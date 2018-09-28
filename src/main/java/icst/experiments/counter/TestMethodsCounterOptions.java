package icst.experiments.counter;

import com.martiansoftware.jsap.FlaggedOption;
import com.martiansoftware.jsap.JSAP;
import com.martiansoftware.jsap.JSAPException;
import icst.experiments.util.Options;

/**
 * created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 28/09/18
 */
public class TestMethodsCounterOptions implements Options {

    @Override
    public JSAP initJSAP() throws JSAPException {
        JSAP jsap = new JSAP();

        FlaggedOption project = new FlaggedOption("project");
        project.setStringParser(JSAP.STRING_PARSER);
        project.setLongFlag("project");

        jsap.registerParameter(project);

        return jsap;
    }

}
