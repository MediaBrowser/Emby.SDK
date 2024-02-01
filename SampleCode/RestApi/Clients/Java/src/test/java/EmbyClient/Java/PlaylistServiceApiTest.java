/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.PlaylistsAddToPlaylistResult;
import io.swagger.client.model.PlaylistsPlaylistCreationResult;
import io.swagger.client.model.QueryResultBaseItemDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PlaylistServiceApi
 */
@Ignore
public class PlaylistServiceApiTest {

    private final PlaylistServiceApi api = new PlaylistServiceApi();

    /**
     * Removes items from a playlist
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePlaylistsByIdItemsTest() throws Exception {
        String id = null;
        String entryIds = null;
        api.deletePlaylistsByIdItems(id, entryIds);

        // TODO: test validations
    }
    /**
     * Gets add to playlist info
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPlaylistsByIdAddtoplaylistinfoTest() throws Exception {
        String ids = null;
        String id = null;
        String userId = null;
        Object response = api.getPlaylistsByIdAddtoplaylistinfo(ids, id, userId);

        // TODO: test validations
    }
    /**
     * Gets the original items of a playlist
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPlaylistsByIdItemsTest() throws Exception {
        String id = null;
        String userId = null;
        Integer startIndex = null;
        Integer limit = null;
        String fields = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        QueryResultBaseItemDto response = api.getPlaylistsByIdItems(id, userId, startIndex, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes);

        // TODO: test validations
    }
    /**
     * Creates a new playlist
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPlaylistsTest() throws Exception {
        String name = null;
        String ids = null;
        String mediaType = null;
        PlaylistsPlaylistCreationResult response = api.postPlaylists(name, ids, mediaType);

        // TODO: test validations
    }
    /**
     * Adds items to a playlist
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPlaylistsByIdItemsTest() throws Exception {
        String ids = null;
        String id = null;
        String userId = null;
        PlaylistsAddToPlaylistResult response = api.postPlaylistsByIdItems(ids, id, userId);

        // TODO: test validations
    }
    /**
     * Moves a playlist item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPlaylistsByIdItemsByItemidMoveByNewindexTest() throws Exception {
        Long itemId = null;
        String id = null;
        Integer newIndex = null;
        api.postPlaylistsByIdItemsByItemidMoveByNewindex(itemId, id, newIndex);

        // TODO: test validations
    }
    /**
     * Removes items from a playlist
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPlaylistsByIdItemsDeleteTest() throws Exception {
        String id = null;
        String entryIds = null;
        api.postPlaylistsByIdItemsDelete(id, entryIds);

        // TODO: test validations
    }
}
