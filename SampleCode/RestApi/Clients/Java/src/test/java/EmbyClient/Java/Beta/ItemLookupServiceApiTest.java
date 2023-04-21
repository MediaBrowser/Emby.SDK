/*
 * Emby Server REST API (BETA)
 * 
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.ExternalIdInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersAlbumInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersArtistInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersBookInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersGameInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersItemLookupInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersMovieInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersMusicVideoInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersPersonLookupInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersSeriesInfo;
import io.swagger.client.model.ProvidersRemoteSearchQueryProvidersTrailerInfo;
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
        ProvidersRemoteSearchQueryProvidersBookInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersItemLookupInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersGameInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersMovieInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersAlbumInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersArtistInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersMusicVideoInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersPersonLookupInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersSeriesInfo body = null;
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
        ProvidersRemoteSearchQueryProvidersTrailerInfo body = null;
        List<RemoteSearchResult> response = api.postItemsRemotesearchTrailer(body);

        // TODO: test validations
    }
}
