package com.google.gson.functional;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.common.TestTypes;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AmplMapTest {
    private Gson gson;

    @Before
    public void setUp() throws Exception {
        gson = new Gson();
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add20_add1082_literalMutationString5752_failAssert41() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20_add1082__10 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_add1082_literalMutationString5752 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add20_add1067_literalMutationString5228_failAssert47() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20_add1067__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_add1067_literalMutationString5228 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add20_literalMutationString918_failAssert14() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{$123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_literalMutationString918 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMapnull35_failAssert7_literalMutationString552_failAssert23() throws Exception {
        try {
            try {
                Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
                ConcurrentMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
                map.size();
                map.containsKey(123);
                map.get(null);
                String json = this.gson.toJson(map);
                org.junit.Assert.fail("testConcurrentMapnull35 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testConcurrentMapnull35_failAssert7_literalMutationString552 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMapnull22560_failAssert202_literalMutationString23400_failAssert217() throws Exception {
        try {
            try {
                Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
                ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
                map.size();
                map.containsKey(null);
                map.get(123);
                String json = this.gson.toJson(map);
                org.junit.Assert.fail("testConcurrentHashMapnull22560 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testConcurrentHashMapnull22560_failAssert202_literalMutationString23400 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMap_add22546_add23735_literalMutationString26795_failAssert243() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add22546_add23735__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add22546__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentHashMap_add22546__10 = map.size();
            boolean o_testConcurrentHashMap_add22546__11 = map.containsKey(123);
            String o_testConcurrentHashMap_add22546__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentHashMap_add22546_add23735_literalMutationString26795 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMap_add22546_add23735_literalMutationString26789_failAssert241() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add22546_add23735__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add22546__7 = this.gson.fromJson("{5123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentHashMap_add22546__10 = map.size();
            boolean o_testConcurrentHashMap_add22546__11 = map.containsKey(123);
            String o_testConcurrentHashMap_add22546__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentHashMap_add22546_add23735_literalMutationString26789 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMapnull22561_failAssert203_literalMutationString23764_failAssert218() throws Exception {
        try {
            try {
                Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
                ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
                map.size();
                map.containsKey(123);
                map.get(null);
                String json = this.gson.toJson(map);
                org.junit.Assert.fail("testConcurrentHashMapnull22561 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testConcurrentHashMapnull22561_failAssert203_literalMutationString23764 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMap_add22546_add23738_literalMutationString26276_failAssert238() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add22546__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add22546_add23738__10 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentHashMap_add22546__10 = map.size();
            boolean o_testConcurrentHashMap_add22546__11 = map.containsKey(123);
            String o_testConcurrentHashMap_add22546__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentHashMap_add22546_add23738_literalMutationString26276 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMapnull7652_failAssert70_literalMutationString8567_failAssert86() throws Exception {
        try {
            try {
                Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
                ConcurrentNavigableMap<Integer, String> map = this.gson.fromJson("{x\"123\":\"456\"}", typeOfMap);
                map.size();
                map.containsKey(123);
                map.get(null);
                String json = this.gson.toJson(map);
                org.junit.Assert.fail("testConcurrentNavigableMapnull7652 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testConcurrentNavigableMapnull7652_failAssert70_literalMutationString8567 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_literalMutationString7622_failAssert66() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> map = gson.fromJson("{0\"123\":\"456\"}", typeOfMap);
            map.size();
            map.containsKey(123);
            map.get(123);
            String json = gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_literalMutationString7622 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15097_literalMutationString16373_failAssert141() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15097__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15097__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15097__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15097_literalMutationString16373 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15097_literalMutationString16400_failAssert138() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{m123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15097__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15097__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15097__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15097_literalMutationString16400 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15097_add16446_literalMutationString20300_failAssert170() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097_add16446__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15097__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15097__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15097__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15097_add16446_literalMutationString20300 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15097_add16446_literalMutationString20336_failAssert169() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097_add16446__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15097__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15097__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15097__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15097_add16446_literalMutationString20336 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15097_add16446_literalMutationString20302_failAssert162() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097__7 = this.gson.fromJson("{8\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097_add16446__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15097__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15097__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15097__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15097_add16446_literalMutationString20302 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15097_add16443_literalMutationString20829_failAssert173() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097_add16443__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15097__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{r123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15097__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15097__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15097__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15097_add16443_literalMutationString20829 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @SuppressWarnings({ "unused", "serial" })
    private static class MyParameterizedMap<K, V> extends LinkedHashMap<K, V> {
        final int foo;

        MyParameterizedMap(int foo) {
            this.foo = foo;
        }
    }

    private static class ClassWithAMap {
        Map<String, String> map = new TreeMap<String, String>();
    }

    private static class MyMap extends LinkedHashMap<String, String> {
        private static final long serialVersionUID = 1L;

        @SuppressWarnings("unused")
        int foo = 10;
    }

    private <K, V> Map<K, V> newMap(K key1, V value1, K key2, V value2) {
        Map<K, V> result = new LinkedHashMap<K, V>();
        result.put(key1, value1);
        result.put(key2, value2);
        return result;
    }

    static class Point {
        private final int x;

        private final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            return ((o instanceof AmplMapTest.Point) && ((x) == (((AmplMapTest.Point) (o)).x))) && ((y) == (((AmplMapTest.Point) (o)).y));
        }

        @Override
        public int hashCode() {
            return ((x) * 37) + (y);
        }

        @Override
        public String toString() {
            return ((x) + ",") + (y);
        }
    }

    static final class MapClass {
        private final Map<String, TestTypes.Base> bases = new HashMap<String, TestTypes.Base>();

        private final Map<String, TestTypes.Sub> subs = new HashMap<String, TestTypes.Sub>();

        public final void addBase(String name, TestTypes.Base value) {
            bases.put(name, value);
        }

        public final void addSub(String name, TestTypes.Sub value) {
            subs.put(name, value);
        }
    }

    static final class MapWithGeneralMapParameters {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        final Map<String, Object> map = new LinkedHashMap();
    }
}

