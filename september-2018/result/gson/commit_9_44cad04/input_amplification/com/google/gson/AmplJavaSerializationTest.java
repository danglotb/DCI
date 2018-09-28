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
    public void testNumberIsSerializable_add34litString1004_failAssert51() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1W,3.14,6.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add34__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add34__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add34__15 = serialized.get(2);
            double o_testNumberIsSerializable_add34__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add34litString1004 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add30litString614_failAssert79() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6.673e-1_1]", type);
            List<Number> serialized = serializedCopy(list);
            Number o_testNumberIsSerializable_add30__11 = serialized.get(0);
            double o_testNumberIsSerializable_add30__12 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add30__14 = serialized.get(1).doubleValue();
            double o_testNumberIsSerializable_add30__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add30litString614 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializablelitString3_failAssert2() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = gson.fromJson("[1,3.14,6.r673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            serialized.get(0).doubleValue();
            serialized.get(1).doubleValue();
            serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializablelitString3 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add34litString998_failAssert52() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6.n73e-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add34__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add34__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add34__15 = serialized.get(2);
            double o_testNumberIsSerializable_add34__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add34litString998 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add32litString174_failAssert67() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,6.673I-11]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add32__11 = serialized.get(0).doubleValue();
            Number o_testNumberIsSerializable_add32__13 = serialized.get(1);
            double o_testNumberIsSerializable_add32__14 = serialized.get(1).doubleValue();
            double o_testNumberIsSerializable_add32__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add32litString174 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializablelitString2_failAssert1() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = gson.fromJson("[1,3.14,6<673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            serialized.get(0).doubleValue();
            serialized.get(1).doubleValue();
            serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializablelitString2 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add30litString610_failAssert80() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[1,3.14,P.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            Number o_testNumberIsSerializable_add30__11 = serialized.get(0);
            double o_testNumberIsSerializable_add30__12 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add30__14 = serialized.get(1).doubleValue();
            double o_testNumberIsSerializable_add30__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add30litString610 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializablelitString4_failAssert3() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = gson.fromJson("[1,3.146.673e-11]", type);
            List<Number> serialized = serializedCopy(list);
            serialized.get(0).doubleValue();
            serialized.get(1).doubleValue();
            serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializablelitString4 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberIsSerializable_add34litString994_failAssert46() throws Exception {
        try {
            Type type = new TypeToken<List<Number>>() {}.getType();
            List<Number> list = this.gson.fromJson("[\"a\",\"b\",\"c\"]", type);
            List<Number> serialized = serializedCopy(list);
            double o_testNumberIsSerializable_add34__11 = serialized.get(0).doubleValue();
            double o_testNumberIsSerializable_add34__13 = serialized.get(1).doubleValue();
            Number o_testNumberIsSerializable_add34__15 = serialized.get(2);
            double o_testNumberIsSerializable_add34__16 = serialized.get(2).doubleValue();
            org.junit.Assert.fail("testNumberIsSerializable_add34litString994 should have thrown JsonSyntaxException");
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

