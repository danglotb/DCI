package org.jsoup.integration;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.UncheckedIOException;
import org.jsoup.integration.servlets.EchoServlet;
import org.jsoup.integration.servlets.InterruptedServlet;
import org.jsoup.integration.servlets.SlowRider;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class AmplConnectTest {
    private static String echoUrl;

    @BeforeClass
    public static void setUp() {
        TestServer.start();
        AmplConnectTest.echoUrl = EchoServlet.Url;
    }

    @org.junit.AfterClass
    public static void tearDown() {
        TestServer.stop();
    }

    private static String ihVal(String key, Document doc) {
        final Element first = doc.select((("th:contains(" + key) + ") + td")).first();
        return first != null ? first.text() : null;
    }

    @Ignore
    @Test
    public void canInterruptBodyStringRead() throws IOException, InterruptedException {
        final String[] body = new String[1];
        Thread runner = new Thread(new Runnable() {
            public void run() {
                try {
                    Connection.Response res = Jsoup.connect(SlowRider.Url).timeout((15 * 1000)).execute();
                    body[0] = res.body();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        runner.start();
        Thread.sleep((1000 * 3));
        runner.interrupt();
        Assert.assertTrue(runner.isInterrupted());
        runner.join();
        Assert.assertTrue(((body[0].length()) > 0));
        Assert.assertTrue(body[0].contains("<p>Are you still there?"));
    }

    @Ignore
    @Test
    public void canInterruptDocumentRead() throws IOException, InterruptedException {
        final String[] body = new String[1];
        Thread runner = new Thread(new Runnable() {
            public void run() {
                try {
                    Connection.Response res = Jsoup.connect(SlowRider.Url).timeout((15 * 1000)).execute();
                    body[0] = res.parse().text();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        runner.start();
        Thread.sleep((1000 * 3));
        runner.interrupt();
        Assert.assertTrue(runner.isInterrupted());
        runner.join();
        Assert.assertTrue(((body[0].length()) == 0));
    }

    @Ignore
    @Test
    public void totalTimeout() throws IOException {
        int timeout = 3 * 1000;
        long start = System.currentTimeMillis();
        boolean threw = false;
        try {
            Jsoup.connect(SlowRider.Url).timeout(timeout).get();
        } catch (SocketTimeoutException e) {
            long end = System.currentTimeMillis();
            long took = end - start;
            Assert.assertTrue(("Time taken was " + took), (took > timeout));
            Assert.assertTrue(("Time taken was " + took), (took < (timeout * 1.2)));
            threw = true;
        }
        Assert.assertTrue(threw);
    }

    @Ignore
    @Test
    public void slowReadOk() throws IOException {
        Document doc = Jsoup.connect(SlowRider.Url).data(SlowRider.MaxTimeParam, "2000").get();
        Element h1 = doc.selectFirst("h1");
        Assert.assertEquals("outatime", h1.text());
    }

    @Ignore
    @Test
    public void infiniteReadSupported() throws IOException {
        Document doc = Jsoup.connect(SlowRider.Url).timeout(0).data(SlowRider.MaxTimeParam, "2000").get();
        Element h1 = doc.selectFirst("h1");
        Assert.assertEquals("outatime", h1.text());
    }

    @Test(timeout = 10000)
    public void postFiles_literalMutationString70404_failAssert530() throws IOException, Exception {
        try {
            File thumb = ParseTest.getFile("/htmltests/thumb.jpg");
            File html = ParseTest.getFile("");
            Document res = Jsoup.connect(EchoServlet.Url).data("firstname", "Jay").data("firstPart", thumb.getName(), new FileInputStream(thumb), "image/jpeg").data("secondPart", html.getName(), new FileInputStream(html)).data("surname", "Soup").post();
            AmplConnectTest.ihVal("Parts", res);
            AmplConnectTest.ihVal("Part secondPart ContentType", res);
            AmplConnectTest.ihVal("Part secondPart Name", res);
            AmplConnectTest.ihVal("Part secondPart Filename", res);
            AmplConnectTest.ihVal("Part secondPart Size", res);
            AmplConnectTest.ihVal("Part firstPart ContentType", res);
            AmplConnectTest.ihVal("Part firstPart Name", res);
            AmplConnectTest.ihVal("Part firstPart Filename", res);
            AmplConnectTest.ihVal("Part firstPart Size", res);
            AmplConnectTest.ihVal("firstname", res);
            AmplConnectTest.ihVal("surname", res);

            org.junit.Assert.fail("postFiles_literalMutationString70404 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void postFiles_literalMutationString70399_failAssert525() throws IOException, Exception {
        try {
            File thumb = ParseTest.getFile("");
            File html = ParseTest.getFile("/htmltests/google-ipod.html");
            Document res = Jsoup.connect(EchoServlet.Url).data("firstname", "Jay").data("firstPart", thumb.getName(), new FileInputStream(thumb), "image/jpeg").data("secondPart", html.getName(), new FileInputStream(html)).data("surname", "Soup").post();
            AmplConnectTest.ihVal("Parts", res);
            AmplConnectTest.ihVal("Part secondPart ContentType", res);
            AmplConnectTest.ihVal("Part secondPart Name", res);
            AmplConnectTest.ihVal("Part secondPart Filename", res);
            AmplConnectTest.ihVal("Part secondPart Size", res);
            AmplConnectTest.ihVal("Part firstPart ContentType", res);
            AmplConnectTest.ihVal("Part firstPart Name", res);
            AmplConnectTest.ihVal("Part firstPart Filename", res);
            AmplConnectTest.ihVal("Part firstPart Size", res);
            AmplConnectTest.ihVal("firstname", res);
            AmplConnectTest.ihVal("surname", res);

            org.junit.Assert.fail("postFiles_literalMutationString70399 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void postFiles_add70519() throws IOException, Exception {
        File thumb = ParseTest.getFile("/htmltests/thumb.jpg");
        File o_postFiles_add70519__3 = ParseTest.getFile("/htmltests/google-ipod.html");
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (o_postFiles_add70519__3)).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (o_postFiles_add70519__3)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_postFiles_add70519__3)).getParent());
        Assert.assertTrue(((File) (o_postFiles_add70519__3)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_postFiles_add70519__3)).isDirectory());
        Assert.assertTrue(((File) (o_postFiles_add70519__3)).isFile());
        Assert.assertFalse(((File) (o_postFiles_add70519__3)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_postFiles_add70519__3)).getTotalSpace())));
        File html = ParseTest.getFile("/htmltests/google-ipod.html");
        Document res = Jsoup.connect(EchoServlet.Url).data("firstname", "Jay").data("firstPart", thumb.getName(), new FileInputStream(thumb), "image/jpeg").data("secondPart", html.getName(), new FileInputStream(html)).data("surname", "Soup").post();
        String o_postFiles_add70519__18 = AmplConnectTest.ihVal("Parts", res);
        Assert.assertEquals("4", o_postFiles_add70519__18);
        String o_postFiles_add70519__19 = AmplConnectTest.ihVal("Part secondPart ContentType", res);
        Assert.assertEquals("application/octet-stream", o_postFiles_add70519__19);
        String o_postFiles_add70519__20 = AmplConnectTest.ihVal("Part secondPart Name", res);
        Assert.assertEquals("secondPart", o_postFiles_add70519__20);
        String o_postFiles_add70519__21 = AmplConnectTest.ihVal("Part secondPart Filename", res);
        Assert.assertEquals("google-ipod.html", o_postFiles_add70519__21);
        String o_postFiles_add70519__22 = AmplConnectTest.ihVal("Part secondPart Size", res);
        Assert.assertEquals("43963", o_postFiles_add70519__22);
        String o_postFiles_add70519__23 = AmplConnectTest.ihVal("Part firstPart ContentType", res);
        Assert.assertEquals("image/jpeg", o_postFiles_add70519__23);
        String o_postFiles_add70519__24 = AmplConnectTest.ihVal("Part firstPart Name", res);
        Assert.assertEquals("firstPart", o_postFiles_add70519__24);
        String o_postFiles_add70519__25 = AmplConnectTest.ihVal("Part firstPart Filename", res);
        Assert.assertEquals("thumb.jpg", o_postFiles_add70519__25);
        String o_postFiles_add70519__26 = AmplConnectTest.ihVal("Part firstPart Size", res);
        Assert.assertEquals("1052", o_postFiles_add70519__26);
        String o_postFiles_add70519__27 = AmplConnectTest.ihVal("firstname", res);
        Assert.assertEquals("Jay", o_postFiles_add70519__27);
        String o_postFiles_add70519__28 = AmplConnectTest.ihVal("surname", res);
        Assert.assertEquals("Soup", o_postFiles_add70519__28);

        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (o_postFiles_add70519__3)).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (o_postFiles_add70519__3)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_postFiles_add70519__3)).getParent());
        Assert.assertTrue(((File) (o_postFiles_add70519__3)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add70519__3)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (o_postFiles_add70519__3)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add70519__3)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-1676206887, ((int) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/google-ipod.html", ((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add70519__3)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_postFiles_add70519__3)).isDirectory());
        Assert.assertTrue(((File) (o_postFiles_add70519__3)).isFile());
        Assert.assertFalse(((File) (o_postFiles_add70519__3)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_postFiles_add70519__3)).getTotalSpace())));
        Assert.assertEquals("4", o_postFiles_add70519__18);
        Assert.assertEquals("application/octet-stream", o_postFiles_add70519__19);
        Assert.assertEquals("secondPart", o_postFiles_add70519__20);
        Assert.assertEquals("google-ipod.html", o_postFiles_add70519__21);
        Assert.assertEquals("43963", o_postFiles_add70519__22);
        Assert.assertEquals("image/jpeg", o_postFiles_add70519__23);
        Assert.assertEquals("firstPart", o_postFiles_add70519__24);
        Assert.assertEquals("thumb.jpg", o_postFiles_add70519__25);
        Assert.assertEquals("1052", o_postFiles_add70519__26);
        Assert.assertEquals("Jay", o_postFiles_add70519__27);
        Assert.assertEquals("Soup", o_postFiles_add70519__28);
    }

    @Test(timeout = 10000)
    public void handlesEmtpyStreamDuringBufferdRead_add200133_literalMutationNumber200234_failAssert803() throws IOException, Exception {
        try {
            Jsoup.connect(InterruptedServlet.Url);
            Connection.Response res = Jsoup.connect(InterruptedServlet.Url).timeout(1).execute();
            boolean threw = false;
            try {
                res.bufferUp();
            } catch (UncheckedIOException e) {
                threw = true;
            }
            org.junit.Assert.fail("handlesEmtpyStreamDuringBufferdRead_add200133_literalMutationNumber200234 should have thrown SocketTimeoutException");
        } catch (SocketTimeoutException expected_1) {
            Assert.assertEquals(null, expected_1.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void handlesEmtpyStreamDuringBufferdRead_literalMutationNumber200126() throws IOException, Exception {
        Connection.Response res = Jsoup.connect(InterruptedServlet.Url).timeout(201).execute();
        boolean threw = false;
        Assert.assertFalse(threw);
        try {
            res.bufferUp();
        } catch (UncheckedIOException e) {
            threw = true;
        }
        Assert.assertTrue(threw);
    }
}

