package org.xwiki.properties.internal;


import java.util.HashMap;
import org.junit.Before;
import org.junit.Rule;
import org.xwiki.component.internal.ContextComponentManagerProvider;
import org.xwiki.properties.BeanManager;
import org.xwiki.properties.RawProperties;
import org.xwiki.properties.internal.converter.ConvertUtilsConverter;
import org.xwiki.properties.internal.converter.EnumConverter;
import org.xwiki.properties.test.GenericTestConverter;
import org.xwiki.test.ComponentManagerRule;
import org.xwiki.test.annotation.ComponentList;


@ComponentList({ DefaultBeanManager.class, DefaultConverterManager.class, EnumConverter.class, ConvertUtilsConverter.class, ContextComponentManagerProvider.class, GenericTestConverter.class })
public class AmplDefaultBeanManagerTest {
    public static class RawPropertiesTest extends HashMap<String, Object> implements RawProperties {
        @Override
        public void set(String propertyName, Object value) {
            put(propertyName, value);
        }
    }

    @Rule
    public final ComponentManagerRule componentManager = new ComponentManagerRule();

    private BeanManager defaultBeanManager;

    @Before
    public void setUp() throws Exception {
        this.defaultBeanManager = this.componentManager.getInstance(BeanManager.class);
    }
}

