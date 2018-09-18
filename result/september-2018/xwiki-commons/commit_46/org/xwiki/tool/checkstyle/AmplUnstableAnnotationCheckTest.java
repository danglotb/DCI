package org.xwiki.tool.checkstyle;


import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import org.junit.Before;


public class AmplUnstableAnnotationCheckTest extends AbstractModuleTestSupport {
    private DefaultConfiguration checkConfig;

    @Before
    public void setUp() {
        this.checkConfig = AbstractModuleTestSupport.createModuleConfig(UnstableAnnotationCheck.class);
        this.checkConfig.addAttribute("currentVersion", "8.1-SNAPSHOT");
    }

    @Override
    protected String getPackageLocation() {
        return "org/xwiki/tool/checkstyle/test/unstable";
    }
}

