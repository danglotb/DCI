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
    public void adjacentSiblings_add25_add1004_literalMutationNumber2053_failAssert102() throws Exception {
        try {
            String h = "<ol><li>One<li>Two<li>Three</ol>";
            Document o_adjacentSiblings_add25_add1004__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li + li");
            int o_adjacentSiblings_add25__6 = sibs.size();
            Element o_adjacentSiblings_add25__7 = sibs.get(-1);
            String o_adjacentSiblings_add25__8 = sibs.get(0).text();
            String o_adjacentSiblings_add25__10 = sibs.get(1).text();
            org.junit.Assert.fail("adjacentSiblings_add25_add1004_literalMutationNumber2053 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void adjacentSiblingsWithId_add43498_literalMutationNumber44072_failAssert782() throws Exception {
        try {
            String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
            Document o_adjacentSiblingsWithId_add43498__2 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li#1 + li#2");
            int o_adjacentSiblingsWithId_add43498__7 = sibs.size();
            String o_adjacentSiblingsWithId_add43498__8 = sibs.get(-1).text();
            org.junit.Assert.fail("adjacentSiblingsWithId_add43498_literalMutationNumber44072 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void adjacentSiblingsWithId_add43502_literalMutationNumber43932_failAssert797() throws Exception {
        try {
            String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("li#1 + li#2");
            int o_adjacentSiblingsWithId_add43502__6 = sibs.size();
            Element o_adjacentSiblingsWithId_add43502__7 = sibs.get(0);
            String o_adjacentSiblingsWithId_add43502__8 = sibs.get(-1).text();
            org.junit.Assert.fail("adjacentSiblingsWithId_add43502_literalMutationNumber43932 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void mixCombinator_add8403_add9413_literalMutationNumber12095_failAssert219() throws Exception {
        try {
            String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
            Document o_mixCombinator_add8403__2 = Jsoup.parse(h);
            Document o_mixCombinator_add8403_add9413__5 = Jsoup.parse(h);
            Document doc = Jsoup.parse(h);
            Elements sibs = doc.select("body > div.foo li + li");
            int o_mixCombinator_add8403__7 = sibs.size();
            String o_mixCombinator_add8403__8 = sibs.get(-1).text();
            String o_mixCombinator_add8403__10 = sibs.get(1).text();
            org.junit.Assert.fail("mixCombinator_add8403_add9413_literalMutationNumber12095 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

