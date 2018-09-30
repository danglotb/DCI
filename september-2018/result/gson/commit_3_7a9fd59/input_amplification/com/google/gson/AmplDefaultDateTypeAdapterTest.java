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
    public void testDateSerialization_add5351_add5387null5632_failAssert141() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5351_add5387__10 = formatter.format(currentDate);
            String o_testDateSerialization_add5351__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5351_add5387null5632 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350null5398_failAssert111_add5573() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 29, 2018\"", o_testDateSerialization_add5350__8);
            dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350null5398 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350_add5386null5704_failAssert133() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDateSerialization_add5350_add5386__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350_add5386null5704 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350null5398_failAssert111_add5570() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350null5398_failAssert111_add5570__10 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 29, 2018\"", o_testDateSerialization_add5350null5398_failAssert111_add5570__10);
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 29, 2018\"", o_testDateSerialization_add5350__8);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350null5398 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5351_add5379null5707_failAssert127() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5351_add5379__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5351__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5351_add5379null5707 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5351null5397_failAssert113() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5351__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5351null5397 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350null5398_failAssert111_add5584() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 29, 2018\"", o_testDateSerialization_add5350__8);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350null5398 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            expected.getMessage();
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350null5396_failAssert110() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350null5396 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5351_add5383null5743_failAssert126() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5351_add5383__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5351_add5383null5743 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350null5398_failAssert111_add5582() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 29, 2018\"", o_testDateSerialization_add5350__8);
            String dateString = dateTypeAdapter.toJson(null);
            formatter.format(currentDate);
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350null5398 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350null5398_failAssert111() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350null5398 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5351_add5390null5549_failAssert120() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5351__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351_add5390__14 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5351_add5390null5549 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5352null5392_failAssert116() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5352__10 = formatter.format(currentDate);
            String o_testDateSerialization_add5352__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5352null5392 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerializationnull5353_failAssert108() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerializationnull5353 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350null5398_failAssert111_add5578() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(currentDate);
            Assert.assertEquals("\"September 29, 2018\"", o_testDateSerialization_add5350__8);
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350null5398 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5352_add5380null5676_failAssert144() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5352__10 = formatter.format(currentDate);
            String o_testDateSerialization_add5352_add5380__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5352__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5352_add5380null5676 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5350_add5386null5708_failAssert131() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5350__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5350_add5386__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5350__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5350_add5386null5708 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5351_add5391null5595_failAssert142() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDateSerialization_add5351__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351_add5391__14 = formatter.format(currentDate);
            String o_testDateSerialization_add5351__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5351_add5391null5595 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDateSerialization_add5351_add5379null5703_failAssert129() throws Exception {
        try {
            int dateStyle = DateFormat.LONG;
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, dateStyle);
            DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
            Date currentDate = new Date();
            String o_testDateSerialization_add5351_add5379__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDateSerialization_add5351__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDateSerialization_add5351__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDateSerialization_add5351_add5379null5703 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_literalMutationString5null85_failAssert17() throws Exception {
        try {
            String pattern = "yyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_literalMutationString5__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_literalMutationString5null85 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add8_add73null1104_failAssert73() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add8_add73__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDatePattern_add8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add8_add73null1104 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add7_add167null704_failAssert70() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add7__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDatePattern_add7_add167__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add7__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add7_add167null704 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add9null100_failAssert36() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add9__10 = formatter.format(currentDate);
            String o_testDatePattern_add9__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add9null100 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2_literalMutationString64() throws Exception {
        try {
            String pattern = "yyy-MM-dd";
            Assert.assertEquals("yyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add8_add77null1876_failAssert50() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add8_add77__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add8_add77null1876 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2_add78() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            expected.getMessage();
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add8_add79null1943_failAssert85() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add8_add79__10 = formatter.format(currentDate);
            String o_testDatePattern_add8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add8_add79null1943 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add8_add80null2010_failAssert56() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8_add80__14 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add8_add80null2010 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2_literalMutationString48() throws Exception {
        try {
            String pattern = "";
            Assert.assertEquals("", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2_add70() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_literalMutationString6null156_failAssert21() throws Exception {
        try {
            String pattern = "yyyy-kM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_literalMutationString6__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_literalMutationString6null156 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add9_add87null1871_failAssert82() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add9__10 = formatter.format(currentDate);
            String o_testDatePattern_add9_add87__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add9__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add9_add87null1871 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add8_add73null1107_failAssert72() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add8_add73__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add8_add73null1107 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_literalMutationString4null170_failAssert13() throws Exception {
        try {
            String pattern = "yyyy-GMM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_literalMutationString4__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_literalMutationString4null170 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2_add74() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            formatter.format(currentDate);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add8null94_failAssert31() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add8null94 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add8_add83null2068_failAssert87() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add8__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add8_add83__14 = formatter.format(currentDate);
            String o_testDatePattern_add8__12 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add8_add83null2068 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2_literalMutationString50() throws Exception {
        try {
            String pattern = "  ";
            Assert.assertEquals("  ", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePatternnull11_failAssert2_add68() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Assert.assertEquals("yyyy-MM-dd", pattern);
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(null);
            AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePatternnull11 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_literalMutationString1null182_failAssert5() throws Exception {
        try {
            String pattern = "";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_literalMutationString1__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_literalMutationString1null182 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add7_add167null708_failAssert68() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add7__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add7_add167__13 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            String o_testDatePattern_add7__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add7_add167null708 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add7null176_failAssert26() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add7__8 = dateTypeAdapter.toJson(currentDate);
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_add7__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add7null176 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_add7null175_failAssert25() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String o_testDatePattern_add7__8 = dateTypeAdapter.toJson(null);
            String dateString = dateTypeAdapter.toJson(currentDate);
            String o_testDatePattern_add7__11 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_add7null175 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDatePattern_literalMutationString2null142_failAssert9() throws Exception {
        try {
            String pattern = "  ";
            DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(Date.class, pattern);
            DateFormat formatter = new SimpleDateFormat(pattern);
            Date currentDate = new Date();
            String dateString = dateTypeAdapter.toJson(null);
            String o_testDatePattern_literalMutationString2__10 = AmplDefaultDateTypeAdapterTest.toLiteral(formatter.format(currentDate));
            org.junit.Assert.fail("testDatePattern_literalMutationString2null142 should have thrown NullPointerException");
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

