/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.FeatureInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FeatureServiceApi
 */
@Ignore
public class FeatureServiceApiTest {

    private final FeatureServiceApi api = new FeatureServiceApi();

    /**
     * Gets a list of installed features
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFeaturesTest() throws Exception {
        List<FeatureInfo> response = api.getFeatures();

        // TODO: test validations
    }
}
