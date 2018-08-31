package icst.experiments.repositories;

import com.martiansoftware.jsap.FlaggedOption;
import com.martiansoftware.jsap.JSAP;
import com.martiansoftware.jsap.JSAPException;
import com.martiansoftware.jsap.Switch;
import icst.experiments.util.Options;

/**
 * Created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 31/08/18
 */
public class RepositoriesSetterOptions implements Options {

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
        path.setHelp("[mandatory] specify the path to the local clone of the repository");

        FlaggedOption owner = new FlaggedOption("owner");
        owner.setRequired(true);
        owner.setLongFlag("owner");
        owner.setStringParser(JSAP.STRING_PARSER);
        owner.setHelp("[mandatory] specify the name of the owner of the repository");

        FlaggedOption project = new FlaggedOption("project");
        project.setRequired(true);
        project.setLongFlag("project");
        project.setStringParser(JSAP.STRING_PARSER);
        project.setHelp("[mandatory] specify the name of the repository");

        FlaggedOption commitIndex = new FlaggedOption("index");
        commitIndex.setRequired(true);
        commitIndex.setLongFlag("commit-index");
        commitIndex.setShortFlag('c');
        commitIndex.setStringParser(JSAP.INTEGER_PARSER);
        commitIndex.setHelp("[mandatory] specify the index of the commit to use");

        FlaggedOption output = new FlaggedOption("output");
        output.setLongFlag("output");
        output.setDefault("dataset/<owner>_<project>.json");
        output.setShortFlag('o');
        output.setStringParser(JSAP.STRING_PARSER);
        output.setHelp("[optional] specify where to save the generated json.");

        jsap.registerParameter(path);
        jsap.registerParameter(owner);
        jsap.registerParameter(project);
        jsap.registerParameter(commitIndex);
        jsap.registerParameter(output);
        jsap.registerParameter(help);

        return jsap;
    }

}
