package org.xwiki.extension.repository.installed;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.xwiki.extension.Extension;
import org.xwiki.extension.ExtensionId;
import org.xwiki.extension.InstallException;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.ResolveException;
import org.xwiki.extension.TestResources;
import org.xwiki.extension.handler.ExtensionHandler;
import org.xwiki.extension.repository.ExtensionRepositoryManager;
import org.xwiki.extension.repository.InstalledExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepository;
import org.xwiki.extension.repository.LocalExtensionRepositoryException;
import org.xwiki.extension.test.MockitoRepositoryUtilsRule;
import org.xwiki.extension.test.TestExtensionHandler;
import org.xwiki.test.annotation.AllComponents;


@AllComponents
public class AmplDefaultInstalledExtensionRepositoryTest {
    @Rule
    public MockitoRepositoryUtilsRule repositoryUtil = new MockitoRepositoryUtilsRule();

    private InstalledExtensionRepository installedExtensionRepository;

    private LocalExtensionRepository localExtensionRepository;

    private ExtensionRepositoryManager repositoryManager;

    private TestResources resources;

    private TestExtensionHandler handler;

    @Before
    public void setUp() throws Exception {
        this.installedExtensionRepository = this.repositoryUtil.getComponentManager().getInstance(InstalledExtensionRepository.class);
        this.localExtensionRepository = this.repositoryUtil.getComponentManager().getInstance(LocalExtensionRepository.class);
        this.repositoryManager = this.repositoryUtil.getComponentManager().getInstance(ExtensionRepositoryManager.class);
        this.handler = this.repositoryUtil.getComponentManager().getInstance(ExtensionHandler.class, "test");
        this.resources = new TestResources();
        this.resources.init(this.installedExtensionRepository);
    }

    private void install(ExtensionId extensionId) throws InstallException, ResolveException, LocalExtensionRepositoryException {
        Extension extension = this.repositoryManager.resolve(extensionId);
        this.localExtensionRepository.storeExtension(extension);
        LocalExtension localExtension = this.localExtensionRepository.resolve(extensionId);
        Assert.assertEquals(extensionId, localExtension.getId());
        this.installedExtensionRepository.installExtension(localExtension, null, false);
    }
}

