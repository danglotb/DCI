package org.jsoup.parser;


import java.io.IOException;
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
    public void normalizesDiscordantTags() throws Exception {
        Parser parser = Parser.xmlParser().settings(ParseSettings.htmlDefault);
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Document document = Jsoup.parse("<div>test</DIV><p></p>", "", parser);
        String o_normalizesDiscordantTags__6 = document.html();
        Assert.assertEquals("<div>\n test\n</div>\n<p></p>", o_normalizesDiscordantTags__6);

        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertTrue(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertEquals("<div>\n test\n</div>\n<p></p>", o_normalizesDiscordantTags__6);
    }
}

