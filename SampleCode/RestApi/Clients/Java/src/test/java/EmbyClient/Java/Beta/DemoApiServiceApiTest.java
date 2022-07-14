/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyPluginGenericEditDemoDataDemoTypeInfo;
import io.swagger.client.model.EmbyWebGenericEditEditObjectContainer;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DemoApiServiceApi
 */
@Ignore
public class DemoApiServiceApiTest {

    private final DemoApiServiceApi api = new DemoApiServiceApi();

    /**
     * Gets GenericEdit demo data
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGenericeditdemoDemoTest() throws Exception {
        Integer demoSet = null;
        Integer demoType = null;
        EmbyWebGenericEditEditObjectContainer response = api.getGenericeditdemoDemo(demoSet, demoType);

        // TODO: test validations
    }
    /**
     * Gets a list of demos
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGenericeditdemoDemotypesTest() throws Exception {
        Integer demoSet = null;
        List<EmbyPluginGenericEditDemoDataDemoTypeInfo> response = api.getGenericeditdemoDemotypes(demoSet);

        // TODO: test validations
    }
    /**
     * Updates GenericEdit demo data
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postGenericeditdemoDemoTest() throws Exception {
        Object body = null;
        Integer demoSet = null;
        Integer demoType = null;
        api.postGenericeditdemoDemo(body, demoSet, demoType);

        // TODO: test validations
    }
}
