package org.jsoup.helper;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import org.jsoup.Jsoup;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;


public class AmplDataUtilTest {
    private InputStream stream(String data) {
        return new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
    }

    private InputStream stream(String data, String charset) {
        try {
            return new ByteArrayInputStream(data.getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            Assert.fail();
        }
        return null;
    }

    @Test(timeout = 10000)
    public void supportsBOMinFiles_literalMutationString23603_failAssert224() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("/bomtests/bom_utf16be.html");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16BE");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf16le.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32BE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf32le.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            org.junit.Assert.fail("supportsBOMinFiles_literalMutationString23603 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsBOMinFiles_literalMutationString23578_failAssert217() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("/bomtests/bom_utf16be.html");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16BE");
            doc.text().contains("??????");
            in = ParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf32be.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32BE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf32le.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            org.junit.Assert.fail("supportsBOMinFiles_literalMutationString23578 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsBOMinFiles_literalMutationString23626_failAssert229() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("/bomtests/bom_utf16be.html");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16BE");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf16le.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf32be.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32BE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            org.junit.Assert.fail("supportsBOMinFiles_literalMutationString23626 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsBOMinFiles_literalMutationString23554_failAssert211() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16BE");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf16le.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-16LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf32be.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32BE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            in = ParseTest.getFile("/bomtests/bom_utf32le.html");
            doc = Jsoup.parse(in, null, "http://example.com");
            doc.title().contains("UTF-32LE");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            doc.text().contains("??????");
            org.junit.Assert.fail("supportsBOMinFiles_literalMutationString23554 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16369_literalMutationString16479_failAssert139() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http:/&/example.com");
            String o_supportsUTF8BOM_literalMutationString16369__5 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16369_literalMutationString16479 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16373_literalMutationString16536_failAssert129() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            String o_supportsUTF8BOM_literalMutationString16373__5 = doc.head().select("Oitle").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16373_literalMutationString16536 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16365_literalMutationString16496_failAssert108() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "  ");
            String o_supportsUTF8BOM_literalMutationString16365__5 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16365_literalMutationString16496 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16368_literalMutationString16468_failAssert125() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "[4(V2Pf/XYQ&58zB,A");
            String o_supportsUTF8BOM_literalMutationString16368__5 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16368_literalMutationString16468 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_add16380_add17024_literalMutationString20061_failAssert207() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_supportsUTF8BOM_add16380_add17024__3 = Jsoup.parse(in, null, "http://example.com");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            Element o_supportsUTF8BOM_add16380__5 = doc.head();
            String o_supportsUTF8BOM_add16380__6 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_add16380_add17024_literalMutationString20061 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_add16377_add17112_literalMutationString21831_failAssert189() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_supportsUTF8BOM_add16377_add17112__3 = Jsoup.parse(in, null, "http://example.com");
            Document o_supportsUTF8BOM_add16377__3 = Jsoup.parse(in, null, "http://example.com");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            String o_supportsUTF8BOM_add16377__6 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_add16377_add17112_literalMutationString21831 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16370_literalMutationString16470_failAssert133() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            String o_supportsUTF8BOM_literalMutationString16370__5 = doc.head().select("tYitle").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16370_literalMutationString16470 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_add16377_literalMutationString16577_failAssert84() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_supportsUTF8BOM_add16377__3 = Jsoup.parse(in, null, "http://example.com");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            String o_supportsUTF8BOM_add16377__6 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_add16377_literalMutationString16577 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_add16377_add17126_literalMutationString20321_failAssert187() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document o_supportsUTF8BOM_add16377__3 = Jsoup.parse(in, null, "http://example.com");
            Document o_supportsUTF8BOM_add16377_add17126__6 = Jsoup.parse(in, null, "http://example.com");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            String o_supportsUTF8BOM_add16377__6 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_add16377_add17126_literalMutationString20321 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16375_literalMutationString16563_failAssert127() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            String o_supportsUTF8BOM_literalMutationString16375__5 = doc.head().select("ttle").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16375_literalMutationString16563 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16359_failAssert64() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16359 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16367_literalMutationString16508_failAssert132() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://exampl.com");
            String o_supportsUTF8BOM_literalMutationString16367__5 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16367_literalMutationString16508 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_add16380_literalMutationString16529_failAssert98() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "http://example.com");
            Element o_supportsUTF8BOM_add16380__5 = doc.head();
            String o_supportsUTF8BOM_add16380__6 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_add16380_literalMutationString16529 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16366_literalMutationString16463_failAssert143() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "httpw//example.com");
            String o_supportsUTF8BOM_literalMutationString16366__5 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16366_literalMutationString16463 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void supportsUTF8BOM_literalMutationString16364_literalMutationString16499_failAssert105() throws IOException, Exception {
        try {
            File in = ParseTest.getFile("");
            Document doc = Jsoup.parse(in, null, "");
            String o_supportsUTF8BOM_literalMutationString16364__5 = doc.head().select("title").text();
            org.junit.Assert.fail("supportsUTF8BOM_literalMutationString16364_literalMutationString16499 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }
}

