package org.apache.commons.io.comparator;


import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class AmplCompositeFileComparatorTest extends ComparatorAbstractTestCase {
    @Test(timeout = 10000)
    public void constructorIterable_order() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order__3);
        boolean o_constructorIterable_order__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order__4);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order__7 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order__7)));
        boolean boolean_0 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_1 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order__3);
        Assert.assertTrue(o_constructorIterable_order__4);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order__7)));
    }
}

