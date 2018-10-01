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
import org.jsoup.nodes.XmlDeclaration;
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
    public void testDetectCharsetEncodingDeclaration_add38969_add41014_add47497() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47497__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add41014_add47695() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47695__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40839() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38969_add40839__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40839__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add41014_add47472() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47472__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclarationnull38996_failAssert127_literalMutationString40947_failAssert158() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, null, Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull38996 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull38996_failAssert127_literalMutationString40947 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40830() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40830_add46513() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46513__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_literalMutationString39832_failAssert153() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add38970_literalMutationString39832 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_literalMutationString40503_failAssert141() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add38969_literalMutationString40503 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40830_add46322() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46322__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40142_add48500() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48500__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40142_add48666() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48666__8)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add41014_add47507() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47507__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40070() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970_add40070__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40070__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add41014_add47484() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47484__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add41014_add47681() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014_add47681__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40830_add46509() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46509__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString38957_failAssert117() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            doc.charset().name();
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString38957 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40830_add46505() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46505__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add41014() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add41014__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add41014__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40830_add46501() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46501__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add41016() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add38969_add41016__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add41016__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40148() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add38970_add40148__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40148__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38969_add40830_add46333() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add38969_add40830__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add38969__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38969__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
        String o_testDetectCharsetEncodingDeclaration_add38969__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38969__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38969_add40830_add46333__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38969__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40142_add48674() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48674__8)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40142_add48496() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48496__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40142() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add38970_add40142__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add38970_add40142_add48493() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add38970__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add38970_add40142__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add38970__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
        String o_testDetectCharsetEncodingDeclaration_add38970__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add38970__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add38970_add40142_add48493__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add38970__11);
    }

    @Test(timeout = 10000)
    public void testParseDeclarationAttributes_add50796_add53994_literalMutationNumber62055_failAssert251() throws Exception {
        try {
            String xml = "<?xml version='1' encoding='UTF-8' something='else'?><val>One</val>";
            Document o_testParseDeclarationAttributes_add50796_add53994__2 = Jsoup.parse(xml, "", Parser.xmlParser());
            Document o_testParseDeclarationAttributes_add50796__2 = Jsoup.parse(xml, "", Parser.xmlParser());
            Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
            XmlDeclaration decl = ((XmlDeclaration) (doc.childNode(-1)));
            String o_testParseDeclarationAttributes_add50796__9 = decl.attr("version");
            String o_testParseDeclarationAttributes_add50796__10 = decl.attr("encoding");
            String o_testParseDeclarationAttributes_add50796__11 = decl.attr("something");
            decl.getWholeDeclaration();
            String o_testParseDeclarationAttributes_add50796__13 = decl.outerHtml();
            org.junit.Assert.fail("testParseDeclarationAttributes_add50796_add53994_literalMutationNumber62055 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void caseSensitiveDeclaration_add10_literalMutationString138_failAssert9() throws Exception {
        try {
            String xml = "<?XML version=\'1\' encoding=\'UTF-8\' something=\'else.?>";
            Document o_caseSensitiveDeclaration_add10__2 = Jsoup.parse(xml, "", Parser.xmlParser());
            Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
            String o_caseSensitiveDeclaration_add10__7 = doc.outerHtml();
            org.junit.Assert.fail("caseSensitiveDeclaration_add10_literalMutationString138 should have thrown IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            Assert.assertEquals("Index: 0, Size: 0", expected.getMessage());
        }
    }
}

