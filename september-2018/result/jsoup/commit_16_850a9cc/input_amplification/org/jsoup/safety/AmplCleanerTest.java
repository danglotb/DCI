package org.jsoup.safety;


import org.jsoup.Jsoup;
import org.jsoup.MultiLocaleRule;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;


public class AmplCleanerTest {
    @Rule
    public MultiLocaleRule rule = new MultiLocaleRule();

    @Test(timeout = 10000)
    public void handlesFramesets_add290654_mg293304() throws Exception {
        String __DSPOT_attributeValue_78847 = "ao N]rs!(y[*!J{$fowC";
        String __DSPOT_attributeKey_78846 = "7f[,:2Dn[4lm3(DiL>HV";
        String dirty = "<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset></html>";
        Assert.assertEquals("<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset></html>", dirty);
        String clean = Jsoup.clean(dirty, Whitelist.basic());
        Assert.assertEquals("", clean);
        Document dirtyDoc = Jsoup.parse(dirty);
        Document cleanDoc = new Cleaner(Whitelist.basic()).clean(dirtyDoc);
        boolean boolean_144 = cleanDoc == null;
        Element o_handlesFramesets_add290654__12 = cleanDoc.body();
        int o_handlesFramesets_add290654__13 = cleanDoc.body().childNodeSize();
        Element o_handlesFramesets_add290654_mg293304__21 = o_handlesFramesets_add290654__12.attr(__DSPOT_attributeKey_78846, __DSPOT_attributeValue_78847);
        Assert.assertFalse(((Element) (o_handlesFramesets_add290654_mg293304__21)).getAllElements().isEmpty());
        Assert.assertFalse(((Element) (o_handlesFramesets_add290654_mg293304__21)).hasText());
        Assert.assertTrue(((Element) (o_handlesFramesets_add290654_mg293304__21)).isBlock());
        Assert.assertEquals("<body 7f[,:2Dn[4lm3(DiL>HV=\"ao N]rs!(y[*!J{$fowC\"></body>", ((Element) (o_handlesFramesets_add290654_mg293304__21)).toString());
        Assert.assertTrue(((Element) (o_handlesFramesets_add290654_mg293304__21)).hasParent());
        Assert.assertEquals("<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset></html>", dirty);
        Assert.assertEquals("", clean);
    }
}

