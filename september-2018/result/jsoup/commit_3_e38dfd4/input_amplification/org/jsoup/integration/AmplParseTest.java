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
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;


public class AmplParseTest {
    @Test(timeout = 10000)
    public void testBaidu_literalMutationString39868_failAssert364_add41320_literalMutationString58136_failAssert478() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document o_testBaidu_literalMutationString39868_failAssert364_add41320__6 = Jsoup.parse(in, null, "http://www.baidu.com/");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                Element submit = doc.select("#su").first();
                String o_testBaidu_literalMutationString39868_failAssert364_add41320__13 = submit.attr("value");
                submit = doc.select("inputOvalue=\u767e\u5ea6\u4e00\u4e0b]").first();
                submit.id();
                Element newsLink = doc.select("a:contains(?)").first();
                newsLink.absUrl("href");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                doc.outputSettings().charset("ascii");
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaidu_literalMutationString39868 should have thrown Selector$SelectorParseException");
            } catch (Selector.SelectorParseException expected) {
            }
            org.junit.Assert.fail("testBaidu_literalMutationString39868_failAssert364_add41320_literalMutationString58136 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaidu_remove39920_failAssert416_literalMutationString43945_failAssert446() throws IOException, Exception {
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
                org.junit.Assert.fail("testBaidu_remove39920 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaidu_remove39920_failAssert416_literalMutationString43945 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaidu_literalMutationString39840_failAssert336() throws IOException, Exception {
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
            org.junit.Assert.fail("testBaidu_literalMutationString39840 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaidu_literalMutationString39868_failAssert364_literalMutationString40809_failAssert437() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                Element submit = doc.select("#su").first();
                submit.attr("value");
                submit = doc.select("inputOvalue=\u767e\u5ea6\u4e00\u4e0b]").first();
                submit.id();
                Element newsLink = doc.select("a:contains(?)").first();
                newsLink.absUrl("href");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                doc.outputSettings().charset("ascii");
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaidu_literalMutationString39868 should have thrown Selector$SelectorParseException");
            } catch (Selector.SelectorParseException expected) {
            }
            org.junit.Assert.fail("testBaidu_literalMutationString39868_failAssert364_literalMutationString40809 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString6_failAssert5_literalMutationString115_failAssert43() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString6 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString6_failAssert5_literalMutationString115 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariantnull29_failAssert10_literalMutationString708_failAssert38() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select(null).outerHtml();
                org.junit.Assert.fail("testBaiduVariantnull29 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testBaiduVariantnull29_failAssert10_literalMutationString708 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString4_failAssert3_literalMutationString675_failAssert44() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString4 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString4_failAssert3_literalMutationString675 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString5_failAssert4_literalMutationString539_failAssert45() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString5 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString5_failAssert4_literalMutationString539 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString2_failAssert1_literalMutationString104_failAssert41() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString2 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString2_failAssert1_literalMutationString104 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString3_failAssert2_literalMutationString745_failAssert42() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariant_literalMutationString3 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testBaiduVariant_literalMutationString3_failAssert2_literalMutationString745 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariantnull28_failAssert9_literalMutationString756_failAssert35() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, null);
                doc.outputSettings().charset().displayName();
                doc.select("title").outerHtml();
                org.junit.Assert.fail("testBaiduVariantnull28 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testBaiduVariantnull28_failAssert9_literalMutationString756 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add22_add487_literalMutationString3126_failAssert85() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add22_add487__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            Charset o_testBaiduVariant_add22__7 = doc.outputSettings().charset();
            String o_testBaiduVariant_add22__9 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add22__12 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add22_add487_literalMutationString3126 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_literalMutationString1_failAssert0() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            doc.outputSettings().charset().displayName();
            doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_literalMutationString1 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add22_literalMutationString349_failAssert31() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            Charset o_testBaiduVariant_add22__7 = doc.outputSettings().charset();
            String o_testBaiduVariant_add22__9 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add22__12 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add22_literalMutationString349 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add20_add870_literalMutationString2590_failAssert72() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add20__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document o_testBaiduVariant_add20_add870__7 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            String o_testBaiduVariant_add20__8 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add20__11 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add20_add870_literalMutationString2590 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add20_add842_literalMutationString3183_failAssert74() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add20_add842__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document o_testBaiduVariant_add20__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            String o_testBaiduVariant_add20__8 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add20__11 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add20_add842_literalMutationString3183 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBaiduVariant_add20_literalMutationString625_failAssert18() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testBaiduVariant_add20__4 = Jsoup.parse(in, null, "http://www.baidu.com/");
            Document doc = Jsoup.parse(in, null, "http://www.baidu.com/");
            String o_testBaiduVariant_add20__8 = doc.outputSettings().charset().displayName();
            String o_testBaiduVariant_add20__11 = doc.select("title").outerHtml();
            org.junit.Assert.fail("testBaiduVariant_add20_literalMutationString625 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_add19566_literalMutationString22655_failAssert313() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("/htmltests/meta-charset-1.html");
            Document o_testHtml5Charset_add19566__4 = Jsoup.parse(in, null, "http://example.com/");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add19566__8 = doc.text();
            String o_testHtml5Charset_add19566__9 = doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com");
            String o_testHtml5Charset_add19566__19 = doc.outputSettings().charset().displayName();
            boolean o_testHtml5Charset_add19566__22 = "?".equals(doc.text());
            in = AmplParseTest.getFile("/htmltests/meta-charset-3.html");
            doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add19566__30 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add19566__33 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add19566__36 = doc.text();
            String o_testHtml5Charset_add19566__37 = doc.text();
            org.junit.Assert.fail("testHtml5Charset_add19566_literalMutationString22655 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_literalMutationString19538_failAssert279() throws IOException, Exception {
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
            org.junit.Assert.fail("testHtml5Charset_literalMutationString19538 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_literalMutationString19553_failAssert285() throws IOException, Exception {
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
            org.junit.Assert.fail("testHtml5Charset_literalMutationString19553 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_add19566_literalMutationString22768_failAssert312() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("/htmltests/meta-charset-1.html");
            Document o_testHtml5Charset_add19566__4 = Jsoup.parse(in, null, "http://example.com/");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add19566__8 = doc.text();
            String o_testHtml5Charset_add19566__9 = doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("/htmltests/meta-charset-2.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            String o_testHtml5Charset_add19566__19 = doc.outputSettings().charset().displayName();
            boolean o_testHtml5Charset_add19566__22 = "?".equals(doc.text());
            in = AmplParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add19566__30 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add19566__33 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add19566__36 = doc.text();
            String o_testHtml5Charset_add19566__37 = doc.text();
            org.junit.Assert.fail("testHtml5Charset_add19566_literalMutationString22768 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_add19566_literalMutationString22541_failAssert314() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testHtml5Charset_add19566__4 = Jsoup.parse(in, null, "http://example.com/");
            Document doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add19566__8 = doc.text();
            String o_testHtml5Charset_add19566__9 = doc.outputSettings().charset().displayName();
            in = AmplParseTest.getFile("/htmltests/meta-charset-2.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            String o_testHtml5Charset_add19566__19 = doc.outputSettings().charset().displayName();
            boolean o_testHtml5Charset_add19566__22 = "?".equals(doc.text());
            in = AmplParseTest.getFile("/htmltests/meta-charset-3.html");
            doc = Jsoup.parse(in, null, "http://example.com/");
            String o_testHtml5Charset_add19566__30 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add19566__33 = doc.outputSettings().charset().displayName();
            String o_testHtml5Charset_add19566__36 = doc.text();
            String o_testHtml5Charset_add19566__37 = doc.text();
            org.junit.Assert.fail("testHtml5Charset_add19566_literalMutationString22541 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testHtml5Charset_literalMutationString19526_failAssert273() throws IOException, Exception {
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
            org.junit.Assert.fail("testHtml5Charset_literalMutationString19526 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65158_add65934_literalMutationString66442_failAssert636() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_literalMutationString65158_add65934__4 = Jsoup.parse(in, null, "");
            Document doc = Jsoup.parse(in, null, "");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65158__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65158_add65934_literalMutationString66442 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65162_literalMutationString65640_failAssert560() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "^?$8#hz!r%,V&4[o@FS iPUb`#HtOl_).$oP-m|[o:Q53:of1x9v=FOeE!HHWo");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65162__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65162_literalMutationString65640 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65160_literalMutationString65867_failAssert566() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.tml?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65160__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65160_literalMutationString65867 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65163_literalMutationString65450_failAssert568() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/201C/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65163__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65163_literalMutationString65450 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65159_literalMutationString65846_failAssert523() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "Jay");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65159__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65159_literalMutationString65846 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65161_literalMutationString65247_failAssert569() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.;com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65161__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65161_literalMutationString65247 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65152_failAssert486() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65152 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_add65171_add65578_literalMutationString69782_failAssert650() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_add65171__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document o_testNytArticle_add65171_add65578__7 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_add65171__10 = headline.text();
            org.junit.Assert.fail("testNytArticle_add65171_add65578_literalMutationString69782 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_add65171_literalMutationString65253_failAssert512() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_add65171__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_add65171__10 = headline.text();
            org.junit.Assert.fail("testNytArticle_add65171_literalMutationString65253 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_add65171_add65555_literalMutationString70333_failAssert651() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_add65171_add65555__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document o_testNytArticle_add65171__4 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_add65171__10 = headline.text();
            org.junit.Assert.fail("testNytArticle_add65171_add65555_literalMutationString70333 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticlenull65177_failAssert499_literalMutationString65806_failAssert562() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null, null);
                Element headline = doc.select("nyt_headline[version=1.0]").first();
                headline.text();
                org.junit.Assert.fail("testNytArticlenull65177 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testNytArticlenull65177_failAssert499_literalMutationString65806 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65158_literalMutationString65855_failAssert521() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65158__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65158_literalMutationString65855 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNytArticle_literalMutationString65159_add65930_literalMutationString67177_failAssert621() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testNytArticle_literalMutationString65159_add65930__4 = Jsoup.parse(in, null, "Jay");
            Document doc = Jsoup.parse(in, null, "Jay");
            Element headline = doc.select("nyt_headline[version=1.0]").first();
            String o_testNytArticle_literalMutationString65159__9 = headline.text();
            org.junit.Assert.fail("testNytArticle_literalMutationString65159_add65930_literalMutationString67177 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add5410_literalMutationString5519_failAssert133() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null);
            Element o_testLowercaseUtf8Charset_add5410__5 = doc.select("#form").first();
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add5410__10 = form.children().size();
            String o_testLowercaseUtf8Charset_add5410__12 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add5410_literalMutationString5519 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5405_failAssert98_literalMutationString5478_failAssert140() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#fBrm").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5405 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5405_failAssert98_literalMutationString5478 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add5409_add5916_literalMutationString8100_failAssert199() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add5409__3 = Jsoup.parse(in, null);
            Document o_testLowercaseUtf8Charset_add5409_add5916__6 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add5409__9 = form.children().size();
            String o_testLowercaseUtf8Charset_add5409__11 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add5409_add5916_literalMutationString8100 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5396_failAssert89() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            form.children().size();
            doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5396 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5401_failAssert94_literalMutationString5476_failAssert142() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5401 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5401_failAssert94_literalMutationString5476 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add5409_add5904_literalMutationString8547_failAssert200() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add5409_add5904__3 = Jsoup.parse(in, null);
            Document o_testLowercaseUtf8Charset_add5409__3 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add5409__9 = form.children().size();
            String o_testLowercaseUtf8Charset_add5409__11 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add5409_add5904_literalMutationString8547 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5402_failAssert95_literalMutationString5835_failAssert139() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#fom").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5402 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5402_failAssert95_literalMutationString5835 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add5409_literalMutationString5715_failAssert115() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add5409__3 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add5409__9 = form.children().size();
            String o_testLowercaseUtf8Charset_add5409__11 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add5409_literalMutationString5715 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5400_failAssert93_literalMutationString5884_failAssert141() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5400 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5400_failAssert93_literalMutationString5884 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5398_failAssert91_literalMutationString5705_failAssert144() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5398 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5398_failAssert91_literalMutationString5705 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5403_failAssert96_literalMutationString5659_failAssert151() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5403 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5403_failAssert96_literalMutationString5659 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5397_failAssert90_literalMutationString5517_failAssert143() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5397 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5397_failAssert90_literalMutationString5517 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5404_failAssert97_literalMutationString5840_failAssert138() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("Jay").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5404 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5404_failAssert97_literalMutationString5840 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_literalMutationString5399_failAssert92_literalMutationString5896_failAssert145() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select("#form").first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5399 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charset_literalMutationString5399_failAssert92_literalMutationString5896 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charset_add5410_add5701_literalMutationString7004_failAssert202() throws IOException, Exception {
        try {
            File in = AmplParseTest.getFile("");
            Document o_testLowercaseUtf8Charset_add5410_add5701__3 = Jsoup.parse(in, null);
            Document doc = Jsoup.parse(in, null);
            Element o_testLowercaseUtf8Charset_add5410__5 = doc.select("#form").first();
            Element form = doc.select("#form").first();
            int o_testLowercaseUtf8Charset_add5410__10 = form.children().size();
            String o_testLowercaseUtf8Charset_add5410__12 = doc.outputSettings().charset().name();
            org.junit.Assert.fail("testLowercaseUtf8Charset_add5410_add5701_literalMutationString7004 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLowercaseUtf8Charsetnull5419_failAssert102_literalMutationString5679_failAssert136() throws IOException, Exception {
        try {
            try {
                File in = AmplParseTest.getFile("");
                Document doc = Jsoup.parse(in, null);
                Element form = doc.select(null).first();
                form.children().size();
                doc.outputSettings().charset().name();
                org.junit.Assert.fail("testLowercaseUtf8Charsetnull5419 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLowercaseUtf8Charsetnull5419_failAssert102_literalMutationString5679 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
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

