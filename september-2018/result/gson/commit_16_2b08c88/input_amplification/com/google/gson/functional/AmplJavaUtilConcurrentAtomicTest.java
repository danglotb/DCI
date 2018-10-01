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
    public void testAtomicLongWithStringSerializationPolicy_mg13_add271_literalMutationString2774_failAssert50() throws Exception {
        try {
            Object __DSPOT_src_866 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder target = gson.fromJson("{\'value\':`10\'}", AmplJavaUtilConcurrentAtomicTest.AtomicLongHolder.class);
            target.value.get();
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongWithStringSerializationPolicy_mg13_add271__12 = gson.toJsonTree(__DSPOT_src_866);
            JsonElement o_testAtomicLongWithStringSerializationPolicy_mg13__12 = gson.toJsonTree(__DSPOT_src_866);
            org.junit.Assert.fail("testAtomicLongWithStringSerializationPolicy_mg13_add271_literalMutationString2774 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 10 path $.value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5617_add6092_literalMutationString9333_failAssert85() throws Exception {
        try {
            Object __DSPOT_src_1644 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[\'10\', \'13\', 14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5617_add6092__23 = gson.toJsonTree(__DSPOT_src_1644);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__15 = gson.toJsonTree(__DSPOT_src_1644);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5617_add6092_literalMutationString9333 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 14 path $[2]", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testAtomicLongArrayWithStringSerializationPolicy_mg5617_add6092_literalMutationString9422_failAssert81() throws Exception {
        try {
            Object __DSPOT_src_1644 = new Object();
            Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
            AtomicLongArray target = gson.fromJson("[u\'10\', \'13\', \'14\']", AtomicLongArray.class);
            int o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__9 = target.length();
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__10 = target.get(0);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__11 = target.get(1);
            long o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__12 = target.get(2);
            String json = gson.toJson(target);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5617_add6092__23 = gson.toJsonTree(__DSPOT_src_1644);
            JsonElement o_testAtomicLongArrayWithStringSerializationPolicy_mg5617__15 = gson.toJsonTree(__DSPOT_src_1644);
            org.junit.Assert.fail("testAtomicLongArrayWithStringSerializationPolicy_mg5617_add6092_literalMutationString9422 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("java.lang.IllegalStateException: Expected a long but was STRING at line 1 column 2 path $[0]", expected.getMessage());
        }
    }

    private static class AtomicLongHolder {
        AtomicLong value;
    }
}

