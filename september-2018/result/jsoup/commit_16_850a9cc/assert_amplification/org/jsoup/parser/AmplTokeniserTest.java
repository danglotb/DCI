package org.jsoup.parser;


import org.junit.Assert;
import org.junit.Test;


public class AmplTokeniserTest {
    @Test(timeout = 10000)
    public void cp1252EntitiesProduceError() throws Exception {
        Parser parser = new Parser(new HtmlTreeBuilder());
        Assert.assertFalse(((Parser) (parser)).isTrackErrors());
        Assert.assertNull(((Parser) (parser)).getErrors());
        Parser o_cp1252EntitiesProduceError__4 = parser.setTrackErrors(10);
        Assert.assertTrue(((Parser) (o_cp1252EntitiesProduceError__4)).isTrackErrors());
        Assert.assertNull(((Parser) (o_cp1252EntitiesProduceError__4)).getErrors());
        String o_cp1252EntitiesProduceError__5 = parser.parseInput("<html><body>&#0128;</body></html>", "").text();
        Assert.assertEquals("\u20ac", o_cp1252EntitiesProduceError__5);
        int o_cp1252EntitiesProduceError__7 = parser.getErrors().size();
        Assert.assertEquals(1, ((int) (o_cp1252EntitiesProduceError__7)));
        Assert.assertTrue(((Parser) (parser)).isTrackErrors());
        Assert.assertFalse(((Parser) (parser)).getErrors().isEmpty());
        Assert.assertTrue(((Parser) (o_cp1252EntitiesProduceError__4)).isTrackErrors());
        Assert.assertFalse(((Parser) (o_cp1252EntitiesProduceError__4)).getErrors().isEmpty());
        Assert.assertEquals("\u20ac", o_cp1252EntitiesProduceError__5);
    }
}

