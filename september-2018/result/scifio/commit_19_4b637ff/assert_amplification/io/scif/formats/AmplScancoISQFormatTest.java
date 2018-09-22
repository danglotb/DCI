package io.scif.formats;


import io.scif.Format;
import io.scif.ImageMetadata;
import java.util.List;
import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;
import net.imagej.axis.CalibratedAxis;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.scijava.Context;
import org.scijava.plugin.PluginInfo;


public class AmplScancoISQFormatTest {
    private static final Context context = new Context();

    private static final ScancoISQFormat.Checker checker = new ScancoISQFormat.Checker();

    private static final ScancoISQFormat format = new ScancoISQFormat();

    private static ScancoISQFormat.Parser parser;

    @BeforeClass
    public static void oneTimeSetup() throws Exception {
        AmplScancoISQFormatTest.format.setContext(AmplScancoISQFormatTest.context);
        AmplScancoISQFormatTest.parser = ((ScancoISQFormat.Parser) (AmplScancoISQFormatTest.format.createParser()));
    }

    @org.junit.AfterClass
    public static void oneTimeTearDown() {
        AmplScancoISQFormatTest.context.dispose();
    }

    @Test(timeout = 10000)
    public void testPopulateImageMetadata() throws Exception {
        final ScancoISQFormat.Metadata metadata = ((ScancoISQFormat.Metadata) (AmplScancoISQFormatTest.format.createMetadata()));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPatientIndex())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getScannerId())));
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getCreationDate());
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getWidth())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getHeight())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSlices())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPhysicalWidth())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPhysicalHeight())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPhysicalDepth())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSliceThickness())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSliceSpacing())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getFirstSlicePosition())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMinDataValue())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMaxDataValue())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMuScaling())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSamples())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getProjections())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getScanDistance())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getScannerType())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSamplingTime())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMeasurementIndex())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSite())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getReferenceLine())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getReconstructionAlgorithm())));
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getPatientName());
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getEnergy())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getIntensity())));
        Assert.assertEquals(512, ((int) (((ScancoISQFormat.Metadata) (metadata)).getDataOffset())));
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getSource());
        Assert.assertTrue(((ScancoISQFormat.Metadata) (metadata)).getAll().isEmpty());
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getImageCount())));
        Assert.assertFalse(((ScancoISQFormat.Metadata) (metadata)).isFiltered());
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getDatasetName());
        Assert.assertEquals(0L, ((long) (((ScancoISQFormat.Metadata) (metadata)).getDatasetSize())));
        Assert.assertTrue(((ScancoISQFormat.Metadata) (metadata)).getTable().isEmpty());
        Assert.assertEquals("Scanco ISQ", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getFormatName());
        Assert.assertTrue(((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).isEnabled());
        Assert.assertEquals("0.31.2-SNAPSHOT", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getVersion());
        Assert.assertEquals("plugin:io.scif.formats.ScancoISQFormat", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getIdentifier());
        Assert.assertFalse(((Context) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getContext())).getServiceIndex().isEmpty());
        Assert.assertFalse(((Context) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getContext())).getPluginIndex().isEmpty());
        Assert.assertTrue(((Context) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getContext())).isStrict());
        Assert.assertEquals(0.0, ((double) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getPriority())), 0.1);
        Assert.assertEquals("plugin:class io.scif.formats.ScancoISQFormat", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getIdentifier());
        Assert.assertEquals("0.31.2-SNAPSHOT", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getVersion());
        Assert.assertNull(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getIconURL());
        Assert.assertEquals("class=\'io.scif.formats.ScancoISQFormat\', name=\'Scanco ISQ\', priority=0.0, enabled=true, pluginType=Format", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).toString());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/scifio_parent/target/classes/", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getLocation());
        Assert.assertEquals("io.scif.formats.ScancoISQFormat", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getClassName());
        Assert.assertTrue(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isEnabled());
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getIconPath());
        Assert.assertTrue(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getMenuPath().isEmpty());
        Assert.assertEquals("app", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getMenuRoot());
        Assert.assertTrue(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isVisible());
        Assert.assertFalse(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isSelectable());
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getSelectionGroup());
        Assert.assertFalse(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isSelected());
        Assert.assertEquals(0.0, ((double) (((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getPriority())), 0.1);
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getDescription());
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getLabel());
        Assert.assertEquals("Scanco ISQ", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getName());
        Assert.assertEquals("Scanco ISQ", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getTitle());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/scifio_parent/target/classes/", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getLocation());
        Assert.assertEquals("Scanco ISQ", ((ScancoISQFormat.Metadata) (metadata)).getFormatName());
        Assert.assertEquals("0.31.2-SNAPSHOT", ((ScancoISQFormat.Metadata) (metadata)).getVersion());
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getInfo());
        Assert.assertEquals(0.0, ((double) (((ScancoISQFormat.Metadata) (metadata)).getPriority())), 0.1);
        Assert.assertFalse(((Context) (((ScancoISQFormat.Metadata) (metadata)).getContext())).getServiceIndex().isEmpty());
        Assert.assertFalse(((Context) (((ScancoISQFormat.Metadata) (metadata)).getContext())).getPluginIndex().isEmpty());
        Assert.assertTrue(((Context) (((ScancoISQFormat.Metadata) (metadata)).getContext())).isStrict());
        Assert.assertEquals("plugin:io.scif.formats.ScancoISQFormat$Metadata", ((ScancoISQFormat.Metadata) (metadata)).getIdentifier());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/scifio_parent/target/classes/", ((ScancoISQFormat.Metadata) (metadata)).getLocation());
        final int[] dimensions = new int[]{ 15, 14, 13 };
        final int[] physicalDimensions = new int[]{ 45, 35, 20 };
        final double[] voxelDimensions = IntStream.range(0, 3).mapToDouble(( i) -> (1.0 * (physicalDimensions[i])) / (dimensions[i])).toArray();
        metadata.setPhysicalWidth(physicalDimensions[0]);
        metadata.setPhysicalHeight(physicalDimensions[1]);
        metadata.setPhysicalDepth(physicalDimensions[2]);
        metadata.setWidth(dimensions[0]);
        metadata.setHeight(dimensions[1]);
        metadata.setSlices(dimensions[2]);
        metadata.populateImageMetadata();
        final ImageMetadata imgMeta = metadata.get(0);
        imgMeta.isLittleEndian();
        imgMeta.isOrderCertain();
        imgMeta.getBitsPerPixel();
        imgMeta.getPixelType();
        imgMeta.getPlanarAxisCount();
        final List<CalibratedAxis> axes = imgMeta.getAxes();
        int o_testPopulateImageMetadata__27 = axes.size();
        Assert.assertEquals(3, ((int) (o_testPopulateImageMetadata__27)));
        for (int i = 0; i < 3; i++) {
            int int_0 = dimensions[i];
            imgMeta.getAxisLength(i);
            double double_1 = voxelDimensions[i];
            axes.get(i).averageScale(0, 1);
        }
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPatientIndex())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getScannerId())));
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getCreationDate());
        Assert.assertEquals(15, ((int) (((ScancoISQFormat.Metadata) (metadata)).getWidth())));
        Assert.assertEquals(14, ((int) (((ScancoISQFormat.Metadata) (metadata)).getHeight())));
        Assert.assertEquals(13, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSlices())));
        Assert.assertEquals(45, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPhysicalWidth())));
        Assert.assertEquals(35, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPhysicalHeight())));
        Assert.assertEquals(20, ((int) (((ScancoISQFormat.Metadata) (metadata)).getPhysicalDepth())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSliceThickness())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSliceSpacing())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getFirstSlicePosition())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMinDataValue())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMaxDataValue())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMuScaling())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSamples())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getProjections())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getScanDistance())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getScannerType())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSamplingTime())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getMeasurementIndex())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getSite())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getReferenceLine())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getReconstructionAlgorithm())));
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getPatientName());
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getEnergy())));
        Assert.assertEquals(0, ((int) (((ScancoISQFormat.Metadata) (metadata)).getIntensity())));
        Assert.assertEquals(512, ((int) (((ScancoISQFormat.Metadata) (metadata)).getDataOffset())));
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getSource());
        Assert.assertFalse(((ScancoISQFormat.Metadata) (metadata)).getAll().isEmpty());
        Assert.assertEquals(1, ((int) (((ScancoISQFormat.Metadata) (metadata)).getImageCount())));
        Assert.assertFalse(((ScancoISQFormat.Metadata) (metadata)).isFiltered());
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getDatasetName());
        Assert.assertEquals(5460L, ((long) (((ScancoISQFormat.Metadata) (metadata)).getDatasetSize())));
        Assert.assertTrue(((ScancoISQFormat.Metadata) (metadata)).getTable().isEmpty());
        Assert.assertEquals("Scanco ISQ", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getFormatName());
        Assert.assertTrue(((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).isEnabled());
        Assert.assertEquals("0.31.2-SNAPSHOT", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getVersion());
        Assert.assertEquals("plugin:io.scif.formats.ScancoISQFormat", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getIdentifier());
        Assert.assertFalse(((Context) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getContext())).getServiceIndex().isEmpty());
        Assert.assertFalse(((Context) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getContext())).getPluginIndex().isEmpty());
        Assert.assertTrue(((Context) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getContext())).isStrict());
        Assert.assertEquals(0.0, ((double) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getPriority())), 0.1);
        Assert.assertEquals("plugin:class io.scif.formats.ScancoISQFormat", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getIdentifier());
        Assert.assertEquals("0.31.2-SNAPSHOT", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getVersion());
        Assert.assertNull(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getIconURL());
        Assert.assertEquals("class=\'io.scif.formats.ScancoISQFormat\', name=\'Scanco ISQ\', priority=0.0, enabled=true, pluginType=Format", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).toString());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/scifio_parent/target/classes/", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getLocation());
        Assert.assertEquals("io.scif.formats.ScancoISQFormat", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getClassName());
        Assert.assertTrue(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isEnabled());
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getIconPath());
        Assert.assertTrue(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getMenuPath().isEmpty());
        Assert.assertEquals("app", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getMenuRoot());
        Assert.assertTrue(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isVisible());
        Assert.assertFalse(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isSelectable());
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getSelectionGroup());
        Assert.assertFalse(((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).isSelected());
        Assert.assertEquals(0.0, ((double) (((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getPriority())), 0.1);
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getDescription());
        Assert.assertEquals("", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getLabel());
        Assert.assertEquals("Scanco ISQ", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getName());
        Assert.assertEquals("Scanco ISQ", ((PluginInfo) (((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getInfo())).getTitle());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/scifio_parent/target/classes/", ((Format) (((ScancoISQFormat.Metadata) (metadata)).getFormat())).getLocation());
        Assert.assertEquals("Scanco ISQ", ((ScancoISQFormat.Metadata) (metadata)).getFormatName());
        Assert.assertEquals("0.31.2-SNAPSHOT", ((ScancoISQFormat.Metadata) (metadata)).getVersion());
        Assert.assertNull(((ScancoISQFormat.Metadata) (metadata)).getInfo());
        Assert.assertEquals(0.0, ((double) (((ScancoISQFormat.Metadata) (metadata)).getPriority())), 0.1);
        Assert.assertFalse(((Context) (((ScancoISQFormat.Metadata) (metadata)).getContext())).getServiceIndex().isEmpty());
        Assert.assertFalse(((Context) (((ScancoISQFormat.Metadata) (metadata)).getContext())).getPluginIndex().isEmpty());
        Assert.assertTrue(((Context) (((ScancoISQFormat.Metadata) (metadata)).getContext())).isStrict());
        Assert.assertEquals("plugin:io.scif.formats.ScancoISQFormat$Metadata", ((ScancoISQFormat.Metadata) (metadata)).getIdentifier());
        Assert.assertEquals("file:/tmp/icst-2019/september-2018/dataset/scifio_parent/target/classes/", ((ScancoISQFormat.Metadata) (metadata)).getLocation());
        Assert.assertEquals(3, ((int) (o_testPopulateImageMetadata__27)));
    }
}

