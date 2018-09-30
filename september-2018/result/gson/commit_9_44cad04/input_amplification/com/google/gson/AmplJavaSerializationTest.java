package com.google.gson;


import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public final class AmplJavaSerializationTest {
    private final Gson gson = new Gson();

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add27_literalMutationString823_failAssert19() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14u,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add27__11 = serialized.get(0).doubleValue();
            Number o_testNumberIsSerializable_add27__13 = serialized.get(1);
            double o_testNumberIsSerializable_add27__14 = serialized.get(1).doubleValue();
            double o_testNumberIsSerializable_add27__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add27_literalMutationString823 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add25_literalMutationString961_failAssert28() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6.67Ze-11]", type);
            List<Number> serialized = serializedCopy(list);
            Number o_testNumberIsSerializable_add25__11 = serialized.get(0);
            double o_testNumberIsSerializable_add25__12 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add25__14 = serialized.get(1).doubleValue();
            double o_testNumberIsSerializable_add25__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add25_literalMutationString961 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add29_add366_literalMutationString4849_failAssert78() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,.14,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add29__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add29__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add29_add366__19 = serialized.get(2);
            Number o_testNumberIsSerializable_add29__15 = serialized.get(2);
            double o_testNumberIsSerializable_add29__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add29_add366_literalMutationString4849 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add27_literalMutationString827_failAssert20() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.1^,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add27__11 = serialized.get(0).doubleValue();
            Number o_testNumberIsSerializable_add27__13 = serialized.get(1);
            double o_testNumberIsSerializable_add27__14 = serialized.get(1).doubleValue();
            double o_testNumberIsSerializable_add27__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add27_literalMutationString827 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializablenull39_failAssert9_literalMutationString1158_failAssert43() throws Exception {
        try {
            try {
                Type type = new TypeToken<List<Number>>() {}.getType();
                List<Number> list = this.gson.fromJson("[1,.14,6.673e-11]", type);
                List<Number> serialized = serializedCopy(null);
                serialized.get(0).doubleValue();
                serialized.get(1).doubleValue();
                serialized.get(2).doubleValue();
                org.junit.Assert.fail("testNumberIsSerializablenull39 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testNumberIsSerializablenull39_failAssert9_literalMutationString1158 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("Expecting number, got: STRING", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add25_literalMutationString953_failAssert27() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.c14,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            Number o_testNumberIsSerializable_add25__11 = serialized.get(0);
            double o_testNumberIsSerializable_add25__12 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add25__14 = serialized.get(1).doubleValue();
            double o_testNumberIsSerializable_add25__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add25_literalMutationString953 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add27_add972_literalMutationString2663_failAssert59() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6.67Z3e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add27__11 = serialized.get(0).doubleValue();
            Number o_testNumberIsSerializable_add27__13 = serialized.get(1);
            double o_testNumberIsSerializable_add27__14 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add27_add972__22 = serialized.get(2);
            double o_testNumberIsSerializable_add27__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add27_add972_literalMutationString2663 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add25_add1046_literalMutationString4352_failAssert47() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1>,3.14,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            Number o_testNumberIsSerializable_add25__11 = serialized.get(0);
            double o_testNumberIsSerializable_add25__12 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add25__14 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add25_add1046__22 = serialized.get(2);
            double o_testNumberIsSerializable_add25__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add25_add1046_literalMutationString4352 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add29_literalMutationString175_failAssert11() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,u6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add29__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add29__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add29__15 = serialized.get(2);
            double o_testNumberIsSerializable_add29__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add29_literalMutationString175 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add27_add972_literalMutationString2660_failAssert69() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.1M,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add27__11 = serialized.get(0).doubleValue();
            Number o_testNumberIsSerializable_add27__13 = serialized.get(1);
            double o_testNumberIsSerializable_add27__14 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add27_add972__22 = serialized.get(2);
            double o_testNumberIsSerializable_add27__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add27_add972_literalMutationString2660 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add29_add378_literalMutationString2549_failAssert60() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6.6m3e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add29__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add29__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add29__15 = serialized.get(2);
            Number o_testNumberIsSerializable_add29_add378__22 = serialized.get(2);
            double o_testNumberIsSerializable_add29__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add29_add378_literalMutationString2549 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializablenull39_failAssert9_literalMutationString1149_failAssert44() throws Exception {
        try {
            try {
                Type type = new TypeToken<List<Number>>() {}.getType();
                List<Number> list = this.gson.fromJson("[1,3.14,6.a73e-11]", type);
                List<Number> serialized = serializedCopy(null);
                serialized.get(0).doubleValue();
                serialized.get(1).doubleValue();
                serialized.get(2).doubleValue();
                org.junit.Assert.fail("testNumberIsSerializablenull39 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testNumberIsSerializablenull39_failAssert9_literalMutationString1149 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("Expecting number, got: STRING", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add29_add366_literalMutationString4846_failAssert57() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6.6w73e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add29__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add29__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add29_add366__19 = serialized.get(2);
            Number o_testNumberIsSerializable_add29__15 = serialized.get(2);
            double o_testNumberIsSerializable_add29__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add29_add366_literalMutationString4846 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add29_add378_literalMutationString2547_failAssert58() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,H6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add29__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add29__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add29__15 = serialized.get(2);
            Number o_testNumberIsSerializable_add29_add378__22 = serialized.get(2);
            double o_testNumberIsSerializable_add29__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add29_add378_literalMutationString2547 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_literalMutationString3_failAssert2() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = gson.fromJson("[1A3.14,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            serialized.get(0).doubleValue();
            serialized.get(1).doubleValue();
            serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_literalMutationString3 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add29_add366_literalMutationString4850_failAssert63() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.1?,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add29__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add29__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add29_add366__19 = serialized.get(2);
            Number o_testNumberIsSerializable_add29__15 = serialized.get(2);
            double o_testNumberIsSerializable_add29__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add29_add366_literalMutationString4850 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add25_add1046_literalMutationString4358_failAssert48() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6`673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            Number o_testNumberIsSerializable_add25__11 = serialized.get(0);
            double o_testNumberIsSerializable_add25__12 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add25__14 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add25_add1046__22 = serialized.get(2);
            double o_testNumberIsSerializable_add25__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add25_add1046_literalMutationString4358 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_literalMutationString6_failAssert4() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = gson.fromJson("[1,3.1c4,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            serialized.get(0).doubleValue();
            serialized.get(1).doubleValue();
            serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_literalMutationString6 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private <T> T serializedCopy(T object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bytesOut);
        out.writeObject(object);
        out.close();
        ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytesOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bytesIn);
        return ((T) (in.readObject()));
    }
}

