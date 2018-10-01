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
    public void testAtomicLongWithStringSerializationPolicy_add10_literalMutationString162_failAssert19() throws Exception {
        try {
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder target = gson.fromJson("{\'value\':V10\'}", AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder.class);
            target.value.get();
            target.value.get();
            String json = gson.toJson(target);
            org.junit.Assert.fail("testAtomicLongWithStringSerializationPolicy_add10_literalMutationString162 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 10 path $.value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongWithStringSerializationPolicynull15_literalMutationString78_failAssert13() throws Exception {
        try {
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder target = gson.fromJson("{\'value\':10\'}", AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder.class);
            target.value.get();
            String json = gson.toJson(null);
            org.junit.Assert.fail("testAtomicLongWithStringSerializationPolicynull15_literalMutationString78 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 10 path $.value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5475_add6452_literalMutationString8415_failAssert89() throws Exception {
        try {
            Object __DSPOT_src_1632 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\', \'13\',s \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5475_add6452__23 = gson.toJsonTree(__DSPOT_src_1632);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__15 = gson.toJsonTree(__DSPOT_src_1632);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5475_add6452_literalMutationString8415 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 13 path $[2]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5475_mg6654_literalMutationString11297_failAssert102() throws Exception {
        try {
            Object __DSPOT_src_1703 = new Object();
            Object __DSPOT_src_1632 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[10\', \'13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__15 = gson.toJsonTree(__DSPOT_src_1632);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5475_mg6654__28 = gson.toJsonTree(__DSPOT_src_1703);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5475_mg6654_literalMutationString11297 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 2 path $[0]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5475_literalMutationString5933_failAssert60() throws Exception {
        try {
            Object __DSPOT_src_1632 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\',t\'13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__15 = gson.toJsonTree(__DSPOT_src_1632);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5475_literalMutationString5933 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 7 path $[1]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_literalMutationString5450_failAssert56() throws Exception {
        try {
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\',3\'13\', \'14\']", AtomicLongArray.class);
            target.length();
            target.get(0);
            target.get(1);
            target.get(2);
            String json = gson.toJson(target);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_literalMutationString5450 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 7 path $[1]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5475_literalMutationString5949_failAssert61() throws Exception {
        try {
            Object __DSPOT_src_1632 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\', \'13\', H\'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5475__15 = gson.toJsonTree(__DSPOT_src_1632);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5475_literalMutationString5949 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 14 path $[2]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_literalMutationNumber5465_failAssert59_literalMutationString5910_failAssert83() throws Exception {
        try {
            try {
                Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
                AtomicLongArray target = gson.fromJson("[\'10\', \'13\',M \'14\']", AtomicLongArray.class);
                target.length();
                target.get(0);
                target.get(1);
                target.get(3);
                String json = gson.toJson(target);
                org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_literalMutationNumber5465 should have thrown IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException expected) {
            }
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_literalMutationNumber5465_failAssert59_literalMutationString5910 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 13 path $[2]", expected_1.getMessage());
        }
    }

    private static class AtomicLongHolder {
        AtomicLong value;
    }
}

