/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ExternalIdInfo;
import io.swagger.client.model.RemoteSearchQueryAlbumInfo;
import io.swagger.client.model.RemoteSearchQueryArtistInfo;
import io.swagger.client.model.RemoteSearchQueryBookInfo;
import io.swagger.client.model.RemoteSearchQueryGameInfo;
import io.swagger.client.model.RemoteSearchQueryItemLookupInfo;
import io.swagger.client.model.RemoteSearchQueryMovieInfo;
import io.swagger.client.model.RemoteSearchQueryMusicVideoInfo;
import io.swagger.client.model.RemoteSearchQueryPersonLookupInfo;
import io.swagger.client.model.RemoteSearchQuerySeriesInfo;
import io.swagger.client.model.RemoteSearchQueryTrailerInfo;
import io.swagger.client.model.RemoteSearchResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ItemLookupServiceApi
 */
@Ignore
public class ItemLookupServiceApiTest {

    private final ItemLookupServiceApi api = new ItemLookupServiceApi();

    /**
     * Gets external id infos for an item
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdExternalidinfosTest() throws Exception {
        String id = null;
        List<ExternalIdInfo> response = api.getItemsByIdExternalidinfos(id);

        // TODO: test validations
    }
    /**
     * Gets a remote image
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsRemotesearchImageTest() throws Exception {
        String imageUrl = null;
        String providerName = null;
        api.getItemsRemotesearchImage(imageUrl, providerName);

        // TODO: test validations
    }
    /**
     * Resets metadata for one or more items
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsMetadataResetTest() throws Exception {
        String itemIds = null;
        api.postItemsMetadataReset(itemIds);

        // TODO: test validations
    }
    /**
     * Applies search criteria to an item and refreshes metadata
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsRemotesearchApplyByIdTest() throws Exception {
        RemoteSearchResult body = null;
        String id = null;
        Boolean replaceAllImages = null;
        api.postItemsRemotesearchApplyById(body, id, replaceAllImages);

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
    public void postItemsRemotesearchBookTest() throws Exception {
        RemoteSearchQueryBookInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchBook(body);

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
    public void postItemsRemotesearchBoxsetTest() throws Exception {
        RemoteSearchQueryItemLookupInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchBoxset(body);

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
    public void postItemsRemotesearchGameTest() throws Exception {
        RemoteSearchQueryGameInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchGame(body);

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
    public void postItemsRemotesearchMovieTest() throws Exception {
        RemoteSearchQueryMovieInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchMovie(body);

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
    public void postItemsRemotesearchMusicalbumTest() throws Exception {
        RemoteSearchQueryAlbumInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchMusicalbum(body);

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
    public void postItemsRemotesearchMusicartistTest() throws Exception {
        RemoteSearchQueryArtistInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchMusicartist(body);

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
    public void postItemsRemotesearchMusicvideoTest() throws Exception {
        RemoteSearchQueryMusicVideoInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchMusicvideo(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsRemotesearchPersonTest() throws Exception {
        RemoteSearchQueryPersonLookupInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchPerson(body);

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
    public void postItemsRemotesearchSeriesTest() throws Exception {
        RemoteSearchQuerySeriesInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchSeries(body);

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
    public void postItemsRemotesearchTrailerTest() throws Exception {
        RemoteSearchQueryTrailerInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchTrailer(body);

        // TODO: test validations
    }
}
