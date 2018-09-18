package org.xwiki.extension.job.internal;


import org.xwiki.extension.TestResources;
import org.xwiki.extension.handler.ExtensionHandler;
import org.xwiki.extension.test.AbstractExtensionHandlerTest;
import org.xwiki.extension.test.TestExtensionHandler;


public class AmplUninstallJobTest extends AbstractExtensionHandlerTest {
    private TestResources resources;

    private TestExtensionHandler handler;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        this.handler = ((TestExtensionHandler) (this.mocker.getInstance(ExtensionHandler.class, "test")));
        this.resources = new TestResources();
        this.resources.init(this.installedExtensionRepository);
    }
}

