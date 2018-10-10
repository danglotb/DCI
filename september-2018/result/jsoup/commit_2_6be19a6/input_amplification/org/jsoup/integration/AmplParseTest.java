package org.jsoup.integration;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;


public class AmplParseTest {
    @Test(timeout = 10000)
    public void testSmhBizArticle_add37035_add39555_literalMutationString42245_failAssert441() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testSmhBizArticle_add37035_add39555__3 = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            Document o_testSmhBizArticle_add37035__3 = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            String o_testSmhBizArticle_add37035__6 = doc.title();
            String o_testSmhBizArticle_add37035__7 = doc.select("html").attr("xml:lang");
            Elements articleBody = doc.select(".articleBody > *");
            int o_testSmhBizArticle_add37035__11 = articleBody.size();

            org.junit.Assert.fail("testSmhBizArticle_add37035_add39555_literalMutationString42245 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSmhBizArticle_add37035_add39572_literalMutationString40184_failAssert440() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testSmhBizArticle_add37035__3 = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            Document o_testSmhBizArticle_add37035_add39572__6 = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            String o_testSmhBizArticle_add37035__6 = doc.title();
            String o_testSmhBizArticle_add37035__7 = doc.select("html").attr("xml:lang");
            Elements articleBody = doc.select(".articleBody > *");
            int o_testSmhBizArticle_add37035__11 = articleBody.size();

            org.junit.Assert.fail("testSmhBizArticle_add37035_add39572_literalMutationString40184 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSmhBizArticlenull37046_failAssert338_literalMutationString37451_literalMutationString40280_failAssert454() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "");
                String o_testSmhBizArticlenull37046_failAssert338_literalMutationString37451__7 = doc.title();
                doc.select("html").attr(null);
                Elements articleBody = doc.select(".articleBody > *");
                articleBody.size();

                org.junit.Assert.fail("testSmhBizArticlenull37046 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testSmhBizArticlenull37046_failAssert338_literalMutationString37451_literalMutationString40280 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSmhBizArticle_literalMutationString36998_failAssert319() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            doc.title();
            doc.select("html").attr("xml:lang");
            Elements articleBody = doc.select(".articleBody > *");
            articleBody.size();

            org.junit.Assert.fail("testSmhBizArticle_literalMutationString36998 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSmhBizArticle_add37035_literalMutationString38684_failAssert364() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testSmhBizArticle_add37035__3 = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
            String o_testSmhBizArticle_add37035__6 = doc.title();
            String o_testSmhBizArticle_add37035__7 = doc.select("html").attr("xml:lang");
            Elements articleBody = doc.select(".articleBody > *");
            int o_testSmhBizArticle_add37035__11 = articleBody.size();

            org.junit.Assert.fail("testSmhBizArticle_add37035_literalMutationString38684 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSmhBizArticlenull37044_failAssert336_literalMutationString37188_failAssert369() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", null);
                doc.title();
                doc.select("html").attr("xml:lang");
                Elements articleBody = doc.select(".articleBody > *");
                articleBody.size();

                org.junit.Assert.fail("testSmhBizArticlenull37044 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testSmhBizArticlenull37044_failAssert336_literalMutationString37188 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNewsHomepage_literalMutationString1_failAssert0() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.news.com.au/");
            doc.title();
            doc.select(".id1225817868581 h4").text().trim();
            Element a = doc.select("a[href=/entertainment/horoscopes]").first();
            a.attr("href");
            a.attr("abs:href");
            Element hs = doc.select("a[href*=naughty-corners-are-a-bad-idea]").first();
            hs.attr("href");
            hs.attr("href");
            hs.attr("abs:href");
            org.junit.Assert.fail("testNewsHomepage_literalMutationString1 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNewsHomepage_add77_literalMutationString3471_failAssert64() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.news.com.au/");
            String o_testNewsHomepage_add77__5 = doc.title();
            String o_testNewsHomepage_add77__6 = doc.select(".id1225817868581 h4").text().trim();
            Element a = doc.select("a[href=/entertainment/horoscopes]").first();
            String o_testNewsHomepage_add77__12 = a.attr("href");
            String o_testNewsHomepage_add77__13 = a.attr("abs:href");
            Element o_testNewsHomepage_add77__14 = doc.select("a[href*=naughty-corners-are-a-bad-idea]").first();
            Element hs = doc.select("a[href*=naughty-corners-are-a-bad-idea]").first();
            String o_testNewsHomepage_add77__19 = hs.attr("href");
            String o_testNewsHomepage_add77__20 = hs.attr("href");
            String o_testNewsHomepage_add77__21 = hs.attr("abs:href");
            org.junit.Assert.fail("testNewsHomepage_add77_literalMutationString3471 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGoogleSearchIpod_literalMutationString51960_failAssert546() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            doc.title();
            Elements results = doc.select("h3.r > a");
            results.size();
            results.get(0).attr("href");
            results.get(1).attr("href");
            org.junit.Assert.fail("testGoogleSearchIpod_literalMutationString51960 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGoogleSearchIpodnull52018_failAssert565_literalMutationString54925_failAssert599() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", null);
                doc.title();
                Elements results = doc.select("h3.r > a");
                results.size();
                results.get(0).attr("href");
                results.get(1).attr("href");
                org.junit.Assert.fail("testGoogleSearchIpodnull52018 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testGoogleSearchIpodnull52018_failAssert565_literalMutationString54925 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGoogleSearchIpod_add52007_add54393_literalMutationString59214_failAssert672() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testGoogleSearchIpod_add52007__3 = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            Document o_testGoogleSearchIpod_add52007_add54393__6 = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            String o_testGoogleSearchIpod_add52007__6 = doc.title();
            Elements results = doc.select("h3.r > a");
            int o_testGoogleSearchIpod_add52007__9 = results.size();
            String o_testGoogleSearchIpod_add52007__10 = results.get(0).attr("href");
            String o_testGoogleSearchIpod_add52007__12 = results.get(1).attr("href");
            org.junit.Assert.fail("testGoogleSearchIpod_add52007_add54393_literalMutationString59214 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGoogleSearchIpod_add52007_literalMutationString52225_failAssert594() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testGoogleSearchIpod_add52007__3 = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            String o_testGoogleSearchIpod_add52007__6 = doc.title();
            Elements results = doc.select("h3.r > a");
            int o_testGoogleSearchIpod_add52007__9 = results.size();
            String o_testGoogleSearchIpod_add52007__10 = results.get(0).attr("href");
            String o_testGoogleSearchIpod_add52007__12 = results.get(1).attr("href");
            org.junit.Assert.fail("testGoogleSearchIpod_add52007_literalMutationString52225 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testGoogleSearchIpod_add52007_add54238_literalMutationString56546_failAssert673() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testGoogleSearchIpod_add52007_add54238__3 = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            Document o_testGoogleSearchIpod_add52007__3 = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
            String o_testGoogleSearchIpod_add52007__6 = doc.title();
            Elements results = doc.select("h3.r > a");
            int o_testGoogleSearchIpod_add52007__9 = results.size();
            String o_testGoogleSearchIpod_add52007__10 = results.get(0).attr("href");
            String o_testGoogleSearchIpod_add52007__12 = results.get(1).attr("href");
            org.junit.Assert.fail("testGoogleSearchIpod_add52007_add54238_literalMutationString56546 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_literalMutationString132629_literalMutationString132958_failAssert1442() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            boolean o_testBinary_literalMutationString132629__5 = doc.text().contains("Jay");
            org.junit.Assert.fail("testBinary_literalMutationString132629_literalMutationString132958 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_add132636_literalMutationString132760_failAssert1423() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_testBinary_add132636__5 = doc.text();
            boolean o_testBinary_add132636__6 = doc.text().contains("gd-jpeg");
            org.junit.Assert.fail("testBinary_add132636_literalMutationString132760 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_literalMutationString132632_literalMutationString132704_failAssert1453() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            boolean o_testBinary_literalMutationString132632__5 = doc.text().contains("g#d-jpeg");
            org.junit.Assert.fail("testBinary_literalMutationString132632_literalMutationString132704 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinarynull132639_literalMutationString132727_failAssert1428() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null);
            boolean o_testBinarynull132639__5 = doc.text().contains("gd-jpeg");
            org.junit.Assert.fail("testBinarynull132639_literalMutationString132727 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_literalMutationString132628_literalMutationString132914_failAssert1451() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            boolean o_testBinary_literalMutationString132628__5 = doc.text().contains("gdjpeg");
            org.junit.Assert.fail("testBinary_literalMutationString132628_literalMutationString132914 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_add132636_add133032_literalMutationString136201_failAssert1539() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_testBinary_add132636_add133032__5 = doc.text();
            String o_testBinary_add132636__5 = doc.text();
            boolean o_testBinary_add132636__6 = doc.text().contains("gd-jpeg");
            org.junit.Assert.fail("testBinary_add132636_add133032_literalMutationString136201 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_add132636_add133029_literalMutationString136646_failAssert1514() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBinary_add132636_add133029__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_testBinary_add132636__5 = doc.text();
            boolean o_testBinary_add132636__6 = doc.text().contains("gd-jpeg");
            org.junit.Assert.fail("testBinary_add132636_add133029_literalMutationString136646 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_literalMutationString132615_failAssert1378() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.text().contains("gd-jpeg");
            org.junit.Assert.fail("testBinary_literalMutationString132615 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_literalMutationString132627_literalMutationString132714_failAssert1440() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            boolean o_testBinary_literalMutationString132627__5 = doc.text().contains("");
            org.junit.Assert.fail("testBinary_literalMutationString132627_literalMutationString132714 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_literalMutationString132631_literalMutationString133047_failAssert1449() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            boolean o_testBinary_literalMutationString132631__5 = doc.text().contains("IA>A+tg");
            org.junit.Assert.fail("testBinary_literalMutationString132631_literalMutationString133047 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_add132634_literalMutationString132769_failAssert1409() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBinary_add132634__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            boolean o_testBinary_add132634__6 = doc.text().contains("gd-jpeg");
            org.junit.Assert.fail("testBinary_add132634_literalMutationString132769 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_literalMutationString132630_literalMutationString132774_failAssert1452() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            boolean o_testBinary_literalMutationString132630__5 = doc.text().contains("dd-jpeg");
            org.junit.Assert.fail("testBinary_literalMutationString132630_literalMutationString132774 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBinary_add132636_add133048_literalMutationString136204_failAssert1538() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_testBinary_add132636__5 = doc.text();
            String o_testBinary_add132636_add133048__8 = doc.text();
            boolean o_testBinary_add132636__6 = doc.text().contains("gd-jpeg");
            org.junit.Assert.fail("testBinary_add132636_add133048_literalMutationString136204 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJp_literalMutationString69382_failAssert800() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            doc.title();
            Element a = doc.select("a[href=t/2322m2]").first();
            a.attr("abs:href");
            a.text();
            org.junit.Assert.fail("testYahooJp_literalMutationString69382 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJpnull69423_failAssert820_literalMutationString70036_failAssert859() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                doc.title();
                Element a = doc.select(null).first();
                a.attr("abs:href");
                a.text();
                org.junit.Assert.fail("testYahooJpnull69423 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooJpnull69423_failAssert820_literalMutationString70036 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJpnull69423_failAssert820null71018_literalMutationString72729_failAssert945() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.yahoo.co.jp/index.html");
                String o_testYahooJpnull69423_failAssert820null71018__8 = doc.title();
                Element a = doc.select(null).first();
                a.attr("abs:href");
                a.text();
                org.junit.Assert.fail("testYahooJpnull69423 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooJpnull69423_failAssert820null71018_literalMutationString72729 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJp_literalMutationString69401_failAssert813_literalMutationString69970_failAssert870() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                doc.title();
                Element a = doc.select("Jay").first();
                a.attr("abs:href");
                a.text();
                org.junit.Assert.fail("testYahooJp_literalMutationString69401 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testYahooJp_literalMutationString69401_failAssert813_literalMutationString69970 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJp_add69413_add71099_literalMutationString74481_failAssert924() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testYahooJp_add69413__3 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            Document o_testYahooJp_add69413_add71099__6 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String o_testYahooJp_add69413__7 = doc.title();
            Element a = doc.select("a[href=t/2322m2]").first();
            String o_testYahooJp_add69413__11 = a.attr("abs:href");
            String o_testYahooJp_add69413__12 = a.text();
            org.junit.Assert.fail("testYahooJp_add69413_add71099_literalMutationString74481 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJp_add69413_add71050_literalMutationString73656_failAssert926() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testYahooJp_add69413_add71050__3 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            Document o_testYahooJp_add69413__3 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String o_testYahooJp_add69413__7 = doc.title();
            Element a = doc.select("a[href=t/2322m2]").first();
            String o_testYahooJp_add69413__11 = a.attr("abs:href");
            String o_testYahooJp_add69413__12 = a.text();
            org.junit.Assert.fail("testYahooJp_add69413_add71050_literalMutationString73656 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJpnull69424_failAssert821null71177_literalMutationString72391_failAssert942() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String o_testYahooJpnull69424_failAssert821null71177__8 = doc.title();
                Element a = doc.select(null).first();
                a.attr(null);
                a.text();
                org.junit.Assert.fail("testYahooJpnull69424 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooJpnull69424_failAssert821null71177_literalMutationString72391 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJpnull69422_failAssert819_literalMutationString69535_failAssert851() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", null);
                doc.title();
                Element a = doc.select("a[href=t/2322m2]").first();
                a.attr("abs:href");
                a.text();
                org.junit.Assert.fail("testYahooJpnull69422 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooJpnull69422_failAssert819_literalMutationString69535 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJpnull69424_failAssert821_literalMutationString69964_failAssert863() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                doc.title();
                Element a = doc.select("a[href=t/2322m2]").first();
                a.attr(null);
                a.text();
                org.junit.Assert.fail("testYahooJpnull69424 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooJpnull69424_failAssert821_literalMutationString69964 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJpnull69423_failAssert820null71028_literalMutationString73481_failAssert941() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String o_testYahooJpnull69423_failAssert820null71028__8 = doc.title();
                Element a = doc.select(null).first();
                a.attr(null);
                a.text();
                org.junit.Assert.fail("testYahooJpnull69423 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooJpnull69423_failAssert820null71028_literalMutationString73481 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooJp_add69413_literalMutationString69533_failAssert845() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testYahooJp_add69413__3 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String o_testYahooJp_add69413__7 = doc.title();
            Element a = doc.select("a[href=t/2322m2]").first();
            String o_testYahooJp_add69413__11 = a.attr("abs:href");
            String o_testYahooJp_add69413__12 = a.text();
            org.junit.Assert.fail("testYahooJp_add69413_literalMutationString69533 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaidu_literalMutationString107418_failAssert1066() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            Element submit = doc.select("#su").first();
            submit.attr("value");
            submit = doc.select("input[value=????]").first();
            submit.id();
            Element newsLink = doc.select("a:contains(?)").first();
            newsLink.absUrl("href");
            doc.outputSettings().charset().displayName();
            doc.select("title").outerHtml();
            doc.outputSettings().charset("ascii");
            doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaidu_literalMutationString107418 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaidu_remove107498_failAssert1146_literalMutationString113297_failAssert1165() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                Element submit = doc.select("#su").first();
                submit.attr("value");
                submit = doc.select("input[value=????]").first();
                submit.id();
                Element newsLink = doc.select("a:contains(?)").first();
                newsLink.absUrl("href");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaidu_remove107498 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaidu_remove107498_failAssert1146_literalMutationString113297 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaidu_literalMutationString107445_failAssert1093_add115269_literalMutationString122465_failAssert1192() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document o_testBaidu_literalMutationString107445_failAssert1093_add115269__6 = Jsoup.parse(in, null, "http://www.baidu.com/");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                Element submit = doc.select("#su").first();
                String o_testBaidu_literalMutationString107445_failAssert1093_add115269__13 = submit.attr("value");
                submit = doc.select("8(j6o7#6_{g_`ZvA/").first();
                submit.id();
                Element newsLink = doc.select("a:contains(?)").first();
                newsLink.absUrl("href");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                doc.outputSettings().charset("ascii");
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaidu_literalMutationString107445 should have thrown Selector$SelectorParseException");
            } catch (Selector.SelectorParseException expected) {
            }
            org.junit.Assert.fail("testBaidu_literalMutationString107445_failAssert1093_add115269_literalMutationString122465 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add46588_literalMutationString46706_failAssert488() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            Charset o_testBaiduVariant_add46588__7 = doc.outputSettings().charset();
            String o_testBaiduVariant_add46588__9 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add46588__12 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add46588_literalMutationString46706 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString46570_failAssert459_literalMutationString46790_failAssert499() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString46570 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString46570_failAssert459_literalMutationString46790 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add46586_add47449_literalMutationString48113_failAssert531() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add46586_add47449__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document o_testBaiduVariant_add46586__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            String o_testBaiduVariant_add46586__8 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add46586__11 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add46586_add47449_literalMutationString48113 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString46571_failAssert460_literalMutationString46672_failAssert498() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString46571 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString46571_failAssert460_literalMutationString46672 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariantnull46594_failAssert465_literalMutationString46736_failAssert492() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, null);
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariantnull46594 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testBaiduVariantnull46594_failAssert465_literalMutationString46736 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString46567_failAssert456_literalMutationString46817_failAssert501() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString46567 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString46567_failAssert456_literalMutationString46817 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add46586_literalMutationString46688_failAssert475() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add46586__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            String o_testBaiduVariant_add46586__8 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add46586__11 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add46586_literalMutationString46688 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString46568_failAssert457() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            doc.outputSettings().charset().displayName();
            doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_literalMutationString46568 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString46569_failAssert458_literalMutationString46789_failAssert502() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString46569 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString46569_failAssert458_literalMutationString46789 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariantnull46595_failAssert466_literalMutationString46732_failAssert495() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select(null).outerHtml();
                org.junit.Assert.fail("testBaiduVariantnull46595 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testBaiduVariantnull46595_failAssert466_literalMutationString46732 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add46588_add47306_literalMutationString50812_failAssert542() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add46588_add47306__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            Charset o_testBaiduVariant_add46588__7 = doc.outputSettings().charset();
            String o_testBaiduVariant_add46588__9 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add46588__12 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add46588_add47306_literalMutationString50812 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add46586_add47465_literalMutationString48402_failAssert530() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add46586__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document o_testBaiduVariant_add46586_add47465__7 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            String o_testBaiduVariant_add46586__8 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add46586__11 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add46586_add47465_literalMutationString48402 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString46572_failAssert461_literalMutationString46784_failAssert500() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString46572 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString46572_failAssert461_literalMutationString46784 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_literalMutationString87165_failAssert1016() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("/htmltests/meta-charset-1.html");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            doc.text();
            doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("/htmltests/meta-charset-2.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.outputSettings().charset().displayName();
            "?".equals(doc.text());
            in = AmplParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com/");
            doc.outputSettings().charset().displayName();
            doc.outputSettings().charset().displayName();
            doc.text();
            doc.text();
            org.junit.Assert.fail("testHtml5Charset_literalMutationString87165 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_literalMutationString87150_failAssert1010() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("/htmltests/meta-charset-1.html");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            doc.text();
            doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.outputSettings().charset().displayName();
            "?".equals(doc.text());
            in = AmplParseTest.getFile("/htmltests/meta-charset-3.html");
            doc = Jsoup.parse(in, null, "http://example.com/");
            doc.outputSettings().charset().displayName();
            doc.outputSettings().charset().displayName();
            doc.text();
            doc.text();
            org.junit.Assert.fail("testHtml5Charset_literalMutationString87150 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_add87178_literalMutationString89571_failAssert1043() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testHtml5Charset_add87178__4 = Jsoup.parse(in, null, "http://example.com/");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add87178__8 = doc.text();
            String o_testHtml5Charset_add87178__9 = doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("/htmltests/meta-charset-2.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            String o_testHtml5Charset_add87178__19 = doc.outputSettings().charset().displayName();
            boolean o_testHtml5Charset_add87178__22 = "?".equals(doc.text());
            in = AmplParseTest.getFile("/htmltests/meta-charset-3.html");
            doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add87178__30 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add87178__33 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add87178__36 = doc.text();
            String o_testHtml5Charset_add87178__37 = doc.text();
            org.junit.Assert.fail("testHtml5Charset_add87178_literalMutationString89571 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_add87178_literalMutationString90259_failAssert1045() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("/htmltests/meta-charset-1.html");
            Document o_testHtml5Charset_add87178__4 = Jsoup.parse(in, null, "http://example.com/");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add87178__8 = doc.text();
            String o_testHtml5Charset_add87178__9 = doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com");
            String o_testHtml5Charset_add87178__19 = doc.outputSettings().charset().displayName();
            boolean o_testHtml5Charset_add87178__22 = "?".equals(doc.text());
            in = AmplParseTest.getFile("/htmltests/meta-charset-3.html");
            doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add87178__30 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add87178__33 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add87178__36 = doc.text();
            String o_testHtml5Charset_add87178__37 = doc.text();
            org.junit.Assert.fail("testHtml5Charset_add87178_literalMutationString90259 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_add87178_literalMutationString90667_failAssert1044() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("/htmltests/meta-charset-1.html");
            Document o_testHtml5Charset_add87178__4 = Jsoup.parse(in, null, "http://example.com/");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add87178__8 = doc.text();
            String o_testHtml5Charset_add87178__9 = doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("/htmltests/meta-charset-2.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            String o_testHtml5Charset_add87178__19 = doc.outputSettings().charset().displayName();
            boolean o_testHtml5Charset_add87178__22 = "?".equals(doc.text());
            in = AmplParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add87178__30 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add87178__33 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add87178__36 = doc.text();
            String o_testHtml5Charset_add87178__37 = doc.text();
            org.junit.Assert.fail("testHtml5Charset_add87178_literalMutationString90667 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_literalMutationString87138_failAssert1004() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            doc.text();
            doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("/htmltests/meta-charset-2.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.outputSettings().charset().displayName();
            "?".equals(doc.text());
            in = AmplParseTest.getFile("/htmltests/meta-charset-3.html");
            doc = Jsoup.parse(in, null, "http://example.com/");
            doc.outputSettings().charset().displayName();
            doc.outputSettings().charset().displayName();
            doc.text();
            doc.text();
            org.junit.Assert.fail("testHtml5Charset_literalMutationString87138 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126329_literalMutationString126860_failAssert1241() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126329__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126329_literalMutationString126860 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126323_failAssert1206() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126323 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_add126342_add127111_literalMutationString130545_failAssert1370() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_add126342__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document o_testNytArticle_add126342_add127111__7 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_add126342__10 = headline.text();
            org.junit.Assert.fail("testNytArticle_add126342_add127111_literalMutationString130545 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126334_literalMutationString126774_failAssert1287() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.c[m/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126334__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126334_literalMutationString126774 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126332_literalMutationString126487_failAssert1280() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "8LKS[*r*m [}{y|)0W:D]3wh8W(.caGPDBl*[?2*Ez(}t2!.;_zu1Cm#r]H9;]");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126332__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126332_literalMutationString126487 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126333_literalMutationString126419_failAssert1286() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/lobal/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126333__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126333_literalMutationString126419 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticlenull126348_failAssert1219_literalMutationString126421_failAssert1282() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, null);
                Element headline = doc.select("nyt_headline[version=1.0]").first();
                headline.text();
                org.junit.Assert.fail("testNytArticlenull126348 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testNytArticlenull126348_failAssert1219_literalMutationString126421 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126330_literalMutationString126455_failAssert1288() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nyti#mes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126330__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126330_literalMutationString126455 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_add126342_add127104_literalMutationString130695_failAssert1371() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_add126342_add127104__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document o_testNytArticle_add126342__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_add126342__10 = headline.text();
            org.junit.Assert.fail("testNytArticle_add126342_add127104_literalMutationString130695 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126331_literalMutationString126438_failAssert1242() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "Jay");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126331__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126331_literalMutationString126438 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_add126342_literalMutationString126839_failAssert1232() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_add126342__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_add126342__10 = headline.text();
            org.junit.Assert.fail("testNytArticle_add126342_literalMutationString126839 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126329_add127033_literalMutationString129883_failAssert1356() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_literalMutationString126329_add127033__4 = Jsoup.parse(in, null, "");
            Document doc = Jsoup.parse(in, null, "");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126329__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126329_add127033_literalMutationString129883 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString126331_add126586_literalMutationString127613_failAssert1340() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_literalMutationString126331_add126586__4 = Jsoup.parse(in, null, "Jay");
            Document doc = Jsoup.parse(in, null, "Jay");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString126331__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString126331_add126586_literalMutationString127613 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticle_literalMutationString30363_failAssert132() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
            p.text();
            org.junit.Assert.fail("testYahooArticle_literalMutationString30363 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticlenull30394_literalMutationString30482_failAssert208() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
            String o_testYahooArticlenull30394__8 = p.text();
            org.junit.Assert.fail("testYahooArticlenull30394_literalMutationString30482 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticlenull30394_literalMutationString30672_literalMutationString33988_failAssert302() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "");
            Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
            String o_testYahooArticlenull30394__8 = p.text();
            org.junit.Assert.fail("testYahooArticlenull30394_literalMutationString30672_literalMutationString33988 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticlenull30394_literalMutationString30675_literalMutationString32435_failAssert304() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "Jay");
            Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
            String o_testYahooArticlenull30394__8 = p.text();
            org.junit.Assert.fail("testYahooArticlenull30394_literalMutationString30675_literalMutationString32435 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticle_literalMutationString30382_failAssert144_literalMutationString30681_failAssert226() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
                Element p = doc.select("").first();
                p.text();
                org.junit.Assert.fail("testYahooArticle_literalMutationString30382 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooArticle_literalMutationString30382_failAssert144_literalMutationString30681 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticle_add30388_add31562_literalMutationString32152_failAssert279() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testYahooArticle_add30388_add31562__3 = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Document o_testYahooArticle_add30388__3 = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
            String o_testYahooArticle_add30388__9 = p.text();
            org.junit.Assert.fail("testYahooArticle_add30388_add31562_literalMutationString32152 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticle_add30388_literalMutationString30558_failAssert172() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testYahooArticle_add30388__3 = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
            String o_testYahooArticle_add30388__9 = p.text();
            org.junit.Assert.fail("testYahooArticle_add30388_literalMutationString30558 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticle_literalMutationString30384_failAssert146_literalMutationString30561_failAssert190() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
                Element p = doc.select("Jay").first();
                p.text();
                org.junit.Assert.fail("testYahooArticle_literalMutationString30384 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testYahooArticle_literalMutationString30384_failAssert146_literalMutationString30561 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticlenull30395_failAssert150_literalMutationString30614_failAssert184() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", null);
                Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
                p.text();
                org.junit.Assert.fail("testYahooArticlenull30395 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooArticlenull30395_failAssert150_literalMutationString30614 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticlenull30396_failAssert151_literalMutationString30513_failAssert185() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
                Element p = doc.select(null).first();
                p.text();
                org.junit.Assert.fail("testYahooArticlenull30396 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testYahooArticlenull30396_failAssert151_literalMutationString30513 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testYahooArticle_add30388_add31579_literalMutationString33821_failAssert278() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testYahooArticle_add30388__3 = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Document o_testYahooArticle_add30388_add31579__6 = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
            Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
            String o_testYahooArticle_add30388__9 = p.text();
            org.junit.Assert.fail("testYahooArticle_add30388_add31579_literalMutationString33821 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64811_failAssert685_literalMutationString64983_failAssert733() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#8form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64811 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64811_failAssert685_literalMutationString64983 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64804_failAssert678_literalMutationString64985_failAssert732() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64804 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64804_failAssert678_literalMutationString64985 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add64815_add65375_literalMutationString67826_failAssert785() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add64815_add65375__3 = Jsoup.parse(in, null);
            Document o_testLowercaseUtf8Charset_add64815__3 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add64815__9 = form.children().size();
            String o_testLowercaseUtf8Charset_add64815__11 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add64815_add65375_literalMutationString67826 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add64815_add65393_literalMutationString68325_failAssert784() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add64815__3 = Jsoup.parse(in, null);
            Document o_testLowercaseUtf8Charset_add64815_add65393__6 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add64815__9 = form.children().size();
            String o_testLowercaseUtf8Charset_add64815__11 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add64815_add65393_literalMutationString68325 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charsetnull64825_failAssert689_literalMutationString64981_failAssert724() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select(null).first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charsetnull64825 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charsetnull64825_failAssert689_literalMutationString64981 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add64816_literalMutationString64907_failAssert721() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null);
            Element o_testLowercaseUtf8Charset_add64816__5 = doc.select("#form").first();
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add64816__10 = form.children().size();
            String o_testLowercaseUtf8Charset_add64816__12 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add64816_literalMutationString64907 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add64816_add65356_literalMutationString67413_failAssert787() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add64816_add65356__3 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element o_testLowercaseUtf8Charset_add64816__5 = doc.select("#form").first();
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add64816__10 = form.children().size();
            String o_testLowercaseUtf8Charset_add64816__12 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add64816_add65356_literalMutationString67413 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64807_failAssert681_literalMutationString64883_failAssert731() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64807 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64807_failAssert681_literalMutationString64883 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64805_failAssert679_literalMutationString64903_failAssert729() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64805 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64805_failAssert679_literalMutationString64903 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64809_failAssert683_literalMutationString64936_failAssert739() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64809 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64809_failAssert683_literalMutationString64936 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64803_failAssert677_literalMutationString64892_failAssert730() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64803 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64803_failAssert677_literalMutationString64892 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64806_failAssert680_literalMutationString64933_failAssert728() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64806 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64806_failAssert680_literalMutationString64933 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64813_failAssert687_literalMutationString64884_failAssert727() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#frm").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64813 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64813_failAssert687_literalMutationString64884 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add64815_literalMutationString64918_failAssert702() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add64815__3 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add64815__9 = form.children().size();
            String o_testLowercaseUtf8Charset_add64815__11 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add64815_literalMutationString64918 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64810_failAssert684_literalMutationString64939_failAssert726() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("Jay").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64810 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64810_failAssert684_literalMutationString64939 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString64802_failAssert676() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            form.children().size();
            doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString64802 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    public static File getFile(String resourceName) {
        try {
            File file = new File(AmplParseTest.class.getResource(resourceName).toURI());
            return file;
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
    }

    public static InputStream inputStreamFrom(String s) {
        try {
            return new ByteArrayInputStream(s.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}

