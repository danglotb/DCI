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
    public void adjacentSiblingsWithId_add43716_add44375_literalMutationNumber46081_failAssert856() throws Exception {
        try {
            String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
            Document o_adjacentSiblingsWithId_add43716__2 = Jsoup.parse(h);
            Document o_adjacentSiblingsWithId_add43716_add44375__5 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li#1 + li#2");
            int o_adjacentSiblingsWithId_add43716__7 = sibs.size();
            String o_adjacentSiblingsWithId_add43716__8 = sibs.get(-1).text();
            org.junit.Assert.fail("adjacentSiblingsWithId_add43716_add44375_literalMutationNumber46081 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void adjacentSiblingsWithId_add43716_add44360_literalMutationNumber46022_failAssert861() throws Exception {
        try {
            String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
            Document o_adjacentSiblingsWithId_add43716_add44360__2 = Jsoup.parse(h);
            Document o_adjacentSiblingsWithId_add43716__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li#1 + li#2");
            int o_adjacentSiblingsWithId_add43716__7 = sibs.size();
            String o_adjacentSiblingsWithId_add43716__8 = sibs.get(-1).text();
            org.junit.Assert.fail("adjacentSiblingsWithId_add43716_add44360_literalMutationNumber46022 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinator_add25_add1021_literalMutationNumber7069_failAssert112() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document o_mixCombinator_add25_add1021__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("body > div.foo li + li");
            int o_mixCombinator_add25__6 = sibs.size();
            Element o_mixCombinator_add25__7 = sibs.get(-1);
            String o_mixCombinator_add25__8 = sibs.get(0).text();
            String o_mixCombinator_add25__10 = sibs.get(1).text();
            org.junit.Assert.fail("mixCombinator_add25_add1021_literalMutationNumber7069 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }
}

