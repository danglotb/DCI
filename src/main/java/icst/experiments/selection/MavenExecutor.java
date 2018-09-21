package icst.experiments.selection;

import org.apache.maven.shared.invoker.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 20/09/18
 */
public class MavenExecutor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MavenExecutor.class);

    public static String mavenHome = "/home/spirals/danglot/apache-maven-3.5.4/";

    public static int runGoals(String pathToPom, String... goals) {
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
