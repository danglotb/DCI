package org.jsoup.nodes;


import java.util.List;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;


public class AmplElementTest {
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

    @Test(timeout = 10000)
    public void testPreviousElementSiblings() throws Exception {
        Document doc = Jsoup.parse(("<ul id='ul'>" + (((((("<li id='a'>a</li>" + "<li id='b'>b</li>") + "<li id='c'>c</li>") + "</ul>") + "<div id='div'>") + "<li id='d'>d</li>") + "</div>")));
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).getAllElements().isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <ul id=\"ul\">\n   <li id=\"a\">a</li>\n   <li id=\"b\">b</li>\n   <li id=\"c\">c</li>\n  </ul>\n  <div id=\"div\">\n   <li id=\"d\">d</li>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Element element = doc.getElementById("b");
        Assert.assertTrue(((Element) (element)).hasText());
        Assert.assertFalse(((Element) (element)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (element)).isBlock());
        Assert.assertTrue(((Element) (element)).hasParent());
        Assert.assertEquals("<li id=\"b\">b</li>", ((Element) (element)).toString());
        List<Element> elementSiblings = element.previousElementSiblings();
        Assert.assertFalse(elementSiblings.isEmpty());
        int o_testPreviousElementSiblings__7 = elementSiblings.size();
        Assert.assertEquals(1, ((int) (o_testPreviousElementSiblings__7)));
        String o_testPreviousElementSiblings__8 = elementSiblings.get(0).id();
        Assert.assertEquals("a", o_testPreviousElementSiblings__8);
        Element element1 = doc.getElementById("a");
        Assert.assertTrue(((Element) (element1)).hasText());
        Assert.assertFalse(((Element) (element1)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (element1)).isBlock());
        Assert.assertTrue(((Element) (element1)).hasParent());
        Assert.assertEquals("<li id=\"a\">a</li>", ((Element) (element1)).toString());
        List<Element> elementSiblings1 = element1.previousElementSiblings();
        int o_testPreviousElementSiblings__14 = elementSiblings1.size();
        Assert.assertEquals(0, ((int) (o_testPreviousElementSiblings__14)));
        Element element2 = doc.getElementById("c");
        Assert.assertTrue(((Element) (element2)).hasText());
        Assert.assertFalse(((Element) (element2)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (element2)).isBlock());
        Assert.assertTrue(((Element) (element2)).hasParent());
        Assert.assertEquals("<li id=\"c\">c</li>", ((Element) (element2)).toString());
        List<Element> elementSiblings2 = element2.previousElementSiblings();
        Assert.assertFalse(elementSiblings2.isEmpty());
        int o_testPreviousElementSiblings__19 = elementSiblings2.size();
        Assert.assertEquals(2, ((int) (o_testPreviousElementSiblings__19)));
        String o_testPreviousElementSiblings__20 = elementSiblings2.get(0).id();
        Assert.assertEquals("a", o_testPreviousElementSiblings__20);
        String o_testPreviousElementSiblings__22 = elementSiblings2.get(1).id();
        Assert.assertEquals("b", o_testPreviousElementSiblings__22);
        Element ul = doc.getElementById("ul");
        Assert.assertTrue(((Element) (ul)).hasText());
        Assert.assertFalse(((Element) (ul)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (ul)).isBlock());
        Assert.assertTrue(((Element) (ul)).hasParent());
        Assert.assertEquals("<ul id=\"ul\">\n <li id=\"a\">a</li>\n <li id=\"b\">b</li>\n <li id=\"c\">c</li>\n</ul>", ((Element) (ul)).toString());
        List<Element> elementSiblings3 = ul.previousElementSiblings();
        try {
            Element element3 = elementSiblings3.get(0);
        } catch (IndexOutOfBoundsException e) {
        }
        Assert.assertTrue(((Document) (doc)).hasText());
        Assert.assertFalse(((Document) (doc)).getAllElements().isEmpty());
        Assert.assertFalse(((Document) (doc)).isBlock());
        Assert.assertFalse(((Document) (doc)).hasParent());
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <ul id=\"ul\">\n   <li id=\"a\">a</li>\n   <li id=\"b\">b</li>\n   <li id=\"c\">c</li>\n  </ul>\n  <div id=\"div\">\n   <li id=\"d\">d</li>\n  </div>\n </body>\n</html>", ((Document) (doc)).toString());
        Assert.assertTrue(((Element) (element)).hasText());
        Assert.assertFalse(((Element) (element)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (element)).isBlock());
        Assert.assertTrue(((Element) (element)).hasParent());
        Assert.assertEquals("<li id=\"b\">b</li>", ((Element) (element)).toString());
        Assert.assertFalse(elementSiblings.isEmpty());
        Assert.assertEquals(1, ((int) (o_testPreviousElementSiblings__7)));
        Assert.assertEquals("a", o_testPreviousElementSiblings__8);
        Assert.assertTrue(((Element) (element1)).hasText());
        Assert.assertFalse(((Element) (element1)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (element1)).isBlock());
        Assert.assertTrue(((Element) (element1)).hasParent());
        Assert.assertEquals("<li id=\"a\">a</li>", ((Element) (element1)).toString());
        Assert.assertEquals(0, ((int) (o_testPreviousElementSiblings__14)));
        Assert.assertTrue(((Element) (element2)).hasText());
        Assert.assertFalse(((Element) (element2)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (element2)).isBlock());
        Assert.assertTrue(((Element) (element2)).hasParent());
        Assert.assertEquals("<li id=\"c\">c</li>", ((Element) (element2)).toString());
        Assert.assertFalse(elementSiblings2.isEmpty());
        Assert.assertEquals(2, ((int) (o_testPreviousElementSiblings__19)));
        Assert.assertEquals("a", o_testPreviousElementSiblings__20);
        Assert.assertEquals("b", o_testPreviousElementSiblings__22);
        Assert.assertTrue(((Element) (ul)).hasText());
        Assert.assertFalse(((Element) (ul)).getAllElements().isEmpty());
        Assert.assertTrue(((Element) (ul)).isBlock());
        Assert.assertTrue(((Element) (ul)).hasParent());
        Assert.assertEquals("<ul id=\"ul\">\n <li id=\"a\">a</li>\n <li id=\"b\">b</li>\n <li id=\"c\">c</li>\n</ul>", ((Element) (ul)).toString());
    }
}

