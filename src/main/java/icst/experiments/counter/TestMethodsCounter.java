package icst.experiments.counter;

import com.martiansoftware.jsap.JSAPResult;
import icst.experiments.commits.ProjectBuilderOptions;
import icst.experiments.util.OptionsWrapper;
import spoon.Launcher;

/**
 * created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 28/09/18
 */
public class TestMethodsCounter {

    private static final String PATH_TO_DATASET = "september-2018/dataset/";

    public static void main(String[] args) {
        JSAPResult configuration = OptionsWrapper.parse(new ProjectBuilderOptions(), args);
        Launcher launcher = new Launcher();
    }

}
