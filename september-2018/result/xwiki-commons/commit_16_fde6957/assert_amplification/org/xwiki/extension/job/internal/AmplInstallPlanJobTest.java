package org.xwiki.extension.job.internal;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.xwiki.extension.InstallException;
import org.xwiki.extension.TestResources;
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

    @Test(timeout = 10000)
    public void testInstallNameSpaceExtensionWithExistingRootExtension_failAssert4() throws Exception, Throwable {
        try {
            install(TestResources.REMOTE_UPGRADE10_ID);
            installPlan(TestResources.REMOTE_UPGRADE20_ID, "namespace");
            org.junit.Assert.fail("testInstallNameSpaceExtensionWithExistingRootExtension should have thrown InstallException");
        } catch (InstallException expected) {
            Assert.assertEquals("An extension with feature [upgrade] is already installed on root namespace ([upgrade-1.0])", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInstallNameSpaceExtensionWithIncompatibleRootDependency_failAssert1() throws Exception, Throwable {
        try {
            install(TestResources.REMOTE_UPGRADE10_ID);
            installPlan(TestResources.REMOTE_UPGRADEWITHDEPENDENCY20_ID, "namespace");
            org.junit.Assert.fail("testInstallNameSpaceExtensionWithIncompatibleRootDependency should have thrown InstallException");
        } catch (InstallException expected) {
            Assert.assertEquals("Failed to resolve extension", expected.getMessage());
        }
    }
}

