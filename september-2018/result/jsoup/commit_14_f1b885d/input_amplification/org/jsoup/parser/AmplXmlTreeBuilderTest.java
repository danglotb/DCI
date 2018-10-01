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
    public void testSupplyParserToDataStream_add320072_add322181_add328026() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072_add322181_add328026__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawPath());
        URI o_testSupplyParserToDataStream_add320072_add322181__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328026__1)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321255() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add320073_add321255__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321255__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_literalMutationString320970_failAssert815() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add320073_literalMutationString320970 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321244_add327604() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add320073_add321244_add327604__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawPath());
        URI o_testSupplyParserToDataStream_add320073_add321244__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327604__4)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322223_add323394() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322223__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322223_add323394__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawPath());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323394__9)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322223_add323198() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072_add322223_add323198__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawPath());
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322223__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323198__1)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322223_add323231() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add320072_add322223_add323231__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getRef());
        URI o_testSupplyParserToDataStream_add320072_add322223__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323231__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322181() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072_add322181__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getPort())));
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322185() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320072_add322185__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getRef());
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322185__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322181_add328219() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072_add322181__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add320072_add322181_add328219__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328219__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_literalMutationString322021_failAssert803() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add320072_literalMutationString322021 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322181_add328211() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072_add322181__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322181_add328211__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawPath());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328211__9)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321244_add327610() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add320073_add321244_add327610__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getRef());
        URI o_testSupplyParserToDataStream_add320073_add321244__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327610__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321150() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073_add321150__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getRef());
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321150__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull320097_literalMutationString321043_failAssert821() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStreamnull320097__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStreamnull320097_literalMutationString321043 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString320060_failAssert779() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString320060 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322181_add328200() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072_add322181__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add320072_add322181_add328200__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getRef());
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328200__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322223_add323418() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322223__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add320072_add322223_add323418__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323418__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321244_add327704() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add320073_add321244__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320073_add321244_add327704__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawPath());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244_add327704__8)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322223_add323210() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320072_add322223_add323210__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getRef());
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322223__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322223_add323210__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321244() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add320073_add321244__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320073_add321244__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322223() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322223__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322225() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add320072_add322225__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322225__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322181_add328030() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320072_add322181_add328030__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getRef());
        URI o_testSupplyParserToDataStream_add320072_add322181__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320072_add322181_add328030__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_mg320078_literalMutationString320207_failAssert832() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_mg320078__10 = TextUtil.stripNewlines(doc.html());
            doc.body();
            org.junit.Assert.fail("testSupplyParserToDataStream_mg320078_literalMutationString320207 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322181_add328192() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072_add322181__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322181_add328192__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawPath());
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322181_add328192__5)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321244_add327710() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add320073_add321244__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add320073_add321244_add327710__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327710__8)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320072_add322223_add323220() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add320072__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add320072_add322223_add323220__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawPath());
        URI o_testSupplyParserToDataStream_add320072_add322223__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320072__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320072__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add320072_add322223_add323220__5)).getRawPath());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_mg320082_literalMutationString321251_failAssert831() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_mg320082__10 = TextUtil.stripNewlines(doc.html());
            doc.head();
            org.junit.Assert.fail("testSupplyParserToDataStream_mg320082_literalMutationString321251 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add320073_add321244_add327598() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add320073_add321244_add327598__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getRef());
        URL o_testSupplyParserToDataStream_add320073__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add320073_add321244__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add320073__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add320073__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add320073_add321244_add327598__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201517_add208194() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208194__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201297_add206979() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206979__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201517_add208035() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208035__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201297_add206819() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206819__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200478() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201517_add208020() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208020__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201297_add206804() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206804__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201297_add206968() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206968__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200478_add209945() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209945__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201517_add208025() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208025__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclarationnull199516_failAssert412_literalMutationString200732_failAssert443() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, null, Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull199516 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull199516_failAssert412_literalMutationString200732 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200489() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add199489_add200489__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200489__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200478_add210084() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210084__8)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201305() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201305__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201305__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201297_add207010() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add207010__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201297_add206995() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297_add206995__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201517_add208013() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208013__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201517_add208206() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201517_add208206__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200478_add209929() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209929__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201297() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201297__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201297__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200478_add210093() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add210093__8)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_literalMutationString200298_failAssert438() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add199489_literalMutationString200298 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201517() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add199488_add201517__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add199488_add201517__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_literalMutationString201084_failAssert426() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add199488_literalMutationString201084 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200478_add209918() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add199489_add200478__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200478_add209918__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199489_add200423() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add199489_add200423__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add199489__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199489__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
        String o_testDetectCharsetEncodingDeclaration_add199489__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199489__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199489_add200423__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199489__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString199476_failAssert402() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            doc.charset().name();
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString199476 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add199488_add201526() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add199488__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add199488_add201526__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add199488__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
        String o_testDetectCharsetEncodingDeclaration_add199488__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add199488__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add199488_add201526__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add199488__12);
    }
}

