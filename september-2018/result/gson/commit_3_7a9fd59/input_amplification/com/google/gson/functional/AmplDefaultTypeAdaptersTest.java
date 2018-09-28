package com.google.gson.functional;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AmplDefaultTypeAdaptersTest {
    private Gson gson;

    private TimeZone oldTimeZone;

    @Before
    public void setUp() throws Exception {
        this.oldTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale.setDefault(Locale.US);
        gson = new Gson();
    }

    @After
    public void tearDown() throws Exception {
        TimeZone.setDefault(oldTimeZone);
    }

    private static class ClassWithUrlField {
        URL url;
    }

    private void testNullSerializationAndDeserialization(Class<?> c) {
        Assert.assertEquals("null", gson.toJson(null, c));
        Assert.assertEquals(null, gson.fromJson("null", c));
    }

    @SuppressWarnings("deprecation")
    private void assertEqualsDate(Date date, int year, int month, int day) {
        Assert.assertEquals((year - 1900), date.getYear());
        Assert.assertEquals(month, date.getMonth());
        Assert.assertEquals(day, date.getDate());
    }

    @SuppressWarnings("deprecation")
    private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {
        Assert.assertEquals(hours, date.getHours());
        Assert.assertEquals(minutes, date.getMinutes());
        Assert.assertEquals(seconds, date.getSeconds());
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPatternnull58327_failAssert205() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
            Date now = new Date(1315806903103L);
            String json = gson.toJson(null);
            Date extracted = gson.fromJson(json, Date.class);
            now.getYear();
            extracted.getYear();
            now.getMonth();
            extracted.getMonth();
            now.getDay();
            extracted.getDay();
            org.junit.Assert.fail("testDateDeserializationWithPatternnull58327 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPatternlitString58301null58645_failAssert214() throws Exception {
        try {
            String pattern = ":";
            Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
            Date now = new Date(1315806903103L);
            String json = gson.toJson(null);
            Date extracted = gson.fromJson(json, Date.class);
            now.getYear();
            extracted.getYear();
            now.getMonth();
            extracted.getMonth();
            now.getDay();
            extracted.getDay();
            org.junit.Assert.fail("testDateDeserializationWithPatternlitString58301null58645 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPattern_add58312null59565_failAssert213() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
            Date now = new Date(1315806903103L);
            String json = gson.toJson(null);
            Date o_testDateDeserializationWithPattern_add58312__11 = gson.fromJson(json, Date.class);
            Date extracted = gson.fromJson(json, Date.class);
            now.getYear();
            extracted.getYear();
            now.getMonth();
            extracted.getMonth();
            now.getDay();
            extracted.getDay();
            org.junit.Assert.fail("testDateDeserializationWithPattern_add58312null59565 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPattern_mg58324null59730_failAssert209() throws Exception {
        try {
            Object __DSPOT_src_3570 = new Object();
            String pattern = "yyyy-MM-dd";
            Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
            Date now = new Date(1315806903103L);
            String json = gson.toJson(null);
            Date extracted = gson.fromJson(json, Date.class);
            now.getYear();
            extracted.getYear();
            now.getMonth();
            extracted.getMonth();
            now.getDay();
            extracted.getDay();
            JsonElement o_testDateDeserializationWithPattern_mg58324__21 = gson.toJsonTree(__DSPOT_src_3570);
            org.junit.Assert.fail("testDateDeserializationWithPattern_mg58324null59730 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPattern_mg58324_add59132null65420_failAssert218() throws Exception {
        try {
            Object __DSPOT_src_3570 = new Object();
            String pattern = "yyyy-MM-dd";
            Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
            Date now = new Date(1315806903103L);
            String json = gson.toJson(null);
            Date extracted = gson.fromJson(json, Date.class);
            now.getYear();
            extracted.getYear();
            now.getMonth();
            extracted.getMonth();
            now.getDay();
            extracted.getDay();
            JsonElement o_testDateDeserializationWithPattern_mg58324_add59132__21 = gson.toJsonTree(__DSPOT_src_3570);
            JsonElement o_testDateDeserializationWithPattern_mg58324__21 = gson.toJsonTree(__DSPOT_src_3570);
            org.junit.Assert.fail("testDateDeserializationWithPattern_mg58324_add59132null65420 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_mg5164null8046_failAssert39() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_454 = new Object();
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
                JsonElement o_testTimestampSerialization_mg5164__22 = gson.toJsonTree(__DSPOT_src_454);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_mg5164null8046 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_mg5164_add7904null16736_failAssert65() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_454 = new Object();
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
                JsonElement o_testTimestampSerialization_mg5164_add7904__22 = gson.toJsonTree(__DSPOT_src_454);
                JsonElement o_testTimestampSerialization_mg5164__22 = gson.toJsonTree(__DSPOT_src_454);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_mg5164_add7904null16736 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_add5154null8039_failAssert55() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                Timestamp o_testTimestampSerialization_add5154__18 = gson.fromJson("\"1970-01-01\"", Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_add5154null8039 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerializationnull5167_failAssert28() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerializationnull5167 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_mg5164litString7651_failAssert36() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_454 = new Object();
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(timestamp, Timestamp.class);
                gson.fromJson("123", Timestamp.class).getTime();
                JsonElement o_testTimestampSerialization_mg5164__22 = gson.toJsonTree(__DSPOT_src_454);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_mg5164litString7651 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_mg17374_add20088null29511_failAssert118() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_943 = new Object();
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime();
                JsonElement o_testSqlDateSerialization_mg17374_add20088__22 = gson.toJsonTree(__DSPOT_src_943);
                JsonElement o_testSqlDateSerialization_mg17374__22 = gson.toJsonTree(__DSPOT_src_943);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_mg17374_add20088null29511 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_add17357null19546_failAssert106() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone o_testSqlDateSerialization_add17357__3 = TimeZone.getTimeZone("UTC");
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_add17357null19546 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerializationnull17377_failAssert79() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerializationnull17377 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_mg17374null20248_failAssert92() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_943 = new Object();
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime();
                JsonElement o_testSqlDateSerialization_mg17374__22 = gson.toJsonTree(__DSPOT_src_943);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_mg17374null20248 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    private static class ClassWithBigDecimal {
        BigDecimal value;

        ClassWithBigDecimal(String value) {
            this.value = new BigDecimal(value);
        }

        String getExpectedJson() {
            return ("{\"value\":" + (value.toEngineeringString())) + "}";
        }
    }

    private static class ClassWithBigInteger {
        BigInteger value;

        ClassWithBigInteger(String value) {
            this.value = new BigInteger(value);
        }

        String getExpectedJson() {
            return ("{\"value\":" + (value)) + "}";
        }
    }

    @SuppressWarnings("rawtypes")
    private static class MyClassTypeAdapter extends TypeAdapter<Class> {
        @Override
        public void write(JsonWriter out, Class value) throws IOException {
            out.value(value.getName());
        }

        @Override
        public Class read(JsonReader in) throws IOException {
            String className = in.nextString();
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new IOException(e);
            }
        }
    }

    static class NumberAsStringAdapter extends TypeAdapter<Number> {
        private final Constructor<? extends Number> constructor;

        NumberAsStringAdapter(Class<? extends Number> type) throws Exception {
            this.constructor = type.getConstructor(String.class);
        }

        @Override
        public void write(JsonWriter out, Number value) throws IOException {
            out.value(value.toString());
        }

        @Override
        public Number read(JsonReader in) throws IOException {
            try {
                return constructor.newInstance(in.nextString());
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
    }
}

