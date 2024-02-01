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
 * API tests for InstantMixServiceApi
 */
@Ignore
public class InstantMixServiceApiTest {

    private final InstantMixServiceApi api = new InstantMixServiceApi();

    /**
     * Creates an instant playlist based on a given album
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlbumsByIdInstantmixTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getAlbumsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Creates an instant playlist based on a given artist
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArtistsInstantmixTest() throws Exception {
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getArtistsInstantmix(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Gets a list of next up episodes
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudiobooksNextupTest() throws Exception {
        String userId = null;
        Integer startIndex = null;
        Integer limit = null;
        String fields = null;
        String albumId = null;
        String parentId = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        QueryResultBaseItemDto response = api.getAudiobooksNextup(userId, startIndex, limit, fields, albumId, parentId, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
    /**
     * Creates an instant playlist based on a given item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdInstantmixTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getItemsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Creates an instant playlist based on a music genre
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMusicgenresByNameInstantmixTest() throws Exception {
        String name = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getMusicgenresByNameInstantmix(name, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Creates an instant playlist based on a music genre
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMusicgenresInstantmixTest() throws Exception {
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getMusicgenresInstantmix(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Creates an instant playlist based on a given playlist
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPlaylistsByIdInstantmixTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getPlaylistsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Creates an instant playlist based on a given song
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSongsByIdInstantmixTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getSongsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
}
