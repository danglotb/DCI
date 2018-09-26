package org.apache.commons.cli;


import java.io.File;
import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("deprecation")
public class AmplPatternOptionBuilderTest {
    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107286() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107684() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106596() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106992() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106590() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add108011() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107606() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107969() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107569() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106998() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107328() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106912() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106477() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107600() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107963() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106483() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106761() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106882() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107696() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isFile();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107690() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107292() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106809() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106924() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107618() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106767() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107059() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107576() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106367() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107975() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107660() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107023() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106452() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106695() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107262() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106458() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107822() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107702() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106614() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107268() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107666() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106974() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107029() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isFile();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107792() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107672() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107035() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106464() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107274() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106906() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        Assert.assertEquals("http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).toString());
        Assert.assertEquals(-1764233962, ((int) (((File) (o_testExistingFilePatternlitString103367__8)).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getName());
        Assert.assertEquals("http:", ((File) (o_testExistingFilePatternlitString103367__8)).getParent());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalPath());
        Assert.assertEquals("http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).toString());
        Assert.assertEquals(98753827, ((int) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getName());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getParent());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalPath());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getParentFile());
        Assert.assertEquals("http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getUsableSpace())));
        Assert.assertEquals("http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isDirectory());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isFile());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103367__8)).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103367__8)).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103367__8)).getUsableSpace())));

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        Assert.assertEquals("http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).toString());
        Assert.assertEquals(-1764233962, ((int) (((File) (o_testExistingFilePatternlitString103367__8)).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getName());
        Assert.assertEquals("http:", ((File) (o_testExistingFilePatternlitString103367__8)).getParent());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalPath());
        Assert.assertEquals("http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).toString());
        Assert.assertEquals(98753827, ((int) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getName());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getParent());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalPath());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getParentFile());
        Assert.assertEquals("http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getUsableSpace())));
        Assert.assertEquals("http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (o_testExistingFilePatternlitString103367__8)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(-430381111, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals("http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(845391024, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/http:/commons.apache.org", ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isDirectory());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isFile());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103367__8)).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103367__8)).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103367__8)).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103367__8)).getUsableSpace())));
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106749() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106986() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106900() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add108005() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isFile();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106620() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107951() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107798() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107557() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107678() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106791() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107089() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106397() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106391() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107482() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103371() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", ":6!83=:PW}/D@I?" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103371__8 = line.getOptionObject("f");
        Assert.assertEquals(":6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).toString());
        Assert.assertEquals(763208697, ((int) (((File) (o_testExistingFilePatternlitString103371__8)).hashCode())));
        Assert.assertEquals("D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getName());
        Assert.assertEquals(":6!83=:PW}", ((File) (o_testExistingFilePatternlitString103371__8)).getParent());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalPath());
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).toString());
        Assert.assertEquals(-270010904, ((int) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getName());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getParent());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalPath());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getParentFile());
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getUsableSpace())));
        Assert.assertEquals(":6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isDirectory());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isFile());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103371__8)).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103371__8)).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103371__8)).getUsableSpace())));

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        Assert.assertEquals(":6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).toString());
        Assert.assertEquals(763208697, ((int) (((File) (o_testExistingFilePatternlitString103371__8)).hashCode())));
        Assert.assertEquals("D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getName());
        Assert.assertEquals(":6!83=:PW}", ((File) (o_testExistingFilePatternlitString103371__8)).getParent());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalPath());
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).toString());
        Assert.assertEquals(-270010904, ((int) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getName());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getParent());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalPath());
        Assert.assertNull(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getParentFile());
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getParentFile())).getUsableSpace())));
        Assert.assertEquals(":6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (o_testExistingFilePatternlitString103371__8)).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).toString());
        Assert.assertEquals(1237572354, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).hashCode())));
        Assert.assertEquals(":6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getParentFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsolutePath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getAbsoluteFile())).getUsableSpace())));
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).toString());
        Assert.assertEquals(304389407, ((int) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).hashCode())));
        Assert.assertEquals("D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getName());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getParent());
        Assert.assertTrue(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getPath());
        Assert.assertEquals("/tmp/icst-2019/september-2018/dataset/commons-cli_parent/:6!83=:PW}/D@I?", ((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isDirectory());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isFile());
        Assert.assertFalse(((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (((File) (o_testExistingFilePatternlitString103371__8)).getCanonicalFile())).getUsableSpace())));
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isDirectory());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isFile());
        Assert.assertFalse(((File) (o_testExistingFilePatternlitString103371__8)).isHidden());
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103371__8)).getTotalSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103371__8)).getFreeSpace())));
        Assert.assertEquals(0L, ((long) (((File) (o_testExistingFilePatternlitString103371__8)).getUsableSpace())));
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107083() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107804() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107926() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isHidden();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106713() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107004() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107488() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107642() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107884() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106434() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106797() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106677() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107920() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isFile();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106683() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107376() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107095() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107370() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107010() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107494() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107890() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107816() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106689() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106602() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106725() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107774() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107016() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107654() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107896() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106373() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107101() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107981() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107582() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107908() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107107() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107866() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).toString();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107987() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106779() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107506() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107902() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106773() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).isAbsolute();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107346() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getParent();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107588() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106379() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getAbsoluteFile())).getCanonicalPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106930() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getParentFile())).isDirectory();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107077() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getParent();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107352() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).isAbsolute();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107594() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107113() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isFile();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107993() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getAbsolutePath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107071() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).getName();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107914() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106707() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getAbsolutePath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106701() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107119() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isHidden();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107878() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getAbsoluteFile())).getName();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107999() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getCanonicalFile())).getCanonicalFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106785() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getCanonicalFile())).getPath();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add106665() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");
        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getAbsoluteFile())).toString();

        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107358() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getParentFile())).getCanonicalFile())).getCanonicalPath();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }

    @Test(timeout = 10000)
    public void testExistingFilePatternlitString103367_add107512() throws Exception {
        final Options options = PatternOptionBuilder.parsePattern("f<");
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        final CommandLineParser parser = new PosixParser();
        final CommandLine line = parser.parse(options, new String[]{ "-f", "http://commons.apache.org" });
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
        new File("test.properties");
        Object o_testExistingFilePatternlitString103367__8 = line.getOptionObject("f");

        ((File) (((File) (((File) (o_testExistingFilePatternlitString103367__8)).getAbsoluteFile())).getParentFile())).isDirectory();
        Assert.assertTrue(((Options) (options)).getRequiredOptions().isEmpty());
        Assert.assertFalse(((Options) (options)).getOptions().isEmpty());
        Assert.assertEquals("[ Options: [ short {f=[ option: f  [ARG] :: null :: class java.io.FileInputStream ]} ] [ long {} ]", ((Options) (options)).toString());
        Assert.assertTrue(((CommandLine) (line)).getArgList().isEmpty());
    }
}

