package org.jsoup.select;


import org.jsoup.Jsoup;
import org.jsoup.MultiLocaleRule;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;


public class AmplSelectorTest {
    @Rule
    public MultiLocaleRule rule = new MultiLocaleRule();

    @Test(timeout = 10000)
    public void adjacentSiblings_add21_add862_literalMutationNumber4517_failAssert77() throws Exception {
        try {
            String h = "<ol><li>One<li>Two<li>Three</ol>";
            Document o_adjacentSiblings_add21_add862__2 = Jsoup.parse(h);
            Document o_adjacentSiblings_add21__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li + li");
            int o_adjacentSiblings_add21__7 = sibs.size();
            String o_adjacentSiblings_add21__8 = sibs.get(-1).text();
            String o_adjacentSiblings_add21__10 = sibs.get(1).text();
            org.junit.Assert.fail("adjacentSiblings_add21_add862_literalMutationNumber4517 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinator_add8451_add9466_literalMutationNumber10266_failAssert242() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document o_mixCombinator_add8451_add9466__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("body > div.foo li + li");
            int o_mixCombinator_add8451__6 = sibs.size();
            String o_mixCombinator_add8451__7 = sibs.get(-1).text();
            Element o_mixCombinator_add8451__9 = sibs.get(1);
            String o_mixCombinator_add8451__10 = sibs.get(1).text();
            org.junit.Assert.fail("mixCombinator_add8451_add9466_literalMutationNumber10266 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinatorGroup_add53919_literalMutationNumber54907_failAssert1050() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document doc = Jsoup.parse(h);
            Elements els = doc.select(".foo > ol, ol > li + li");
            int o_mixCombinatorGroup_add53919__6 = els.size();
            String o_mixCombinatorGroup_add53919__7 = els.get(-1).tagName();
            Element o_mixCombinatorGroup_add53919__9 = els.get(1);
            String o_mixCombinatorGroup_add53919__10 = els.get(1).text();
            String o_mixCombinatorGroup_add53919__12 = els.get(2).text();
            org.junit.Assert.fail("mixCombinatorGroup_add53919_literalMutationNumber54907 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinatorGroup_add53913_add55056_literalMutationNumber61576_failAssert1069() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document o_mixCombinatorGroup_add53913__2 = Jsoup.parse(h);
            Document o_mixCombinatorGroup_add53913_add55056__5 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements els = doc.select(".foo > ol, ol > li + li");
            int o_mixCombinatorGroup_add53913__7 = els.size();
            String o_mixCombinatorGroup_add53913__8 = els.get(-1).tagName();
            String o_mixCombinatorGroup_add53913__10 = els.get(1).text();
            String o_mixCombinatorGroup_add53913__12 = els.get(2).text();
            org.junit.Assert.fail("mixCombinatorGroup_add53913_add55056_literalMutationNumber61576 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

