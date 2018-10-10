package org.jsoup.parser;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
    public void testInvalidTableContents_literalMutationString12116_failAssert259_literalMutationString12250_failAssert307() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_42 = endOfEmail > (-1);
                boolean boolean_43 = guarantee > (-1);
                boolean boolean_44 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString12116 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString12116_failAssert259_literalMutationString12250 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContentsnull12151_failAssert271_literalMutationString12678_failAssert292() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf(null);
                boolean boolean_147 = endOfEmail > (-1);
                boolean boolean_148 = guarantee > (-1);
                boolean boolean_149 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContentsnull12151 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContentsnull12151_failAssert271_literalMutationString12678 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString12115_failAssert258_literalMutationString12267_failAssert309() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_39 = endOfEmail > (-1);
                boolean boolean_40 = guarantee > (-1);
                boolean boolean_41 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString12115 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString12115_failAssert258_literalMutationString12267 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString12114_failAssert257() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_36 = endOfEmail > (-1);
            boolean boolean_37 = guarantee > (-1);
            boolean boolean_38 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString12114 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContentsnull12150_failAssert270_literalMutationString12520_failAssert293() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf(null);
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_144 = endOfEmail > (-1);
                boolean boolean_145 = guarantee > (-1);
                boolean boolean_146 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContentsnull12150 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContentsnull12150_failAssert270_literalMutationString12520 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add12140_literalMutationString12408_failAssert290() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testInvalidTableContents_add12140__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_114 = endOfEmail > (-1);
            boolean boolean_115 = guarantee > (-1);
            boolean boolean_116 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_add12140_literalMutationString12408 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString12117_failAssert260_literalMutationString12332_failAssert308() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_45 = endOfEmail > (-1);
                boolean boolean_46 = guarantee > (-1);
                boolean boolean_47 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString12117 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString12117_failAssert260_literalMutationString12332 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add12140_add13954_literalMutationString14594_failAssert359() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testInvalidTableContents_add12140__3 = Jsoup.parse(in, "UTF-8");
            Document o_testInvalidTableContents_add12140_add13954__6 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_114 = endOfEmail > (-1);
            boolean boolean_115 = guarantee > (-1);
            boolean boolean_116 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_add12140_add13954_literalMutationString14594 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_add12140_add13939_literalMutationString16653_failAssert358() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testInvalidTableContents_add12140_add13939__3 = Jsoup.parse(in, "UTF-8");
            Document o_testInvalidTableContents_add12140__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            String rendered = doc.toString();
            int endOfEmail = rendered.indexOf("Comment");
            int guarantee = rendered.indexOf("Why am I here?");
            boolean boolean_114 = endOfEmail > (-1);
            boolean boolean_115 = guarantee > (-1);
            boolean boolean_116 = guarantee > endOfEmail;
            org.junit.Assert.fail("testInvalidTableContents_add12140_add13939_literalMutationString16653 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString12119_failAssert262_literalMutationString12259_failAssert310() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_51 = endOfEmail > (-1);
                boolean boolean_52 = guarantee > (-1);
                boolean boolean_53 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString12119 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString12119_failAssert262_literalMutationString12259 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testInvalidTableContents_literalMutationString12118_failAssert261_literalMutationString12266_failAssert311() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                String rendered = doc.toString();
                int endOfEmail = rendered.indexOf("Comment");
                int guarantee = rendered.indexOf("Why am I here?");
                boolean boolean_48 = endOfEmail > (-1);
                boolean boolean_49 = guarantee > (-1);
                boolean boolean_50 = guarantee > endOfEmail;
                org.junit.Assert.fail("testInvalidTableContents_literalMutationString12118 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testInvalidTableContents_literalMutationString12118_failAssert261_literalMutationString12266 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString3_failAssert2_literalMutationString123_failAssert56() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag("template");
                for (Element template : templates) {
                    boolean boolean_6 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTable_literalMutationString3 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString3_failAssert2_literalMutationString123 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString10_failAssert9_literalMutationString148_failAssert77() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "U+F-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag("template");
                for (Element template : templates) {
                    boolean boolean_13 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTable_literalMutationString10 should have thrown UnsupportedEncodingException");
            } catch (UnsupportedEncodingException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString10_failAssert9_literalMutationString148 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString5_failAssert4_literalMutationString124_failAssert59() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag("template");
                for (Element template : templates) {
                    boolean boolean_8 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTable_literalMutationString5 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString5_failAssert4_literalMutationString124 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add21_add760_literalMutationString1854_failAssert146() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testTemplateInsideTable_add21_add760__3 = Jsoup.parse(in, "UTF-8");
            Document o_testTemplateInsideTable_add21__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            Elements templates = doc.body().getElementsByTag("template");
            for (Element template : templates) {
                boolean boolean_24 = (template.childNodes().size()) > 1;
            }
            org.junit.Assert.fail("testTemplateInsideTable_add21_add760_literalMutationString1854 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTablenull32_failAssert14_literalMutationString294_failAssert52() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag(null);
                for (Element template : templates) {
                    boolean boolean_35 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTablenull32 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTablenull32_failAssert14_literalMutationString294 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add24_literalMutationString183_failAssert51() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            Elements o_testTemplateInsideTable_add24__7 = doc.body().getElementsByTag("template");
            Elements templates = doc.body().getElementsByTag("template");
            for (Element template : templates) {
                boolean boolean_27 = (template.childNodes().size()) > 1;
            }
            org.junit.Assert.fail("testTemplateInsideTable_add24_literalMutationString183 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add25_literalMutationString120_failAssert47() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            Element o_testTemplateInsideTable_add25__7 = doc.body();
            Elements templates = doc.body().getElementsByTag("template");
            for (Element template : templates) {
                boolean boolean_28 = (template.childNodes().size()) > 1;
            }
            org.junit.Assert.fail("testTemplateInsideTable_add25_literalMutationString120 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString6_failAssert5_literalMutationString150_failAssert60() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag("template");
                for (Element template : templates) {
                    boolean boolean_9 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTable_literalMutationString6 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString6_failAssert5_literalMutationString150 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add21_literalMutationString182_failAssert34() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testTemplateInsideTable_add21__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            Elements templates = doc.body().getElementsByTag("template");
            for (Element template : templates) {
                boolean boolean_24 = (template.childNodes().size()) > 1;
            }
            org.junit.Assert.fail("testTemplateInsideTable_add21_literalMutationString182 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
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
    public void testTemplateInsideTable_literalMutationString11_failAssert10_literalMutationString115_failAssert76() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UF-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag("template");
                for (Element template : templates) {
                    boolean boolean_14 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTable_literalMutationString11 should have thrown UnsupportedEncodingException");
            } catch (UnsupportedEncodingException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString11_failAssert10_literalMutationString115 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString4_failAssert3_literalMutationString171_failAssert58() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag("template");
                for (Element template : templates) {
                    boolean boolean_7 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTable_literalMutationString4 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString4_failAssert3_literalMutationString171 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_literalMutationString2_failAssert1_literalMutationString128_failAssert57() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                doc.outputSettings().prettyPrint(true);
                Elements templates = doc.body().getElementsByTag("template");
                for (Element template : templates) {
                    boolean boolean_5 = (template.childNodes().size()) > 1;
                }
                org.junit.Assert.fail("testTemplateInsideTable_literalMutationString2 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("testTemplateInsideTable_literalMutationString2_failAssert1_literalMutationString128 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTemplateInsideTable_add21_add767_literalMutationString2462_failAssert145() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_testTemplateInsideTable_add21__3 = Jsoup.parse(in, "UTF-8");
            Document o_testTemplateInsideTable_add21_add767__6 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            doc.outputSettings().prettyPrint(true);
            Elements templates = doc.body().getElementsByTag("template");
            for (Element template : templates) {
                boolean boolean_24 = (template.childNodes().size()) > 1;
            }
            org.junit.Assert.fail("testTemplateInsideTable_add21_add767_literalMutationString2462 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4908_failAssert151_literalMutationString5300_failAssert203() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4908 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4908_failAssert151_literalMutationString5300 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4925_add5500_literalMutationString10844_failAssert252() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__5 = doc.html();
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__6 = StringUtil.normaliseWhitespace(doc.html());
            Element o_handlesXmlDeclAndCommentsBeforeDoctype_add4925_add5500__12 = doc.head();
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__8 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4925_add5500_literalMutationString10844 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4923_literalMutationString5073_failAssert165() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_handlesXmlDeclAndCommentsBeforeDoctype_add4923__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4923__6 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4923__8 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4923_literalMutationString5073 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4907_failAssert150_literalMutationString5163_failAssert205() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4907 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4907_failAssert150_literalMutationString5163 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4924_add5558_literalMutationString7445_failAssert232() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_handlesXmlDeclAndCommentsBeforeDoctype_add4924_add5558__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__5 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__7 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__9 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4924_add5558_literalMutationString7445 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4905_failAssert148_literalMutationString5059_failAssert207() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4905 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4905_failAssert148_literalMutationString5059 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4906_failAssert149_literalMutationString5020_failAssert204() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4906 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4906_failAssert149_literalMutationString5020 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctypenull4932_failAssert156_literalMutationString5014_failAssert201() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select(null).text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctypenull4932 should have thrown IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctypenull4932_failAssert156_literalMutationString5014 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4924_literalMutationString5062_failAssert199() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__5 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__7 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__9 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4924_literalMutationString5062 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4925_add5467_literalMutationString8789_failAssert230() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_handlesXmlDeclAndCommentsBeforeDoctype_add4925_add5467__3 = Jsoup.parse(in, "UTF-8");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__5 = doc.html();
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__6 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__8 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4925_add5467_literalMutationString8789 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4928_literalMutationString5056_failAssert177() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4928__5 = StringUtil.normaliseWhitespace(doc.html());
            Element o_handlesXmlDeclAndCommentsBeforeDoctype_add4928__7 = doc.head();
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4928__8 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4928_literalMutationString5056 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4924_add5603_literalMutationString6477_failAssert254() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__5 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__7 = StringUtil.normaliseWhitespace(doc.html());
            Element o_handlesXmlDeclAndCommentsBeforeDoctype_add4924_add5603__13 = doc.head();
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4924__9 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4924_add5603_literalMutationString6477 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_add4925_literalMutationString5052_failAssert196() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__5 = doc.html();
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__6 = StringUtil.normaliseWhitespace(doc.html());
            String o_handlesXmlDeclAndCommentsBeforeDoctype_add4925__8 = doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_add4925_literalMutationString5052 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4909_failAssert152_literalMutationString5028_failAssert206() throws IOException, Exception {
        try {
            try {
                File in = ParseTest.getFile("");
                Document doc = Jsoup.parse(in, "UTF-8");
                StringUtil.normaliseWhitespace(doc.html());
                doc.head().select("title").text();
                org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4909 should have thrown NullPointerException");
            } catch (NullPointerException expected) {
            }
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4909_failAssert152_literalMutationString5028 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected_1) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4904_failAssert147() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, "UTF-8");
            StringUtil.normaliseWhitespace(doc.html());
            doc.head().select("title").text();
            org.junit.Assert.fail("handlesXmlDeclAndCommentsBeforeDoctype_literalMutationString4904 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }
}

