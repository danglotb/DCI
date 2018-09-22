package org.apache.commons.cli;


import java.io.File;
import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("deprecation")
public class AmplPatternOptionBuilderTest {
    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105983() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106435() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106558() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106712() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105980() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106438() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106552() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105986() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106157() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106311() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106396() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106151() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106393() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106208() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106600() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106688() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106205() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105992() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106724() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106048() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106202() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105995() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106682() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106287() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106281() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106736() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106739() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106579() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106733() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106217() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106299() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106576() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106697() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106730() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106214() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106570() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106691() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106054() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106296() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106694() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106051() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106293() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106290() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106109() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106506() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106748() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105938() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106106() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106503() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106745() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106585() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106103() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106588() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106742() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106582() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106100() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106060() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106063() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105944() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106754() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106239() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106636() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106597() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isFile();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106751() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isFile();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105941() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106115() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106594() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106193() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106591() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106648() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106528() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105950() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106127() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106248() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106645() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105953() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106245() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106085() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106534() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106139() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106414() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106657() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106537() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106497() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106651() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106136() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106257() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106097() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106251() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106494() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106133() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106254() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106094() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106491() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106091() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106709() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isFile();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106549() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106703() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106308() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isFile();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106429() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106706() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add105971() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106546() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106700() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106305() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106426() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106145() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106266() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isFile();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106387() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106543() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106148() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106269() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106302() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106423() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        Assert.assertEquals("<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).toString());
        Assert.assertEquals(-1925832438, ((int) (((File) (o_testExistingFilePatternlitString102873__8)).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getName());
        Assert.assertEquals("<-Kk}!Ezi", ((File) (o_testExistingFilePatternlitString102873__8)).getParent());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalPath());
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).toString());
        Assert.assertEquals(1065914318, ((int) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getName());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getParent());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalPath());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getParentFile());
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getUsableSpace())));
        Assert.assertEquals("<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isDirectory());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isFile());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString102873__8)).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString102873__8)).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString102873__8)).getUsableSpace())));

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        Assert.assertEquals("<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).toString());
        Assert.assertEquals(-1925832438, ((int) (((File) (o_testExistingFilePatternlitString102873__8)).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getName());
        Assert.assertEquals("<-Kk}!Ezi", ((File) (o_testExistingFilePatternlitString102873__8)).getParent());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalPath());
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).toString());
        Assert.assertEquals(1065914318, ((int) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getName());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getParent());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalPath());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getParentFile());
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getUsableSpace())));
        Assert.assertEquals("<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (o_testExistingFilePatternlitString102873__8)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(-1379298156, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(1912148816, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/<-Kk}!Ezi/v)9Lq", ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isDirectory());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isFile());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString102873__8)).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString102873__8)).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString102873__8)).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString102873__8)).getUsableSpace())));
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106142() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106263() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106384() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106660() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getParentFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106540() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106260() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString102873_add106381() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "<-Kk}!Ezi/v)9Lq" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString102873__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString102873__8)).getParentFile())).getAbsoluteFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }
}

