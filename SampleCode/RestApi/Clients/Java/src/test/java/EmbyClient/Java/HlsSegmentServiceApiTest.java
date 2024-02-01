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
 * API tests for HlsSegmentServiceApi
 */
@Ignore
public class HlsSegmentServiceApiTest {

    private final HlsSegmentServiceApi api = new HlsSegmentServiceApi();

    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteVideosActiveencodingsTest() throws Exception {
        String deviceId = null;
        String playSessionId = null;
        api.deleteVideosActiveencodings(deviceId, playSessionId);

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
    public void postVideosActiveencodingsDeleteTest() throws Exception {
        String deviceId = null;
        String playSessionId = null;
        api.postVideosActiveencodingsDelete(deviceId, playSessionId);

        // TODO: test validations
    }
}
