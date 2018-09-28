package com.google.gson.functional;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AmplPrimitiveTest {
    private Gson gson;

    @Before
    public void setUp() throws Exception {
        gson = new Gson();
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18_add518litString3692_failAssert65() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            Number o_testNumberDeserialization_add18_add518__19 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "N-e";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18_add518litString3692 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserializationlitString10_failAssert8() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = gson.fromJson(json, Number.class);
            expected.intValue();
            actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = gson.fromJson(json, Number.class);
            expected.longValue();
            actual.longValue();
            json = "scb";
            actual = gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserializationlitString10 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add14litString291_failAssert42() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add14__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add14__7 = expected.intValue();
            int o_testNumberDeserialization_add14__8 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__15 = expected.longValue();
            long o_testNumberDeserialization_add14__16 = actual.longValue();
            json = "6^F";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add14litString291 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add21litString257_failAssert32() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add21__6 = expected.intValue();
            int o_testNumberDeserialization_add21__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__14 = expected.longValue();
            long o_testNumberDeserialization_add21__15 = actual.longValue();
            json = "!OK";
            Number o_testNumberDeserialization_add21__17 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add21litString257 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add14_add528litString1543_failAssert73() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add14__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add14__7 = expected.intValue();
            int o_testNumberDeserialization_add14__8 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add14_add528__19 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__15 = expected.longValue();
            long o_testNumberDeserialization_add14__16 = actual.longValue();
            json = "1t.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add14_add528litString1543 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserializationlitString8_failAssert7() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = gson.fromJson(json, Number.class);
            expected.intValue();
            actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = gson.fromJson(json, Number.class);
            expected.longValue();
            actual.longValue();
            json = "1d.0";
            actual = gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserializationlitString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add21litString204_failAssert26() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add21__6 = expected.intValue();
            int o_testNumberDeserialization_add21__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__14 = expected.longValue();
            long o_testNumberDeserialization_add21__15 = actual.longValue();
            json = "-Infinity";
            Number o_testNumberDeserialization_add21__17 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add21litString204 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add14litString262_failAssert41() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add14__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add14__7 = expected.intValue();
            int o_testNumberDeserialization_add14__8 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__15 = expected.longValue();
            long o_testNumberDeserialization_add14__16 = actual.longValue();
            json = "1|.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add14litString262 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add21litString231_failAssert29() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add21__6 = expected.intValue();
            int o_testNumberDeserialization_add21__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__14 = expected.longValue();
            long o_testNumberDeserialization_add21__15 = actual.longValue();
            json = "1o.0";
            Number o_testNumberDeserialization_add21__17 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add21litString231 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18_add539litString2538_failAssert55() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "Gson should not accept NaN for serialization";
            Number o_testNumberDeserialization_add18_add539__28 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18_add539litString2538 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18_add518litString3681_failAssert71() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            Number o_testNumberDeserialization_add18_add518__19 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "1+.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18_add518litString3681 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18_add491litString3208_failAssert68() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18_add491__16 = this.gson.fromJson(json, Number.class);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "*{9";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18_add491litString3208 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add21_add366litString2374_failAssert54() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add21_add366__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add21__6 = expected.intValue();
            int o_testNumberDeserialization_add21__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__14 = expected.longValue();
            long o_testNumberDeserialization_add21__15 = actual.longValue();
            json = "Gson should not accept negative infinity for serialization by default";
            Number o_testNumberDeserialization_add21__17 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add21__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add21_add366litString2374 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18_add491litString3191_failAssert64() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18_add491__16 = this.gson.fromJson(json, Number.class);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "1u.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18_add491litString3191 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserializationlitString6_failAssert5() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = gson.fromJson(json, Number.class);
            expected.intValue();
            actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = gson.fromJson(json, Number.class);
            expected.longValue();
            actual.longValue();
            json = "String Blah Blah Blah...1, 2, 3";
            actual = gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserializationlitString6 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18litString207_failAssert15() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "1v.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18litString207 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18litString183_failAssert16() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "NaN";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18litString183 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18litString192_failAssert19() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "g.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18litString192 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add18_add456litString2951_failAssert57() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add18_add456__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add18__6 = expected.intValue();
            int o_testNumberDeserialization_add18__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add18__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__15 = expected.longValue();
            long o_testNumberDeserialization_add18__16 = actual.longValue();
            json = "Gson should not accept NaN for serialization";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add18__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add18_add456litString2951 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    private String extractElementFromArray(String json) {
        return json.substring(((json.indexOf('[')) + 1), json.indexOf(']'));
    }

    private static class ClassWithIntegerField {
        Integer i;
    }
}

