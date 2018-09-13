package org.xwiki.filter.internal;


import org.junit.Rule;
import org.xwiki.filter.internal.type.FilterStreamTypeConverter;
import org.xwiki.filter.type.FilterStreamType;
import org.xwiki.properties.converter.Converter;
import org.xwiki.test.mockito.MockitoComponentMockingRule;


public class AmplFilterStreamTypeConverterTest {
    @Rule
    public MockitoComponentMockingRule<Converter<FilterStreamType>> mocker = new MockitoComponentMockingRule<Converter<FilterStreamType>>(FilterStreamTypeConverter.class);
}

