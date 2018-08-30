package icst.experiments.commits;

import com.martiansoftware.jsap.JSAPResult;
import icst.experiments.json.CommitJSON;
import icst.experiments.json.ProjectJSON;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 30/08/18
 */
public class ProjectJSONBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectJSONBuilder.class);

    private Repository repository;
    private Git git;

    private ProjectJSON projectJSON;

    public ProjectJSONBuilder(String pathToRepository, String owner, String project) {
        try {
            this.repository = new FileRepositoryBuilder()
                    .setGitDir(new File(pathToRepository + "/.git"))
                    .build();
            this.git = new Git(this.repository);
            this.projectJSON = new ProjectJSON(owner, project, this.getDate());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getDate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return String.format("%d/%d/%d", localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.getYear());
    }

    private void buildListCandidateCommits() {
        try {
            final Iterable<RevCommit> commits = this.git.log()
                    .add(this.repository.resolve(Constants.HEAD))
                    .call();
            final Iterator<RevCommit> iterator = commits.iterator();
            int i = 0;
            while (iterator.hasNext() && !(this.projectJSON.commits.size() == 100)) {
                this.buildCandidateCommit(iterator.next());
                i++;
            }
            System.out.println(i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void buildCandidateCommit(RevCommit commit) {
        if (commit.getParentCount() < 1) {
            return;
        }

        final RevCommit parentCommit = commit.getParents()[0];
        final List<DiffEntry> diffEntries = this.computeDiff(commit, parentCommit);
        final boolean anyMatch = diffEntries.stream()
                .filter(diffEntry -> diffEntry.getChangeType() != DiffEntry.ChangeType.RENAME)
                .filter(diffEntry -> diffEntry.getChangeType() != DiffEntry.ChangeType.COPY)
                .filter(diffEntry -> !this.isAMove(diffEntry, diffEntries))
                .map(DiffEntry::getNewPath)
                .anyMatch(this::isSourceJavaModification);
        if (anyMatch) {
            this.projectJSON.commits.add(new CommitJSON(commit.getName(), parentCommit.getName()));
        }
    }

    private boolean isAMove(DiffEntry diffEntry, List<DiffEntry> diffEntries) {
        if (diffEntry.getChangeType() == DiffEntry.ChangeType.ADD) {
            final String fileNameToLookFor = getFileNameToLookFor(diffEntry.getNewPath());
            return isAMoveSpecificChangeType(
                    diffEntries,
                    DiffEntry.ChangeType.DELETE,
                    fileNameToLookFor,
                    DiffEntry::getOldPath
            );
        } else if (diffEntry.getChangeType() == DiffEntry.ChangeType.DELETE) {
            final String fileNameToLookFor = getFileNameToLookFor(diffEntry.getOldPath());
            return isAMoveSpecificChangeType(
                    diffEntries,
                    DiffEntry.ChangeType.ADD,
                    fileNameToLookFor,
                    DiffEntry::getNewPath
            );
        }
        return false;
    }

    private boolean isAMoveSpecificChangeType(List<DiffEntry> diffEntries,
                                              DiffEntry.ChangeType changeType,
                                              String fileNameToLookFor,
                                              Function<DiffEntry, String> getter) {
        return diffEntries.stream().noneMatch(other -> other.getChangeType() == changeType) ||
                diffEntries.stream().filter(other -> other.getChangeType() == changeType)
                        .anyMatch(other -> getter.apply(other).endsWith(fileNameToLookFor));
    }

    private String getFileNameToLookFor(String filename) {
        final String[] split = filename.split("/");
        return split[split.length - 1];
    }

    private List<DiffEntry> computeDiff(RevCommit commit, RevCommit parent) {
        try {
            ObjectReader reader = repository.newObjectReader();
            CanonicalTreeParser parentTreeParser = new CanonicalTreeParser();
            CanonicalTreeParser commitTreeParser = new CanonicalTreeParser();
            parentTreeParser.reset(reader, parent.getTree());
            commitTreeParser.reset(reader, commit.getTree());
            DiffFormatter diffFormatter = new DiffFormatter(System.out);
            diffFormatter.setRepository(git.getRepository());
            return diffFormatter.scan(commitTreeParser, parentTreeParser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private boolean isSourceJavaModification(String path) {
        return path.endsWith(".java") && path.contains("src/main/java");
    }

    public static void main(String[] args) throws IOException {
        JSAPResult configuration = ProjectBuilderOptions.options.parse(args);
        final String owner = configuration.getString("owner");
        final String project = configuration.getString("project");
        final ProjectJSONBuilder projectJSONBuilder = new ProjectJSONBuilder(
                configuration.getString("path-to-repository"),
                owner,
                project
        );
        projectJSONBuilder.buildListCandidateCommits();
        ProjectJSON.save(projectJSONBuilder.projectJSON,
                configuration.getString("output") + "/" +
                        owner + "_" + project + ".json"
        );
    }

}
