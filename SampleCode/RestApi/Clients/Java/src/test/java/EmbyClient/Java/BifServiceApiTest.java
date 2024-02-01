/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.RokuMetadataApiThumbnailSetInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BifServiceApi
 */
@Ignore
public class BifServiceApiTest {

    private final BifServiceApi api = new BifServiceApi();

    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdThumbnailsetTest() throws Exception {
        Integer width = null;
        String id = null;
        RokuMetadataApiThumbnailSetInfo response = api.getItemsByIdThumbnailset(width, id);

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
    public void getVideosByIdIndexBifTest() throws Exception {
        Integer width = null;
        String id = null;
        api.getVideosByIdIndexBif(width, id);

        // TODO: test validations
    }
}
