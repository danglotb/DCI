package org.apache.commons.io.input;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.Assert;
import org.junit.Test;


public class AmplBoundedReaderTest {
    private final Reader sr = new BufferedReader(new StringReader("01234567890"));

    private final Reader shortReader = new BufferedReader(new StringReader("01"));

    @Test(timeout = 10000)
    public void readMulti_add30() throws IOException, Exception {
        BoundedReader mr = new BoundedReader(sr, 3);
        char[] cbuf = new char[4];
        for (int i = 0; i < (cbuf.length); i++) {
            cbuf[i] = 'X';
        }
        int o_readMulti_add30__9 = mr.read(cbuf, 0, 4);
        Assert.assertEquals(3, ((int) (o_readMulti_add30__9)));
        final int read = mr.read(cbuf, 0, 4);
        Assert.assertEquals(0, ((int) (read)));
        char char_120 = cbuf[0];
        char char_121 = cbuf[1];
        char char_122 = cbuf[2];
        char char_123 = cbuf[3];
        mr.close();
        Assert.assertEquals(3, ((int) (o_readMulti_add30__9)));
        Assert.assertEquals(0, ((int) (read)));
    }

    @Test(timeout = 10000)
    public void readMulti_add30_mg601() throws IOException, Exception {
        int __DSPOT_len_31 = 776558984;
        int __DSPOT_off_30 = 478132801;
        char[] __DSPOT_cbuf_29 = new char[0];
        BoundedReader mr = new BoundedReader(this.sr, 3);
        char[] cbuf = new char[4];
        for (int i = 0; i < (cbuf.length); i++) {
            cbuf[i] = 'X';
        }
        int o_readMulti_add30__9 = mr.read(cbuf, 0, 4);
        final int read = mr.read(cbuf, 0, 4);
        char char_120 = cbuf[0];
        char char_121 = cbuf[1];
        char char_122 = cbuf[2];
        char char_123 = cbuf[3];
        mr.close();
        int o_readMulti_add30_mg601__22 = mr.read(__DSPOT_cbuf_29, __DSPOT_off_30, __DSPOT_len_31);
        Assert.assertEquals(0, ((int) (o_readMulti_add30_mg601__22)));
    }

    @Test(timeout = 10000)
    public void readMulti_add30_mg601_add4465() throws IOException, Exception {
        int __DSPOT_len_31 = 776558984;
        int __DSPOT_off_30 = 478132801;
        char[] __DSPOT_cbuf_29 = new char[0];
        BoundedReader mr = new BoundedReader(this.sr, 3);
        char[] cbuf = new char[4];
        for (int i = 0; i < (cbuf.length); i++) {
            cbuf[i] = 'X';
        }
        int o_readMulti_add30__9 = mr.read(cbuf, 0, 4);
        int o_readMulti_add30_mg601_add4465__15 = mr.read(cbuf, 0, 4);
        Assert.assertEquals(0, ((int) (o_readMulti_add30_mg601_add4465__15)));
        final int read = mr.read(cbuf, 0, 4);
        char char_120 = cbuf[0];
        char char_121 = cbuf[1];
        char char_122 = cbuf[2];
        char char_123 = cbuf[3];
        mr.close();
        int o_readMulti_add30_mg601__22 = mr.read(__DSPOT_cbuf_29, __DSPOT_off_30, __DSPOT_len_31);
        Assert.assertEquals(0, ((int) (o_readMulti_add30_mg601_add4465__15)));
    }

    @Test(timeout = 10000)
    public void readMulti_mg36_add2269() throws IOException, Exception {
        int __DSPOT_len_3 = 312752620;
        int __DSPOT_off_2 = 1635508580;
        char[] __DSPOT_cbuf_1 = new char[]{ '}', ',', 'G' };
        BoundedReader mr = new BoundedReader(this.sr, 3);
        char[] cbuf = new char[4];
        for (int i = 0; i < (cbuf.length); i++) {
            cbuf[i] = 'X';
        }
        final int read = mr.read(cbuf, 0, 4);
        char char_144 = cbuf[0];
        char char_145 = cbuf[1];
        char char_146 = cbuf[2];
        char char_147 = cbuf[3];
        mr.close();
        int o_readMulti_mg36_add2269__19 = mr.read(__DSPOT_cbuf_1, __DSPOT_off_2, __DSPOT_len_3);
        Assert.assertEquals(0, ((int) (o_readMulti_mg36_add2269__19)));
        int o_readMulti_mg36__19 = mr.read(__DSPOT_cbuf_1, __DSPOT_off_2, __DSPOT_len_3);
        Assert.assertEquals(0, ((int) (o_readMulti_mg36_add2269__19)));
    }

    @Test(timeout = 10000)
    public void readMulti_literalMutationNumber3() throws IOException, Exception {
        BoundedReader mr = new BoundedReader(sr, 0);
        char[] cbuf = new char[4];
        for (int i = 0; i < (cbuf.length); i++) {
            cbuf[i] = 'X';
        }
        final int read = mr.read(cbuf, 0, 4);
        Assert.assertEquals(0, ((int) (read)));
        char char_12 = cbuf[0];
        char char_13 = cbuf[1];
        char char_14 = cbuf[2];
        char char_15 = cbuf[3];
        mr.close();
        Assert.assertEquals(0, ((int) (read)));
    }

    @Test(timeout = 10000)
    public void readMulti_mg36() throws IOException, Exception {
        int __DSPOT_len_3 = 312752620;
        int __DSPOT_off_2 = 1635508580;
        char[] __DSPOT_cbuf_1 = new char[]{ '}', ',', 'G' };
        BoundedReader mr = new BoundedReader(sr, 3);
        char[] cbuf = new char[4];
        for (int i = 0; i < (cbuf.length); i++) {
            cbuf[i] = 'X';
        }
        final int read = mr.read(cbuf, 0, 4);
        Assert.assertEquals(3, ((int) (read)));
        char char_144 = cbuf[0];
        char char_145 = cbuf[1];
        char char_146 = cbuf[2];
        char char_147 = cbuf[3];
        mr.close();
        int o_readMulti_mg36__19 = mr.read(__DSPOT_cbuf_1, __DSPOT_off_2, __DSPOT_len_3);
        Assert.assertEquals(0, ((int) (o_readMulti_mg36__19)));
        Assert.assertEquals(3, ((int) (read)));
    }
}

