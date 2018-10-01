package org.jsoup.parser;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class AmplHtmlParserTest {
    @Ignore
    @Test
    public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        Assert.assertEquals(StringUtil.normaliseWhitespace(w), StringUtil.normaliseWhitespace(doc.body().html()));
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_mg36391_mg38899() throws IOException, Exception {
        Document.OutputSettings __DSPOT_outputSettings_17302 = new Document.OutputSettings();
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_312 = endOfEmail > (-1);
        boolean boolean_313 = guarantee > (-1);
        boolean boolean_314 = guarantee > endOfEmail;
        Document o_testInvalidTableContents_mg36391__20 = doc.outputSettings(__DSPOT_outputSettings_17302);
        String o_testInvalidTableContents_mg36391_mg38899__23 = o_testInvalidTableContents_mg36391__20.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_mg36391_mg38899__23);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_mg36386() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_297 = endOfEmail > (-1);
        boolean boolean_298 = guarantee > (-1);
        boolean boolean_299 = guarantee > endOfEmail;
        String o_testInvalidTableContents_mg36386__18 = doc.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_mg36386__18);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_mg36391_add38591_mg47468() throws IOException, Exception {
        Document.OutputSettings __DSPOT_outputSettings_17302 = new Document.OutputSettings();
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document o_testInvalidTableContents_mg36391_add38591__5 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_312 = endOfEmail > (-1);
        boolean boolean_313 = guarantee > (-1);
        boolean boolean_314 = guarantee > endOfEmail;
        Document o_testInvalidTableContents_mg36391__20 = doc.outputSettings(__DSPOT_outputSettings_17302);
        String o_testInvalidTableContents_mg36391_add38591_mg47468__26 = o_testInvalidTableContents_mg36391__20.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_mg36391_add38591_mg47468__26);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add36374_mg40084() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document o_testInvalidTableContents_add36374__3 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_261 = endOfEmail > (-1);
        boolean boolean_262 = guarantee > (-1);
        boolean boolean_263 = guarantee > endOfEmail;
        String o_testInvalidTableContents_add36374_mg40084__21 = o_testInvalidTableContents_add36374__3.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_add36374_mg40084__21);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString36348_failAssert120() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_183 = endOfEmail > (-1);
            boolean boolean_184 = guarantee > (-1);
            boolean boolean_185 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString36348 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_mg36391_add38621_mg43458() throws IOException, Exception {
        Document.OutputSettings __DSPOT_outputSettings_17302 = new Document.OutputSettings();
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_312 = endOfEmail > (-1);
        boolean boolean_313 = guarantee > (-1);
        boolean boolean_314 = guarantee > endOfEmail;
        Document o_testInvalidTableContents_mg36391_add38621__20 = doc.outputSettings(__DSPOT_outputSettings_17302);
        Document o_testInvalidTableContents_mg36391__20 = doc.outputSettings(__DSPOT_outputSettings_17302);
        String o_testInvalidTableContents_mg36391_add38621_mg43458__26 = o_testInvalidTableContents_mg36391_add38621__20.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_mg36391_add38621_mg43458__26);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add36374_literalMutationString39253_failAssert155() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testInvalidTableContents_add36374__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_261 = endOfEmail > (-1);
            boolean boolean_262 = guarantee > (-1);
            boolean boolean_263 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_add36374_literalMutationString39253 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_mg36391_add38621_mg43570() throws IOException, Exception {
        Document.OutputSettings __DSPOT_outputSettings_17302 = new Document.OutputSettings();
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_312 = endOfEmail > (-1);
        boolean boolean_313 = guarantee > (-1);
        boolean boolean_314 = guarantee > endOfEmail;
        Document o_testInvalidTableContents_mg36391_add38621__20 = doc.outputSettings(__DSPOT_outputSettings_17302);
        Document o_testInvalidTableContents_mg36391__20 = doc.outputSettings(__DSPOT_outputSettings_17302);
        String o_testInvalidTableContents_mg36391_add38621_mg43570__26 = o_testInvalidTableContents_mg36391__20.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_mg36391_add38621_mg43570__26);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_mg36391_add38591_mg47230() throws IOException, Exception {
        Document.OutputSettings __DSPOT_outputSettings_17302 = new Document.OutputSettings();
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document o_testInvalidTableContents_mg36391_add38591__5 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_312 = endOfEmail > (-1);
        boolean boolean_313 = guarantee > (-1);
        boolean boolean_314 = guarantee > endOfEmail;
        Document o_testInvalidTableContents_mg36391__20 = doc.outputSettings(__DSPOT_outputSettings_17302);
        String o_testInvalidTableContents_mg36391_add38591_mg47230__26 = o_testInvalidTableContents_mg36391_add38591__5.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_mg36391_add38591_mg47230__26);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add36374_mg40217() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        Document o_testInvalidTableContents_add36374__3 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        String rendered = doc.toString();
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
        int endOfEmail = rendered.indexOf("Comment");
        int guarantee = rendered.indexOf("Why am I here?");
        boolean boolean_261 = endOfEmail > (-1);
        boolean boolean_262 = guarantee > (-1);
        boolean boolean_263 = guarantee > endOfEmail;
        String o_testInvalidTableContents_add36374_mg40217__21 = doc.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-invalid-elements.html", o_testInvalidTableContents_add36374_mg40217__21);
        Assert.assertEquals("<html>\n <head></head>\n <body> \n  <table> \n   <tbody>\n    <tr> \n     <td> \n      <table> \n       <tbody>\n        <tr> \n         <!--Comment--> \n        </tr>\n       </tbody>\n      </table><p>Why am I here?</p>\n      <table>   \n      </table> </td> \n    </tr> \n   </tbody>\n  </table>   \n </body>\n</html>", rendered);
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add20_mg20324_mg22658() throws IOException, Exception {
        Document.OutputSettings __DSPOT_outputSettings_14007 = new Document.OutputSettings();
        File o_testTemplateInsideTable_add20__1 = ParseTest.getFile("/htmltests/table-polymer-template.html");
        File in = ParseTest.getFile("/htmltests/table-polymer-template.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        Elements templates = doc.body().getElementsByTag("template");
        for (Element template : templates) {
            boolean boolean_23 = (template.childNodes().size()) > 1;
        }
        Document o_testTemplateInsideTable_add20_mg20324__21 = doc.outputSettings(__DSPOT_outputSettings_14007);
        String o_testTemplateInsideTable_add20_mg20324_mg22658__24 = o_testTemplateInsideTable_add20_mg20324__21.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", o_testTemplateInsideTable_add20_mg20324_mg22658__24);
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_mg34() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/table-polymer-template.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        Elements templates = doc.body().getElementsByTag("template");
        for (Element template : templates) {
            boolean boolean_37 = (template.childNodes().size()) > 1;
        }
        String o_testTemplateInsideTable_mg34__16 = doc.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", o_testTemplateInsideTable_mg34__16);
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add20() throws IOException, Exception {
        File o_testTemplateInsideTable_add20__1 = ParseTest.getFile("/htmltests/table-polymer-template.html");
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (o_testTemplateInsideTable_add20__1)).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_testTemplateInsideTable_add20__1)).getParent());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isDirectory());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isFile());
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_testTemplateInsideTable_add20__1)).getTotalSpace())));
        File in = ParseTest.getFile("/htmltests/table-polymer-template.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        doc.outputSettings().prettyPrint(true);
        Elements templates = doc.body().getElementsByTag("template");
        for (Element template : templates) {
            boolean boolean_23 = (template.childNodes().size()) > 1;
        }
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (o_testTemplateInsideTable_add20__1)).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_testTemplateInsideTable_add20__1)).getParent());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (o_testTemplateInsideTable_add20__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-721689773, ((int) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/table-polymer-template.html", ((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_testTemplateInsideTable_add20__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isDirectory());
        Assert.assertTrue(((File) (o_testTemplateInsideTable_add20__1)).isFile());
        Assert.assertFalse(((File) (o_testTemplateInsideTable_add20__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_testTemplateInsideTable_add20__1)).getTotalSpace())));
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString1_failAssert0() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            Elements templates = doc.body().getElementsByTag("template");
            for (Element template : templates) {
                boolean boolean_4 = (template.childNodes().size()) > 1;
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString1 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29324() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196__3 = Jsoup.parse(in, "UTF-8");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29324__20 = o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196__3.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29324__20);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29448() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196__3 = Jsoup.parse(in, "UTF-8");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29448__20 = o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29448__20);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23298_failAssert69_literalMutationString24976_failAssert98() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23298 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23298_failAssert69_literalMutationString24976 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23302_failAssert73_literalMutationString24215_failAssert95() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23302 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23302_failAssert73_literalMutationString24215 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23300_failAssert71_literalMutationString24603_failAssert94() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23300 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23300_failAssert71_literalMutationString24603 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_mg23327() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__5 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__5);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__7 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__7);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__10 = doc.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__10);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__5);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_mg23327__7);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30525() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211__6 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30525__20 = o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30525__20);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30608() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211__6 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30608__20 = o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211__6.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30608__20);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23297_failAssert68() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            StringUtil.normaliseWhitespace(doc.html());
            doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23297 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23301_failAssert72_literalMutationString24249_failAssert96() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23301 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23301_failAssert72_literalMutationString24249 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_mg25392() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_mg25392__17 = doc.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_mg25392__17);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_mg25275() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_mg25275__17 = o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_mg25275__17);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30694() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211__6 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30694__20 = doc.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25211_mg30694__20);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctypenull23343_failAssert78_literalMutationString24920_failAssert93() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select(null).text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctypenull23343 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctypenull23343_failAssert78_literalMutationString24920 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_literalMutationString24816_failAssert90() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add23316_literalMutationString24816 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29555() throws IOException, Exception {
        File in = ParseTest.getFile("/htmltests/comments.html");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196__3 = Jsoup.parse(in, "UTF-8");
        Document o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__3 = Jsoup.parse(in, "UTF-8");
        Document doc = Jsoup.parse(in, "UTF-8");
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6 = StringUtil.normaliseWhitespace(doc.html());
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8 = doc.head().select("title").text();
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
        String o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29555__20 = doc.location();
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/comments.html", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316_add25196_mg29555__20);
        Assert.assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__6);
        Assert.assertEquals("A Certain Kind of Test", o_handlesXmlDeclAndCommentsBeforeDoctype_add23316__8);
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23299_failAssert70_literalMutationString23909_failAssert97() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23299 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString23299_failAssert70_literalMutationString23909 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }
}

