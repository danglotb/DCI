package org.jsoup.integration;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.integration.servlets.EchoServlet;
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
    public void postFiles_literalMutationString60120_failAssert283() throws IOException, Exception {
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

            org.junit.Assert.fail("postFiles_literalMutationString60120 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void postFiles_add60234() throws IOException, Exception {
        File o_postFiles_add60234__1 = ParseTest.getFile("/htmltests/thumb.jpg");
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (o_postFiles_add60234__1)).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (o_postFiles_add60234__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_postFiles_add60234__1)).getParent());
        Assert.assertTrue(((File) (o_postFiles_add60234__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_postFiles_add60234__1)).isDirectory());
        Assert.assertTrue(((File) (o_postFiles_add60234__1)).isFile());
        Assert.assertFalse(((File) (o_postFiles_add60234__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_postFiles_add60234__1)).getTotalSpace())));
        File thumb = ParseTest.getFile("/htmltests/thumb.jpg");
        File html = ParseTest.getFile("/htmltests/google-ipod.html");
        Document res = Jsoup.connect(EchoServlet.Url).data("firstname", "Jay").data("firstPart", thumb.getName(), new FileInputStream(thumb), "image/jpeg").data("secondPart", html.getName(), new FileInputStream(html)).data("surname", "Soup").post();
        String o_postFiles_add60234__18 = AmplConnectTest.ihVal("Parts", res);
        Assert.assertEquals("4", o_postFiles_add60234__18);
        String o_postFiles_add60234__19 = AmplConnectTest.ihVal("Part secondPart ContentType", res);
        Assert.assertEquals("application/octet-stream", o_postFiles_add60234__19);
        String o_postFiles_add60234__20 = AmplConnectTest.ihVal("Part secondPart Name", res);
        Assert.assertEquals("secondPart", o_postFiles_add60234__20);
        String o_postFiles_add60234__21 = AmplConnectTest.ihVal("Part secondPart Filename", res);
        Assert.assertEquals("google-ipod.html", o_postFiles_add60234__21);
        String o_postFiles_add60234__22 = AmplConnectTest.ihVal("Part secondPart Size", res);
        Assert.assertEquals("43963", o_postFiles_add60234__22);
        String o_postFiles_add60234__23 = AmplConnectTest.ihVal("Part firstPart ContentType", res);
        Assert.assertEquals("image/jpeg", o_postFiles_add60234__23);
        String o_postFiles_add60234__24 = AmplConnectTest.ihVal("Part firstPart Name", res);
        Assert.assertEquals("firstPart", o_postFiles_add60234__24);
        String o_postFiles_add60234__25 = AmplConnectTest.ihVal("Part firstPart Filename", res);
        Assert.assertEquals("thumb.jpg", o_postFiles_add60234__25);
        String o_postFiles_add60234__26 = AmplConnectTest.ihVal("Part firstPart Size", res);
        Assert.assertEquals("1052", o_postFiles_add60234__26);
        String o_postFiles_add60234__27 = AmplConnectTest.ihVal("firstname", res);
        Assert.assertEquals("Jay", o_postFiles_add60234__27);
        String o_postFiles_add60234__28 = AmplConnectTest.ihVal("surname", res);
        Assert.assertEquals("Soup", o_postFiles_add60234__28);

        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (o_postFiles_add60234__1)).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (o_postFiles_add60234__1)).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (o_postFiles_add60234__1)).getParent());
        Assert.assertTrue(((File) (o_postFiles_add60234__1)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).toString());
        Assert.assertEquals(2132933432, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).hashCode())));
        Assert.assertEquals("test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add60234__1)).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (o_postFiles_add60234__1)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add60234__1)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(718477537, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-579718021, ((int) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/htmltests/thumb.jpg", ((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isDirectory());
        Assert.assertTrue(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (((File) (o_postFiles_add60234__1)).getCanonicalFile())).getTotalSpace())));
        Assert.assertFalse(((File) (o_postFiles_add60234__1)).isDirectory());
        Assert.assertTrue(((File) (o_postFiles_add60234__1)).isFile());
        Assert.assertFalse(((File) (o_postFiles_add60234__1)).isHidden());
        Assert.assertEquals(137864937472L, ((long) (((File) (o_postFiles_add60234__1)).getTotalSpace())));
        Assert.assertEquals("4", o_postFiles_add60234__18);
        Assert.assertEquals("application/octet-stream", o_postFiles_add60234__19);
        Assert.assertEquals("secondPart", o_postFiles_add60234__20);
        Assert.assertEquals("google-ipod.html", o_postFiles_add60234__21);
        Assert.assertEquals("43963", o_postFiles_add60234__22);
        Assert.assertEquals("image/jpeg", o_postFiles_add60234__23);
        Assert.assertEquals("firstPart", o_postFiles_add60234__24);
        Assert.assertEquals("thumb.jpg", o_postFiles_add60234__25);
        Assert.assertEquals("1052", o_postFiles_add60234__26);
        Assert.assertEquals("Jay", o_postFiles_add60234__27);
        Assert.assertEquals("Soup", o_postFiles_add60234__28);
    }

    @Test(timeout = 10000)
    public void postFiles_literalMutationString60114_failAssert277() throws IOException, Exception {
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

            org.junit.Assert.fail("postFiles_literalMutationString60114 should have thrown FileNotFoundException");
        } catch (FileNotFoundException expected) {
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/jsoup_parent/target/test-classes/org/jsoup/integration (Is a directory)", expected.getMessage());
        }
    }
}

