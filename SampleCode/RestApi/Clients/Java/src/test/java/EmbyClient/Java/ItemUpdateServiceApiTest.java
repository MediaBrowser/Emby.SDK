/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.MetadataEditorInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ItemUpdateServiceApi
 */
@Ignore
public class ItemUpdateServiceApiTest {

    private final ItemUpdateServiceApi api = new ItemUpdateServiceApi();

    /**
     * Gets metadata editor info for an item
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByItemidMetadataeditorTest() throws Exception {
        String itemId = null;
        MetadataEditorInfo response = api.getItemsByItemidMetadataeditor(itemId);

        // TODO: test validations
    }
    /**
     * Updates an item
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByItemidTest() throws Exception {
        BaseItemDto body = null;
        String itemId = null;
        api.postItemsByItemid(body, itemId);

        // TODO: test validations
    }
}
