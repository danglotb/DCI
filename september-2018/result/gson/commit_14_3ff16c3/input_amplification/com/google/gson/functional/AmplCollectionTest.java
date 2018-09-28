package com.google.gson.functional;


import com.google.gson.Gson;
import com.google.gson.common.TestTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AmplCollectionTest {
    private Gson gson;

    @Before
    public void setUp() throws Exception {
        gson = new Gson();
    }

    static class HasArrayListField {
        ArrayList<Long> longs = new ArrayList<Long>();
    }

    @SuppressWarnings("rawtypes")
    private static int[] toIntArray(Collection collection) {
        int[] ints = new int[collection.size()];
        int i = 0;
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ++i) {
            Object obj = iterator.next();
            if (obj instanceof Integer) {
                ints[i] = ((Integer) (obj)).intValue();
            }else
                if (obj instanceof Long) {
                    ints[i] = ((Long) (obj)).intValue();
                }

        }
        return ints;
    }

    private static class ObjectWithWildcardCollection {
        private final Collection<? extends TestTypes.BagOfPrimitives> collection;

        public ObjectWithWildcardCollection(Collection<? extends TestTypes.BagOfPrimitives> collection) {
            this.collection = collection;
        }

        public Collection<? extends TestTypes.BagOfPrimitives> getCollection() {
            return collection;
        }
    }

    private static class Entry {
        int value;

        Entry(int value) {
            this.value = value;
        }
    }

    @Test(timeout = 10000)
    public void testSetSerialization_add32420litString32702() throws Exception {
        Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
        boolean o_testSetSerialization_add32420__3 = set.add(new AmplCollectionTest.Entry(1));
        boolean o_testSetSerialization_add32420__5 = set.add(new AmplCollectionTest.Entry(2));
        String json = this.gson.toJson(set);
        Assert.assertEquals("[{\"value\":2},{\"value\":1}]", json);
        boolean o_testSetSerialization_add32420__9 = json.contains("1");
        boolean o_testSetSerialization_add32420__10 = json.contains("2");
        boolean o_testSetSerialization_add32420__11 = json.contains(":");
        Assert.assertEquals("[{\"value\":2},{\"value\":1}]", json);
    }

    @Test(timeout = 10000)
    public void testSetSerializationnull32425_failAssert93litNum32959() throws Exception {
        try {
            Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
            boolean o_testSetSerializationnull32425_failAssert93litNum32959__5 = set.add(new AmplCollectionTest.Entry(1));
            Assert.assertTrue(o_testSetSerializationnull32425_failAssert93litNum32959__5);
            boolean o_testSetSerializationnull32425_failAssert93litNum32959__7 = set.add(new AmplCollectionTest.Entry(Integer.MAX_VALUE));
            Assert.assertTrue(o_testSetSerializationnull32425_failAssert93litNum32959__7);
            String json = this.gson.toJson(set);
            Assert.assertEquals("[{\"value\":1},{\"value\":2147483647}]", json);
            boolean o_testSetSerializationnull32425_failAssert93litNum32959__11 = json.contains("1");
            Assert.assertTrue(o_testSetSerializationnull32425_failAssert93litNum32959__11);
            json.contains(null);
            org.junit.Assert.fail("testSetSerializationnull32425 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testSetSerializationnull32425_failAssert93_add33118litNum35466() throws Exception {
        try {
            Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
            boolean o_testSetSerializationnull32425_failAssert93_add33118__5 = set.add(new AmplCollectionTest.Entry(0));
            boolean o_testSetSerializationnull32425_failAssert93_add33118__7 = set.add(new AmplCollectionTest.Entry(2));
            String json = this.gson.toJson(set);
            Assert.assertEquals("[{\"value\":2},{\"value\":0}]", json);
            boolean o_testSetSerializationnull32425_failAssert93_add33118__11 = json.contains("1");
            boolean o_testSetSerializationnull32425_failAssert93_add33118__12 = json.contains("1");
            json.contains(null);
            org.junit.Assert.fail("testSetSerializationnull32425 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testSetSerialization_add32420() throws Exception {
        Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
        boolean o_testSetSerialization_add32420__3 = set.add(new AmplCollectionTest.Entry(1));
        Assert.assertTrue(o_testSetSerialization_add32420__3);
        boolean o_testSetSerialization_add32420__5 = set.add(new AmplCollectionTest.Entry(2));
        Assert.assertTrue(o_testSetSerialization_add32420__5);
        String json = gson.toJson(set);
        Assert.assertEquals("[{\"value\":1},{\"value\":2}]", json);
        boolean o_testSetSerialization_add32420__9 = json.contains("1");
        Assert.assertTrue(o_testSetSerialization_add32420__9);
        boolean o_testSetSerialization_add32420__10 = json.contains("2");
        Assert.assertTrue(o_testSetSerialization_add32420__10);
        boolean o_testSetSerialization_add32420__11 = json.contains("2");
        Assert.assertTrue(o_testSetSerialization_add32420__11);
        Assert.assertTrue(o_testSetSerialization_add32420__3);
        Assert.assertTrue(o_testSetSerialization_add32420__5);
        Assert.assertEquals("[{\"value\":1},{\"value\":2}]", json);
        Assert.assertTrue(o_testSetSerialization_add32420__9);
        Assert.assertTrue(o_testSetSerialization_add32420__10);
    }

    @Test(timeout = 10000)
    public void testSetSerialization_add32417_add33015() throws Exception {
        Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
        boolean o_testSetSerialization_add32417__3 = set.add(new AmplCollectionTest.Entry(1));
        boolean o_testSetSerialization_add32417__5 = set.add(new AmplCollectionTest.Entry(2));
        boolean o_testSetSerialization_add32417__7 = set.add(new AmplCollectionTest.Entry(2));
        String o_testSetSerialization_add32417_add33015__15 = this.gson.toJson(set);
        Assert.assertEquals("[{\"value\":2},{\"value\":2},{\"value\":1}]", o_testSetSerialization_add32417_add33015__15);
        String json = this.gson.toJson(set);
        Assert.assertEquals("[{\"value\":2},{\"value\":2},{\"value\":1}]", json);
        boolean o_testSetSerialization_add32417__11 = json.contains("1");
        boolean o_testSetSerialization_add32417__12 = json.contains("2");
        Assert.assertEquals("[{\"value\":2},{\"value\":2},{\"value\":1}]", o_testSetSerialization_add32417_add33015__15);
        Assert.assertEquals("[{\"value\":2},{\"value\":2},{\"value\":1}]", json);
    }

    @Test(timeout = 10000)
    public void testSetSerializationnull32425_failAssert93_add33106litString34221() throws Exception {
        try {
            Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
            boolean o_testSetSerializationnull32425_failAssert93_add33106__5 = set.add(new AmplCollectionTest.Entry(1));
            boolean o_testSetSerializationnull32425_failAssert93_add33106__7 = set.add(new AmplCollectionTest.Entry(2));
            boolean o_testSetSerializationnull32425_failAssert93_add33106__9 = set.add(new AmplCollectionTest.Entry(2));
            String json = this.gson.toJson(set);
            Assert.assertEquals("[{\"value\":2},{\"value\":2},{\"value\":1}]", json);
            boolean o_testSetSerializationnull32425_failAssert93_add33106__13 = json.contains("World");
            json.contains(null);
            org.junit.Assert.fail("testSetSerializationnull32425 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testSetSerializationnull32425_failAssert93_add33106_add34683() throws Exception {
        try {
            Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
            boolean o_testSetSerializationnull32425_failAssert93_add33106_add34683__5 = set.add(new AmplCollectionTest.Entry(1));
            Assert.assertTrue(o_testSetSerializationnull32425_failAssert93_add33106_add34683__5);
            boolean o_testSetSerializationnull32425_failAssert93_add33106__5 = set.add(new AmplCollectionTest.Entry(1));
            boolean o_testSetSerializationnull32425_failAssert93_add33106__7 = set.add(new AmplCollectionTest.Entry(2));
            boolean o_testSetSerializationnull32425_failAssert93_add33106__9 = set.add(new AmplCollectionTest.Entry(2));
            String json = this.gson.toJson(set);
            Assert.assertEquals("[{\"value\":2},{\"value\":2},{\"value\":1},{\"value\":1}]", json);
            boolean o_testSetSerializationnull32425_failAssert93_add33106__13 = json.contains("1");
            json.contains(null);
            org.junit.Assert.fail("testSetSerializationnull32425 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testSetSerialization_add32417_add33015_add36528() throws Exception {
        Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
        boolean o_testSetSerialization_add32417__3 = set.add(new AmplCollectionTest.Entry(1));
        boolean o_testSetSerialization_add32417__5 = set.add(new AmplCollectionTest.Entry(2));
        boolean o_testSetSerialization_add32417_add33015_add36528__11 = set.add(new AmplCollectionTest.Entry(2));
        Assert.assertTrue(o_testSetSerialization_add32417_add33015_add36528__11);
        boolean o_testSetSerialization_add32417__7 = set.add(new AmplCollectionTest.Entry(2));
        String o_testSetSerialization_add32417_add33015__15 = this.gson.toJson(set);
        Assert.assertEquals("[{\"value\":2},{\"value\":1},{\"value\":2},{\"value\":2}]", o_testSetSerialization_add32417_add33015__15);
        String json = this.gson.toJson(set);
        Assert.assertEquals("[{\"value\":2},{\"value\":1},{\"value\":2},{\"value\":2}]", json);
        boolean o_testSetSerialization_add32417__11 = json.contains("1");
        boolean o_testSetSerialization_add32417__12 = json.contains("2");
        Assert.assertTrue(o_testSetSerialization_add32417_add33015_add36528__11);
        Assert.assertEquals("[{\"value\":2},{\"value\":1},{\"value\":2},{\"value\":2}]", o_testSetSerialization_add32417_add33015__15);
        Assert.assertEquals("[{\"value\":2},{\"value\":1},{\"value\":2},{\"value\":2}]", json);
    }

    @Test(timeout = 10000)
    public void testSetSerialization_add32417_add33015litNum36430() throws Exception {
        Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
        boolean o_testSetSerialization_add32417__3 = set.add(new AmplCollectionTest.Entry(1));
        boolean o_testSetSerialization_add32417__5 = set.add(new AmplCollectionTest.Entry(Integer.MAX_VALUE));
        boolean o_testSetSerialization_add32417__7 = set.add(new AmplCollectionTest.Entry(2));
        String o_testSetSerialization_add32417_add33015__15 = this.gson.toJson(set);
        Assert.assertEquals("[{\"value\":2},{\"value\":2147483647},{\"value\":1}]", o_testSetSerialization_add32417_add33015__15);
        String json = this.gson.toJson(set);
        Assert.assertEquals("[{\"value\":2},{\"value\":2147483647},{\"value\":1}]", json);
        boolean o_testSetSerialization_add32417__11 = json.contains("1");
        boolean o_testSetSerialization_add32417__12 = json.contains("2");
        Assert.assertEquals("[{\"value\":2},{\"value\":2147483647},{\"value\":1}]", o_testSetSerialization_add32417_add33015__15);
        Assert.assertEquals("[{\"value\":2},{\"value\":2147483647},{\"value\":1}]", json);
    }

    @Test(timeout = 10000)
    public void testSetSerializationnull32424_failAssert92_add33165() throws Exception {
        try {
            Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
            boolean o_testSetSerializationnull32424_failAssert92_add33165__5 = set.add(new AmplCollectionTest.Entry(1));
            Assert.assertTrue(o_testSetSerializationnull32424_failAssert92_add33165__5);
            boolean o_testSetSerializationnull32424_failAssert92_add33165__7 = set.add(new AmplCollectionTest.Entry(2));
            Assert.assertTrue(o_testSetSerializationnull32424_failAssert92_add33165__7);
            String o_testSetSerializationnull32424_failAssert92_add33165__9 = this.gson.toJson(set);
            Assert.assertEquals("[{\"value\":1},{\"value\":2}]", o_testSetSerializationnull32424_failAssert92_add33165__9);
            String json = this.gson.toJson(set);
            Assert.assertEquals("[{\"value\":1},{\"value\":2}]", json);
            json.contains(null);
            json.contains("2");
            org.junit.Assert.fail("testSetSerializationnull32424 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testSetSerializationnull32425_failAssert93_add33118litNum35491() throws Exception {
        try {
            Set<AmplCollectionTest.Entry> set = new HashSet<AmplCollectionTest.Entry>();
            boolean o_testSetSerializationnull32425_failAssert93_add33118__5 = set.add(new AmplCollectionTest.Entry(1));
            boolean o_testSetSerializationnull32425_failAssert93_add33118__7 = set.add(new AmplCollectionTest.Entry(3));
            String json = this.gson.toJson(set);
            Assert.assertEquals("[{\"value\":1},{\"value\":3}]", json);
            boolean o_testSetSerializationnull32425_failAssert93_add33118__11 = json.contains("1");
            boolean o_testSetSerializationnull32425_failAssert93_add33118__12 = json.contains("1");
            json.contains(null);
            org.junit.Assert.fail("testSetSerializationnull32425 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}

