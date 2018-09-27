package org.jsoup.nodes;


import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;


public class AmplElementTest {
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

    @Test(timeout = 10000)
    public void testAddNewElement() throws Exception {
        Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).getAllElements().isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Element div = doc.getElementById("1");
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Element) (div)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Element o_testAddNewElement__5 = div.appendElement("p").text("there");
        Assert.assertTrue(((Element) (o_testAddNewElement__5)).hasText());
        Assert.assertFalse(((Element) (o_testAddNewElement__5)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (o_testAddNewElement__5)).isBlock());
        Assert.assertEquals("<p>there</p>", ((Element) (o_testAddNewElement__5)).toString());
        Assert.assertTrue(((Element) (o_testAddNewElement__5)).hasParent());
        Element o_testAddNewElement__7 = div.appendElement("P").attr("CLASS", "second").text("now");
        Assert.assertTrue(((Element) (o_testAddNewElement__7)).hasText());
        Assert.assertFalse(((Element) (o_testAddNewElement__7)).getAllElements().isEmpty());
        Assert.assertFalse(((Element) (o_testAddNewElement__7)).isBlock());
        Assert.assertEquals("<P CLASS=\"second\">\n now\n</P>", ((Element) (o_testAddNewElement__7)).toString());
        Assert.assertTrue(((Element) (o_testAddNewElement__7)).hasParent());
        String o_testAddNewElement__10 = TextUtil.stripNewlines(doc.html());
        Assert.assertEquals("<html><head></head><body><div id=\"1\"><p>Hello</p><p>there</p><P CLASS=\"second\">now</P></div></body></html>", o_testAddNewElement__10);
        Elements ps = doc.select("p");
        for (int i = 0; i < (ps.size()); i++) {
        }
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).getAllElements().isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div id=\"1\">\n   <p>Hello</p>\n   <p>there</p>\n   <P CLASS=\"second\">\n    now\n   </P>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertTrue(((Element) (div)).hasText());
        Assert.assertFalse(((Element) (div)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (div)).isBlock());
        Assert.assertEquals("<div id=\"1\">\n <p>Hello</p>\n <p>there</p>\n <P CLASS=\"second\">\n  now\n </P>\n</div>", ((Element) (div)).toString());
        Assert.assertTrue(((Element) (div)).hasParent());
        Assert.assertTrue(((Element) (o_testAddNewElement__5)).hasText());
        Assert.assertFalse(((Element) (o_testAddNewElement__5)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (o_testAddNewElement__5)).isBlock());
        Assert.assertEquals("<p>there</p>", ((Element) (o_testAddNewElement__5)).toString());
        Assert.assertTrue(((Element) (o_testAddNewElement__5)).hasParent());
        Assert.assertTrue(((Element) (o_testAddNewElement__7)).hasText());
        Assert.assertFalse(((Element) (o_testAddNewElement__7)).getAllElements().isEmpty());
        Assert.assertFalse(((Element) (o_testAddNewElement__7)).isBlock());
        Assert.assertEquals("<P CLASS=\"second\">\n now\n</P>", ((Element) (o_testAddNewElement__7)).toString());
        Assert.assertTrue(((Element) (o_testAddNewElement__7)).hasParent());
        Assert.assertEquals("<html><head></head><body><div id=\"1\"><p>Hello</p><p>there</p><P CLASS=\"second\">now</P></div></body></html>", o_testAddNewElement__10);
    }
}

