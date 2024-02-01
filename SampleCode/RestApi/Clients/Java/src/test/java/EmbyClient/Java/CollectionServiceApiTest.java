/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.CollectionsCollectionCreationResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CollectionServiceApi
 */
@Ignore
public class CollectionServiceApiTest {

    private final CollectionServiceApi api = new CollectionServiceApi();

    /**
     * Removes items from a collection
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionsByIdItemsTest() throws Exception {
        String ids = null;
        String id = null;
        api.deleteCollectionsByIdItems(ids, id);

        // TODO: test validations
    }
    /**
     * Creates a new collection
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postCollectionsTest() throws Exception {
        Boolean isLocked = null;
        String name = null;
        String parentId = null;
        String ids = null;
        CollectionsCollectionCreationResult response = api.postCollections(isLocked, name, parentId, ids);

        // TODO: test validations
    }
    /**
     * Adds items to a collection
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postCollectionsByIdItemsTest() throws Exception {
        String ids = null;
        String id = null;
        api.postCollectionsByIdItems(ids, id);

        // TODO: test validations
    }
    /**
     * Removes items from a collection
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postCollectionsByIdItemsDeleteTest() throws Exception {
        String ids = null;
        String id = null;
        api.postCollectionsByIdItemsDelete(ids, id);

        // TODO: test validations
    }
}
