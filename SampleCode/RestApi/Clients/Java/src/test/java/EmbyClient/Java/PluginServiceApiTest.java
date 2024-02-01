/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.PluginsPluginInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PluginServiceApi
 */
@Ignore
public class PluginServiceApiTest {

    private final PluginServiceApi api = new PluginServiceApi();

    /**
     * Uninstalls a plugin
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePluginsByIdTest() throws Exception {
        String id = null;
        api.deletePluginsById(id);

        // TODO: test validations
    }
    /**
     * Gets a list of currently installed plugins
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPluginsTest() throws Exception {
        List<PluginsPluginInfo> response = api.getPlugins();

        // TODO: test validations
    }
    /**
     * Gets a plugin&#x27;s configuration
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPluginsByIdConfigurationTest() throws Exception {
        String id = null;
        api.getPluginsByIdConfiguration(id);

        // TODO: test validations
    }
    /**
     * Gets a plugin thumb image
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPluginsByIdThumbTest() throws Exception {
        String id = null;
        api.getPluginsByIdThumb(id);

        // TODO: test validations
    }
    /**
     * Updates a plugin&#x27;s configuration
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPluginsByIdConfigurationTest() throws Exception {
        Object body = null;
        String id = null;
        api.postPluginsByIdConfiguration(body, id);

        // TODO: test validations
    }
    /**
     * Uninstalls a plugin
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPluginsByIdDeleteTest() throws Exception {
        String id = null;
        api.postPluginsByIdDelete(id);

        // TODO: test validations
    }
}
