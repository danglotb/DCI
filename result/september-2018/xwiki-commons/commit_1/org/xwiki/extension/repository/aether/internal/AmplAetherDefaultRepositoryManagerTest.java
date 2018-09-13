package org.xwiki.extension.repository.aether.internal;


import org.junit.Before;
import org.junit.Rule;
import org.xwiki.extension.DefaultExtensionDependency;
import org.xwiki.extension.ExtensionDependency;
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
}

