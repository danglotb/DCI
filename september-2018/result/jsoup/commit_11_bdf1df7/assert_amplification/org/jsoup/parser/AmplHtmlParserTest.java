package org.jsoup.parser;


import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class AmplHtmlParserTest {
    @Test(timeout = 10000)
    public void parsesQuiteRoughAttributes() throws Exception {
        String html = "<p =a>One<a <p>Something</p>Else";
        Assert.assertEquals("<p =a>One<a <p>Something</p>Else", html);
        Document doc = Jsoup.parse(html);
        String String_8 = "<p =a>One<a <p>Something</a></p>\n" + "<a <p>Else</a>";
        Assert.assertEquals("<p =a>One<a <p>Something</a></p>\n<a <p>Else</a>", String_8);
        String o_parsesQuiteRoughAttributes__6 = doc.body().html();
        Assert.assertEquals("<p =a>One<a <p>Something</a></p>\n<a <p>Else</a>", o_parsesQuiteRoughAttributes__6);
        doc = Jsoup.parse("<p .....>");
        String o_parsesQuiteRoughAttributes__10 = doc.body().html();
        Assert.assertEquals("<p .....></p>", o_parsesQuiteRoughAttributes__10);
        Assert.assertEquals("<p =a>One<a <p>Something</p>Else", html);
        Assert.assertEquals("<p =a>One<a <p>Something</a></p>\n<a <p>Else</a>", String_8);
        Assert.assertEquals("<p =a>One<a <p>Something</a></p>\n<a <p>Else</a>", o_parsesQuiteRoughAttributes__6);
    }

    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }
}

