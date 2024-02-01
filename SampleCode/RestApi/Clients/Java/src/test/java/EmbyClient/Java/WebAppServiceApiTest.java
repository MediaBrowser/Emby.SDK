/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ApiConfigurationPageInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WebAppServiceApi
 */
@Ignore
public class WebAppServiceApiTest {

    private final WebAppServiceApi api = new WebAppServiceApi();

    /**
     * 
     *
     * Requires authentication as user
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
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebConfigurationpagesTest() throws Exception {
        List<ApiConfigurationPageInfo> response = api.getWebConfigurationpages();

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebStringsTest() throws Exception {
        api.getWebStrings();

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebStringsetTest() throws Exception {
        List<String> response = api.getWebStringset();

        // TODO: test validations
    }
}
