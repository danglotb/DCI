package org.jsoup.parser;


import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class AmplHtmlParserTest {
    @Test(timeout = 10000)
    public void testSelectWithOption() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Parser o_testSelectWithOption__3 = parser.setTrackErrors(10);
        Assert.assertTrue(((Parser) (o_testSelectWithOption__3)).isTrackErrors());
        Assert.assertNull(((Parser) (o_testSelectWithOption__3)).getErrors());
        Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        int o_testSelectWithOption__6 = parser.getErrors().size();
        Assert.assertEquals(0, ((int) (o_testSelectWithOption__6)));
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertTrue(((Parser) (o_testSelectWithOption__3)).isTrackErrors());
        Assert.assertTrue(((Parser) (o_testSelectWithOption__3)).getErrors().isEmpty());
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
    public void tracksErrorsWhenRequested() throws Exception {
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Assert.assertEquals("<p>One</p href=\'no\'><!DOCTYPE html>&arrgh;<font /><br /><foo", html);
        Parser parser = Parser.htmlParser().setTrackErrors(500);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Document doc = Jsoup.parse(html, "http://example.com", parser);
        List<ParseError> errors = parser.getErrors();
        int o_tracksErrorsWhenRequested__9 = errors.size();
        Assert.assertEquals(5, ((int) (o_tracksErrorsWhenRequested__9)));
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        errors.get(3).toString();
        errors.get(4).toString();
        Assert.assertEquals("<p>One</p href=\'no\'><!DOCTYPE html>&arrgh;<font /><br /><foo", html);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertEquals(5, ((int) (o_tracksErrorsWhenRequested__9)));
    }

    @Test(timeout = 10000)
    public void tracksLimitedErrorsWhenRequested() throws Exception {
        String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        Assert.assertEquals("<p>One</p href=\'no\'><!DOCTYPE html>&arrgh;<font /><br /><foo", html);
        Parser parser = Parser.htmlParser().setTrackErrors(3);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Document doc = parser.parseInput(html, "http://example.com");
        List<ParseError> errors = parser.getErrors();
        int o_tracksLimitedErrorsWhenRequested__9 = errors.size();
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested__9)));
        errors.get(0).toString();
        errors.get(1).toString();
        errors.get(2).toString();
        Assert.assertEquals("<p>One</p href=\'no\'><!DOCTYPE html>&arrgh;<font /><br /><foo", html);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertEquals(3, ((int) (o_tracksLimitedErrorsWhenRequested__9)));
    }

    @Test(timeout = 10000)
    public void noErrorsByDefault() throws Exception {
        String html = "<p>One</p href='no'>&arrgh;<font /><br /><foo";
        Assert.assertEquals("<p>One</p href=\'no\'>&arrgh;<font /><br /><foo", html);
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Document doc = Jsoup.parse(html, "http://example.com", parser);
        List<ParseError> errors = parser.getErrors();
        int o_noErrorsByDefault__8 = errors.size();
        Assert.assertEquals(0, ((int) (o_noErrorsByDefault__8)));
        Assert.assertEquals("<p>One</p href=\'no\'>&arrgh;<font /><br /><foo", html);
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
    }

    @Test(timeout = 10000)
    public void canPreserveTagCase() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Parser o_canPreserveTagCase__3 = parser.settings(new ParseSettings(true, false));
        Assert.assertFalse(((Parser) (o_canPreserveTagCase__3)).isTrackErrors());
        Assert.assertNull(((Parser) (o_canPreserveTagCase__3)).getErrors());
        Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        String o_canPreserveTagCase__7 = StringUtil.normaliseWhitespace(doc.outerHtml());
        Assert.assertEquals("<html> <head></head> <body> <div id=\"1\"> <SPAN id=\"2\"></SPAN> </div> </body> </html>", o_canPreserveTagCase__7);
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertFalse(((Parser) (o_canPreserveTagCase__3)).isTrackErrors());
        Assert.assertTrue(((Parser) (o_canPreserveTagCase__3)).getErrors().isEmpty());
    }

    @Test(timeout = 10000)
    public void canPreserveAttributeCase() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Parser o_canPreserveAttributeCase__3 = parser.settings(new ParseSettings(false, true));
        Assert.assertFalse(((Parser) (o_canPreserveAttributeCase__3)).isTrackErrors());
        Assert.assertNull(((Parser) (o_canPreserveAttributeCase__3)).getErrors());
        Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        String o_canPreserveAttributeCase__7 = StringUtil.normaliseWhitespace(doc.outerHtml());
        Assert.assertEquals("<html> <head></head> <body> <div id=\"1\"> <span ID=\"2\"></span> </div> </body> </html>", o_canPreserveAttributeCase__7);
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertFalse(((Parser) (o_canPreserveAttributeCase__3)).isTrackErrors());
        Assert.assertTrue(((Parser) (o_canPreserveAttributeCase__3)).getErrors().isEmpty());
    }

    @Test(timeout = 10000)
    public void canPreserveBothCase() throws Exception {
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Parser o_canPreserveBothCase__3 = parser.settings(new ParseSettings(true, true));
        Assert.assertFalse(((Parser) (o_canPreserveBothCase__3)).isTrackErrors());
        Assert.assertNull(((Parser) (o_canPreserveBothCase__3)).getErrors());
        Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        String o_canPreserveBothCase__7 = StringUtil.normaliseWhitespace(doc.outerHtml());
        Assert.assertEquals("<html> <head></head> <body> <div id=\"1\"> <SPAN ID=\"2\"></SPAN> </div> </body> </html>", o_canPreserveBothCase__7);
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertFalse(((Parser) (o_canPreserveBothCase__3)).isTrackErrors());
        Assert.assertTrue(((Parser) (o_canPreserveBothCase__3)).getErrors().isEmpty());
    }

    @Test(timeout = 10000)
    public void caseSensitiveParseTree() throws Exception {
        String html = "<r><X>A</X><y>B</y></r>";
        Assert.assertEquals("<r><X>A</X><y>B</y></r>", html);
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Parser o_caseSensitiveParseTree__4 = parser.settings(ParseSettings.preserveCase);
        Assert.assertFalse(((Parser) (o_caseSensitiveParseTree__4)).isTrackErrors());
        Assert.assertNull(((Parser) (o_caseSensitiveParseTree__4)).getErrors());
        Document doc = parser.parseInput(html, "");
        String o_caseSensitiveParseTree__7 = StringUtil.normaliseWhitespace(doc.body().html());
        Assert.assertEquals("<r> <X> A </X> <y> B </y> </r>", o_caseSensitiveParseTree__7);
        Assert.assertEquals("<r><X>A</X><y>B</y></r>", html);
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertFalse(((Parser) (o_caseSensitiveParseTree__4)).isTrackErrors());
        Assert.assertTrue(((Parser) (o_caseSensitiveParseTree__4)).getErrors().isEmpty());
    }

    @Test(timeout = 10000)
    public void caseInsensitiveParseTree() throws Exception {
        String html = "<r><X>A</X><y>B</y></r>";
        Assert.assertEquals("<r><X>A</X><y>B</y></r>", html);
        Parser parser = Parser.htmlParser();
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Document doc = parser.parseInput(html, "");
        String o_caseInsensitiveParseTree__6 = StringUtil.normaliseWhitespace(doc.body().html());
        Assert.assertEquals("<r> <x> A </x> <y> B </y> </r>", o_caseInsensitiveParseTree__6);
        Assert.assertEquals("<r><X>A</X><y>B</y></r>", html);
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
    }

    @Test(timeout = 10000)
    public void selfClosingVoidIsNotAnError() throws Exception {
        String html = "<p>test<br/>test<br/></p>";
        Assert.assertEquals("<p>test<br/>test<br/></p>", html);
        Parser parser = Parser.htmlParser().setTrackErrors(5);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Document o_selfClosingVoidIsNotAnError__5 = parser.parseInput(html, "");
        Assert.assertFalse(((Document) (o_selfClosingVoidIsNotAnError__5)).isBlock());
        Assert.assertFalse(((Document) (o_selfClosingVoidIsNotAnError__5)).getAllElements().isEmpty());
        Assert.assertTrue(((Document) (o_selfClosingVoidIsNotAnError__5)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p>test<br>test<br></p>\n </body>\n</html>", ((Document) (o_selfClosingVoidIsNotAnError__5)).toString());
        Assert.assertFalse(((Document) (o_selfClosingVoidIsNotAnError__5)).hasParent());
        int o_selfClosingVoidIsNotAnError__6 = parser.getErrors().size();
        Assert.assertEquals(0, ((int) (o_selfClosingVoidIsNotAnError__6)));
        boolean o_selfClosingVoidIsNotAnError__8 = Jsoup.isValid(html, Whitelist.basic());
        Assert.assertTrue(o_selfClosingVoidIsNotAnError__8);
        String clean = Jsoup.clean(html, Whitelist.basic());
        Assert.assertEquals("<p>test<br>test<br></p>", clean);
        Assert.assertEquals("<p>test<br/>test<br/></p>", html);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertFalse(((Document) (o_selfClosingVoidIsNotAnError__5)).isBlock());
        Assert.assertFalse(((Document) (o_selfClosingVoidIsNotAnError__5)).getAllElements().isEmpty());
        Assert.assertTrue(((Document) (o_selfClosingVoidIsNotAnError__5)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p>test<br>test<br></p>\n </body>\n</html>", ((Document) (o_selfClosingVoidIsNotAnError__5)).toString());
        Assert.assertFalse(((Document) (o_selfClosingVoidIsNotAnError__5)).hasParent());
        Assert.assertEquals(0, ((int) (o_selfClosingVoidIsNotAnError__6)));
        Assert.assertTrue(o_selfClosingVoidIsNotAnError__8);
    }

    @Test(timeout = 10000)
    public void selfClosingOnNonvoidIsError() throws Exception {
        String html = "<p>test</p><div /><div>Two</div>";
        Assert.assertEquals("<p>test</p><div /><div>Two</div>", html);
        Parser parser = Parser.htmlParser().setTrackErrors(5);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Document o_selfClosingOnNonvoidIsError__5 = parser.parseInput(html, "");
        Assert.assertFalse(((Document) (o_selfClosingOnNonvoidIsError__5)).isBlock());
        Assert.assertFalse(((Document) (o_selfClosingOnNonvoidIsError__5)).getAllElements().isEmpty());
        Assert.assertTrue(((Document) (o_selfClosingOnNonvoidIsError__5)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p>test</p>\n  <div></div>\n  <div>\n   Two\n  </div>\n </body>\n</html>", ((Document) (o_selfClosingOnNonvoidIsError__5)).toString());
        Assert.assertFalse(((Document) (o_selfClosingOnNonvoidIsError__5)).hasParent());
        int o_selfClosingOnNonvoidIsError__6 = parser.getErrors().size();
        Assert.assertEquals(1, ((int) (o_selfClosingOnNonvoidIsError__6)));
        parser.getErrors().get(0).toString();
        boolean o_selfClosingOnNonvoidIsError__11 = Jsoup.isValid(html, Whitelist.relaxed());
        Assert.assertFalse(o_selfClosingOnNonvoidIsError__11);
        String clean = Jsoup.clean(html, Whitelist.relaxed());
        Assert.assertEquals("<p>test</p>\n<div></div>\n<div>\n Two\n</div>", clean);
        String o_selfClosingOnNonvoidIsError__16 = StringUtil.normaliseWhitespace(clean);
        Assert.assertEquals("<p>test</p> <div></div> <div> Two </div>", o_selfClosingOnNonvoidIsError__16);
        Assert.assertEquals("<p>test</p><div /><div>Two</div>", html);
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertFalse(((Document) (o_selfClosingOnNonvoidIsError__5)).isBlock());
        Assert.assertFalse(((Document) (o_selfClosingOnNonvoidIsError__5)).getAllElements().isEmpty());
        Assert.assertTrue(((Document) (o_selfClosingOnNonvoidIsError__5)).hasText());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <p>test</p>\n  <div></div>\n  <div>\n   Two\n  </div>\n </body>\n</html>", ((Document) (o_selfClosingOnNonvoidIsError__5)).toString());
        Assert.assertFalse(((Document) (o_selfClosingOnNonvoidIsError__5)).hasParent());
        Assert.assertEquals(1, ((int) (o_selfClosingOnNonvoidIsError__6)));
        Assert.assertFalse(o_selfClosingOnNonvoidIsError__11);
        Assert.assertEquals("<p>test</p>\n<div></div>\n<div>\n Two\n</div>", clean);
    }
}

