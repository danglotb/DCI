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
import org.jsoup.helper.StringUtil;
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
    public void testSupplyParserToDataStream_literalMutationString84878_literalMutationString85322_failAssert892() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "v77,Vc=YYg==*d", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString84878__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString84878_literalMutationString85322 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString84879_literalMutationString85307_failAssert885() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString84879__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString84879_literalMutationString85307 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85123_add90988() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884_add85123__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85123_add90988__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90988__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85123_add90986() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884_add85123__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add84884_add85123_add90986__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getRef());
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90986__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85123_add90984() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884_add85123__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85123_add90984__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getPort())));
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90984__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85242_add90542() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85242__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85242_add90542__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90542__9)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85450_add91023() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add84885_add85450__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84885_add85450_add91023__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add91023__8)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85450_add91025() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add84885_add85450__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add84885_add85450_add91025__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add91025__8)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85242_add90545() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85242__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add84884_add85242_add90545__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90545__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85132() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84884_add85132__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getRef());
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85132__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85123_add90937() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84884_add85123_add90937__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getRef());
        URI o_testSupplyParserToDataStream_add84884_add85123__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90937__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull84891_literalMutationString84966_failAssert874() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStreamnull84891__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStreamnull84891_literalMutationString84966 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85123_add90936() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884_add85123_add90936__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getPort())));
        URI o_testSupplyParserToDataStream_add84884_add85123__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123_add90936__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString84883_literalMutationString84979_failAssert894() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://f<o.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString84883__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString84883_literalMutationString84979 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85123_add90990() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884_add85123__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add84884_add85123_add90990__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85123_add90990__9)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85251() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add84884_add85251__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85251__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85242_add90433() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85242_add90433__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getPort())));
        URI o_testSupplyParserToDataStream_add84884_add85242__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90433__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85242_add90427() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884_add85242_add90427__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getPort())));
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85242__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242_add90427__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85242_add90428() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84884_add85242_add90428__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getRef());
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85242__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90428__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85242() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URI o_testSupplyParserToDataStream_add84884_add85242__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85242__5)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85123() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884_add85123__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getPort())));
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884_add85123__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString84881_literalMutationString85295_failAssert895() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://f&oo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString84881__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString84881_literalMutationString85295 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85451() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add84885_add85451__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85451__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85450() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add84885_add85450__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_add85242_add90445() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        URL o_testSupplyParserToDataStream_add84884_add85242_add90445__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getRef());
        URI o_testSupplyParserToDataStream_add84884_add85242__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84884_add85242_add90445__5)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull84891_add85077() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStreamnull84891_add85077__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStreamnull84891__10 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("", o_testSupplyParserToDataStreamnull84891__10);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStreamnull84891_add85077__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStreamnull84891_add85079() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStreamnull84891_add85079__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(null, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStreamnull84891__10 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("", o_testSupplyParserToDataStreamnull84891__10);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStreamnull84891_add85079__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884_literalMutationString84992_failAssert858() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add84884_literalMutationString84992 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_literalMutationString85363_failAssert868() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_add84885_literalMutationString85363 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString84872_failAssert838() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString84872 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84884() throws IOException, Exception, URISyntaxException {
        URI o_testSupplyParserToDataStream_add84884__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884__1)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84884__12 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84884__12);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawPath());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getRawFragment());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84884__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84884__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84884__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84884__1)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84884__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84884__1)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85450_add90983() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URL o_testSupplyParserToDataStream_add84885_add85450_add90983__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getRef());
        URI o_testSupplyParserToDataStream_add84885_add85450__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90983__4)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85450_add90977() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885_add85450_add90977__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getRef());
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add84885_add85450__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85450_add90977__1)).getRef());
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_literalMutationString84882_literalMutationString85120_failAssert893() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://fo.com", Parser.xmlParser());
            String o_testSupplyParserToDataStream_literalMutationString84882__10 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testSupplyParserToDataStream_literalMutationString84882_literalMutationString85120 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85450_add90979() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        URI o_testSupplyParserToDataStream_add84885_add85450_add90979__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getPort())));
        URI o_testSupplyParserToDataStream_add84885_add85450__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).toString());
        Assert.assertEquals(1064420468, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getPath());
        Assert.assertFalse(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getScheme());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getAuthority());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getFragment());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getQuery());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getHost());
        Assert.assertNull(((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testSupplyParserToDataStream_add84885_add85450_add90979__4)).getPort())));
    }

    @Test(timeout = 10000)
    public void testSupplyParserToDataStream_add84885_add85435() throws IOException, Exception, URISyntaxException {
        URL o_testSupplyParserToDataStream_add84885_add85435__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getRef());
        URL o_testSupplyParserToDataStream_add84885__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        String o_testSupplyParserToDataStream_add84885__11 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<doc><val>One<val>Two</val>Three</val></doc>", o_testSupplyParserToDataStream_add84885__11);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getAuthority());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-test.xml", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getHost());
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testSupplyParserToDataStream_add84885_add85435__1)).getRef());
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclarationAsDeclaration_add9567_add10532_literalMutationNumber13795_failAssert166() throws Exception {
        try {
            String html = "<?xml encoding='UTF-8' ?><body>One</body><!-- comment -->";
            Document o_handlesXmlDeclarationAsDeclaration_add9567_add10532__2 = Jsoup.parse(html, "", Parser.xmlParser());
            Document o_handlesXmlDeclarationAsDeclaration_add9567__2 = Jsoup.parse(html, "", Parser.xmlParser());
            Document doc = Jsoup.parse(html, "", Parser.xmlParser());
            String o_handlesXmlDeclarationAsDeclaration_add9567__7 = StringUtil.normaliseWhitespace(doc.outerHtml());
            String o_handlesXmlDeclarationAsDeclaration_add9567__9 = doc.childNode(-1).nodeName();
            String o_handlesXmlDeclarationAsDeclaration_add9567__11 = doc.childNode(2).nodeName();
            org.junit.Assert.fail("handlesXmlDeclarationAsDeclaration_add9567_add10532_literalMutationNumber13795 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37576() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37577() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37577__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37577__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString37218_failAssert355_literalMutationString37317_failAssert393() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37218 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37218_failAssert355_literalMutationString37317 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37576_add42196() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42196__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37576_add42198() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42198__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclarationnull37237_failAssert360_literalMutationString37302_failAssert386() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, null, Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull37237 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclarationnull37237_failAssert360_literalMutationString37302 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37860_add42418() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42418__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37862() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add37228_add37862__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37862__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37860() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawFragment());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getPort())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawUserInfo());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawPath());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227__1)).getRawFragment());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString37215_failAssert352() throws IOException, Exception, URISyntaxException {
        try {
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            doc.charset().name();
            TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37215 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37860_add42423() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42423__4)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37576_add42062() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42062__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString37220_failAssert357_literalMutationString37331_failAssert390() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37220 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37220_failAssert357_literalMutationString37331 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37481() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37481__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37481__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37576_add42066() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42066__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37576_add42070() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42070__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_literalMutationString37336_failAssert372() throws IOException, Exception, URISyntaxException {
        try {
            URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add37227_literalMutationString37336 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37860_add42428() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URL o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42428__4)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37860_add42477() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42477__8)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37860_add42478() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        URI o_testDetectCharsetEncodingDeclaration_add37228_add37860__4 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37860_add42478__8)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37470() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString37219_failAssert356_literalMutationString37301_failAssert391() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37219 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37219_failAssert356_literalMutationString37301 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37470_add42502() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42502__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37470_add42500() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42500__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString37216_failAssert353_literalMutationString37466_failAssert392() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37216 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37216_failAssert353_literalMutationString37466 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_literalMutationString37731_failAssert381() throws IOException, Exception, URISyntaxException {
        try {
            URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
            File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
            InputStream inStream = new FileInputStream(xmlFile);
            Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
            String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
            String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_add37228_literalMutationString37731 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37228_add37832() throws IOException, Exception, URISyntaxException {
        URL o_testDetectCharsetEncodingDeclaration_add37228_add37832__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getRef());
        URL o_testDetectCharsetEncodingDeclaration_add37228__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37228__11 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
        String o_testDetectCharsetEncodingDeclaration_add37228__13 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37228__13);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37228_add37832__1)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37228__11);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_literalMutationString37217_failAssert354_literalMutationString37447_failAssert394() throws IOException, Exception, URISyntaxException {
        try {
            try {
                File xmlFile = new File(XmlTreeBuilder.class.getResource("").toURI());
                InputStream inStream = new FileInputStream(xmlFile);
                Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
                doc.charset().name();
                TextUtil.stripNewlines(doc.html());
                org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37217 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testDetectCharsetEncodingDeclaration_literalMutationString37217_failAssert354_literalMutationString37447 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/parser (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37470_add42533() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getPort())));
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42533__9)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37470_add42534() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getRef());
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42534__9)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37470_add42531() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42531__5)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37470_add42532() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37470__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URL o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml");
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getRef());
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).toString());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getPath());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getAuthority());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getQuery());
        Assert.assertEquals("file", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getProtocol());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getFile());
        Assert.assertEquals("", ((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getHost());
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getPort())));
        Assert.assertEquals(-1, ((int) (((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getDefaultPort())));
        Assert.assertNull(((URL) (o_testDetectCharsetEncodingDeclaration_add37227_add37470_add42532__5)).getRef());
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }

    @Test(timeout = 10000)
    public void testDetectCharsetEncodingDeclaration_add37227_add37576_add42050() throws IOException, Exception, URISyntaxException {
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getPort())));
        URI o_testDetectCharsetEncodingDeclaration_add37227__1 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        URI o_testDetectCharsetEncodingDeclaration_add37227_add37576__5 = XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI();
        File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        InputStream inStream = new FileInputStream(xmlFile);
        Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        String o_testDetectCharsetEncodingDeclaration_add37227__12 = doc.charset().name();
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
        String o_testDetectCharsetEncodingDeclaration_add37227__14 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>", o_testDetectCharsetEncodingDeclaration_add37227__14);
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawSchemeSpecificPart());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getSchemeSpecificPart());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawUserInfo());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawQuery());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getRawPath());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).toString());
        Assert.assertEquals(1475313060, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).hashCode())));
        Assert.assertTrue(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/xml-charset.xml", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getPath());
        Assert.assertFalse(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).isOpaque());
        Assert.assertEquals("file", ((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getScheme());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getAuthority());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getFragment());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getQuery());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getHost());
        Assert.assertNull(((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getUserInfo());
        Assert.assertEquals(-1, ((int) (((URI) (o_testDetectCharsetEncodingDeclaration_add37227_add37576_add42050__1)).getPort())));
        Assert.assertEquals("ISO-8859-1", o_testDetectCharsetEncodingDeclaration_add37227__12);
    }
}

