package com.google.gson.functional;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.google.gson.LongSerializationPolicy;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AmplJavaUtilConcurrentAtomicTest {
    private Gson gson;

    @Before
    public void setUp() throws Exception {
        gson = new Gson();
    }

    @Test(timeout = 10000)
    public void testAtomicLongWithStringSerializationPolicy_add11litString96_failAssert51() throws Exception {
        try {
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            gson.fromJson("{'value':'10'}", AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder.class);
            AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder target = gson.fromJson("{\'value\':)\'10\'}", AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder.class);
            target.value.get();
            String json = gson.toJson(target);
            org.junit.Assert.fail("testAtomicLongWithStringSerializationPolicy_add11litString96 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 10 path $.value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongWithStringSerializationPolicy_mg15_add285litString2596_failAssert58() throws Exception {
        try {
            Object __DSPOT_src_1 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder target = gson.fromJson("{\'value\':10\'}", AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder.class);
            target.value.get();
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongWithStringSerializationPolicy_mg15_add285__12 = gson.toJsonTree(__DSPOT_src_1);
            JsonElement o_testAtomicLongWithStringSerializationPolicy_mg15__12 = gson.toJsonTree(__DSPOT_src_1);
            org.junit.Assert.fail("testAtomicLongWithStringSerializationPolicy_mg15_add285litString2596 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 10 path $.value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5503_mg6814litString9220_failAssert161() throws Exception {
        try {
            Object __DSPOT_src_871 = new Object();
            Object __DSPOT_src_790 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\', 13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__15 = gson.toJsonTree(__DSPOT_src_790);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5503_mg6814__28 = gson.toJsonTree(__DSPOT_src_871);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5503_mg6814litString9220 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 8 path $[1]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5503_mg6814litString9179_failAssert159() throws Exception {
        try {
            Object __DSPOT_src_871 = new Object();
            Object __DSPOT_src_790 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\', \'13\',2\'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__15 = gson.toJsonTree(__DSPOT_src_790);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5503_mg6814__28 = gson.toJsonTree(__DSPOT_src_871);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5503_mg6814litString9179 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 13 path $[2]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5503_add6563litString8804_failAssert142() throws Exception {
        try {
            Object __DSPOT_src_790 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[H10\', \'13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5503_add6563__23 = gson.toJsonTree(__DSPOT_src_790);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5503__15 = gson.toJsonTree(__DSPOT_src_790);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5503_add6563litString8804 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 2 path $[0]", expected.getMessage());
        }
    }

    private static class AtomicLongHolder {
        AtomicLong value;
    }
}

