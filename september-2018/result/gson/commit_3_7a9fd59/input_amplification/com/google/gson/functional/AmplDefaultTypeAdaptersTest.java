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
    public void testDateDeserializationWithPattern_mg59432null60336_failAssert163() throws Exception {
        try {
            Object __DSPOT_src_3478 = new Object();
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
            JsonElement o_testDateDeserializationWithPattern_mg59432__21 = gson.toJsonTree(__DSPOT_src_3478);
            org.junit.Assert.fail("testDateDeserializationWithPattern_mg59432null60336 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPattern_add59420null60356_failAssert166() throws Exception {
        try {
            String pattern = "yyyy-MM-dd";
            Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
            Date now = new Date(1315806903103L);
            String json = gson.toJson(null);
            Date o_testDateDeserializationWithPattern_add59420__11 = gson.fromJson(json, Date.class);
            Date extracted = gson.fromJson(json, Date.class);
            now.getYear();
            extracted.getYear();
            now.getMonth();
            extracted.getMonth();
            now.getDay();
            extracted.getDay();
            org.junit.Assert.fail("testDateDeserializationWithPattern_add59420null60356 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPatternnull59435_failAssert160() throws Exception {
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
            org.junit.Assert.fail("testDateDeserializationWithPatternnull59435 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test(timeout = 10000)
    public void testDateDeserializationWithPattern_mg59432_add60155null62846_failAssert169() throws Exception {
        try {
            Object __DSPOT_src_3478 = new Object();
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
            JsonElement o_testDateDeserializationWithPattern_mg59432_add60155__21 = gson.toJsonTree(__DSPOT_src_3478);
            JsonElement o_testDateDeserializationWithPattern_mg59432__21 = gson.toJsonTree(__DSPOT_src_3478);
            org.junit.Assert.fail("testDateDeserializationWithPattern_mg59432_add60155null62846 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_mg6193null7317_failAssert26() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_449 = new Object();
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
                JsonElement o_testTimestampSerialization_mg6193__22 = gson.toJsonTree(__DSPOT_src_449);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_mg6193null7317 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_mg6193_add7012_literalMutationString12000_failAssert39() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_449 = new Object();
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(timestamp, Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", Timestamp.class).getTime();
                JsonElement o_testTimestampSerialization_mg6193_add7012__22 = gson.toJsonTree(__DSPOT_src_449);
                JsonElement o_testTimestampSerialization_mg6193__22 = gson.toJsonTree(__DSPOT_src_449);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_mg6193_add7012_literalMutationString12000 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_mg6193_add7012null12721_failAssert45() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_449 = new Object();
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
                JsonElement o_testTimestampSerialization_mg6193_add7012__22 = gson.toJsonTree(__DSPOT_src_449);
                JsonElement o_testTimestampSerialization_mg6193__22 = gson.toJsonTree(__DSPOT_src_449);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_mg6193_add7012null12721 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerializationnull6196_failAssert18() throws Exception {
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
            org.junit.Assert.fail("testTimestampSerializationnull6196 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_add6183null8670_failAssert37() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                Timestamp o_testTimestampSerialization_add6183__18 = gson.fromJson("\"1970-01-01\"", Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_add6183null8670 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_literalMutationString6170_failAssert14() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(timestamp, Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", Timestamp.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_literalMutationString6170 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_mg6193_literalMutationString6955_failAssert20() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_449 = new Object();
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(timestamp, Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", Timestamp.class).getTime();
                JsonElement o_testTimestampSerialization_mg6193__22 = gson.toJsonTree(__DSPOT_src_449);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_mg6193_literalMutationString6955 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_add6183_literalMutationString8400_failAssert29() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(timestamp, Timestamp.class);
                Timestamp o_testTimestampSerialization_add6183__18 = gson.fromJson("\"1970-01-01\"", Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", Timestamp.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_add6183_literalMutationString8400 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimestampSerialization_add6183_literalMutationString8368_failAssert28() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Timestamp timestamp = new Timestamp(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(timestamp, Timestamp.class);
                Timestamp o_testTimestampSerialization_add6183__18 = gson.fromJson("{\'name3\':\'v3\'}", Timestamp.class);
                gson.fromJson("\"1970-01-01\"", Timestamp.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testTimestampSerialization_add6183_literalMutationString8368 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_add18362_literalMutationString19200_failAssert80() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(sqlDate, Timestamp.class);
                java.sql.Date o_testSqlDateSerialization_add18362__18 = gson.fromJson("\"1970-01-01\"", java.sql.Date.class);
                gson.fromJson("{\'name3\':\'v3\'}", java.sql.Date.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_add18362_literalMutationString19200 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_add18362_literalMutationString19166_failAssert79() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(sqlDate, Timestamp.class);
                java.sql.Date o_testSqlDateSerialization_add18362__18 = gson.fromJson("{\'name3\':\'v3\'}", java.sql.Date.class);
                gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_add18362_literalMutationString19166 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_mg18372null20765_failAssert65() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_940 = new Object();
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime();
                JsonElement o_testSqlDateSerialization_mg18372__22 = gson.toJsonTree(__DSPOT_src_940);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_mg18372null20765 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_mg18372_add20421null24095_failAssert91() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_940 = new Object();
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(null, Timestamp.class);
                gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime();
                JsonElement o_testSqlDateSerialization_mg18372_add20421__22 = gson.toJsonTree(__DSPOT_src_940);
                JsonElement o_testSqlDateSerialization_mg18372__22 = gson.toJsonTree(__DSPOT_src_940);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_mg18372_add20421null24095 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_mg18372_add20421_literalMutationString23329_failAssert83() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_940 = new Object();
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(sqlDate, Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", java.sql.Date.class).getTime();
                JsonElement o_testSqlDateSerialization_mg18372_add20421__22 = gson.toJsonTree(__DSPOT_src_940);
                JsonElement o_testSqlDateSerialization_mg18372__22 = gson.toJsonTree(__DSPOT_src_940);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_mg18372_add20421_literalMutationString23329 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_add18355null20468_failAssert76() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone o_testSqlDateSerialization_add18355__3 = TimeZone.getTimeZone("UTC");
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
            org.junit.Assert.fail("testSqlDateSerialization_add18355null20468 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerializationnull18375_failAssert56() throws Exception {
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
            org.junit.Assert.fail("testSqlDateSerializationnull18375 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_add18355_literalMutationString20244_failAssert68() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone o_testSqlDateSerialization_add18355__3 = TimeZone.getTimeZone("UTC");
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(sqlDate, Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", java.sql.Date.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_add18355_literalMutationString20244 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_mg18372_literalMutationString20279_failAssert58() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                Object __DSPOT_src_940 = new Object();
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(sqlDate, Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", java.sql.Date.class).getTime();
                JsonElement o_testSqlDateSerialization_mg18372__22 = gson.toJsonTree(__DSPOT_src_940);
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_mg18372_literalMutationString20279 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSqlDateSerialization_literalMutationString18349_failAssert51() throws Exception {
        try {
            TimeZone defaultTimeZone = TimeZone.getDefault();
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(Locale.US);
            try {
                java.sql.Date sqlDate = new java.sql.Date(0L);
                Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
                String json = gson.toJson(sqlDate, Timestamp.class);
                gson.fromJson("{\'name3\':\'v3\'}", java.sql.Date.class).getTime();
            } finally {
                TimeZone.setDefault(defaultTimeZone);
                Locale.setDefault(defaultLocale);
            }
            org.junit.Assert.fail("testSqlDateSerialization_literalMutationString18349 should have thrown JsonParseException");
        } catch (JsonParseException expected) {
            Assert.assertEquals("The date should be a string value", expected.getMessage());
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

