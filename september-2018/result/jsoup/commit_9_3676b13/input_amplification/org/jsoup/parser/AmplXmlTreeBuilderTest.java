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
    public void testSupplyParserToDataStream_add23750_add24278() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750_add24278__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getPort())));
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24279() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23750_add24279__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getRef());
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24279__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24212_add29803() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751_add24212_add29803__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getRef());
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add23751_add24212__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29803__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24308_add28125() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750_add24308_add28125__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getPort())));
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24308__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28125__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString23748_literalMutationString23917_failAssert378() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "httxp://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString23748__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString23748_literalMutationString23917 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24308_add28162() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add23750_add24308_add28162__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getRef());
        URI o_testSupplyParserToDataStream_add23750_add24308__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28162__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString23745_literalMutationString23842_failAssert368() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString23745__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString23745_literalMutationString23842 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24308() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24308__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24309() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add23750_add24309__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24309__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24212_add29911() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add23751_add24212__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add23751_add24212_add29911__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29911__8)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_literalMutationString24043_failAssert341() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add23750_literalMutationString24043 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24278_add28766() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750_add24278__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add23750_add24278_add28766__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getRef());
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28766__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString23749_literalMutationString23862_failAssert375() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "8*-eZ$M^y?7Tx0", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString23749__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString23749_literalMutationString23862 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24308_add28152() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24308_add28152__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getPort())));
        URI o_testSupplyParserToDataStream_add23750_add24308__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28152__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24278_add28800() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750_add24278__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24278_add28800__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28800__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24278_add28320() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23750_add24278_add28320__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getRef());
        URI o_testSupplyParserToDataStream_add23750_add24278__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28320__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString23744_literalMutationString23815_failAssert376() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://oo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString23744__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString23744_literalMutationString23815 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24278_add28291() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750_add24278_add28291__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getPort())));
        URI o_testSupplyParserToDataStream_add23750_add24278__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28291__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24212_add29909() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add23751_add24212__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23751_add24212_add29909__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29909__8)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull23757_add24183() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStreamnull23757_add24183__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStreamnull23757__10 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("", o_testSupplyParserToDataStreamnull23757__10);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStreamnull23757_add24183__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24308_add28588() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24308__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24308_add28588__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24308_add28588__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull23757_add24185() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStreamnull23757_add24185__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStreamnull23757__10 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("", o_testSupplyParserToDataStreamnull23757__10);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull23757_add24185__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24308_add28143() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23750_add24308_add28143__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getRef());
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24308__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28143__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull23757_literalMutationString23911_failAssert357() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStreamnull23757__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStreamnull23757_literalMutationString23911 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24278_add28736() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750_add24278__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24278_add28736__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getPort())));
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23750_add24278_add28736__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24212() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add23751_add24212__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24214() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add23751_add24214__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24214__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24212_add29812() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add23751_add24212_add29812__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getPort())));
        URI o_testSupplyParserToDataStream_add23751_add24212__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add23751_add24212_add29812__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString23747_literalMutationString23816_failAssert377() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http@//foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString23747__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString23747_literalMutationString23816 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString23738_failAssert321() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString23738 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24177() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751_add24177__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getRef());
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24177__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_add24212_add29817() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add23751_add24212_add29817__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getRef());
        URI o_testSupplyParserToDataStream_add23751_add24212__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23751__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23751_add24212_add29817__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24308_add28616() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750_add24308__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add23750_add24308_add28616__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24308_add28616__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23751_literalMutationString23920_failAssert351() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testSupplyParserToDataStream_add23751__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add23751__11 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add23751_literalMutationString23920 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add23750_add24278_add28819() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add23750_add24278__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add23750__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add23750_add24278_add28819__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add23750__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add23750__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add23750_add24278_add28819__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47930() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add47360_add47930__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47930__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47981_add49629() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49629__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString47351_failAssert585_literalMutationString47495_failAssert622() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47351 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47351_failAssert585_literalMutationString47495 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47981_add49701() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49701__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclarationnull47369_failAssert589_literalMutationString47497_failAssert616() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, null, Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull47369 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull47369_failAssert589_literalMutationString47497 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47981_add50174() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50174__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47925_add52478() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52478__8)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47925() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47907_add52073() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52073__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString47347_failAssert581() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            doc.charset().name();
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47347 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47925_add51909() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51909__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47981_add49672() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49672__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString47349_failAssert583_literalMutationString47470_failAssert623() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47349 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47349_failAssert583_literalMutationString47470 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47907_add51533() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51533__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47981_add50186() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add50186__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47981() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47981__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47982() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47982__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47982__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_literalMutationString47493_failAssert611() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add47360_literalMutationString47493 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47872() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360_add47872__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47872__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_literalMutationString47700_failAssert601() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add47359_literalMutationString47700 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47925_add52010() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52010__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47907() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47925_add51966() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add51966__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47907_add52097() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52097__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString47348_failAssert582_literalMutationString47431_failAssert621() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47348 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47348_failAssert582_literalMutationString47431 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString47350_failAssert584_literalMutationString47442_failAssert619() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47350 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47350_failAssert584_literalMutationString47442 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47981_add49652() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47981__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47981_add49652__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47907_add52124() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52124__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47360_add47925_add52464() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47360__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47360__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
        String o_testDetectCharsetEncodingDeclaration_add47360__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47360__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add47360_add47925_add52464__8)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47360__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47919() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47919__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47919__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString47352_failAssert586_literalMutationString47440_failAssert620() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47352 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString47352_failAssert586_literalMutationString47440 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47907_add51555() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add51555__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add47359_add47907_add52085() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add47359_add47907__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add47359__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add47359__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
        String o_testDetectCharsetEncodingDeclaration_add47359__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add47359__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add47359_add47907_add52085__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add47359__12);
    }
}

