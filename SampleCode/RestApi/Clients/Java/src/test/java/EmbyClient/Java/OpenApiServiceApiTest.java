/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OpenApiServiceApi
 */
@Ignore
public class OpenApiServiceApiTest {

    private final OpenApiServiceApi api = new OpenApiServiceApi();

    /**
     * Gets the OpenAPI 3 specifications
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOpenapiTest() throws Exception {
        String response = api.getOpenapi();

        // TODO: test validations
    }
    /**
     * Gets OpenAPI 3 specifications
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOpenapiJsonTest() throws Exception {
        String response = api.getOpenapiJson();

        // TODO: test validations
    }
    /**
     * Gets the swagger specifications
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSwaggerTest() throws Exception {
        String response = api.getSwagger();

        // TODO: test validations
    }
    /**
     * Gets the swagger specifications
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSwaggerJsonTest() throws Exception {
        String response = api.getSwaggerJson();

        // TODO: test validations
    }
}
