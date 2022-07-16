/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.ProvidersMetadataRefreshMode;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ItemRefreshServiceApi
 */
@Ignore
public class ItemRefreshServiceApiTest {

    private final ItemRefreshServiceApi api = new ItemRefreshServiceApi();

    /**
     * Refreshes metadata for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdRefreshTest() throws Exception {
        String id = null;
        Boolean recursive = null;
        ProvidersMetadataRefreshMode metadataRefreshMode = null;
        ProvidersMetadataRefreshMode imageRefreshMode = null;
        Boolean replaceAllMetadata = null;
        Boolean replaceAllImages = null;
        api.postItemsByIdRefresh(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages);

        // TODO: test validations
    }
}
