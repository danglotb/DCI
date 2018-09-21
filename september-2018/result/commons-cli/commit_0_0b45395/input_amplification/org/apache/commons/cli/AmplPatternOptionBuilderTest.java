package org.apache.commons.cli;


import java.io.File;
import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("deprecation")
public class AmplPatternOptionBuilderTest {
    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111817() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isHidden();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111859() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isHidden();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            Assert.assertEquals("test.properties", ((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).toString());
            Assert.assertEquals(-12587618, ((int) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).hashCode())));
            Assert.assertEquals("test.properties", ((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getName());
            Assert.assertNull(((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getParent());
            Assert.assertFalse(((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalPath());
            Assert.assertNull(((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getParentFile());
            Assert.assertEquals("test.properties", ((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsolutePath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).toString());
            Assert.assertEquals(-471408732, ((int) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).hashCode())));
            Assert.assertEquals("test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParent());
            Assert.assertTrue(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).toString());
            Assert.assertEquals(872871332, ((int) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).hashCode())));
            Assert.assertEquals("commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getParent());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isFile());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isHidden());
            Assert.assertEquals(282639695872L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsolutePath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).toString());
            Assert.assertEquals(-471408732, ((int) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
            Assert.assertEquals("test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getParent());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isFile());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getFreeSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getUsableSpace())));
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).toString());
            Assert.assertEquals(-471408732, ((int) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
            Assert.assertEquals("test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getParent());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isFile());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isHidden());
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getFreeSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getUsableSpace())));
            Assert.assertFalse(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).isFile());
            Assert.assertFalse(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).isHidden());
            Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getTotalSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getFreeSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getUsableSpace())));
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).toString());
            Assert.assertEquals(-471408732, ((int) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).hashCode())));
            Assert.assertEquals("test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParent());
            Assert.assertTrue(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).toString());
            Assert.assertEquals(872871332, ((int) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).hashCode())));
            Assert.assertEquals("commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getParent());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getAbsolutePath());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isFile());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isHidden());
            Assert.assertEquals(282639695872L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getTotalSpace())));
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsolutePath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).toString());
            Assert.assertEquals(-471408732, ((int) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
            Assert.assertEquals("test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getParent());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isFile());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isHidden());
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getFreeSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getUsableSpace())));
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).toString());
            Assert.assertEquals(-471408732, ((int) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).hashCode())));
            Assert.assertEquals("test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getName());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getParent());
            Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getPath());
            Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/test.properties", ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isFile());
            Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isHidden());
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getFreeSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getUsableSpace())));
            Assert.assertFalse(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).isDirectory());
            Assert.assertFalse(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).isFile());
            Assert.assertFalse(((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).isHidden());
            Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getTotalSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getFreeSpace())));
            Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getUsableSpace())));
            Assert.assertFalse(((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).isDirectory());
            Assert.assertFalse(((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).isFile());
            Assert.assertFalse(((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).isHidden());
            Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getTotalSpace())));
            Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getFreeSpace())));
            Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getUsableSpace())));

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111986() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getParent();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111787() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).toString();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111941() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getName();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111983() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getName();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111747() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).toString();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111901() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getName();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111989() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isAbsolute();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111944() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getParent();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111829() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).toString();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111904() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getParent();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111947() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isAbsolute();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111907() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isAbsolute();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111799() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111953() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add112007() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isHidden();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111753() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getName();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111995() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111796() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getParent();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111950() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111759() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isAbsolute();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111913() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111835() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getName();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111956() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111756() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getParent();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111910() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getCanonicalPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111998() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add112004() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isFile();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111992() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111793() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getName();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add112001() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).isDirectory();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111916() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).getAbsolutePath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111838() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getParent();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111959() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isDirectory();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111919() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isDirectory();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111765() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111841() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isAbsolute();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111962() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isFile();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111847() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111802() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111768() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getAbsolutePath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111922() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isFile();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111844() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111965() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).isHidden();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111762() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).getCanonicalPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111805() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getPath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111925() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).isHidden();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111808() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111777() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isHidden();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111853() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isDirectory();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111774() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isFile();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111895() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getParentFile())).toString();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111814() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isFile();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111935() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getAbsoluteFile())).toString();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111856() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).isFile();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111977() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getCanonicalFile())).getCanonicalFile())).toString();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111811() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getAbsoluteFile())).isDirectory();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111850() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(timeout = 10000)
    public void testExistingFilePattern_mg102332_failAssert341_rv105234_add111771() throws Exception {
        try {
            String __DSPOT_description_140827 = "Z#!{?cZ7Q[(=]%dfuR$M";
            boolean __DSPOT_hasArg_140826 = true;
            String __DSPOT_opt_140824 = "W+&_e|P#5:c(%-T7nL5t";
            String __DSPOT_description_139193 = "+q{-$k $U9W-XSoVnpJ)";
            boolean __DSPOT_hasArg_139192 = false;
            String __DSPOT_longOpt_139191 = "hYRyEB#>#<yC+<yNv:sK";
            String __DSPOT_opt_139190 = "Lhs?|U|{=[uZfkv<`gLt";
            final Options options = PatternOptionBuilder.parsePattern("f<");
            Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
            Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
            Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
            final CommandLineParser parser = new PosixParser();
            final CommandLine line = parser.parse(options, new String[]{ "-f", "test.properties" });
            Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
            new File("test.properties");
            Object o_testExistingFilePattern_mg102332_failAssert341_rv105234__17 = line.getOptionObject("f");
            ((File) (((File) (((File) (o_testExistingFilePattern_mg102332_failAssert341_rv105234__17)).getAbsoluteFile())).getParentFile())).isDirectory();

            Options __DSPOT_invoc_16 = options.addOption(__DSPOT_opt_139190, __DSPOT_longOpt_139191, __DSPOT_hasArg_139192, __DSPOT_description_139193);
            org.junit.Assert.fail("testExistingFilePattern_mg102332 should have thrown IllegalArgumentException");
            __DSPOT_invoc_16.addOption(__DSPOT_opt_140824, __DSPOT_hasArg_140826, __DSPOT_description_140827);
        } catch (IllegalArgumentException expected) {
        }
    }
}

