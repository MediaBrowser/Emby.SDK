/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.MetadataRefreshMode;
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
        MetadataRefreshMode metadataRefreshMode = null;
        MetadataRefreshMode imageRefreshMode = null;
        Boolean replaceAllMetadata = null;
        Boolean replaceAllImages = null;
        api.postItemsByIdRefresh(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages);

        // TODO: test validations
    }
}
