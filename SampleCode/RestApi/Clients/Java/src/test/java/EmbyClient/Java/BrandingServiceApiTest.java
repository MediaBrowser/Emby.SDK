/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.BrandingBrandingOptions;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BrandingServiceApi
 */
@Ignore
public class BrandingServiceApiTest {

    private final BrandingServiceApi api = new BrandingServiceApi();

    /**
     * Gets branding configuration
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBrandingConfigurationTest() throws Exception {
        BrandingBrandingOptions response = api.getBrandingConfiguration();

        // TODO: test validations
    }
    /**
     * Gets custom css
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBrandingCssTest() throws Exception {
        api.getBrandingCss();

        // TODO: test validations
    }
    /**
     * Gets custom css
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBrandingCssCssTest() throws Exception {
        api.getBrandingCssCss();

        // TODO: test validations
    }
}
