package org.xwiki.extension.repository.aether.internal;


import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.xwiki.extension.DefaultExtensionDependency;
import org.xwiki.extension.Extension;
import org.xwiki.extension.ExtensionDependency;
import org.xwiki.extension.ExtensionException;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.ExtensionLicenseManager;
import org.xwiki.extension.repository.ExtensionRepositoryManager;
import org.xwiki.extension.test.MockitoRepositoryUtilsRule;
import org.xwiki.extension.version.internal.DefaultVersionConstraint;
import org.xwiki.test.annotation.AllComponents;


@AllComponents
public class AmplAetherDefaultRepositoryManagerTest {
    private static final String GROUPID = "groupid";

    private static final String ARTIfACTID = "artifactid";

    @Rule
    public MockitoRepositoryUtilsRule repositoryUtil = new MockitoRepositoryUtilsRule();

    private ExtensionRepositoryManager repositoryManager;

    private ExtensionId extensionId;

    private ExtensionId snapshotExtensionId;

    private ExtensionId extensionDependencyId;

    private ExtensionId extensionIdClassifier;

    private ExtensionDependency dependencyExtensionId;

    private ExtensionDependency dependencyExtensionIdRange;

    private ExtensionLicenseManager extensionLicenseManager;

    private ExtensionId bundleExtensionId;

    private ExtensionId sextensionId;

    private ExtensionId sextensionDependencyId;

    @Before
    public void setUp() throws Exception {
        this.extensionId = new ExtensionId((((AmplAetherDefaultRepositoryManagerTest.GROUPID) + ':') + (AmplAetherDefaultRepositoryManagerTest.ARTIfACTID)), "version");
        this.snapshotExtensionId = new ExtensionId((((AmplAetherDefaultRepositoryManagerTest.GROUPID) + ':') + (AmplAetherDefaultRepositoryManagerTest.ARTIfACTID)), "1.0-SNAPSHOT");
        this.extensionDependencyId = new ExtensionId("dgroupid:dartifactid", "dversion");
        this.extensionIdClassifier = new ExtensionId(((((AmplAetherDefaultRepositoryManagerTest.GROUPID) + ':') + (AmplAetherDefaultRepositoryManagerTest.ARTIfACTID)) + ":classifier"), "version");
        this.dependencyExtensionId = new DefaultExtensionDependency(this.extensionDependencyId.getId(), new DefaultVersionConstraint(this.extensionDependencyId.getVersion().getValue()));
        this.dependencyExtensionIdRange = new DefaultExtensionDependency(this.extensionDependencyId.getId(), new DefaultVersionConstraint("[dversion,)"));
        this.bundleExtensionId = new ExtensionId("groupid:bundleartifactid", "version");
        this.sextensionId = new ExtensionId("sgroupid:sartifactid", "version");
        this.sextensionDependencyId = new ExtensionId("sgroupid:sdartifactid", "version");
        this.repositoryManager = this.repositoryUtil.getComponentManager().getInstance(ExtensionRepositoryManager.class);
        this.extensionLicenseManager = this.repositoryUtil.getComponentManager().getInstance(ExtensionLicenseManager.class);
    }

    @Test(timeout = 10000)
    public void testDownload() throws IOException, Exception, ExtensionException {
        Extension extension = this.repositoryManager.resolve(this.extensionId);
        try (final InputStream is = extension.getFile().openStream()) {
            String o_testDownload__8 = IOUtils.toString(is);
            Assert.assertEquals("content", o_testDownload__8);
        }
    }

    @Test(timeout = 10000)
    public void testDownloadSNAPSHOT() throws IOException, Exception, ExtensionException {
        Extension extension = this.repositoryManager.resolve(this.snapshotExtensionId);
        try (final InputStream is = extension.getFile().openStream()) {
            String o_testDownloadSNAPSHOT__8 = IOUtils.toString(is);
            Assert.assertEquals("snapshot content", o_testDownloadSNAPSHOT__8);
        }
    }

    @Test(timeout = 10000)
    public void testDownloadClassifier() throws IOException, Exception, ExtensionException {
        Extension extension = this.repositoryManager.resolve(this.extensionIdClassifier);
        try (final InputStream is = extension.getFile().openStream()) {
            String o_testDownloadClassifier__8 = IOUtils.toString(is);
            Assert.assertEquals("classifier content", o_testDownloadClassifier__8);
        }
    }

    @Test(timeout = 10000)
    public void testDownloadBundle() throws IOException, Exception, ExtensionException {
        Extension extension = this.repositoryManager.resolve(this.bundleExtensionId);
        try (final InputStream is = extension.getFile().openStream()) {
            String o_testDownloadBundle__8 = IOUtils.toString(is);
            Assert.assertEquals("content", o_testDownloadBundle__8);
        }
    }
}

