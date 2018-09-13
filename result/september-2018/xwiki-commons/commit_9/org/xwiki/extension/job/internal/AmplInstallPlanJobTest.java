package org.xwiki.extension.job.internal;


import org.junit.Before;
import org.xwiki.extension.repository.CoreExtensionRepository;
import org.xwiki.extension.test.AbstractExtensionHandlerTest;
import org.xwiki.extension.test.ConfigurableDefaultCoreExtensionRepository;


public class AmplInstallPlanJobTest extends AbstractExtensionHandlerTest {
    private ConfigurableDefaultCoreExtensionRepository coreRepository;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        this.coreRepository = this.mocker.getInstance(CoreExtensionRepository.class);
    }
}

