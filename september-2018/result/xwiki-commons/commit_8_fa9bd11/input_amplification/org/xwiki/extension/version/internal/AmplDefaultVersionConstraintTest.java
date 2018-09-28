package org.xwiki.extension.version.internal;


import org.junit.Assert;
import org.junit.Test;
import org.xwiki.extension.version.IncompatibleVersionConstraintException;


public class AmplDefaultVersionConstraintTest {
    @Test(timeout = 10000)
    public void testMergelitString24_failAssert5() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint(":").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString24 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [:] is not part of version constraint [[2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString42_failAssert13() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("{.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString42 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [{.0] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString43_failAssert14() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2w.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString43 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [2w.0] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString29_failAssert9() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("Yl)nX")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString29 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [Yl)nX] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString26_failAssert6() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint(";2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString26 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [;2.0]] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString23_failAssert4() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("\n").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString23 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [\n] is not part of version constraint [[2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString44_failAssert15() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("20")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString44 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [20] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString31_failAssert11() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("\n")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString31 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [\n] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString30_failAssert10() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString30 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString32_failAssert12() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint(":")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString32 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [:] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString17_failAssert0() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString17 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [1.0] is not part of version constraint [[2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString45_failAssert16() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("L^[")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString45 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [L^[] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString46_failAssert17() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString46 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString22_failAssert3() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString22 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [] is not part of version constraint [[2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString47_failAssert18() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("\n")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString47 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [\n] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString21_failAssert2() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("lB!+l!(e,").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("2.0")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString21 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [lB!+l!(e,] is not part of version constraint [[2.0]]", expected_2.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testMergelitString48_failAssert19() throws Exception, IncompatibleVersionConstraintException {
        try {
            new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("2.0")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            new DefaultVersionConstraint("[1.0,2.0]").merge(new DefaultVersionConstraint(":")).getValue();
            try {
                new DefaultVersionConstraint("[1.0]").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            try {
                new DefaultVersionConstraint("1.0").merge(new DefaultVersionConstraint("[2.0]")).getValue();
            } catch (IncompatibleVersionConstraintException expected) {

            }
            org.junit.Assert.fail("testMergelitString48 should have thrown IncompatibleVersionConstraintException");
        } catch (IncompatibleVersionConstraintException expected_2) {
            Assert.assertEquals("Version [:] is not part of version constraint [[1.0,2.0]]", expected_2.getMessage());
        }
    }
}

