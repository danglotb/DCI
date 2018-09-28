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
    public void testConcurrentMaplitNum16litString1207_failAssert50() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{Y\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMaplitNum16__9 = map.size();
            boolean o_testConcurrentMaplitNum16__10 = map.containsKey(123);
            map.get(122);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMaplitNum16litString1207 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add22_add990litString4029_failAssert102() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22_add990__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add22__10 = map.size();
            boolean o_testConcurrentMap_add22__11 = map.containsKey(123);
            String o_testConcurrentMap_add22__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add22_add990litString4029 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add22_add977litString3194_failAssert104() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22_add977__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{&\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add22__10 = map.size();
            boolean o_testConcurrentMap_add22__11 = map.containsKey(123);
            String o_testConcurrentMap_add22__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add22_add977litString3194 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMaplitString2_failAssert1() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> map = gson.fromJson("{r123\":\"456\"}", typeOfMap);
            map.size();
            map.containsKey(123);
            map.get(123);
            String json = gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMaplitString2 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add22litString673_failAssert12() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22__7 = this.gson.fromJson("{L123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add22__10 = map.size();
            boolean o_testConcurrentMap_add22__11 = map.containsKey(123);
            String o_testConcurrentMap_add22__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add22litString673 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_add7145_add7757litString10498_failAssert172() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add7145_add7757__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add7145__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentNavigableMap_add7145__10 = map.size();
            boolean o_testConcurrentNavigableMap_add7145__11 = map.containsKey(123);
            String o_testConcurrentNavigableMap_add7145__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_add7145_add7757litString10498 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add14154_add15237litString18273_failAssert251() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add14154__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add14154_add15237__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{a:\'1\',b:\'2\'}", typeOfMap);
            int o_testConcurrentSkipListMap_add14154__10 = map.size();
            boolean o_testConcurrentSkipListMap_add14154__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add14154__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add14154_add15237litString18273 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMapnull14168_failAssert213litString15010_failAssert248() throws Exception {
        try {
            try {
                Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
                ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
                map.size();
                map.containsKey(null);
                map.get(123);
                String json = this.gson.toJson(map);
                org.junit.Assert.fail("testConcurrentSkipListMapnull14168 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testConcurrentSkipListMapnull14168_failAssert213litString15010 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add14154litString15019_failAssert221() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add14154__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add14154__10 = map.size();
            boolean o_testConcurrentSkipListMap_add14154__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add14154__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add14154litString15019 should have thrown JsonSyntaxException");
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

