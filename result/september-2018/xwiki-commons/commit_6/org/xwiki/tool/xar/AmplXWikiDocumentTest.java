package org.xwiki.tool.xar;


import org.dom4j.DocumentException;
import org.junit.Assert;
import org.xwiki.tool.xar.internal.XWikiDocument;


public class AmplXWikiDocumentTest {
    private void assertReferenceFromNameSpace(String reference, String space, String name) throws DocumentException {
        XWikiDocument xdocument = new XWikiDocument();
        xdocument.fromXML((((("<xwikidoc><web>" + space) + "</web><name>") + name) + "</name></xwikidoc>"));
        Assert.assertEquals(reference, xdocument.getReference());
    }

    private void assertReference(String reference, String xml) throws DocumentException {
        XWikiDocument xdocument = new XWikiDocument();
        xdocument.fromXML(xml);
        Assert.assertEquals(reference, xdocument.getReference());
    }
}

