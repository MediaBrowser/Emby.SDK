/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.AllThemeMediaResult;
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.ItemCounts;
import io.swagger.client.model.LibraryDeleteInfo;
import io.swagger.client.model.LibraryLibraryOptionsResult;
import io.swagger.client.model.LibraryMediaFolder;
import io.swagger.client.model.LibraryPostUpdatedMedia;
import io.swagger.client.model.PersistenceIntroDebugInfo;
import io.swagger.client.model.QueryResultBaseItemDto;
import io.swagger.client.model.ThemeMediaResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LibraryServiceApi
 */
@Ignore
public class LibraryServiceApiTest {

    private final LibraryServiceApi api = new LibraryServiceApi();

    /**
     * Deletes an item from the library and file system
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteItemsTest() throws Exception {
        String ids = null;
        api.deleteItems(ids);

        // TODO: test validations
    }
    /**
     * Deletes an item from the library and file system
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteItemsByIdTest() throws Exception {
        String id = null;
        api.deleteItemsById(id);

        // TODO: test validations
    }
    /**
     * Finds albums similar to a given album.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlbumsByIdSimilarTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getAlbumsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Finds albums similar to a given album.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArtistsByIdSimilarTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getArtistsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Finds games similar to a given game.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGamesByIdSimilarTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getGamesByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Gets all parents of an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdAncestorsTest() throws Exception {
        String id = null;
        String userId = null;
        List<BaseItemDto> response = api.getItemsByIdAncestors(id, userId);

        // TODO: test validations
    }
    /**
     * Gets critic reviews for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdCriticreviewsTest() throws Exception {
        String id = null;
        Integer startIndex = null;
        Integer limit = null;
        QueryResultBaseItemDto response = api.getItemsByIdCriticreviews(id, startIndex, limit);

        // TODO: test validations
    }
    /**
     * Gets delete info for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdDeleteinfoTest() throws Exception {
        String id = null;
        LibraryDeleteInfo response = api.getItemsByIdDeleteinfo(id);

        // TODO: test validations
    }
    /**
     * Downloads item media
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdDownloadTest() throws Exception {
        String id = null;
        api.getItemsByIdDownload(id);

        // TODO: test validations
    }
    /**
     * Gets the original file of an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdFileTest() throws Exception {
        String id = null;
        api.getItemsByIdFile(id);

        // TODO: test validations
    }
    /**
     * Gets similar items
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdSimilarTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getItemsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Gets theme videos and songs for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdThememediaTest() throws Exception {
        String id = null;
        String userId = null;
        Boolean inheritFromParent = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        String fields = null;
        AllThemeMediaResult response = api.getItemsByIdThememedia(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields);

        // TODO: test validations
    }
    /**
     * Gets theme songs for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdThemesongsTest() throws Exception {
        String id = null;
        String userId = null;
        Boolean inheritFromParent = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        String fields = null;
        ThemeMediaResult response = api.getItemsByIdThemesongs(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields);

        // TODO: test validations
    }
    /**
     * Gets theme videos for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdThemevideosTest() throws Exception {
        String id = null;
        String userId = null;
        Boolean inheritFromParent = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        String fields = null;
        ThemeMediaResult response = api.getItemsByIdThemevideos(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields);

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
    public void getItemsCountsTest() throws Exception {
        String userId = null;
        Boolean isFavorite = null;
        ItemCounts response = api.getItemsCounts(userId, isFavorite);

        // TODO: test validations
    }
    /**
     * Gets info to debug intros
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsIntrosTest() throws Exception {
        List<PersistenceIntroDebugInfo> response = api.getItemsIntros();

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
    public void getLibrariesAvailableoptionsTest() throws Exception {
        LibraryLibraryOptionsResult response = api.getLibrariesAvailableoptions();

        // TODO: test validations
    }
    /**
     * Gets all user media folders.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLibraryMediafoldersTest() throws Exception {
        Boolean isHidden = null;
        QueryResultBaseItemDto response = api.getLibraryMediafolders(isHidden);

        // TODO: test validations
    }
    /**
     * Gets a list of physical paths from virtual folders
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLibraryPhysicalpathsTest() throws Exception {
        List<String> response = api.getLibraryPhysicalpaths();

        // TODO: test validations
    }
    /**
     * Gets all user media folders.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLibrarySelectablemediafoldersTest() throws Exception {
        List<LibraryMediaFolder> response = api.getLibrarySelectablemediafolders();

        // TODO: test validations
    }
    /**
     * Finds movies and trailers similar to a given movie.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMoviesByIdSimilarTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getMoviesByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Finds tv shows similar to a given one.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getShowsByIdSimilarTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getShowsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Finds movies and trailers similar to a given trailer.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTrailersByIdSimilarTest() throws Exception {
        String id = null;
        String includeItemTypes = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String userId = null;
        Integer limit = null;
        String fields = null;
        QueryResultBaseItemDto response = api.getTrailersByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);

        // TODO: test validations
    }
    /**
     * Deletes an item from the library and file system
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdDeleteTest() throws Exception {
        String id = null;
        api.postItemsByIdDelete(id);

        // TODO: test validations
    }
    /**
     * Deletes an item from the library and file system
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsDeleteTest() throws Exception {
        String ids = null;
        api.postItemsDelete(ids);

        // TODO: test validations
    }
    /**
     * Reports that new movies have been added by an external source
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryMediaUpdatedTest() throws Exception {
        LibraryPostUpdatedMedia body = null;
        api.postLibraryMediaUpdated(body);

        // TODO: test validations
    }
    /**
     * Deprecated. Use /Library/Media/Updated
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryMoviesAddedTest() throws Exception {
        api.postLibraryMoviesAdded();

        // TODO: test validations
    }
    /**
     * Deprecated. Use /Library/Media/Updated
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryMoviesUpdatedTest() throws Exception {
        api.postLibraryMoviesUpdated();

        // TODO: test validations
    }
    /**
     * Starts a library scan
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryRefreshTest() throws Exception {
        api.postLibraryRefresh();

        // TODO: test validations
    }
    /**
     * Deprecated. Use /Library/Media/Updated
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibrarySeriesAddedTest() throws Exception {
        api.postLibrarySeriesAdded();

        // TODO: test validations
    }
    /**
     * Deprecated. Use /Library/Media/Updated
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibrarySeriesUpdatedTest() throws Exception {
        api.postLibrarySeriesUpdated();

        // TODO: test validations
    }
}
