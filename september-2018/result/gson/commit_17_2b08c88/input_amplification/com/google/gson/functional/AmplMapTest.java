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
    public void testConcurrentMaplitNum19litString777_failAssert42() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{*\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMaplitNum19__9 = map.size();
            boolean o_testConcurrentMaplitNum19__10 = map.containsKey(123);
            map.get(0);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMaplitNum19litString777 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add22_add651litString5291_failAssert63() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22_add651__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{P\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add22__10 = map.size();
            boolean o_testConcurrentMap_add22__11 = map.containsKey(123);
            String o_testConcurrentMap_add22__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add22_add651litString5291 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentMap_add22_add635litString4265_failAssert74() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentMap<Integer, String>>() {}.getType();
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22_add635__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> o_testConcurrentMap_add22__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentMap<Integer, String> map = this.gson.fromJson("{I123\":\"456\"}", typeOfMap);
            int o_testConcurrentMap_add22__10 = map.size();
            boolean o_testConcurrentMap_add22__11 = map.containsKey(123);
            String o_testConcurrentMap_add22__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentMap_add22_add635litString4265 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMap_add21119litString21277_failAssert298() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add21119__7 = this.gson.fromJson("{9123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentHashMap_add21119__10 = map.size();
            boolean o_testConcurrentHashMap_add21119__11 = map.containsKey(123);
            String o_testConcurrentHashMap_add21119__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentHashMap_add21119litString21277 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMap_add21119_add21806litString24551_failAssert348() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add21119_add21806__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add21119__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{M\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentHashMap_add21119__10 = map.size();
            boolean o_testConcurrentHashMap_add21119__11 = map.containsKey(123);
            String o_testConcurrentHashMap_add21119__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentHashMap_add21119_add21806litString24551 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentHashMap_add21119litString21349_failAssert299() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentHashMap<Integer, String>>() {}.getType();
            ConcurrentHashMap<Integer, String> o_testConcurrentHashMap_add21119__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentHashMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentHashMap_add21119__10 = map.size();
            boolean o_testConcurrentHashMap_add21119__11 = map.containsKey(123);
            String o_testConcurrentHashMap_add21119__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentHashMap_add21119litString21349 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_add6918litString7851_failAssert125() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add6918__7 = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentNavigableMap_add6918__10 = map.size();
            boolean o_testConcurrentNavigableMap_add6918__11 = map.containsKey(123);
            String o_testConcurrentNavigableMap_add6918__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_add6918litString7851 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_add6918litString7904_failAssert126() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add6918__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentNavigableMap_add6918__10 = map.size();
            boolean o_testConcurrentNavigableMap_add6918__11 = map.containsKey(123);
            String o_testConcurrentNavigableMap_add6918__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_add6918litString7904 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_add6918_add8155litString13021_failAssert158() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add6918__7 = this.gson.fromJson("{O\"123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add6918_add8155__10 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentNavigableMap_add6918__10 = map.size();
            boolean o_testConcurrentNavigableMap_add6918__11 = map.containsKey(123);
            String o_testConcurrentNavigableMap_add6918__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_add6918_add8155litString13021 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentNavigableMap_add6918_add8155litString13056_failAssert157() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentNavigableMap<Integer, String>>() {}.getType();
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add6918__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> o_testConcurrentNavigableMap_add6918_add8155__10 = this.gson.fromJson("{z\"123\":\"456\"}", typeOfMap);
            ConcurrentNavigableMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentNavigableMap_add6918__10 = map.size();
            boolean o_testConcurrentNavigableMap_add6918__11 = map.containsKey(123);
            String o_testConcurrentNavigableMap_add6918__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentNavigableMap_add6918_add8155litString13056 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add13934litString14427_failAssert223() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add13934__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add13934__10 = map.size();
            boolean o_testConcurrentSkipListMap_add13934__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add13934__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add13934litString14427 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add13938_add14370litString17061_failAssert256() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add13938_add14370__7 = this.gson.fromJson("{X\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add13938__9 = map.size();
            boolean o_testConcurrentSkipListMap_add13938__10 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add13938__11 = map.get(123);
            String o_testConcurrentSkipListMap_add13938__12 = this.gson.toJson(map);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add13938_add14370litString17061 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected an int but was STRING at line 1 column 2 path $.", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testConcurrentSkipListMap_add13934_add14587litString19677_failAssert274() throws Exception {
        try {
            Type typeOfMap = new TypeToken<ConcurrentSkipListMap<Integer, String>>() {}.getType();
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add13934_add14587__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> o_testConcurrentSkipListMap_add13934__7 = this.gson.fromJson("{\"123\":\"456\"}", typeOfMap);
            ConcurrentSkipListMap<Integer, String> map = this.gson.fromJson("{5\"123\":\"456\"}", typeOfMap);
            int o_testConcurrentSkipListMap_add13934__10 = map.size();
            boolean o_testConcurrentSkipListMap_add13934__11 = map.containsKey(123);
            String o_testConcurrentSkipListMap_add13934__12 = map.get(123);
            String json = this.gson.toJson(map);
            org.junit.Assert.fail("testConcurrentSkipListMap_add13934_add14587litString19677 should have thrown JsonSyntaxException");
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

