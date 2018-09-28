package org.apache.commons.io.comparator;


import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class AmplCompositeFileComparatorTest extends ComparatorAbstractTestCase {
    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add77_add1199() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add77_add1199__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add77_add1199__6);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2_add77__17 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add77_add1199__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add100_add866() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add100__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add100_add866__11 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add100_add866__11)));
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add100_add866__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add100_add862() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add100_add862__8 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add100_add862__8)));
        int o_constructorIterable_order_remove6_add100__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add100_add862__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add131_add1077() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add131_add1077__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add131_add1077__3);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1_add131__14 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add131_add1077__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64_add983() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2_add64_add983__20 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add64_add983__20)));
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add64_add983__20)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add77_add1195() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add77_add1195__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add77_add1195__3);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2_add77__17 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add77_add1195__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add100_add869() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add100__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add100_add869__14 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add100_add869__14)));
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add100_add869__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add122_add1035() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3_add122__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3_add122_add1035__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3_add122_add1035__9);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_6 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add3_add122_add1035__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add123_add1020() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add123_add1020__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1020__3);
        boolean o_constructorIterable_order_add1_add123__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1020__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add80_add655() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add80_add655__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add80_add655__6);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add2_add80__19 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add80_add655__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add96_add673() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6_add96__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add96_add673__11 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add96_add673__11)));
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add96_add673__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64_add975() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2_add64_add975__17 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add64_add975__17)));
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add64_add975__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add80_add650() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add80_add650__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add80_add650__3);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add2_add80__19 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add80_add650__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add126_add847() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3_add126_add847__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3_add126_add847__3);
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3_add126__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_6 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add3_add126_add847__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add73_add1193() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add73_add1193__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add73_add1193__9);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2_add73__14 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add73_add1193__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add134_add1062() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add134_add1062__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add134_add1062__3);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add1_add134__17 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add134_add1062__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add80_add659() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add80_add659__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add80_add659__9);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add2_add80__19 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add80_add659__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add96_add677() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6_add96__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add96_add677__14 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add96_add677__14)));
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add96_add677__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add134_add1066() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add134_add1066__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add134_add1066__6);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add1_add134__17 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add134_add1066__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add134_add1069() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add134_add1069__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add134_add1069__9);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add1_add134__17 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add134_add1069__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add139_add676() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add139__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_remove7_add139_add676__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove7_add139_add676__6);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove7_add139_add676__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add142_add1177() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add142__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add142_add1177__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add142_add1177__16)));
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add142_add1177__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add100_add857() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6_add100_add857__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove6_add100_add857__3);
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add100__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove6_add100_add857__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64_add964() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add64_add964__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add964__9);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add964__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add150() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(equalFile1, equalFile2);
        boolean boolean_10 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(moreFile, lessFile);
        int o_constructorIterable_order_add5_add150__19 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add5_add150__19)));
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add5_add150__19)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64_add969() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add64_add969__12 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add969__12);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add969__12);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add96_add681() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6_add96__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add96_add681__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add96_add681__16)));
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add96_add681__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add139_add678() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add139__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add139_add678__11 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add139_add678__11)));
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add139_add678__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128_add897() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128_add897__12 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add897__12);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add897__12);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add73_add1186() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add73_add1186__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add73_add1186__3);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2_add73__14 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add73_add1186__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add73_add1189() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add73_add1189__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add73_add1189__6);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2_add73__14 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add73_add1189__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add73() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2_add73__14 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add73__14)));
        int o_constructorIterable_order_add2__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_4 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add73__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add139_add682() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add139__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add139_add682__14 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add139_add682__14)));
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add139_add682__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add70__9);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_4 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add70__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add142() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add142__8 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add142__8)));
        int o_constructorIterable_order_remove7__6 = c.compare(equalFile1, equalFile2);
        boolean boolean_14 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add142__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add139_add685() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add139__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add139_add685__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add139_add685__16)));
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add139_add685__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add102_add766() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6_add102_add766__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove6_add102_add766__3);
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add102__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove6_add102_add766__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67_add842() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67_add842__12 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add842__12);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add842__12);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add77() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add2_add77__17 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add77__17)));
        boolean boolean_4 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add77__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add126_add860() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3_add126__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add3_add126_add860__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3_add126_add860__9);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_6 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add3_add126_add860__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add140() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5_add140__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5_add140__3);
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(equalFile1, equalFile2);
        boolean boolean_10 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(moreFile, lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add5_add140__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70_add970() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2_add70_add970__20 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add70_add970__20)));
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add70_add970__20)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70_add976() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add2_add70_add976__22 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add70_add976__22)));
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add70_add976__22)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67_add837() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67_add837__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add837__9);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add837__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add149() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(equalFile1, equalFile2);
        boolean boolean_10 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add5_add149__16 = c.compare(moreFile, lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add5_add149__16)));
        int o_constructorIterable_order_add5__10 = c.compare(moreFile, lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add5_add149__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add148() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add5_add148__14 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add5_add148__14)));
        boolean boolean_10 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(moreFile, lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add5_add148__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add147() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5_add147__11 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add5_add147__11)));
        int o_constructorIterable_order_add5__7 = c.compare(equalFile1, equalFile2);
        boolean boolean_10 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(moreFile, lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add5_add147__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add139() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add139__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove7_add139__3);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(equalFile1, equalFile2);
        boolean boolean_14 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove7_add139__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add144() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5_add144__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5_add144__6);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(equalFile1, equalFile2);
        boolean boolean_10 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(moreFile, lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add5_add144__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add128__9);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_2 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add128__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add144_add701() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5_add144__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add5_add144_add701__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5_add144_add701__9);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_10 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add5_add144_add701__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add80() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_4 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add2_add80__19 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add80__19)));
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add80__19)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add108() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4_add108__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4_add108__3);
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(lessFile, moreFile);
        boolean boolean_8 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add4_add108__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add131_add1081() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add131_add1081__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add131_add1081__6);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1_add131__14 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add131_add1081__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67_add855() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add2_add67_add855__22 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add67_add855__22)));
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add67_add855__22)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add131_add1086() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add131_add1086__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add131_add1086__9);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1_add131__14 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add131_add1086__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67_add850() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2_add67_add850__20 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add67_add850__20)));
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add2_add67_add850__20)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64_add992() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add2_add64_add992__22 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add64_add992__22)));
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add2_add64_add992__22)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70_add963() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2_add70_add963__17 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add70_add963__17)));
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add70_add963__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67_add846() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2_add67_add846__17 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add67_add846__17)));
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2_add67_add846__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add131() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1_add131__14 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add1_add131__14)));
        int o_constructorIterable_order_add1__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_2 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add1_add131__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add145() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_remove7_add145__11 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add145__11)));
        boolean boolean_14 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add145__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add146() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(equalFile1, equalFile2);
        boolean boolean_14 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_remove7_add146__13 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add146__13)));
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add146__13)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add126_add853() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3_add126_add853__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3_add126_add853__6);
        boolean o_constructorIterable_order_add3_add126__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_6 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add3_add126_add853__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add136() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_2 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add1_add136__19 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add1_add136__19)));
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add1_add136__19)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add113() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4_add113__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4_add113__6);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(lessFile, moreFile);
        boolean boolean_8 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add4_add113__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add134() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add1_add134__17 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add1_add134__17)));
        boolean boolean_2 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add1_add134__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add146_add1030() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add146_add1030__8 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add146_add1030__8)));
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add146__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add146_add1030__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add136_add881() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add136_add881__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add136_add881__6);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add1_add136__19 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add136_add881__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add118() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4_add118__11 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add4_add118__11)));
        int o_constructorIterable_order_add4__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(lessFile, moreFile);
        boolean boolean_8 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add4_add118__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add146_add1036() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add146_add1036__11 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add146_add1036__11)));
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add146__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add146_add1036__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add136_add885() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add136_add885__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add136_add885__9);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add1_add136__19 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add136_add885__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add105_add824() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add105__13 = c.compare(this.moreFile, this.lessFile);
        int o_constructorIterable_order_remove6_add105_add824__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add105_add824__16)));
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add105_add824__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add145_add925() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add145_add925__11 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add145_add925__11)));
        int o_constructorIterable_order_remove7_add145__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add145_add925__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add142_add1153() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add142_add1153__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove7_add142_add1153__3);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add142__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove7_add142_add1153__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add108_add1194() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4_add108__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4_add108_add1194__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4_add108_add1194__9);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_8 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add4_add108_add1194__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add102_add782() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add102__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add102_add782__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add102_add782__16)));
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add102_add782__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128_add904() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1_add128_add904__17 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add1_add128_add904__17)));
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add1_add128_add904__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add145_add929() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add145__11 = c.compare(this.lessFile, this.moreFile);
        int o_constructorIterable_order_remove7_add145_add929__14 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add145_add929__14)));
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add145_add929__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70_add955() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70_add955__12 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add955__12);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add955__12);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add126() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3_add126__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3_add126__6);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_6 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add3_add126__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add145_add921() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add145_add921__8 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add145_add921__8)));
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add145__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add145_add921__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add125() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add125__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add125__6);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_2 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add125__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add122() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3_add122__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3_add122__3);
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_6 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add3_add122__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add123() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add123__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add123__3);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_2 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add123__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add64__3);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_4 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add64__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add146_add1042() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add146_add1042__13 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add146_add1042__13)));
        int o_constructorIterable_order_remove7_add146__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add146_add1042__13)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add146_add1047() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add146__13 = c.compare(this.moreFile, this.lessFile);
        int o_constructorIterable_order_remove7_add146_add1047__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add146_add1047__16)));
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add146_add1047__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add102_add775() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add102_add775__11 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add102_add775__11)));
        int o_constructorIterable_order_remove6_add102__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add102_add775__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add136_add877() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add136_add877__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add136_add877__3);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add1_add136__19 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add136_add877__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add113_add679() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4_add113_add679__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4_add113_add679__3);
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4_add113__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_8 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add4_add113_add679__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67_add831() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67_add831__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add831__6);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add831__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add67__6);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_4 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add67__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add102_add778() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add102__11 = c.compare(this.lessFile, this.moreFile);
        int o_constructorIterable_order_remove6_add102_add778__14 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add102_add778__14)));
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add102_add778__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add102_add771() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add102_add771__8 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add102_add771__8)));
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add102__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add102_add771__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add125_add876() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add125_add876__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add876__3);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add125__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add876__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add67_add825() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add67_add825__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add825__3);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add67__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add67_add825__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70_add943() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70_add943__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add943__6);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add943__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add138() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add4_add138__14 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add4_add138__14)));
        int o_constructorIterable_order_add4__8 = c.compare(lessFile, moreFile);
        boolean boolean_8 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add4_add138__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add144_add696() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5_add144_add696__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5_add144_add696__3);
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5_add144__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_10 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add5_add144_add696__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add100() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add100__8 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add100__8)));
        int o_constructorIterable_order_remove6__6 = c.compare(equalFile1, equalFile2);
        boolean boolean_12 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add100__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add140_add576() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5_add140__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5_add140_add576__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5_add140_add576__9);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_10 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add5_add140_add576__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5_add144_add698() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add5_add144_add698__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5_add144_add698__6);
        boolean o_constructorIterable_order_add5_add144__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_10 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add5_add144_add698__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add145_add932() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add145__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add145_add932__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add145_add932__16)));
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_remove7_add145_add932__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add102() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_remove6_add102__11 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add102__11)));
        boolean boolean_12 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add102__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add105() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(equalFile1, equalFile2);
        boolean boolean_12 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_remove6_add105__13 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add105__13)));
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add105__13)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70_add948() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70_add948__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add948__9);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add948__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add113_add683() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4_add113_add683__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4_add113_add683__6);
        boolean o_constructorIterable_order_add4_add113__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_8 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add4_add113_add683__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add139_add644() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add139_add644__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove7_add139_add644__3);
        boolean o_constructorIterable_order_remove7_add139__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove7_add139_add644__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add123_add1040() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add123__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add123_add1040__12 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1040__12);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1040__12);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add105_add806() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add105_add806__8 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add105_add806__8)));
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add105__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6_add105_add806__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add113_add686() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4_add113__6 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add4_add113_add686__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4_add113_add686__9);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_8 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add4_add113_add686__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add105_add801() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6_add105_add801__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove6_add105_add801__3);
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add105__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove6_add105_add801__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add142_add1165() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add142__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add142_add1165__11 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add142_add1165__11)));
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add142_add1165__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add141() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(lessFile, moreFile);
        int o_constructorIterable_order_add4_add141__17 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add4_add141__17)));
        boolean boolean_8 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add4_add141__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128_add808() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128_add808__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add808__6);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add808__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add142_add1171() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add142__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add142_add1171__14 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add142_add1171__14)));
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_remove7_add142_add1171__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64_add957() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2_add64_add957__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add957__6);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add957__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128_add802() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add128_add802__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add802__3);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add802__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add125_add884() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add125__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add125_add884__9 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add884__9);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add884__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128_add888() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128_add888__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add888__9);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add128_add888__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add125_add880() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add125_add880__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add880__6);
        boolean o_constructorIterable_order_add1_add125__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add880__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4_add143() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add4__8 = c.compare(lessFile, moreFile);
        boolean boolean_8 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add4_add143__19 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add4_add143__19)));
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add4_add143__19)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add70_add938() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add70_add938__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add938__3);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add70__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add70_add938__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove6__3);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6__6)));
        boolean boolean_12 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove6__3);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove6__6)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add129() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3_add129__11 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3_add129__11)));
        int o_constructorIterable_order_add3__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_6 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3_add129__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add77_add1203() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2_add77_add1203__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add77_add1203__9);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add2_add77__17 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add77_add1203__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add5() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add5__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5__3);
        boolean o_constructorIterable_order_add5__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add5__4);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add5__7 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add5__7)));
        boolean boolean_10 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add5__10 = c.compare(moreFile, lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add5__10)));
        boolean boolean_11 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add5__3);
        Assert.assertTrue(o_constructorIterable_order_add5__4);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add5__7)));
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add5__10)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add100_add872() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6_add100__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add100_add872__16 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add100_add872__16)));
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add100_add872__16)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add4() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add4__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4__3);
        boolean o_constructorIterable_order_add4__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add4__4);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add4__7 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add4__7)));
        int o_constructorIterable_order_add4__8 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add4__8)));
        boolean boolean_8 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_9 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add4__3);
        Assert.assertTrue(o_constructorIterable_order_add4__4);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add4__7)));
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add4__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add146_add1024() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add146_add1024__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove7_add146_add1024__3);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove7_add146__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove7_add146_add1024__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3__3);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add3__4);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3__7)));
        int o_constructorIterable_order_add3__8 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3__8)));
        boolean boolean_6 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add3__3);
        Assert.assertTrue(o_constructorIterable_order_add3__4);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3__7)));
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2__3);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2__4);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2__5);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2__8)));
        boolean boolean_4 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2__3);
        Assert.assertTrue(o_constructorIterable_order_add2__4);
        Assert.assertTrue(o_constructorIterable_order_add2__5);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add2__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1__3);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1__4);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1__5);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add1__8)));
        boolean boolean_2 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1__3);
        Assert.assertTrue(o_constructorIterable_order_add1__4);
        Assert.assertTrue(o_constructorIterable_order_add1__5);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add1__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add105_add817() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add105_add817__13 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add105_add817__13)));
        int o_constructorIterable_order_remove6_add105__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(4, ((int) (o_constructorIterable_order_remove6_add105_add817__13)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add142_add1159() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7_add142_add1159__8 = c.compare(this.equalFile1, this.equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add142_add1159__8)));
        int o_constructorIterable_order_remove7_add142__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7_add142_add1159__8)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add2_add64_add950() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add2_add64_add950__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add950__3);
        boolean o_constructorIterable_order_add2_add64__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add2__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add2__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add2__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_4 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_5 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add2_add64_add950__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add123_add1034() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add123__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add123_add1034__9 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1034__9);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1034__9);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add105_add812() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove6_add105_add812__11 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add105_add812__11)));
        boolean boolean_12 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_remove6_add105__13 = c.compare(this.moreFile, this.lessFile);
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-4, ((int) (o_constructorIterable_order_remove6_add105_add812__11)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add123_add1027() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1_add123__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add123_add1027__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1027__6);
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add123_add1027__6);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128_add918() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        int o_constructorIterable_order_add1_add128_add918__22 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add1_add128_add918__22)));
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add1_add128_add918__22)));
    }

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

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7_add145_add916() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7_add145_add916__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove7_add145_add916__3);
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_remove7_add145__11 = c.compare(this.lessFile, this.moreFile);
        boolean boolean_14 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove7_add145_add916__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove6_add96() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove6_add96__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove6_add96__3);
        boolean o_constructorIterable_order_remove6__3 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove6__6 = c.compare(equalFile1, equalFile2);
        boolean boolean_12 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_13 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove6_add96__3);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add135() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add3_add135__17 = c.compare(lessFile, moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add3_add135__17)));
        boolean boolean_6 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add3_add135__17)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add128_add910() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add128__9 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        int o_constructorIterable_order_add1_add128_add910__20 = c.compare(this.lessFile, this.moreFile);
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add1_add128_add910__20)));
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(-1, ((int) (o_constructorIterable_order_add1_add128_add910__20)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add137() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add3__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_6 = (c.compare(lessFile, moreFile)) < 0;
        int o_constructorIterable_order_add3_add137__19 = c.compare(this.moreFile, this.lessFile);
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add3_add137__19)));
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(1, ((int) (o_constructorIterable_order_add3_add137__19)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add3_add132() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add3__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add3__4 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add3__7 = c.compare(equalFile1, equalFile2);
        int o_constructorIterable_order_add3_add132__14 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3_add132__14)));
        int o_constructorIterable_order_add3__8 = c.compare(equalFile1, equalFile2);
        boolean boolean_6 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_7 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_add3_add132__14)));
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_add1_add125_add891() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_add1__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add125__6 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1__4 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        boolean o_constructorIterable_order_add1_add125_add891__12 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add891__12);
        boolean o_constructorIterable_order_add1__5 = list.add(ExtensionFileComparator.EXTENSION_COMPARATOR);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_add1__8 = c.compare(this.equalFile1, this.equalFile2);
        boolean boolean_2 = (c.compare(this.lessFile, this.moreFile)) < 0;
        boolean boolean_3 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_add1_add125_add891__12);
    }

    @Test(timeout = 10000)
    public void constructorIterable_order_remove7() throws Exception {
        final List<Comparator<File>> list = new ArrayList<>();
        boolean o_constructorIterable_order_remove7__3 = list.add(SizeFileComparator.SIZE_COMPARATOR);
        Assert.assertTrue(o_constructorIterable_order_remove7__3);
        final Comparator<File> c = new CompositeFileComparator(list);
        int o_constructorIterable_order_remove7__6 = c.compare(equalFile1, equalFile2);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7__6)));
        boolean boolean_14 = (c.compare(lessFile, moreFile)) < 0;
        boolean boolean_15 = (c.compare(this.moreFile, this.lessFile)) > 0;
        Assert.assertTrue(o_constructorIterable_order_remove7__3);
        Assert.assertEquals(0, ((int) (o_constructorIterable_order_remove7__6)));
    }
}

