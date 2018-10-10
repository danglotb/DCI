package org.jsoup.nodes;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.integration.ParseTest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.xml;


public class AmplDocumentTest {
    private static final String charsetUtf8 = "UTF-8";

    private static final String charsetIso8859 = "ISO-8859-1";

    @Test(timeout = 10000)
    public void testLocation_add32null2464_failAssert47_literalMutationString15009_failAssert98() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("");
                Document o_testLocation_add32__4 = Jsoup.parse(in, "UTF-8", null);
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
                doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add32null2464 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add32null2464_failAssert47_literalMutationString15009 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add36_literalMutationString2061_failAssert66() throws IOException, Exception {
        try {
            File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String location = doc.location();
            String baseUri = doc.baseUri();
            in = new ParseTest().getFile("");
            Document o_testLocation_add36__13 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            location = doc.location();
            baseUri = doc.baseUri();
            org.junit.Assert.fail("testLocation_add36_literalMutationString2061 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add32null2470_failAssert48_literalMutationString15685_failAssert81() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("");
                Document o_testLocation_add32__4 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
                doc = Jsoup.parse(in, null, null);
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add32null2470 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add32null2470_failAssert48_literalMutationString15685 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add36null2477_failAssert71_literalMutationString7800_failAssert92() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("");
                Document o_testLocation_add36__13 = Jsoup.parse(in, null, null);
                doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add36null2477 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add36null2477_failAssert71_literalMutationString7800 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_literalMutationString19_failAssert12() throws IOException, Exception {
        try {
            File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String location = doc.location();
            String baseUri = doc.baseUri();
            in = new ParseTest().getFile("");
            doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            location = doc.location();
            baseUri = doc.baseUri();
            org.junit.Assert.fail("testLocation_literalMutationString19 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add32_literalMutationString1247_failAssert43() throws IOException, Exception {
        try {
            File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
            Document o_testLocation_add32__4 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String location = doc.location();
            String baseUri = doc.baseUri();
            in = new ParseTest().getFile("");
            doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            location = doc.location();
            baseUri = doc.baseUri();
            org.junit.Assert.fail("testLocation_add32_literalMutationString1247 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add32null2467_failAssert46_literalMutationString15470_failAssert100() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("");
                Document o_testLocation_add32__4 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                Document doc = Jsoup.parse(in, "UTF-8", null);
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
                doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add32null2467 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add32null2467_failAssert46_literalMutationString15470 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add32null2470_failAssert48_literalMutationString15982_failAssert79() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
                Document o_testLocation_add32__4 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("");
                doc = Jsoup.parse(in, null, null);
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add32null2470 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add32null2470_failAssert48_literalMutationString15982 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add36null2479_failAssert70_literalMutationString6755_failAssert93() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("");
                Document o_testLocation_add36__13 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                doc = Jsoup.parse(in, null, null);
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add36null2479 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add36null2479_failAssert70_literalMutationString6755 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add36null2477_failAssert71_literalMutationString7606_failAssert106() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
                Document o_testLocation_add36__13 = Jsoup.parse(in, null, null);
                doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add36null2477 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add36null2477_failAssert71_literalMutationString7606 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_literalMutationString1_failAssert0() throws IOException, Exception {
        try {
            File in = new ParseTest().getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String location = doc.location();
            String baseUri = doc.baseUri();
            in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
            doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            location = doc.location();
            baseUri = doc.baseUri();
            org.junit.Assert.fail("testLocation_literalMutationString1 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add36null2475_failAssert68_literalMutationString10635_failAssert112() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile(null);
                Document o_testLocation_add36__13 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add36null2475 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLocation_add36null2475_failAssert68_literalMutationString10635 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add36_literalMutationString1378_failAssert65() throws IOException, Exception {
        try {
            File in = new ParseTest().getFile("");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String location = doc.location();
            String baseUri = doc.baseUri();
            in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
            Document o_testLocation_add36__13 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            location = doc.location();
            baseUri = doc.baseUri();
            org.junit.Assert.fail("testLocation_add36_literalMutationString1378 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add32_literalMutationString231_failAssert42() throws IOException, Exception {
        try {
            File in = new ParseTest().getFile("");
            Document o_testLocation_add32__4 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
            String location = doc.location();
            String baseUri = doc.baseUri();
            in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
            doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
            location = doc.location();
            baseUri = doc.baseUri();
            org.junit.Assert.fail("testLocation_add32_literalMutationString231 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add32null2468_failAssert45_literalMutationString4392_failAssert80() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("");
                Document o_testLocation_add32__4 = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile(null);
                doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add32null2468 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testLocation_add32null2468_failAssert45_literalMutationString4392 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testLocation_add36null2479_failAssert70_literalMutationString6523_failAssert105() throws IOException, Exception {
        try {
            try {
                File in = new ParseTest().getFile("");
                Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
                String location = doc.location();
                String baseUri = doc.baseUri();
                in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
                Document o_testLocation_add36__13 = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
                doc = Jsoup.parse(in, null, null);
                location = doc.location();
                baseUri = doc.baseUri();
                org.junit.Assert.fail("testLocation_add36null2479 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testLocation_add36null2479_failAssert70_literalMutationString6523 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Ignore
    @Test
    public void testOverflowClone() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.insert(0, "<i>");
            builder.append("</i>");
        }
        Document doc = Jsoup.parse(builder.toString());
        doc.clone();
    }

    private Document createHtmlDocument(String charset) {
        final Document doc = Document.createShell("");
        doc.head().appendElement("meta").attr("charset", charset);
        doc.head().appendElement("meta").attr("name", "charset").attr("content", charset);
        return doc;
    }

    private Document createXmlDocument(String version, String charset, boolean addDecl) {
        final Document doc = new Document("");
        doc.appendElement("root").text("node");
        doc.outputSettings().syntax(xml);
        if (addDecl) {
            XmlDeclaration decl = new XmlDeclaration("xml", false);
            decl.attr("version", version);
            decl.attr("encoding", charset);
            doc.prependChild(decl);
        }
        return doc;
    }
}

