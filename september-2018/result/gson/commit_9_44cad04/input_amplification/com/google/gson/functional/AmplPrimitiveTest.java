package com.google.gson.functional;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
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
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2484() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2484__23 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2484__23)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1425() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add132_add1938() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1938__6 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("1", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1938__6)).toString());
            Assert.assertEquals(49, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1938__6)).hashCode())));
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1420() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1385() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1385__11 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1385__11)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1393() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            String o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1393__14 = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1393__14);
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_literalMutationString1348() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "*.0";
            Assert.assertEquals("*.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1648() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            String o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1648__14 = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1648__14);
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1595() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1595__23 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1595__23)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add376() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18)));
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2479() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2479__20 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2479__20)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18)));
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add14_literalMutationString117_failAssert12() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add14__6 = expected.intValue();
            int o_testNumberDeserialization_add14__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add14__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__15 = expected.longValue();
            long o_testNumberDeserialization_add14__16 = actual.longValue();
            json = "t.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add14_literalMutationString117 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2498() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add134_add1870() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_literalMutationString1356() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "kW.0";
            Assert.assertEquals("kW.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1398() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1398__18 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("9223372036854775807", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1398__18)).toString());
            Assert.assertEquals(-1773151198, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1398__18)).hashCode())));
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2490() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2490__26 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2490__26)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1656() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1656__18 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("9223372036854775807", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1656__18)).toString());
            Assert.assertEquals(-1773151198, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1656__18)).hashCode())));
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__16)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString335__17)));
            json = "vhs";
            Assert.assertEquals("vhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_literalMutationString2430() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "Ohs";
            Assert.assertEquals("Ohs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1601() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1601__26 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1601__26)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1403() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1403__20 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1403__20)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1565() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            Number o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1565__21 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("9223372036854775807", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1565__21)).toString());
            Assert.assertEquals(-1773151198, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1565__21)).hashCode())));
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1408() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1408__23 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1408__23)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_literalMutationString1613() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "h.0";
            Assert.assertEquals("h.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1608() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_literalMutationString2436() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "ds";
            Assert.assertEquals("ds", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add132_add1997() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1997__21 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("9223372036854775807", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1997__21)).toString());
            Assert.assertEquals(-1773151198, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1997__21)).hashCode())));
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1661() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1661__20 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1661__20)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1372() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1372__6 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("1", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1372__6)).toString());
            Assert.assertEquals(49, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1372__6)).hashCode())));
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_literalMutationString1571() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k*.0";
            Assert.assertEquals("k*.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1668() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1668__23 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1668__23)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add132_add1991() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__10 = actual.intValue();
            String o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1991__17 = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add1991__17);
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18)));
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1614() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_literalMutationString1334() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k0";
            Assert.assertEquals("k0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_literalMutationString1605() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k0";
            Assert.assertEquals("k0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1413() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1413__26 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1413__26)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_add1378() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1378__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151_add1378__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1674() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1674__26 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1674__26)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add376_add2347() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2347__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2347__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add376_add2344() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2344__6 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("1", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2344__6)).toString());
            Assert.assertEquals(49, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2344__6)).hashCode())));
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add132_add2036() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151_literalMutationString1339() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            json = "JN-";
            Assert.assertEquals("JN-", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add10_literalMutationString126_failAssert27() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add10__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add10__7 = expected.intValue();
            int o_testNumberDeserialization_add10__8 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add10__15 = expected.longValue();
            long o_testNumberDeserialization_add10__16 = actual.longValue();
            json = "SO/";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add10__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add10_literalMutationString126 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1545() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1545__11 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1545__11)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add160() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add160__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add160__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add160__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add160__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add160__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add160__16)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add160__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add160__17)));
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__16)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString352__17)));
            json = "ds";
            Assert.assertEquals("ds", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_literalMutationString2418() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "gds";
            Assert.assertEquals("gds", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_literalMutationString1598() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "uz*";
            Assert.assertEquals("uz*", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add134_add1824() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1824__6 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("1", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1824__6)).toString());
            Assert.assertEquals(49, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1824__6)).hashCode())));
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18)));
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add151() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151__16)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151__17)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add151__18)));
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1551() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1551__14 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1551__14)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1556() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            String o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1556__17 = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1556__17);
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__16)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_literalMutationString344__17)));
            json = "Rvn";
            Assert.assertEquals("Rvn", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2454() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2454__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2454__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add10_literalMutationString157_failAssert29() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add10__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add10__7 = expected.intValue();
            int o_testNumberDeserialization_add10__8 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add10__15 = expected.longValue();
            long o_testNumberDeserialization_add10__16 = actual.longValue();
            json = "L.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add10__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add10_literalMutationString157 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_literalMutationString2424() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "d_hs";
            Assert.assertEquals("d_hs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1691() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString4_failAssert3_add259_literalMutationString1459_failAssert89() throws Exception {
        try {
            try {
                String json = "1";
                Number expected = new Integer(json);
                Number actual = this.gson.fromJson(json, Number.class);
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add259__8 = expected.intValue();
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add259__9 = actual.intValue();
                json = String.valueOf(Long.MAX_VALUE);
                expected = new Long(json);
                actual = this.gson.fromJson(json, Number.class);
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add259__16 = expected.longValue();
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add259__17 = expected.longValue();
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add259__18 = actual.longValue();
                json = ")";
                actual = this.gson.fromJson(json, Number.class);
                actual.longValue();
                org.junit.Assert.fail("testNumberDeserialization_literalMutationString4 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString4_failAssert3_add259_literalMutationString1459 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("Expecting number, got: STRING", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1697() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2447() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2447__6 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("1", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2447__6)).toString());
            Assert.assertEquals(49, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2447__6)).hashCode())));
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add17_literalMutationString392_failAssert22() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add17__6 = expected.intValue();
            int o_testNumberDeserialization_add17__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add17__14 = expected.longValue();
            long o_testNumberDeserialization_add17__15 = actual.longValue();
            json = "1u.0";
            Number o_testNumberDeserialization_add17__17 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add17__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add17_literalMutationString392 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add14_literalMutationString123_failAssert11() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add14__6 = expected.intValue();
            int o_testNumberDeserialization_add14__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add14__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__15 = expected.longValue();
            long o_testNumberDeserialization_add14__16 = actual.longValue();
            json = "!Fs";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add14_literalMutationString123 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add17_literalMutationString377_failAssert24() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add17__6 = expected.intValue();
            int o_testNumberDeserialization_add17__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add17__14 = expected.longValue();
            long o_testNumberDeserialization_add17__15 = actual.longValue();
            json = "(8(";
            Number o_testNumberDeserialization_add17__17 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add17__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add17_literalMutationString377 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1628() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1628__6 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("1", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1628__6)).toString());
            Assert.assertEquals(49, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1628__6)).hashCode())));
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2461() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2461__11 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2461__11)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString4_failAssert3_add243_literalMutationString1223_failAssert57() throws Exception {
        try {
            try {
                String json = "1";
                Number expected = new Integer(json);
                Number o_testNumberDeserialization_literalMutationString4_failAssert3_add243__6 = this.gson.fromJson(json, Number.class);
                Number actual = this.gson.fromJson(json, Number.class);
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add243__9 = expected.intValue();
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add243__10 = actual.intValue();
                json = String.valueOf(Long.MAX_VALUE);
                expected = new Long(json);
                actual = this.gson.fromJson(json, Number.class);
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add243__17 = expected.longValue();
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add243__18 = actual.longValue();
                json = "^";
                actual = this.gson.fromJson(json, Number.class);
                actual.longValue();
                org.junit.Assert.fail("testNumberDeserialization_literalMutationString4 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString4_failAssert3_add243_literalMutationString1223 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("Expecting number, got: STRING", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add134_add1842() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__10 = actual.intValue();
            String o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1842__17 = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1842__17);
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add10_literalMutationString150_failAssert28() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_add10__4 = this.gson.fromJson(json, Number.class);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add10__7 = expected.intValue();
            int o_testNumberDeserialization_add10__8 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add10__15 = expected.longValue();
            long o_testNumberDeserialization_add10__16 = actual.longValue();
            json = "1A.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add10__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add10_literalMutationString150 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add134_add1849() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            Number o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1849__21 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("9223372036854775807", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1849__21)).toString());
            Assert.assertEquals(-1773151198, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134_add1849__21)).hashCode())));
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_add14_literalMutationString129_failAssert13() throws Exception {
        try {
            String json = "1";
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_add14__6 = expected.intValue();
            int o_testNumberDeserialization_add14__7 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            expected = new Long(json);
            Number o_testNumberDeserialization_add14__12 = this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__15 = expected.longValue();
            long o_testNumberDeserialization_add14__16 = actual.longValue();
            json = "1(.0";
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_add14__20 = actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_add14_literalMutationString129 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add132() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__9 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132__9)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__10 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132__10)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__17 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132__17)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__18 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132__18)));
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add132_add2002() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add132__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add2002__23 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add132_add2002__23)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add132__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add376_add2376() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10 = actual.intValue();
            String o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2376__17 = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2376__17);
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7() throws Exception {
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
            json = "dhs";
            actual = gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6() throws Exception {
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
            json = "k.0";
            actual = gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
            Assert.assertEquals("Expecting number, got: STRING", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString4_failAssert3_add254_literalMutationString1068_failAssert64() throws Exception {
        try {
            try {
                String json = "1";
                Number expected = new Integer(json);
                Number actual = this.gson.fromJson(json, Number.class);
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add254__8 = expected.intValue();
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add254__9 = actual.intValue();
                String o_testNumberDeserialization_literalMutationString4_failAssert3_add254__10 = String.valueOf(Long.MAX_VALUE);
                json = String.valueOf(Long.MAX_VALUE);
                expected = new Long(json);
                actual = this.gson.fromJson(json, Number.class);
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add254__17 = expected.longValue();
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add254__18 = actual.longValue();
                json = "B";
                actual = this.gson.fromJson(json, Number.class);
                actual.longValue();
                org.junit.Assert.fail("testNumberDeserialization_literalMutationString4 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString4_failAssert3_add254_literalMutationString1068 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("Expecting number, got: STRING", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add134() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134__9)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add134__10 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134__10)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__17 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134__17)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add134__18 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_add134__18)));
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add395() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add395__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add395__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add395__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add395__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add395__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add395__16)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add395__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add395__17)));
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2474() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            Number o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2474__18 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("9223372036854775807", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2474__18)).toString());
            Assert.assertEquals(-1773151198, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2474__18)).hashCode())));
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1535() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1535__6 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("1", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1535__6)).toString());
            Assert.assertEquals(49, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1535__6)).hashCode())));
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1639() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1639__11 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1639__11)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__16)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString114__17)));
            json = "|.0";
            Assert.assertEquals("|.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__16)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString112__17)));
            json = "km.0";
            Assert.assertEquals("km.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__9 = actual.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__9)));
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__16 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__16)));
            long o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__17 = actual.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString7_failAssert6_literalMutationString106__17)));
            json = "k0";
            Assert.assertEquals("k0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString4_failAssert3_add263_literalMutationString1136_failAssert92() throws Exception {
        try {
            try {
                String json = "1";
                Number expected = new Integer(json);
                Number actual = this.gson.fromJson(json, Number.class);
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add263__8 = expected.intValue();
                int o_testNumberDeserialization_literalMutationString4_failAssert3_add263__9 = actual.intValue();
                json = String.valueOf(Long.MAX_VALUE);
                expected = new Long(json);
                actual = this.gson.fromJson(json, Number.class);
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add263__16 = expected.longValue();
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add263__17 = actual.longValue();
                long o_testNumberDeserialization_literalMutationString4_failAssert3_add263__18 = actual.longValue();
                json = "c";
                actual = this.gson.fromJson(json, Number.class);
                actual.longValue();
                org.junit.Assert.fail("testNumberDeserialization_literalMutationString4 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString4_failAssert3_add263_literalMutationString1136 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected_1) {
            Assert.assertEquals("Expecting number, got: STRING", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add376_add2429() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            this.gson.fromJson(json, Number.class);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add376_add2387() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2387__23 = expected.longValue();
            Assert.assertEquals(9223372036854775807L, ((long) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2387__23)));
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_add1540() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1540__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString8_failAssert7_add370_add1540__8)));
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add370_literalMutationString1513() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__9 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add370__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add370__18 = actual.longValue();
            json = "dahs";
            Assert.assertEquals("dahs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString7_failAssert6_add154_add1633() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1633__8 = expected.intValue();
            Assert.assertEquals(1, ((int) (o_testNumberDeserialization_literalMutationString7_failAssert6_add154_add1633__8)));
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString7_failAssert6_add154__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString7_failAssert6_add154__18 = actual.longValue();
            json = "k.0";
            Assert.assertEquals("k.0", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString7 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add376_add2382() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__9 = actual.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add376__10 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            Number o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2382__21 = this.gson.fromJson(json, Number.class);
            Assert.assertEquals("9223372036854775807", ((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2382__21)).toString());
            Assert.assertEquals(-1773151198, ((int) (((LazilyParsedNumber) (o_testNumberDeserialization_literalMutationString8_failAssert7_add376_add2382__21)).hashCode())));
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__17 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add376__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2469() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            String o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2469__14 = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", o_testNumberDeserialization_literalMutationString8_failAssert7_add391_add2469__14);
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testNumberDeserialization_literalMutationString8_failAssert7_add391_add2502() throws Exception {
        try {
            String json = "1";
            Assert.assertEquals("1", json);
            Number expected = new Integer(json);
            Number actual = this.gson.fromJson(json, Number.class);
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__8 = expected.intValue();
            int o_testNumberDeserialization_literalMutationString8_failAssert7_add391__9 = actual.intValue();
            json = String.valueOf(Long.MAX_VALUE);
            Assert.assertEquals("9223372036854775807", json);
            expected = new Long(json);
            actual = this.gson.fromJson(json, Number.class);
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__16 = expected.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__17 = actual.longValue();
            long o_testNumberDeserialization_literalMutationString8_failAssert7_add391__18 = actual.longValue();
            json = "dhs";
            Assert.assertEquals("dhs", json);
            actual = this.gson.fromJson(json, Number.class);
            actual.longValue();
            actual.longValue();
            org.junit.Assert.fail("testNumberDeserialization_literalMutationString8 should have thrown JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    private String extractElementFromArray(String json) {
        return json.substring(((json.indexOf('[')) + 1), json.indexOf(']'));
    }

    private static class ClassWithIntegerField {
        Integer i;
    }
}

