/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.ConfigurationServerConfiguration;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ConfigurationServiceApi
 */
@Ignore
public class ConfigurationServiceApiTest {

    private final ConfigurationServiceApi api = new ConfigurationServiceApi();

    /**
     * Gets application configuration
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemConfigurationTest() throws Exception {
        ConfigurationServerConfiguration response = api.getSystemConfiguration();

        // TODO: test validations
    }
    /**
     * Gets a named configuration
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemConfigurationByKeyTest() throws Exception {
        String key = null;
        api.getSystemConfigurationByKey(key);

        // TODO: test validations
    }
    /**
     * Updates application configuration
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSystemConfigurationTest() throws Exception {
        ConfigurationServerConfiguration body = null;
        api.postSystemConfiguration(body);

        // TODO: test validations
    }
    /**
     * Updates named configuration
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSystemConfigurationByKeyTest() throws Exception {
        Object body = null;
        String key = null;
        api.postSystemConfigurationByKey(body, key);

        // TODO: test validations
    }
}