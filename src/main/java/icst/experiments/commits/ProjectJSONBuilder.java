package icst.experiments.commits;

import com.martiansoftware.jsap.JSAPResult;
import icst.experiments.json.CommitJSON;
import icst.experiments.json.ProjectJSON;
import icst.experiments.util.AbstractRepositoryAndGit;
import icst.experiments.util.OptionsWrapper;
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
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 30/08/18
 */
public class ProjectJSONBuilder extends AbstractRepositoryAndGit {

    public static final int MAX_NUMBER_COMMITS = 1000;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectJSONBuilder.class);

    public ProjectJSONBuilder(String pathToRepository, String owner, String project) {
        super(pathToRepository);
        this.projectJSON = new ProjectJSON(owner, project, this.getDate());
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
            while (iterator.hasNext() && !(this.projectJSON.commits.size() == MAX_NUMBER_COMMITS)) {
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
        final List<String> modifiedJavaFile = diffEntries.stream()
                .filter(diffEntry -> diffEntry.getChangeType() != DiffEntry.ChangeType.RENAME)
                .filter(diffEntry -> diffEntry.getChangeType() != DiffEntry.ChangeType.COPY)
                .filter(diffEntry -> !this.isAMove(diffEntry, diffEntries))
                .map(DiffEntry::getNewPath)
                .filter(this::isSourceJavaModification)
                .collect(Collectors.toList());
        if (!modifiedJavaFile.isEmpty()) {
            this.projectJSON.commits.add(new CommitJSON(commit.getName(), parentCommit.getName(), getConcernedModule(modifiedJavaFile)));
        }
    }

    private Function<String, String> getConcernedModule = string ->
            string.substring(0, string.indexOf("src/main/java"));


    private String getConcernedModule(List<String> modifiedJavaFile) {
        return modifiedJavaFile.stream()
                .map(string -> this.getConcernedModule.apply(string))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .orElse(new AbstractMap.SimpleImmutableEntry<>("", 0L))
                .getKey();
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
        JSAPResult configuration = OptionsWrapper.parse(new ProjectBuilderOptions(), args);
        if (configuration.getBoolean("help")) {
            OptionsWrapper.usage();
            System.exit(1);
        }
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

