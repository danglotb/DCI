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
    public void testConcurrentMap_add20_add402_literalMutationString5788_failAssert35() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20_add402__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{n\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_add402_literalMutationString5788 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add20_add402_literalMutationString5765_failAssert44() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20_add402__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_add402_literalMutationString5765 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add20_literalMutationString324_failAssert10() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{8\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_literalMutationString324 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add20_add402_literalMutationString5790_failAssert45() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20_add402__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_add402_literalMutationString5790 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add20_add398_literalMutationString5332_failAssert50() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20_add398__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add20__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add20__10 = map.size();
            boolean o_testConcurrentMap_add20__11 = map.containsKey(123);
            String o_testConcurrentMap_add20__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add20_add398_literalMutationString5332 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMapnull22692_failAssert208_literalMutationString24005_failAssert221() throws Exception {
        try {
            try {
                Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
                ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{5\"123\":\"456\"}", typeOfMap);
                map.size();
                map.containsKey(123);
                map.get(null);
                String json = this.gson.toJson(map);
                org.junit.Assert.fail("testConcurrentHashMapnull22692 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testConcurrentHashMapnull22692_failAssert208_literalMutationString24005 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_add7592_add7974_literalMutationString12547_failAssert105() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add7592__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add7592_add7974__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentNavigableMap_add7592__10 = map.size();
            boolean o_testConcurrentNavigableMap_add7592__11 = map.containsKey(123);
            String o_testConcurrentNavigableMap_add7592__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_add7592_add7974_literalMutationString12547 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_literalMutationString7576_failAssert66() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> map = gson.fromJson("{6123\":\"456\"}", typeOfMap);
            map.size();
            map.containsKey(123);
            map.get(123);
            String json = gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_literalMutationString7576 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15042_add15485_literalMutationString19654_failAssert182() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15042_add15485__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15042__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15042__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15042__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15042__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15042_add15485_literalMutationString19654 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15042_add15490_literalMutationString20060_failAssert168() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15042__7 = this.gson.fromJson("{`\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15042_add15490__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15042__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15042__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15042__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15042_add15490_literalMutationString20060 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add15042_literalMutationString15358_failAssert147() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add15042__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add15042__10 = map.size();
            boolean o_testConcurrentSkipListMap_add15042__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add15042__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add15042_literalMutationString15358 should have thrown JsonSyntaxException");
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

