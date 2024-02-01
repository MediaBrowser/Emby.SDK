/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.EditObjectContainer;
import io.swagger.client.model.MediaEncodingCodecParameterContext;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CodecParameterServiceApi
 */
@Ignore
public class CodecParameterServiceApiTest {

    private final CodecParameterServiceApi api = new CodecParameterServiceApi();

    /**
     * Gets the parameters for a specified codec.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingCodecparametersTest() throws Exception {
        String codecId = null;
        MediaEncodingCodecParameterContext parameterContext = null;
        EditObjectContainer response = api.getEncodingCodecparameters(codecId, parameterContext);

        // TODO: test validations
    }
    /**
     * Updates the parameters for a specified codec.
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingCodecparametersTest() throws Exception {
        Object body = null;
        String codecId = null;
        MediaEncodingCodecParameterContext parameterContext = null;
        api.postEncodingCodecparameters(body, codecId, parameterContext);

        // TODO: test validations
    }
}
