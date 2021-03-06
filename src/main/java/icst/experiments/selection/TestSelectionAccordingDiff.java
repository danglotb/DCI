package icst.experiments.selection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 18/09/18
 */
public class TestSelectionAccordingDiff {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestSelectionAccordingDiff.class);

    private static final String DIFF_NAME = "patch.diff";

    private static final String PREFIX_RESULT = "result/september-2018/";

    public static final String TMP_TEST_SELECTION_FILENAME = "testsThatExecuteTheChanges.csv";




    public static long testSelection(String shaParent,
                                     String project,
                                     String pathToRepository,
                                     String concernedModule) {
        // 2 compute the .diff file, that encodes the changes
        final File file = new File(pathToRepository + "/" + DIFF_NAME);
        // TODO checkout which git diff is used
        CommandExecutor.runCmd(shaParent, pathToRepository, file.getAbsolutePath());
        // prepare repository
        LOGGER.info("Prepare for {}", project);
        CommandExecutor.runCmd("git diff " + shaParent + " > " + DIFF_NAME, pathToRepository + "/" + concernedModule, DIFF_NAME);
        // install
        /*
        MavenExecutor.runGoals(pathToRepository + "/pom.xml",
                "clean",
                "install",
                "-DskipTests",
                "-Dcheckstyle.skip=true",
                "-Denforcer.skip=true",
                "-Dxwiki.clirr.skip=true", // anyway, we can use this specific goal on all project, the value is not used...
                "--quiet");
        */
        // 4 compute the list of the test that execute the change
        final String absolutePathToParent = new File(pathToRepository + "_parent/" + concernedModule).getAbsolutePath();
        final String absolutePathToCurrentCommit = new File(pathToRepository + "/" + concernedModule).getAbsolutePath();
        long time = System.currentTimeMillis();
        MavenExecutor.runGoals(absolutePathToParent+ "/pom.xml",
                "clean",
                "eu.stamp-project:diff-test-selection:0.5-SNAPSHOT:list",
                "-DpathToDiff=" + new File(pathToRepository + "/" + DIFF_NAME).getAbsolutePath(),
                "-DpathToOtherVersion=" + absolutePathToCurrentCommit,
                "-Dmodule=" + concernedModule,
                "-DoutputPath=" + new File(pathToRepository + "/" + TMP_TEST_SELECTION_FILENAME).getAbsolutePath());
        return System.currentTimeMillis() - time;
    }
}

