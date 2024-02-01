/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.QueryResultBaseItemDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ChannelServiceApi
 */
@Ignore
public class ChannelServiceApiTest {

    private final ChannelServiceApi api = new ChannelServiceApi();

    /**
     * Gets available channels
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getChannelsTest() throws Exception {
        String userId = null;
        Integer startIndex = null;
        String fields = null;
        Integer limit = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        QueryResultBaseItemDto response = api.getChannels(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
}
