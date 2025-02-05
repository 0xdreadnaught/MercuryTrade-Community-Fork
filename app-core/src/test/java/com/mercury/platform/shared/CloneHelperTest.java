package com.mercury.platform.shared;

import com.mercury.platform.shared.config.configration.impl.adr.AdrConfigurationServiceMock;
import com.mercury.platform.shared.config.descriptor.adr.AdrIconDescriptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CloneHelperTest {
    @Test
    public void cloneObject() throws Exception {
        AdrConfigurationServiceMock config = new AdrConfigurationServiceMock(null);
        AdrIconDescriptor sourceIcon = config.getDefaultIcon();
        AdrIconDescriptor cloned = CloneHelper.cloneObject(sourceIcon);
        cloned.setComponentId(cloned.getComponentId() + 10341);
        assertNotEquals(sourceIcon,cloned);
    }
}