package icst.experiments.commits;

import icst.experiments.json.ProjectJSON;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
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
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Benjamin DANGLOT
 * benjamin.danglot@inria.fr
 * on 30/08/18
 */
public class CommitsManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommitsManager.class);

    private Repository repository;
    private Git git;

    public CommitsManager(String pathToRepository) {
        try {
            this.repository = new FileRepositoryBuilder()
                    .setGitDir(new File(pathToRepository))
                    .build();
            this.git = new Git(this.repository);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getDate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return String.format("%d/%d/%d", localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
    }

    public static void main(String[] args) throws IOException {
        final CommitsManager commitsManager = new CommitsManager(".git");
        try {
            final Iterable<RevCommit> call = commitsManager.git.log()
                    .add(commitsManager.repository.resolve(Constants.HEAD))
                    .call();
            final Iterator<RevCommit> iterator = call.iterator();
            final RevCommit next = iterator.next();
            commitsManager.computeDiff(next, next.getParent(0));
        } catch (GitAPIException e) {
            e.printStackTrace();
        }
    }

    private void computeDiff(RevCommit commit, RevCommit parent) {
        try {
            ObjectReader reader = repository.newObjectReader();
            CanonicalTreeParser parentTreeParser = new CanonicalTreeParser();
            CanonicalTreeParser commitTreeParser = new CanonicalTreeParser();
            parentTreeParser.reset(reader, parent.getTree());
            commitTreeParser.reset(reader, commit.getTree());
            DiffFormatter diffFormatter = new DiffFormatter(System.out);
            diffFormatter.setRepository(git.getRepository());
            List<DiffEntry> entries = diffFormatter.scan(commitTreeParser, parentTreeParser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

