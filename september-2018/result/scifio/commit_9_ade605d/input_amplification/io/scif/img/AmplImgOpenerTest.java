package io.scif.img;


import io.scif.Metadata;
import io.scif.Reader;
import io.scif.config.SCIFIOConfig;
import io.scif.img.cell.SCIFIOCellImgFactory;
import java.util.List;
import net.imagej.ImgPlus;
import net.imagej.axis.Axes;
import net.imagej.axis.AxisType;
import net.imglib2.exception.IncompatibleTypeException;
import net.imglib2.img.ImgFactory;
import net.imglib2.img.array.ArrayImgFactory;
import net.imglib2.img.planar.PlanarImgFactory;
import net.imglib2.type.NativeType;
import net.imglib2.type.numeric.RealType;
import net.imglib2.type.numeric.integer.UnsignedByteType;
import org.junit.Assert;
import org.junit.Test;


public class AmplImgOpenerTest {
    private final ImgOpener imgOpener = new ImgOpener();

    private final String id = "testImg&lengths=512,512,5&axes=X,Y,Time.fake";

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test(timeout = 10000)
    public void testImgOptions_add3null30_failAssert11() throws ImgIOException, Exception, IncompatibleTypeException {
        try {
            final NativeType t = new UnsignedByteType();
            final ImgFactory aif = new ArrayImgFactory().imgFactory(t);
            final ImgFactory pif = new PlanarImgFactory().imgFactory(t);
            new SCIFIOCellImgFactory().imgFactory(t);
            final ImgFactory sif = new SCIFIOCellImgFactory().imgFactory(null);
            for (final ImgFactory f : new ImgFactory[]{ aif, pif, sif }) {
            }
            org.junit.Assert.fail("testImgOptions_add3null30 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @SuppressWarnings({ "rawtypes" })
    private void testSubRegion(final ImgFactory factory) throws ImgIOException {
        final SCIFIOConfig config = new SCIFIOConfig();
        AxisType[] axes = new AxisType[]{ Axes.X, Axes.Y };
        String[] ranges = new String[]{ "128-255", "128-255" };
        config.imgOpenerSetRegion(new ImageRegion(axes, ranges));
        doTestSubRegion(factory, config, ((128 * 128) * 5));
        axes = new AxisType[]{ Axes.TIME };
        ranges = new String[]{ "0,2-4:2" };
        config.imgOpenerSetRegion(new ImageRegion(axes, ranges));
        doTestSubRegion(factory, config, ((512 * 512) * 3));
        config.imgOpenerSetRegion(null);
        doTestSubRegion(factory, config, ((512 * 512) * 5));
    }

    @SuppressWarnings("rawtypes")
    private void doTestSubRegion(final ImgFactory factory, final SCIFIOConfig options, final long size) throws ImgIOException {
        ImgPlus imgPlus = null;
        imgPlus = imgOpener.openImgs(id, factory, options).get(0);
        Assert.assertNotNull(imgPlus);
        Assert.assertEquals(size, imgPlus.size());
    }

    private <T extends RealType<T> & NativeType<T>> void doTestGenerics(final T type) throws ImgIOException, IncompatibleTypeException {
        ImgPlus<T> imgPlus = null;
        final ImgFactory<T> factory = new ArrayImgFactory<T>().imgFactory(type);
        imgPlus = imgOpener.openImgs(id, type).get(0);
        Assert.assertNotNull(imgPlus);
        imgPlus = null;
        imgPlus = imgOpener.openImgs(id, type, new SCIFIOConfig()).get(0);
        Assert.assertNotNull(imgPlus);
        imgPlus = null;
        imgPlus = imgOpener.openImgs(id, factory, type).get(0);
        Assert.assertNotNull(imgPlus);
        imgPlus = null;
    }

    private class MultiImgOpener extends ImgOpener {
        @Override
        public <T extends RealType<T>> List<SCIFIOImgPlus<T>> openImgs(final Reader reader, final T type, final ImgFactory<T> imgFactory, final SCIFIOConfig config) throws ImgIOException {
            final Metadata m = reader.getMetadata();
            int offset = 0;
            for (int i = 0; i < (m.getImageCount()); i++) {
                m.get(i).setAxisLength(Axes.X, ((m.get(i).getAxisLength(Axes.X)) - offset));
                m.get(i).setAxisLength(Axes.Y, ((m.get(i).getAxisLength(Axes.Y)) - offset));
                offset += 10;
            }
            return super.openImgs(reader, type, imgFactory, config);
        }
    }
}

