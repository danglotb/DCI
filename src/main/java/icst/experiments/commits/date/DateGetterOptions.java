package icst.experiments.commits.date;

import com.martiansoftware.jsap.FlaggedOption;
import com.martiansoftware.jsap.JSAP;
import com.martiansoftware.jsap.JSAPException;
import com.martiansoftware.jsap.Switch;
import icst.experiments.util.Options;

/**
 * created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 08/10/18
 */
public class DateGetterOptions implements Options {

    @Override
    public JSAP initJSAP() throws JSAPException {
        JSAP jsap = new JSAP();

        Switch help = new Switch("help");
        help.setDefault("false");
        help.setLongFlag("help");
        help.setShortFlag('h');
        help.setHelp("show this help");

        FlaggedOption path = new FlaggedOption("path-to-repository");
        path.setRequired(true);
        path.setLongFlag("path-to-repository");
        path.setStringParser(JSAP.STRING_PARSER);

        FlaggedOption project = new FlaggedOption("project");
        project.setRequired(true);
        project.setLongFlag("project");
        project.setStringParser(JSAP.STRING_PARSER);

        jsap.registerParameter(path);
        jsap.registerParameter(project);
        jsap.registerParameter(help);

        return jsap;
    }
}