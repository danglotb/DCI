package org.xwiki.extension.job.internal;


import org.xwiki.extension.handler.ExtensionHandler;
import org.xwiki.extension.test.AbstractExtensionHandlerTest;
import org.xwiki.extension.test.TestExtensionHandler;


public class AmplInstallJobTest extends AbstractExtensionHandlerTest {
    private TestExtensionHandler handler;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        this.handler = ((TestExtensionHandler) (this.mocker.getInstance(ExtensionHandler.class, "test")));
    }
}

