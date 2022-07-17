/*
 * Emby Server REST API (BETA)
 * 
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyWebApiConfigurationPageInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DashboardServiceApi
 */
@Ignore
public class DashboardServiceApiTest {

    private final DashboardServiceApi api = new DashboardServiceApi();

    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebConfigurationpageTest() throws Exception {
        api.getWebConfigurationpage();

        // TODO: test validations
    }
    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebConfigurationpagesTest() throws Exception {
        List<EmbyWebApiConfigurationPageInfo> response = api.getWebConfigurationpages();

        // TODO: test validations
    }
    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebStringsTest() throws Exception {
        api.getWebStrings();

        // TODO: test validations
    }
}
