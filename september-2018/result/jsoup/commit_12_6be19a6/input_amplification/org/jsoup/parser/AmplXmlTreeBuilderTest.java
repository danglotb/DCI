package org.jsoup.parser;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class AmplXmlTreeBuilderTest {
    @Ignore
    @Test
    public void testSupplyParserToConnection() throws IOException {
        String xmlUrl = "http://direct.infohound.net/tools/jsoup-xml-test.xml";
        Document xmlDoc = Jsoup.connect(xmlUrl).parser(Parser.xmlParser()).get();
        Document htmlDoc = Jsoup.connect(xmlUrl).parser(Parser.htmlParser()).get();
        Document autoXmlDoc = Jsoup.connect(xmlUrl).get();
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", TextUtil.stripNewlines(xmlDoc.html()));
        Assert.assertFalse(htmlDoc.equals(xmlDoc));
        Assert.assertEquals(xmlDoc, autoXmlDoc);
        Assert.assertEquals(1, htmlDoc.select("head").size());
        Assert.assertEquals(0, xmlDoc.select("head").size());
        Assert.assertEquals(0, autoXmlDoc.select("head").size());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1336_add13245() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13_add1336_add13245__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getPort())));
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1336__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13245__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1284_add12439() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13_add1284__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1284_add12439__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getPort())));
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12439__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1336_add13249() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add13_add1336_add13249__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getRef());
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1336__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13249__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_mg19_literalMutationString155_failAssert52() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_mg19__10 = TextUtil.stripNewlines(doc.html());
            doc.body();
            org.junit.Assert.fail("testSupplyParserToDataStream_mg19_literalMutationString155 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_literalMutationString215_failAssert36() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add14_literalMutationString215 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add441_add7814() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add14_add441__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add14_add441_add7814__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7814__8)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1292() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add13_add1292__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getRef());
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1292__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1284_add12286() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13_add1284_add12286__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getPort())));
        URI o_testSupplyParserToDataStream_add13_add1284__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12286__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add441() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add14_add441__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1284_add12448() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13_add1284__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1284_add12448__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284_add12448__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1336() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1336__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1284_add12443() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13_add1284__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add13_add1284_add12443__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getRef());
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12443__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add448() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add14_add448__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add448__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add441_add7626() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14_add441_add7626__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getRef());
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add14_add441__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7626__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1338() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add13_add1338__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1338__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1284() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13_add1284__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getPort())));
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1284__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_literalMutationString1185_failAssert24() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add13_literalMutationString1185 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add441_add7632() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add14_add441_add7632__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getPort())));
        URI o_testSupplyParserToDataStream_add14_add441__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7632__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1284_add12451() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13_add1284__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add13_add1284_add12451__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12451__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull38_literalMutationString776_failAssert42() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStreamnull38__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStreamnull38_literalMutationString776 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1284_add12292() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add13_add1284_add12292__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getRef());
        URI o_testSupplyParserToDataStream_add13_add1284__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1284_add12292__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1336_add13391() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1336__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add13_add1336_add13391__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13391__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add441_add7637() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add14_add441_add7637__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getRef());
        URI o_testSupplyParserToDataStream_add14_add441__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add441_add7637__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1336_add13258() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1336_add13258__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getPort())));
        URI o_testSupplyParserToDataStream_add13_add1336__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13258__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_mg23_literalMutationString1033_failAssert53() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_mg23__10 = TextUtil.stripNewlines(doc.html());
            doc.head();
            org.junit.Assert.fail("testSupplyParserToDataStream_mg23_literalMutationString1033 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString1_failAssert0() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString1 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add389() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14_add389__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getRef());
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14_add389__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1336_add13262() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add13_add1336_add13262__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getRef());
        URI o_testSupplyParserToDataStream_add13_add1336__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add13_add1336_add13262__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add14__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add14__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add14__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add14__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add14__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add14_add441_add7804() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add14__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add14_add441__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add14_add441_add7804__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add14__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add14__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add14_add441_add7804__8)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add13_add1336_add13386() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add13__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1336__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add13_add1336_add13386__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add13__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add13__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add13_add1336_add13386__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17010_add24396() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24396__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17045_add23085() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23085__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17010_add24234() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24234__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17045_add23245() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23245__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString14757_failAssert90() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            doc.charset().name();
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString14757 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17046() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17046__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17046__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17045() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawPath());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045__5)).getRawPath());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17010_add24382() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24382__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_literalMutationString15619_failAssert126() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add14770_literalMutationString15619 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15823() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add14770_add15823__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15823__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17045_add23092() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23092__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15814_add24329() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24329__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17010_add24388() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24388__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17045_add23256() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23256__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15741() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770_add15741__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15741__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_literalMutationString16846_failAssert114() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add14769_literalMutationString16846 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15814_add24315() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24315__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15814() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawPath());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814__4)).getRawPath());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17010_add24374() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24374__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15814_add24472() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24472__8)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17045_add23073() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23073__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15814_add24306() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24306__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17010_add24245() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17010_add24245__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17010() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17010__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawPath());
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14769_add17010__1)).getRawPath());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14770_add15814_add24461() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14770__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14770__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
        String o_testDetectCharsetEncodingDeclaration_add14770__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14770__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add14770_add15814_add24461__8)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14770__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17045_add23079() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add14769_add17045__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17045_add23079__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add14769_add17011() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add14769_add17011__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add14769__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add14769__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
        String o_testDetectCharsetEncodingDeclaration_add14769__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add14769__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add14769_add17011__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add14769__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclarationnull14797_failAssert100_literalMutationString16632_failAssert131() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, null, Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull14797 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull14797_failAssert100_literalMutationString16632 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }
}

