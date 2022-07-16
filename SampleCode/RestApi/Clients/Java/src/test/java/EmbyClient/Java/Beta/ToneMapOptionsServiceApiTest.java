/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyWebGenericEditEditObjectContainer;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ToneMapOptionsServiceApi
 */
@Ignore
public class ToneMapOptionsServiceApiTest {

    private final ToneMapOptionsServiceApi api = new ToneMapOptionsServiceApi();

    /**
     * Gets the tone mapping options
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingFulltonemapoptionsTest() throws Exception {
        EmbyWebGenericEditEditObjectContainer response = api.getEncodingFulltonemapoptions();

        // TODO: test validations
    }
    /**
     * Gets the tone mapping options
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingPublictonemapoptionsTest() throws Exception {
        EmbyWebGenericEditEditObjectContainer response = api.getEncodingPublictonemapoptions();

        // TODO: test validations
    }
    /**
     * Updates the tone mapping options
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingFulltonemapoptionsTest() throws Exception {
        Object body = null;
        api.postEncodingFulltonemapoptions(body);

        // TODO: test validations
    }
    /**
     * Updates the tone mapping options
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingPublictonemapoptionsTest() throws Exception {
        Object body = null;
        api.postEncodingPublictonemapoptions(body);

        // TODO: test validations
    }
}
