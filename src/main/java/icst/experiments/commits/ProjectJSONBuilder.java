package icst.experiments.commits;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.martiansoftware.jsap.JSAPResult;
import icst.experiments.json.BlackListElement;
import icst.experiments.json.Blacklist;
import icst.experiments.json.CommitJSON;
import icst.experiments.json.ProjectJSON;
import icst.experiments.selection.TestSelectionAccordingDiff;
import icst.experiments.util.AbstractRepositoryAndGit;
import icst.experiments.util.OptionsWrapper;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
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

    private Blacklist blacklist;

    private boolean useParent;

    private String outputAbsolutePath;

    public ProjectJSONBuilder(String pathToRepository, String owner, String project, String output, boolean useParent) {
        super(pathToRepository);
        if (new File(output + "/" + project + ".json").exists()) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try {
                this.outputAbsolutePath = new File(output + "/" + project + (useParent ? "_parent" : "")).getAbsolutePath() + "/";
                this.projectJSON = gson.fromJson(new FileReader(this.outputAbsolutePath + project + ".json"), ProjectJSON.class);
                this.blacklist = gson.fromJson(new FileReader(this.outputAbsolutePath + project + "_blacklist.json"), Blacklist.class);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.projectJSON = new ProjectJSON(owner, project, this.getDate());
            this.blacklist = new Blacklist();
        }
        this.useParent = useParent;
    }

    private String getDate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return String.format("%d/%d/%d", localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.getYear());
    }

    private boolean buildListCandidateCommits(int sizeGoal) {
        try {
            final Iterable<RevCommit> commits = this.git.log()
                    .add(this.repository.resolve(Constants.HEAD))
                    .call();
            final Iterator<RevCommit> iterator = commits.iterator();
            boolean commitAdded = false;
            while (iterator.hasNext() && !(this.projectJSON.commits.size() >= sizeGoal)) {
                commitAdded |= this.buildCandidateCommit(iterator.next());
            }
            return commitAdded;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final String PREFIX_RESULT = "result/september-2018/";

    private boolean buildCandidateCommit(RevCommit commit) {
        if (commit.getParentCount() < 1) {
            this.blacklist.blacklist.add(new BlackListElement(commit.getName(), "NoShaParent"));
            return false;
        }
        if (this.projectJSON.contains(commit.getName())) {
            LOGGER.warn("{} is already in the list!", commit.getName().substring(0, 7));
            return false;
        }
        if (this.blacklist.blacklist.contains(commit.getName())) {
            LOGGER.warn("{} is in the blacklist!", commit.getName().substring(0, 7));
            return false;
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
            final String concernedModule = getConcernedModule(modifiedJavaFile);
            if (!new File(this.pathToRootFolder + "/" + concernedModule + "/src/test/java/").exists()) {
                LOGGER.info("The module does not contain any test: {}", commit.getName().substring(0, 7));
                this.blacklist.blacklist.add(new BlackListElement(commit.getName(), "NoTest"));
                return false;
            }
            if (new File(this.pathToRootFolder + "/" + concernedModule).exists()) {
                // checks if we find test to be amplified
                new TestSelectionAccordingDiff().testSelection(
                        commit.getName(),
                        parentCommit.getName(),
                        this.projectJSON.name,
                        this.pathToRootFolder,
                        concernedModule,
                        this.useParent
                );
                // check if the .csv file is created and contains some tests to be amplified
                final File file = new File(this.pathToRootFolder + "/testsThatExecuteTheChanges.csv");
                if (!file.exists()) {
                    LOGGER.info("no test could be found for {}", commit.getName().substring(0, 7));
                    this.blacklist.blacklist.add(new BlackListElement(commit.getName(), "SelectionFailed"));
                    return false;
                }
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String list = reader.lines().collect(Collectors.joining("\n"));
                    if (!list.isEmpty()) {
                        // copy the csv file to keep it, and rename it
                        final File outputDirectory = new File(PREFIX_RESULT + projectJSON.name
                                + (this.useParent ? "_parent" : "")
                                + "/commits_" + projectJSON.commits.size());
                        if (!(outputDirectory.exists())) {
                            FileUtils.forceMkdir(outputDirectory);
                        }
                        FileUtils.copyFile(file, new File(outputDirectory.getAbsolutePath() + "/testsThatExecuteTheChanges.csv"));
                        this.projectJSON.commits.add(new CommitJSON(commit.getName(), parentCommit.getName(), concernedModule));
                        LOGGER.info("could find test to be amplified for {}", commit.getName().substring(0, 7));
                        return true;
                    } else {
                        LOGGER.warn("No test execute the changes for {}", commit.getName().substring(0, 7));
                        this.blacklist.blacklist.add(new BlackListElement(commit.getName(), "NoTestExecuteChanges"));
                        return false;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                LOGGER.warn("skipping {}({}), empty test folder...", commit.getName().substring(0, 7), this.projectJSON.commits.size());
                this.blacklist.blacklist.add(new BlackListElement(commit.getName(), "NoTestInModule"));
                return false;
            }
        }
        LOGGER.warn("There is no java file modified for {}", commit.getName().substring(0, 7));
        this.blacklist.blacklist.add(new BlackListElement(commit.getName(), "NoJavaModification"));
        return false;
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

    public static void main(String[] args) throws FileNotFoundException {
        JSAPResult configuration = OptionsWrapper.parse(new ProjectBuilderOptions(), args);
        if (configuration.getBoolean("help")) {
            OptionsWrapper.usage();
            System.exit(1);
        }
        final String owner = configuration.getString("owner");
        final String project = configuration.getString("project");
        final String output = configuration.getString("output");
        final boolean useParent = configuration.getBoolean("use-parent");
        final ProjectJSONBuilder projectJSONBuilder = new ProjectJSONBuilder(
                configuration.getString("path-to-repository"),
                owner,
                project,
                output,
                useParent
        );
        if (projectJSONBuilder.buildListCandidateCommits(configuration.getInt("size-goal"))) {
            ProjectJSON.save(projectJSONBuilder.projectJSON, projectJSONBuilder.outputAbsolutePath + project + ".json");
            Blacklist.save(projectJSONBuilder.blacklist, projectJSONBuilder.outputAbsolutePath  + project + "_blacklist.json");
        }
    }

}

