package org.xwiki.extension.repository.aether.internal;


import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.xwiki.extension.repository.ExtensionRepositoryFactory;
import org.xwiki.test.annotation.AllComponents;
import org.xwiki.test.mockito.MockitoComponentMockingRule;


@AllComponents
public class AmplSystemHTTPProxyTest {
    @Rule
    public WireMockRule proxyWireMockRule = new WireMockRule(8888);

    @Rule
    public MockitoComponentMockingRule<ExtensionRepositoryFactory> repositoryFactory = new MockitoComponentMockingRule<ExtensionRepositoryFactory>(AetherExtensionRepositoryFactory.class);
}

