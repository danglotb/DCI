package com.google.gson;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class AmplDefaultDateTypeAdapterTest {
    private void assertFormattingAlwaysEmitsUsLocale(Locale locale) {
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(locale);
        try {
            assertFormatted("Jan 1, 1970 12:00:00 AM", new DefaultDateTypeAdapter(Date.class));
            assertFormatted("1/1/70", new DefaultDateTypeAdapter(Date.class, DateFormat.SHORT));
            assertFormatted("Jan 1, 1970", new DefaultDateTypeAdapter(Date.class, DateFormat.MEDIUM));
            assertFormatted("January 1, 1970", new DefaultDateTypeAdapter(Date.class, DateFormat.LONG));
            assertFormatted("1/1/70 12:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT, DateFormat.SHORT));
            assertFormatted("Jan 1, 1970 12:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM, DateFormat.MEDIUM));
            assertFormatted("January 1, 1970 12:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG, DateFormat.LONG));
            assertFormatted("Thursday, January 1, 1970 12:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL, DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4961_add4995null5206_failAssert119() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4961_add4995__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4961_add4995null5206 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4961_add4999null5280_failAssert137() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4961_add4999__10 = formatter.format(currentDate);
            String o_testDateSerialization_add4961__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4961_add4999null5280 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960_add4993null5287_failAssert127() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDateSerialization_add4960_add4993__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960_add4993null5287 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960null5012_failAssert110_add5160() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 27, 2018\"", o_testDateSerialization_add4960__8);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960null5012 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            expected.getMessage();
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960null5012_failAssert110() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960null5012 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerializationnull4963_failAssert107() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerializationnull4963 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960_add4993null5293_failAssert129() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4960_add4993__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960_add4993null5293 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960null5012_failAssert110_add5143() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 27, 2018\"", o_testDateSerialization_add4960__8);
            dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960null5012 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960null5012_failAssert110_add5142() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960null5012_failAssert110_add5142__10 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 27, 2018\"", o_testDateSerialization_add4960null5012_failAssert110_add5142__10);
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 27, 2018\"", o_testDateSerialization_add4960__8);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960null5012 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960null5012_failAssert110_add5149() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 27, 2018\"", o_testDateSerialization_add4960__8);
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960null5012 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4961null5015_failAssert112() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4961__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4961null5015 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960null5011_failAssert109() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960null5011 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4961_add4991null5200_failAssert133() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4961_add4991__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDateSerialization_add4961__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4961_add4991null5200 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4962null5001_failAssert115() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4962__10 = formatter.format(currentDate);
            String o_testDateSerialization_add4962__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4962null5001 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4961_add4991null5205_failAssert131() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4961_add4991__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4961__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4961_add4991null5205 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4961_add5007null5231_failAssert145() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4961__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961_add5007__14 = formatter.format(currentDate);
            String o_testDateSerialization_add4961__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4961_add5007null5231 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4961_add5003null5148_failAssert123() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4961__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961_add5003__14 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4961__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4961_add5003null5148 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4962_add4985null5219_failAssert138() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add4962__10 = formatter.format(currentDate);
            String o_testDateSerialization_add4962_add4985__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add4962__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4962_add4985null5219 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add4960null5012_failAssert110_add5154() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add4960__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 27, 2018\"", o_testDateSerialization_add4960__8);
            String dateString = dateTypeAdapter.toJson(null);
            formatter.format(currentDate);
            String o_testDateSerialization_add4960__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add4960null5012 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add10_add117null1507_failAssert85() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add10_add117__10 = formatter.format(currentDate);
            String o_testDatePattern_add10__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add10_add117null1507 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternlitString4null64_failAssert8() throws Exception {
        try {
            String pattern = "yyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePatternlitString4__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternlitString4null64 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString89_add766() throws Exception {
        try {
            String pattern = "";
            Assert.assertEquals("", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            formatter.format(currentDate);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString89_add760() throws Exception {
        try {
            String pattern = "";
            Assert.assertEquals("", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add10null134_failAssert25() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add10__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add10null134 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add10_add119null1568_failAssert49() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add10__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10_add119__14 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add10_add119null1568 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add10_add106null1527_failAssert67() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add10_add106__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add10__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add10_add106null1527 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternlitString7null121_failAssert12() throws Exception {
        try {
            String pattern = "\n";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePatternlitString7__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternlitString7null121 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4_add113() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            formatter.format(currentDate);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4_add115() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            expected.getMessage();
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add10_add106null1524_failAssert69() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add10_add106__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDatePattern_add10__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add10_add106null1524 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString95_add675() throws Exception {
        try {
            String pattern = ":";
            Assert.assertEquals(":", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add10_add123null1592_failAssert83() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add10__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10_add123__14 = formatter.format(currentDate);
            String o_testDatePattern_add10__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add10_add123null1592 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add11null126_failAssert32() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add11__10 = formatter.format(currentDate);
            String o_testDatePattern_add11__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add11null126 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString92() throws Exception {
        try {
            String pattern = "\n";
            Assert.assertEquals("\n", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString95() throws Exception {
        try {
            String pattern = ":";
            Assert.assertEquals(":", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString89() throws Exception {
        try {
            String pattern = "";
            Assert.assertEquals("", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add9_add170null1492_failAssert75() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add9__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add9_add170__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add9__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add9_add170null1492 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternlitString2null63_failAssert6() throws Exception {
        try {
            String pattern = "yyy7-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePatternlitString2__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternlitString2null63 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4_add105() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4_add109() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternlitString8null94_failAssert14() throws Exception {
        try {
            String pattern = ":";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePatternlitString8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternlitString8null94 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add9null174_failAssert20() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add9__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDatePattern_add9__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add9null174 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add10_add112null1392_failAssert54() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add10_add112__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add10__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add10_add112null1392 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add9null175_failAssert21() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add9__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add9__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add9null175 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString82() throws Exception {
        try {
            String pattern = "yyy-MM-dd";
            Assert.assertEquals("yyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add11_add104null1241_failAssert91() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add11__10 = formatter.format(currentDate);
            String o_testDatePattern_add11_add104__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add11__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add11_add104null1241 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull13_failAssert4litString78() throws Exception {
        try {
            String pattern = "yyyy-MM-9dd";
            Assert.assertEquals("yyyy-MM-9dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull13 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add9_add170null1488_failAssert72() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add9__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDatePattern_add9_add170__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add9__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add9_add170null1488 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternlitString6null99_failAssert10() throws Exception {
        try {
            String pattern = "";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePatternlitString6__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternlitString6null99 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    private void assertFormatted(String formatted, DefaultDateTypeAdapter adapter) {
        Assert.assertEquals(AmplDefaultDateTypeAdapterTest.toLiteral(formatted), adapter.toJson(new Date(0)));
    }

    private void assertParsed(String date, DefaultDateTypeAdapter adapter) throws IOException {
        Assert.assertEquals(date, new Date(0), adapter.fromJson(AmplDefaultDateTypeAdapterTest.toLiteral(date)));
        Assert.assertEquals("ISO 8601", new Date(0), adapter.fromJson(AmplDefaultDateTypeAdapterTest.toLiteral("1970-01-01T00:00:00Z")));
    }

    private static String toLiteral(String s) {
        return ('"' + s) + '"';
    }
}

