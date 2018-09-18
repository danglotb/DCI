package org.xwiki.job.internal;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.xwiki.cache.CacheManager;
import org.xwiki.cache.internal.MapCache;
import org.xwiki.job.JobManagerConfiguration;
import org.xwiki.test.mockito.MockitoComponentMockingRule;


public class AmplDefaultJobStatusStoreTest {
    @Rule
    public final MockitoComponentMockingRule<DefaultJobStatusStore> componentManager = new MockitoComponentMockingRule<>(DefaultJobStatusStore.class);

    @Before
    public void before() throws Exception {
        JobManagerConfiguration jobManagerConfiguration = this.componentManager.getInstance(JobManagerConfiguration.class);
        FileUtils.deleteDirectory(new File("target/test/jobs/"));
        FileUtils.copyDirectory(new File("src/test/resources/jobs/"), new File("target/test/jobs/"));
        Mockito.when(jobManagerConfiguration.getStorage()).thenReturn(new File("target/test/jobs/status"));
        Mockito.when(jobManagerConfiguration.getJobStatusCacheSize()).thenReturn(100);
        CacheManager cacheManagerMock = this.componentManager.getInstance(CacheManager.class);
        Mockito.when(cacheManagerMock.createNewCache(ArgumentMatchers.any())).thenReturn(new MapCache<>());
    }
}

