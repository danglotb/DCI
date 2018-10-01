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
    public void testSupplyParserToDataStream_add24037_add25175() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add24037_add25175__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25175__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_literalMutationString25819_failAssert85() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add24036_literalMutationString25819 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26187_add37205() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26187__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26187_add37205__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37205__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_mg24046_literalMutationString25833_failAssert113() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_mg24046__10 = TextUtil.stripNewlines(doc.html());
            doc.head();
            org.junit.Assert.fail("testSupplyParserToDataStream_mg24046_literalMutationString25833 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26070_add38057() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036_add26070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26070_add38057__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getPort())));
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38057__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_add25169_add31906() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add24037_add25169_add31906__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getPort())));
        URI o_testSupplyParserToDataStream_add24037_add25169__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add31906__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull24061_literalMutationString24908_failAssert103() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStreamnull24061__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStreamnull24061_literalMutationString24908 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26082() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24036_add26082__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getRef());
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26082__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26187_add37214() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26187__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add24036_add26187_add37214__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37214__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26070_add38061() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036_add26070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add24036_add26070_add38061__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getRef());
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38061__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_add25169_add32082() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add24037_add25169__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24037_add25169_add32082__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169_add32082__8)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26070_add38065() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036_add26070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26070_add38065__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38065__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_add25169_add31916() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add24037_add25169_add31916__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getRef());
        URI o_testSupplyParserToDataStream_add24037_add25169__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31916__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26070_add38066() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036_add26070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add24036_add26070_add38066__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38066__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26187_add37056() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036_add26187_add37056__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getPort())));
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26187__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37056__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26070() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036_add26070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getPort())));
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_add25169_add32090() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add24037_add25169__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add24037_add25169_add32090__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add32090__8)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26187_add37066() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26187_add37066__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getPort())));
        URI o_testSupplyParserToDataStream_add24036_add26187__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187_add37066__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString24024_failAssert61() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString24024 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26188() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add24036_add26188__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26188__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26187() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26187__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26187__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26187_add37060() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24036_add26187_add37060__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getRef());
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036_add26187__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37060__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_add25169() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add24037_add25169__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24037_add25169__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_add25089() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037_add25089__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getRef());
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25089__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_mg24042_literalMutationString24172_failAssert114() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_mg24042__10 = TextUtil.stripNewlines(doc.html());
            doc.body();
            org.junit.Assert.fail("testSupplyParserToDataStream_mg24042_literalMutationString24172 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26070_add38001() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036_add26070_add38001__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getPort())));
        URI o_testSupplyParserToDataStream_add24036_add26070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add24036_add26070_add38001__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26070_add38004() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24036_add26070_add38004__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getRef());
        URI o_testSupplyParserToDataStream_add24036_add26070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26070_add38004__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_add25169_add31895() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add24037_add25169_add31895__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getRef());
        URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add24037_add25169__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24037__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24037_add25169_add31895__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24037_literalMutationString24937_failAssert97() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testSupplyParserToDataStream_add24037__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add24037__11 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add24037_literalMutationString24937 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add24036_add26187_add37070() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add24036__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add24036_add26187_add37070__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getRef());
        URI o_testSupplyParserToDataStream_add24036_add26187__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add24036__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add24036__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add24036_add26187_add37070__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56667_add64259() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64259__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55643_add59971() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59971__8)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56754_add65314() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65314__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55643_add59776() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59776__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56754_add65510() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65510__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_literalMutationString56430_failAssert230() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add54500_literalMutationString56430 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55643_add59979() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59979__8)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56754_add65319() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65319__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56667_add64267() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64267__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_literalMutationString55369_failAssert242() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add54501_literalMutationString55369 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56667() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56754_add65309() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65309__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56754_add65505() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65505__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56667_add64071() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64071__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55552() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501_add55552__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55552__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56667_add64276() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64276__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56675() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56675__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56675__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString54488_failAssert206() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            doc.charset().name();
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString54488 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56754() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500_add56754__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56757() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56757__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56757__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54500__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56667_add64086() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64086__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56667_add64284() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56667__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56667_add64284__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55643() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55643_add59792() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59792__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclarationnull54528_failAssert216_literalMutationString55918_failAssert247() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, null, Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull54528 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull54528_failAssert216_literalMutationString55918 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55643_add59786() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add54501_add55643__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add54501_add55643_add59786__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54501_add55647() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add54501__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add54501_add55647__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54501__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
        String o_testDetectCharsetEncodingDeclaration_add54501__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54501__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54501_add55647__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54501__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add54500_add56754_add65326() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add54500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add54500_add56754__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add54500__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
        String o_testDetectCharsetEncodingDeclaration_add54500__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add54500__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add54500_add56754_add65326__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add54500__12);
    }
}

