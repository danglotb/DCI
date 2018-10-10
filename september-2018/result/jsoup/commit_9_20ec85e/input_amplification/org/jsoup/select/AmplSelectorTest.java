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
    public void adjacentSiblings_add53697_add54715_literalMutationNumber55674_failAssert807() throws Exception {
        try {
            String h = "<ol><li>One<li>Two<li>Three</ol>";
            Document o_adjacentSiblings_add53697_add54715__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li + li");
            int o_adjacentSiblings_add53697__6 = sibs.size();
            String o_adjacentSiblings_add53697__7 = sibs.get(-1).text();
            Element o_adjacentSiblings_add53697__9 = sibs.get(1);
            String o_adjacentSiblings_add53697__10 = sibs.get(1).text();
            org.junit.Assert.fail("adjacentSiblings_add53697_add54715_literalMutationNumber55674 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void adjacentSiblingsWithId_add96263_add96730_literalMutationNumber101265_failAssert1569() throws Exception {
        try {
            String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
            Document o_adjacentSiblingsWithId_add96263__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li#1 + li#2");
            int o_adjacentSiblingsWithId_add96263__7 = sibs.size();
            Element o_adjacentSiblingsWithId_add96263_add96730__12 = sibs.get(-1);
            String o_adjacentSiblingsWithId_add96263__8 = sibs.get(0).text();
            org.junit.Assert.fail("adjacentSiblingsWithId_add96263_add96730_literalMutationNumber101265 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinator_add45322_literalMutationNumber46143_failAssert593() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("body > div.foo li + li");
            int o_mixCombinator_add45322__6 = sibs.size();
            String o_mixCombinator_add45322__7 = sibs.get(-1).text();
            Element o_mixCombinator_add45322__9 = sibs.get(1);
            String o_mixCombinator_add45322__10 = sibs.get(1).text();
            org.junit.Assert.fail("mixCombinator_add45322_literalMutationNumber46143 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinator_add45320_literalMutationNumber46316_failAssert605() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("body > div.foo li + li");
            int o_mixCombinator_add45320__6 = sibs.size();
            Element o_mixCombinator_add45320__7 = sibs.get(0);
            String o_mixCombinator_add45320__8 = sibs.get(-1).text();
            String o_mixCombinator_add45320__10 = sibs.get(1).text();
            org.junit.Assert.fail("mixCombinator_add45320_literalMutationNumber46316 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinatorGroup_add106763_add108248_literalMutationNumber113405_failAssert1778() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document o_mixCombinatorGroup_add106763_add108248__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements els = doc.select(".foo > ol, ol > li + li");
            int o_mixCombinatorGroup_add106763__6 = els.size();
            String o_mixCombinatorGroup_add106763__7 = els.get(-1).tagName();
            String o_mixCombinatorGroup_add106763__9 = els.get(1).text();
            Element o_mixCombinatorGroup_add106763__11 = els.get(2);
            String o_mixCombinatorGroup_add106763__12 = els.get(2).text();
            org.junit.Assert.fail("mixCombinatorGroup_add106763_add108248_literalMutationNumber113405 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoLessThan_add73156_literalMutationNumber74184_failAssert1114() throws Exception {
        try {
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:lt(2)");
            int o_testPseudoLessThan_add73156__5 = ps.size();
            String o_testPseudoLessThan_add73156__6 = ps.get(-1).text();
            Element o_testPseudoLessThan_add73156__8 = ps.get(1);
            String o_testPseudoLessThan_add73156__9 = ps.get(1).text();
            String o_testPseudoLessThan_add73156__11 = ps.get(2).text();
            org.junit.Assert.fail("testPseudoLessThan_add73156_literalMutationNumber74184 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoLessThan_add73154_literalMutationNumber73529_failAssert1122() throws Exception {
        try {
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:lt(2)");
            int o_testPseudoLessThan_add73154__5 = ps.size();
            Element o_testPseudoLessThan_add73154__6 = ps.get(0);
            String o_testPseudoLessThan_add73154__7 = ps.get(-1).text();
            String o_testPseudoLessThan_add73154__9 = ps.get(1).text();
            String o_testPseudoLessThan_add73154__11 = ps.get(2).text();
            org.junit.Assert.fail("testPseudoLessThan_add73154_literalMutationNumber73529 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoGreaterThan_add36836_add37736_literalMutationNumber41759_failAssert516() throws Exception {
        try {
            Document o_testPseudoGreaterThan_add36836__1 = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>");
            Document o_testPseudoGreaterThan_add36836_add37736__4 = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>");
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:gt(0)");
            int o_testPseudoGreaterThan_add36836__6 = ps.size();
            String o_testPseudoGreaterThan_add36836__7 = ps.get(-1).text();
            String o_testPseudoGreaterThan_add36836__9 = ps.get(1).text();
            org.junit.Assert.fail("testPseudoGreaterThan_add36836_add37736_literalMutationNumber41759 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoGreaterThan_add36840_literalMutationNumber37530_failAssert486() throws Exception {
        try {
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:gt(0)");
            int o_testPseudoGreaterThan_add36840__5 = ps.size();
            Element o_testPseudoGreaterThan_add36840__6 = ps.get(-1);
            String o_testPseudoGreaterThan_add36840__7 = ps.get(0).text();
            String o_testPseudoGreaterThan_add36840__9 = ps.get(1).text();
            org.junit.Assert.fail("testPseudoGreaterThan_add36840_literalMutationNumber37530 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoEquals_add20822_add22108_literalMutationNumber33854_failAssert419() throws Exception {
        try {
            Document o_testPseudoEquals_add20822__1 = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Document o_testPseudoEquals_add20822_add22108__4 = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:eq(0)");
            int o_testPseudoEquals_add20822__6 = ps.size();
            String o_testPseudoEquals_add20822__7 = ps.get(-1).text();
            String o_testPseudoEquals_add20822__9 = ps.get(1).text();
            Elements ps2 = doc.select("div:eq(0) p:eq(0)");
            int o_testPseudoEquals_add20822__13 = ps2.size();
            String o_testPseudoEquals_add20822__14 = ps2.get(0).text();
            String o_testPseudoEquals_add20822__16 = ps2.get(0).tagName();
            org.junit.Assert.fail("testPseudoEquals_add20822_add22108_literalMutationNumber33854 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoEquals_add20832_literalMutationNumber22054_failAssert399() throws Exception {
        try {
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:eq(0)");
            int o_testPseudoEquals_add20832__5 = ps.size();
            String o_testPseudoEquals_add20832__6 = ps.get(0).text();
            String o_testPseudoEquals_add20832__8 = ps.get(1).text();
            Elements ps2 = doc.select("div:eq(0) p:eq(0)");
            int o_testPseudoEquals_add20832__12 = ps2.size();
            Element o_testPseudoEquals_add20832__13 = ps2.get(-1);
            String o_testPseudoEquals_add20832__14 = ps2.get(0).text();
            String o_testPseudoEquals_add20832__16 = ps2.get(0).tagName();
            org.junit.Assert.fail("testPseudoEquals_add20832_literalMutationNumber22054 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoEquals_add20822_add22045_literalMutationNumber36144_failAssert425() throws Exception {
        try {
            Document o_testPseudoEquals_add20822_add22045__1 = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Document o_testPseudoEquals_add20822__1 = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:eq(0)");
            int o_testPseudoEquals_add20822__6 = ps.size();
            String o_testPseudoEquals_add20822__7 = ps.get(0).text();
            String o_testPseudoEquals_add20822__9 = ps.get(1).text();
            Elements ps2 = doc.select("div:eq(0) p:eq(0)");
            int o_testPseudoEquals_add20822__13 = ps2.size();
            String o_testPseudoEquals_add20822__14 = ps2.get(0).text();
            String o_testPseudoEquals_add20822__16 = ps2.get(-1).tagName();
            org.junit.Assert.fail("testPseudoEquals_add20822_add22045_literalMutationNumber36144 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoBetween_add66977_literalMutationNumber67189_failAssert972() throws Exception {
        try {
            Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
            Elements ps = doc.select("div p:gt(0):lt(2)");
            int o_testPseudoBetween_add66977__5 = ps.size();
            Element o_testPseudoBetween_add66977__6 = ps.get(-1);
            String o_testPseudoBetween_add66977__7 = ps.get(0).text();
            org.junit.Assert.fail("testPseudoBetween_add66977_literalMutationNumber67189 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testPseudoCombined_add90022_add90547_literalMutationNumber92864_failAssert1381() throws Exception {
        try {
            Document o_testPseudoCombined_add90022_add90547__1 = Jsoup.parse("<div class='foo'><p>One</p><p>Two</p></div><div><p>Three</p><p>Four</p></div>");
            Document o_testPseudoCombined_add90022__1 = Jsoup.parse("<div class='foo'><p>One</p><p>Two</p></div><div><p>Three</p><p>Four</p></div>");
            Document doc = Jsoup.parse("<div class='foo'><p>One</p><p>Two</p></div><div><p>Three</p><p>Four</p></div>");
            Elements ps = doc.select("div.foo p:gt(0)");
            int o_testPseudoCombined_add90022__6 = ps.size();
            String o_testPseudoCombined_add90022__7 = ps.get(-1).text();
            org.junit.Assert.fail("testPseudoCombined_add90022_add90547_literalMutationNumber92864 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

