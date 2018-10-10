package org.jsoup.parser;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class AmplHtmlParserTest {
    @Test(timeout = 10000)
    public void handlesEscapedData_add158804_add159803_literalMutationNumber164973_failAssert1074() throws Exception {
        try {
            String html = "<div title='Surf &amp; Turf'>Reef &amp; Beef</div>";
            Document o_handlesEscapedData_add158804_add159803__2 = Jsoup.parse(html);
            Document o_handlesEscapedData_add158804__2 = Jsoup.parse(html);
            Document doc = Jsoup.parse(html);
            Element div = doc.getElementsByTag("div").get(-1);
            String o_handlesEscapedData_add158804__8 = div.attr("title");
            String o_handlesEscapedData_add158804__9 = div.text();
            org.junit.Assert.fail("handlesEscapedData_add158804_add159803_literalMutationNumber164973 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesJavadocFont_add180377_add181833_literalMutationNumber187617_failAssert1229() throws Exception {
        try {
            String h = "<TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\">    <A HREF=\"deprecated-list.html\"><FONT CLASS=\"NavBarFont1\"><B>Deprecated</B></FONT></A>&nbsp;</TD>";
            Document o_handlesJavadocFont_add180377_add181833__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Element a = doc.select("a").first();
            String o_handlesJavadocFont_add180377__7 = a.text();
            Element o_handlesJavadocFont_add180377__8 = a.child(0);
            String o_handlesJavadocFont_add180377__9 = a.child(0).tagName();
            String o_handlesJavadocFont_add180377__11 = a.child(-1).child(0).tagName();
            org.junit.Assert.fail("handlesJavadocFont_add180377_add181833_literalMutationNumber187617 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesJavadocFont_add180377_add181833_literalMutationNumber187369_failAssert1228() throws Exception {
        try {
            String h = "<TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\">    <A HREF=\"deprecated-list.html\"><FONT CLASS=\"NavBarFont1\"><B>Deprecated</B></FONT></A>&nbsp;</TD>";
            Document o_handlesJavadocFont_add180377_add181833__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Element a = doc.select("a").first();
            String o_handlesJavadocFont_add180377__7 = a.text();
            Element o_handlesJavadocFont_add180377__8 = a.child(-1);
            String o_handlesJavadocFont_add180377__9 = a.child(0).tagName();
            String o_handlesJavadocFont_add180377__11 = a.child(0).child(0).tagName();
            org.junit.Assert.fail("handlesJavadocFont_add180377_add181833_literalMutationNumber187369 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesJavadocFont_add180372_literalMutationNumber181212_failAssert1138() throws Exception {
        try {
            String h = "<TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\">    <A HREF=\"deprecated-list.html\"><FONT CLASS=\"NavBarFont1\"><B>Deprecated</B></FONT></A>&nbsp;</TD>";
            Document o_handlesJavadocFont_add180372__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Element a = doc.select("a").first();
            String o_handlesJavadocFont_add180372__8 = a.text();
            String o_handlesJavadocFont_add180372__9 = a.child(-1).tagName();
            String o_handlesJavadocFont_add180372__11 = a.child(0).child(0).tagName();
            org.junit.Assert.fail("handlesJavadocFont_add180372_literalMutationNumber181212 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested_add330501_literalMutationNumber332432_failAssert2146() throws Exception {
        try {
            String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
            Parser parser = Parser.htmlParser().setTrackErrors(3);
            Document o_tracksLimitedErrorsWhenRequested_add330501__5 = parser.parseInput(html, "http://example.com");
            Document doc = parser.parseInput(html, "http://example.com");
            List<ParseError> errors = parser.getErrors();
            int o_tracksLimitedErrorsWhenRequested_add330501__10 = errors.size();
            errors.get(-1).toString();
            errors.get(1).toString();
            errors.get(2).toString();
            org.junit.Assert.fail("tracksLimitedErrorsWhenRequested_add330501_literalMutationNumber332432 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContentsnull131655_failAssert769_literalMutationString131786_failAssert791() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf(null);
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_169 = endOfEmail > (-1);
                boolean boolean_170 = guarantee > (-1);
                boolean boolean_171 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContentsnull131655 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContentsnull131655_failAssert769_literalMutationString131786 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString131619_failAssert756() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_61 = endOfEmail > (-1);
            boolean boolean_62 = guarantee > (-1);
            boolean boolean_63 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString131619 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add131650_add132576() throws IOException, Exception {
        File o_testInvalidTableContents_add131650_add132576__1 = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (o_testInvalidTableContents_add131650_add132576__1)).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getParent());
        Assert.assertTrue(((File) (o_testInvalidTableContents_add131650_add132576__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_testInvalidTableContents_add131650_add132576__1)).isDirectory());
        Assert.assertTrue(((File) (o_testInvalidTableContents_add131650_add132576__1)).isFile());
        Assert.assertFalse(((File) (o_testInvalidTableContents_add131650_add132576__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getTotalSpace())));
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int o_testInvalidTableContents_add131650__11 = rendered.indexOf("Why am I here?");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_154 = endOfEmail > (-1);
        boolean boolean_155 = guarantee > (-1);
        boolean boolean_156 = guarantee > endOfEmail;
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (o_testInvalidTableContents_add131650_add132576__1)).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getParent());
        Assert.assertTrue(((File) (o_testInvalidTableContents_add131650_add132576__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-2075938401, ((int) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", ((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_testInvalidTableContents_add131650_add132576__1)).isDirectory());
        Assert.assertTrue(((File) (o_testInvalidTableContents_add131650_add132576__1)).isFile());
        Assert.assertFalse(((File) (o_testInvalidTableContents_add131650_add132576__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_testInvalidTableContents_add131650_add132576__1)).getTotalSpace())));
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString131620_failAssert757_literalMutationString131866_failAssert804() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_64 = endOfEmail > (-1);
                boolean boolean_65 = guarantee > (-1);
                boolean boolean_66 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString131620 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString131620_failAssert757_literalMutationString131866 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContentsnull131656_failAssert770_literalMutationString131764_failAssert790() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf(null);
                boolean boolean_172 = endOfEmail > (-1);
                boolean boolean_173 = guarantee > (-1);
                boolean boolean_174 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContentsnull131656 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContentsnull131656_failAssert770_literalMutationString131764 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add131645_literalMutationString132022_failAssert788() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testInvalidTableContents_add131645__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_139 = endOfEmail > (-1);
            boolean boolean_140 = guarantee > (-1);
            boolean boolean_141 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_add131645_literalMutationString132022 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString131623_failAssert760_literalMutationString132006_failAssert802() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_73 = endOfEmail > (-1);
                boolean boolean_74 = guarantee > (-1);
                boolean boolean_75 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString131623 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString131623_failAssert760_literalMutationString132006 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString131621_failAssert758_literalMutationString131755_failAssert806() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_67 = endOfEmail > (-1);
                boolean boolean_68 = guarantee > (-1);
                boolean boolean_69 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString131621 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString131621_failAssert758_literalMutationString131755 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString131622_failAssert759_literalMutationString132096_failAssert803() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_70 = endOfEmail > (-1);
                boolean boolean_71 = guarantee > (-1);
                boolean boolean_72 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString131622 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString131622_failAssert759_literalMutationString132096 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString131624_failAssert761_literalMutationString132710_failAssert805() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_76 = endOfEmail > (-1);
                boolean boolean_77 = guarantee > (-1);
                boolean boolean_78 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString131624 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString131624_failAssert761_literalMutationString132710 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void selfClosingOnNonvoidIsErrornull142089_failAssert822_literalMutationNumber143693_failAssert844() throws Exception {
        try {
            try {
                String html = "<p>test</p><div /><div>Two</div>";
                Parser parser = Parser.htmlParser().setTrackErrors(5);
                parser.parseInput(html, "");
                parser.getErrors().size();
                parser.getErrors().get(-1).toString();
                Jsoup.isValid(null, Whitelist.relaxed());
                String clean = Jsoup.clean(html, Whitelist.relaxed());
                StringUtil.normaliseWhitespace(clean);
                org.junit.Assert.fail("selfClosingOnNonvoidIsErrornull142089 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("selfClosingOnNonvoidIsErrornull142089_failAssert822_literalMutationNumber143693 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected_1) {
            Assert.assertEquals(null, expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add20() throws IOException, Exception {
        File o_testTemplateInsideTable_add20__1 = ParseTest.getFile("/htmltests/table-polymer-template.html");
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (o_testTemplateInsideTable_add20__1)).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_testTemplateInsideTable_add20__1)).getParent());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isDirectory());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isFile());
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_testTemplateInsideTable_add20__1)).getTotalSpace())));
        File in = ParseTest.getFile("/htmltests/table-polymer-template.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        Elements templates = doc.body().getElementsByTag("template");
        for (Element template : templates) {
            boolean boolean_27 = (template.childNodes().size()) > 1;
        }
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (o_testTemplateInsideTable_add20__1)).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_testTemplateInsideTable_add20__1)).getParent());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isDirectory());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isFile());
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_testTemplateInsideTable_add20__1)).getTotalSpace())));
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString1_failAssert0() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            Elements templates = doc.body().getElementsByTag("template");
            for (Element template : templates) {
                boolean boolean_8 = (template.childNodes().size()) > 1;
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString1 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }
}

