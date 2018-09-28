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
    public void testAtomicLongWithStringSerializationPolicy_add9litString121_failAssert55() throws Exception {
        try {
            new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder target = gson.fromJson("{\'value\':A\'10\'}", AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder.class);
            target.value.get();
            String json = gson.toJson(target);
            org.junit.Assert.fail("testAtomicLongWithStringSerializationPolicy_add9litString121 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 10 path $.value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicylitString5407_failAssert67() throws Exception {
        try {
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\', 13\', \'14\']", AtomicLongArray.class);
            target.length();
            target.get(0);
            target.get(1);
            target.get(2);
            String json = gson.toJson(target);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitString5407 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 8 path $[1]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicylitNum5423_failAssert79litString5623_failAssert122() throws Exception {
        try {
            try {
                Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
                AtomicLongArray target = gson.fromJson("[\'10\', \'13\',y \'14\']", AtomicLongArray.class);
                target.length();
                target.get(0);
                target.get(1);
                target.get(3);
                String json = gson.toJson(target);
                org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5423 should have thrown IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5423_failAssert79litString5623 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 13 path $[2]", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicylitNum5422_failAssert78litString5576_failAssert129() throws Exception {
        try {
            try {
                Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
                AtomicLongArray target = gson.fromJson("[\'10\', i13\', \'14\']", AtomicLongArray.class);
                target.length();
                target.get(0);
                target.get(1986476324);
                target.get(2);
                String json = gson.toJson(target);
                org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5422 should have thrown IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5422_failAssert78litString5576 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 8 path $[1]", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5438litString5572_failAssert89() throws Exception {
        try {
            Object __DSPOT_src_1551 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[V\'10\', \'13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__15 = gson.toJsonTree(__DSPOT_src_1551);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5438litString5572 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 2 path $[0]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicylitNum5417_failAssert75litString5550_failAssert125() throws Exception {
        try {
            try {
                Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
                AtomicLongArray target = gson.fromJson("[\'10\', \'13\', 14\']", AtomicLongArray.class);
                target.length();
                target.get(-189454149);
                target.get(1);
                target.get(2);
                String json = gson.toJson(target);
                org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5417 should have thrown IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5417_failAssert75litString5550 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 14 path $[2]", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicylitNum5428_failAssert82litString6012_failAssert128() throws Exception {
        try {
            try {
                Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
                AtomicLongArray target = gson.fromJson("[\'10\', z13\', \'14\']", AtomicLongArray.class);
                target.length();
                target.get(0);
                target.get(1);
                target.get(1969450161);
                String json = gson.toJson(target);
                org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5428 should have thrown IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicylitNum5428_failAssert82litString6012 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 8 path $[1]", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5438_mg6751litString7337_failAssert153() throws Exception {
        try {
            Object __DSPOT_src_1632 = new Object();
            Object __DSPOT_src_1551 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[Y\'10\', \'13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__15 = gson.toJsonTree(__DSPOT_src_1551);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5438_mg6751__28 = gson.toJsonTree(__DSPOT_src_1632);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5438_mg6751litString7337 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 2 path $[0]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5438_mg6751litString7353_failAssert156() throws Exception {
        try {
            Object __DSPOT_src_1632 = new Object();
            Object __DSPOT_src_1551 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\', 13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5438__15 = gson.toJsonTree(__DSPOT_src_1551);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5438_mg6751__28 = gson.toJsonTree(__DSPOT_src_1632);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5438_mg6751litString7353 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 8 path $[1]", expected.getMessage());
        }
    }

    private static class AtomicLongHolder {
        AtomicLong value;
    }
}

