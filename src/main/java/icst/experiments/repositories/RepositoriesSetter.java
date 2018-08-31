package icst.experiments.repositories;

import com.martiansoftware.jsap.JSAPResult;
import icst.experiments.commits.ProjectBuilderOptions;
import icst.experiments.json.CommitJSON;
import icst.experiments.util.AbstractRepositoryAndGit;
import icst.experiments.util.OptionsWrapper;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 31/08/18
 */
public class RepositoriesSetter extends AbstractRepositoryAndGit {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoriesSetter.class);

    protected static final String SUFFIX_PATH_TO_OTHER = "_parent";

    protected RepositoriesSetter parent;

    public RepositoriesSetter(String pathToRepository) {
        super(pathToRepository);
        this.parent = new RepositoriesSetter(pathToRepository + SUFFIX_PATH_TO_OTHER);
    }

    public void setUpForGivenCommit(CommitJSON commit) {
        this.setUpForGivenCommit(commit.sha);
        this.parent.setUpForGivenCommit(commit.parent);
    }

    private void setUpForGivenCommit(String sha) {
        try {
            this.git.clean()
                    .setCleanDirectories(true)
                    .setDryRun(true)
                    .call();
            this.git.checkout()
                    .setName(sha)
                    .call();
        } catch (GitAPIException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JSAPResult configuration = OptionsWrapper.parse(new RepositoriesSetterOptions(), args);
    }
}
