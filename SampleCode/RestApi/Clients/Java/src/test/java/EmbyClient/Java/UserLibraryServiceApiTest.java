/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.QueryResultBaseItemDto;
import io.swagger.client.model.UserItemDataDto;
import io.swagger.client.model.UserLibraryLeaveSharedItems;
import io.swagger.client.model.UserLibraryUpdateUserItemAccess;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserLibraryServiceApi
 */
@Ignore
public class UserLibraryServiceApiTest {

    private final UserLibraryServiceApi api = new UserLibraryServiceApi();

    /**
     * Unmarks an item as a favorite
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByUseridFavoriteitemsByIdTest() throws Exception {
        String userId = null;
        String id = null;
        UserItemDataDto response = api.deleteUsersByUseridFavoriteitemsById(userId, id);

        // TODO: test validations
    }
    /**
     * Deletes a user&#x27;s saved personal rating for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByUseridItemsByIdRatingTest() throws Exception {
        String userId = null;
        String id = null;
        UserItemDataDto response = api.deleteUsersByUseridItemsByIdRating(userId, id);

        // TODO: test validations
    }
    /**
     * Gets a live tv program
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvProgramsByIdTest() throws Exception {
        String id = null;
        BaseItemDto response = api.getLivetvProgramsById(id);

        // TODO: test validations
    }
    /**
     * Gets an item from a user&#x27;s library
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridItemsByIdTest() throws Exception {
        String userId = null;
        String id = null;
        BaseItemDto response = api.getUsersByUseridItemsById(userId, id);

        // TODO: test validations
    }
    /**
     * Gets intros to play before the main media item plays
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridItemsByIdIntrosTest() throws Exception {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        QueryResultBaseItemDto response = api.getUsersByUseridItemsByIdIntros(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
    /**
     * Gets local trailers for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridItemsByIdLocaltrailersTest() throws Exception {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        List<BaseItemDto> response = api.getUsersByUseridItemsByIdLocaltrailers(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
    /**
     * Gets special features for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridItemsByIdSpecialfeaturesTest() throws Exception {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        List<BaseItemDto> response = api.getUsersByUseridItemsByIdSpecialfeatures(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
    /**
     * Gets latest media
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridItemsLatestTest() throws Exception {
        String userId = null;
        Integer limit = null;
        String parentId = null;
        String fields = null;
        String includeItemTypes = null;
        String mediaTypes = null;
        Boolean isFolder = null;
        Boolean isPlayed = null;
        Boolean groupItems = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        List<BaseItemDto> response = api.getUsersByUseridItemsLatest(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
    /**
     * Gets the root folder from a user&#x27;s library
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridItemsRootTest() throws Exception {
        String userId = null;
        BaseItemDto response = api.getUsersByUseridItemsRoot(userId);

        // TODO: test validations
    }
    /**
     * Gets additional parts for a video.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdAdditionalpartsTest() throws Exception {
        String id = null;
        String userId = null;
        String fields = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        QueryResultBaseItemDto response = api.getVideosByIdAdditionalparts(id, userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
    /**
     * Updates user item access
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsAccessTest() throws Exception {
        UserLibraryUpdateUserItemAccess body = null;
        api.postItemsAccess(body);

        // TODO: test validations
    }
    /**
     * Makes an item private
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdMakeprivateTest() throws Exception {
        String id = null;
        api.postItemsByIdMakeprivate(id);

        // TODO: test validations
    }
    /**
     * Makes an item public to all users
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdMakepublicTest() throws Exception {
        String id = null;
        api.postItemsByIdMakepublic(id);

        // TODO: test validations
    }
    /**
     * Leaves a shared item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsSharedLeaveTest() throws Exception {
        UserLibraryLeaveSharedItems body = null;
        api.postItemsSharedLeave(body);

        // TODO: test validations
    }
    /**
     * Marks an item as a favorite
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridFavoriteitemsByIdTest() throws Exception {
        String userId = null;
        String id = null;
        UserItemDataDto response = api.postUsersByUseridFavoriteitemsById(userId, id);

        // TODO: test validations
    }
    /**
     * Unmarks an item as a favorite
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridFavoriteitemsByIdDeleteTest() throws Exception {
        String userId = null;
        String id = null;
        UserItemDataDto response = api.postUsersByUseridFavoriteitemsByIdDelete(userId, id);

        // TODO: test validations
    }
    /**
     * Updates a user&#x27;s hide from resume for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridItemsByIdHidefromresumeTest() throws Exception {
        String userId = null;
        String id = null;
        Boolean hide = null;
        UserItemDataDto response = api.postUsersByUseridItemsByIdHidefromresume(userId, id, hide);

        // TODO: test validations
    }
    /**
     * Updates a user&#x27;s rating for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridItemsByIdRatingTest() throws Exception {
        String userId = null;
        String id = null;
        Boolean likes = null;
        UserItemDataDto response = api.postUsersByUseridItemsByIdRating(userId, id, likes);

        // TODO: test validations
    }
    /**
     * Deletes a user&#x27;s saved personal rating for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridItemsByIdRatingDeleteTest() throws Exception {
        String userId = null;
        String id = null;
        UserItemDataDto response = api.postUsersByUseridItemsByIdRatingDelete(userId, id);

        // TODO: test validations
    }
}
