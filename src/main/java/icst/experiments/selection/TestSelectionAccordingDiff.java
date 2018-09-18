package icst.experiments.selection;

import icst.experiments.commits.ProjectJSONBuilder;
import icst.experiments.repositories.nojson.RepositoriesSetterNoJSON;
import org.apache.maven.shared.invoker.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 18/09/18
 */
public class TestSelectionAccordingDiff {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectJSONBuilder.class);

    public static String mavenHome = "/usr/share/maven/";

    private static final String DIFF_NAME = "patch.diff";

    private static final String PREFIX_RESULT = "result/september-2018/";

    public static final String TMP_TEST_SELECTION_FILENAME = "testThatExecuteTheChanges.csv";

    public void testSelection(String sha, String shaParent, String project, String pathToRepository, String concernedModule) {
        // 1 setting both project to correct commit
        RepositoriesSetterNoJSON.main(new String[]{
                "--project", project,
                "--path-to-repository", pathToRepository,
                "--sha", sha,
                "--sha-parent", shaParent
        });
        // 2 compute the .diff file, that encodes the changes
        final File file = new File(pathToRepository + "/" + DIFF_NAME);
        runCmd(shaParent, pathToRepository, file.getAbsolutePath());
        // prepare repository
        LOGGER.info("Prepare for {}", project);
        //runCmd("git diff " + shaParent + " > " + DIFF_NAME, pathToRepository + "/" + concernedModule);
        runCmd("git diff " + shaParent + " > " + DIFF_NAME, pathToRepository + "/" + concernedModule, DIFF_NAME);
        runCmd("python src/main/python/september-2018/preparation.py " + project, null);
        // install
        runGoals(pathToRepository  + "/pom.xml", "clean", "install", "-DskipTests", "--quiet");
        // 4 compute the list of the test that execute the change
        runGoals(pathToRepository + "/" + concernedModule + "/pom.xml",
                "clean",
                "eu.stamp-project:diff-test-selection:0.5-SNAPSHOT:list",
                "-DpathToDiff=" + new File(pathToRepository + "/" + DIFF_NAME).getAbsolutePath(),
                "-DpathToOtherVersion=" + new File(pathToRepository + "_parent/" + concernedModule).getAbsolutePath(),
                "-Dmodule=" + concernedModule,
                "-DoutputPath=" + new File(pathToRepository + "/" + TMP_TEST_SELECTION_FILENAME).getAbsolutePath());
    }

    private void runCmd(String shaParent, String cwd, String outputPathFolder) {
        Process p;
        try {
            p = Runtime.getRuntime().exec(
                    "git diff " + shaParent,
                    new String[]{},
                    new File(cwd));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (final FileWriter fileWriter = new FileWriter(outputPathFolder, false)) {
            new BufferedReader(new InputStreamReader(p.getInputStream()))
                    .lines()
                    .forEach(line -> {
                        try {
                            LOGGER.info("{}", line);
                            fileWriter.write(line + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void runCmd(String cmd, String cwd) {
        LOGGER.info("Executing cmd {}", cmd);
        Process p;
        try {
            if (cwd != null) {
                p = Runtime.getRuntime().exec(cmd, new String[]{}, new File(cwd));
            } else {
                p = Runtime.getRuntime().exec(cmd);
            }
            new ThreadToReadInputStream(System.out, p.getInputStream()).start();
            new ThreadToReadInputStream(System.err, p.getErrorStream()).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class ThreadToReadInputStream extends Thread {

        private final PrintStream output;
        private final InputStream input;

        ThreadToReadInputStream(PrintStream output, InputStream input) {
            this.output = output;
            this.input = input;
        }

        @Override
        public synchronized void start() {
            int read;
            try {
                while ((read = this.input.read()) != -1) {
                    this.output.print((char) read);
                }
            } catch (Exception ignored) {
                //ignored
            } finally {
                this.interrupt();
            }
        }
    }

    private int runGoals(String pathToPom, String... goals) {
        InvocationRequest request = new DefaultInvocationRequest();
        request.setGoals(Arrays.asList(goals));
        request.setPomFile(new File(pathToPom));
        request.setJavaHome(new File(System.getProperty("java.home")));

        Properties properties = new Properties();
        properties.setProperty("enforcer.skip", "true");
        properties.setProperty("checkstyle.skip", "true");
        properties.setProperty("cobertura.skip", "true");
        properties.setProperty("skipITs", "true");
        properties.setProperty("rat.skip", "true");
        properties.setProperty("license.skip", "true");
        properties.setProperty("findbugs.skip", "true");
        properties.setProperty("gpg.skip", "true");
        request.setProperties(properties);

        Invoker invoker = new DefaultInvoker();
        invoker.setMavenHome(new File(mavenHome));
        LOGGER.info(String.format("run maven %s", Arrays.stream(goals).collect(Collectors.joining(" "))));
        invoker.setOutputHandler(System.out::println);
        invoker.setErrorHandler(System.err::println);
        try {
            return invoker.execute(request).getExitCode();
        } catch (MavenInvocationException e) {
            throw new RuntimeException(e);
        }
    }

}
