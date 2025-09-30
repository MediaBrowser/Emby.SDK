/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.api;

import embyclient.ApiCallback;
import embyclient.ApiClient;
import embyclient.ApiException;
import embyclient.ApiResponse;
import embyclient.Configuration;
import embyclient.Pair;
import embyclient.ProgressRequestBody;
import embyclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import embyclient.model.AllThemeMediaResult;
import embyclient.model.BaseItemDto;
import embyclient.model.ItemCounts;
import embyclient.model.LibraryDeleteInfo;
import embyclient.model.LibraryMediaFolder;
import embyclient.model.LibraryOptionsResult;
import embyclient.model.LibraryPostUpdatedMedia;
import java.time.OffsetDateTime;
import embyclient.model.PersistenceIntroDebugInfo;
import embyclient.model.QueryResultBaseItemDto;
import embyclient.model.ThemeMediaResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryServiceApi {
    private ApiClient apiClient;

    public LibraryServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LibraryServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteItems
     * @param ids Ids (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteItemsCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteItemsValidateBeforeCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling deleteItems(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteItemsCall(ids, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteItems(String ids) throws ApiException {
        deleteItemsWithHttpInfo(ids);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteItemsWithHttpInfo(String ids) throws ApiException {
        com.squareup.okhttp.Call call = deleteItemsValidateBeforeCall(ids, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param ids Ids (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteItemsAsync(String ids, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteItemsValidateBeforeCall(ids, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteItemsById
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteItemsByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteItemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteItemsByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteItemsById(String id) throws ApiException {
        deleteItemsByIdWithHttpInfo(id);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteItemsByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteItemsByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteItemsByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAlbumsByIdSimilar
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getAlbumsByIdSimilarCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Albums/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAlbumsByIdSimilarValidateBeforeCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAlbumsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getAlbumsByIdSimilarCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public QueryResultBaseItemDto getAlbumsByIdSimilar(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getAlbumsByIdSimilarWithHttpInfo(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getAlbumsByIdSimilarWithHttpInfo(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getAlbumsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds albums similar to a given album. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getAlbumsByIdSimilarAsync(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAlbumsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getArtistsByIdSimilar
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getArtistsByIdSimilarCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Artists/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getArtistsByIdSimilarValidateBeforeCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getArtistsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getArtistsByIdSimilarCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public QueryResultBaseItemDto getArtistsByIdSimilar(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getArtistsByIdSimilarWithHttpInfo(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getArtistsByIdSimilarWithHttpInfo(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getArtistsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds albums similar to a given album. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getArtistsByIdSimilarAsync(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getArtistsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGamesByIdSimilar
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public com.squareup.okhttp.Call getGamesByIdSimilarCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Games/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGamesByIdSimilarValidateBeforeCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getGamesByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getGamesByIdSimilarCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public QueryResultBaseItemDto getGamesByIdSimilar(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getGamesByIdSimilarWithHttpInfo(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getGamesByIdSimilarWithHttpInfo(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getGamesByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds games similar to a given game. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public com.squareup.okhttp.Call getGamesByIdSimilarAsync(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getGamesByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdAncestors
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdAncestorsCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Ancestors"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdAncestorsValidateBeforeCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdAncestors(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdAncestorsCall(id, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all parents of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @return List&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public List<BaseItemDto> getItemsByIdAncestors(String id, String userId) throws ApiException {
        ApiResponse<List<BaseItemDto>> resp = getItemsByIdAncestorsWithHttpInfo(id, userId);
        return resp.getData();
    }

    /**
     * Gets all parents of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @return ApiResponse&lt;List&lt;BaseItemDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public ApiResponse<List<BaseItemDto>> getItemsByIdAncestorsWithHttpInfo(String id, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdAncestorsValidateBeforeCall(id, userId, null, null);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all parents of an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdAncestorsAsync(String id, String userId, final ApiCallback<List<BaseItemDto>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdAncestorsValidateBeforeCall(id, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdCriticreviews
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdCriticreviewsCall(String id, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/CriticReviews"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdCriticreviewsValidateBeforeCall(String id, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdCriticreviews(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdCriticreviewsCall(id, startIndex, limit, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets critic reviews for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public QueryResultBaseItemDto getItemsByIdCriticreviews(String id, Integer startIndex, Integer limit) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getItemsByIdCriticreviewsWithHttpInfo(id, startIndex, limit);
        return resp.getData();
    }

    /**
     * Gets critic reviews for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getItemsByIdCriticreviewsWithHttpInfo(String id, Integer startIndex, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdCriticreviewsValidateBeforeCall(id, startIndex, limit, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets critic reviews for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdCriticreviewsAsync(String id, Integer startIndex, Integer limit, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdCriticreviewsValidateBeforeCall(id, startIndex, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdDeleteinfo
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDeleteinfoCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/DeleteInfo"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdDeleteinfoValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdDeleteinfo(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdDeleteinfoCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets delete info for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return LibraryDeleteInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryDeleteInfo getItemsByIdDeleteinfo(String id) throws ApiException {
        ApiResponse<LibraryDeleteInfo> resp = getItemsByIdDeleteinfoWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets delete info for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;LibraryDeleteInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryDeleteInfo> getItemsByIdDeleteinfoWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdDeleteinfoValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<LibraryDeleteInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets delete info for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDeleteinfoAsync(String id, final ApiCallback<LibraryDeleteInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdDeleteinfoValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryDeleteInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdDownload
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDownloadCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Download"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdDownloadValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdDownload(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdDownloadCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Downloads item media
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdDownload(String id) throws ApiException {
        getItemsByIdDownloadWithHttpInfo(id);
    }

    /**
     * Downloads item media
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdDownloadWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdDownloadValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Downloads item media (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDownloadAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdDownloadValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdFile
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdFileCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/File"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdFileValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdFile(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdFileCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the original file of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdFile(String id) throws ApiException {
        getItemsByIdFileWithHttpInfo(id);
    }

    /**
     * Gets the original file of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdFileWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdFileValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets the original file of an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdFileAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdFileValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdSimilar
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdSimilarCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdSimilarValidateBeforeCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdSimilarCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets similar items
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public QueryResultBaseItemDto getItemsByIdSimilar(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getItemsByIdSimilarWithHttpInfo(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets similar items
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getItemsByIdSimilarWithHttpInfo(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets similar items (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdSimilarAsync(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdThememedia
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThememediaCall(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/ThemeMedia"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (inheritFromParent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("InheritFromParent", inheritFromParent));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdThememediaValidateBeforeCall(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdThememedia(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdThememediaCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets theme videos and songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return AllThemeMediaResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AllThemeMediaResult getItemsByIdThememedia(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<AllThemeMediaResult> resp = getItemsByIdThememediaWithHttpInfo(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets theme videos and songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;AllThemeMediaResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AllThemeMediaResult> getItemsByIdThememediaWithHttpInfo(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdThememediaValidateBeforeCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<AllThemeMediaResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets theme videos and songs for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThememediaAsync(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<AllThemeMediaResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdThememediaValidateBeforeCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AllThemeMediaResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdThemesongs
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemesongsCall(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/ThemeSongs"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (inheritFromParent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("InheritFromParent", inheritFromParent));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdThemesongsValidateBeforeCall(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdThemesongs(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdThemesongsCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets theme songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ThemeMediaResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThemeMediaResult getItemsByIdThemesongs(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<ThemeMediaResult> resp = getItemsByIdThemesongsWithHttpInfo(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets theme songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;ThemeMediaResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThemeMediaResult> getItemsByIdThemesongsWithHttpInfo(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdThemesongsValidateBeforeCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets theme songs for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemesongsAsync(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<ThemeMediaResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdThemesongsValidateBeforeCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdThemevideos
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemevideosCall(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/ThemeVideos"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (inheritFromParent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("InheritFromParent", inheritFromParent));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdThemevideosValidateBeforeCall(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdThemevideos(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdThemevideosCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets theme videos for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ThemeMediaResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThemeMediaResult getItemsByIdThemevideos(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<ThemeMediaResult> resp = getItemsByIdThemevideosWithHttpInfo(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets theme videos for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;ThemeMediaResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThemeMediaResult> getItemsByIdThemevideosWithHttpInfo(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdThemevideosValidateBeforeCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets theme videos for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemevideosAsync(String id, Boolean inheritFromParent, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<ThemeMediaResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsByIdThemevideosValidateBeforeCall(id, inheritFromParent, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsCounts
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsCountsCall(String userId, Boolean isFavorite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/Counts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsCountsValidateBeforeCall(String userId, Boolean isFavorite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getItemsCountsCall(userId, isFavorite, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @return ItemCounts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemCounts getItemsCounts(String userId, Boolean isFavorite) throws ApiException {
        ApiResponse<ItemCounts> resp = getItemsCountsWithHttpInfo(userId, isFavorite);
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @return ApiResponse&lt;ItemCounts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ItemCounts> getItemsCountsWithHttpInfo(String userId, Boolean isFavorite) throws ApiException {
        com.squareup.okhttp.Call call = getItemsCountsValidateBeforeCall(userId, isFavorite, null, null);
        Type localVarReturnType = new TypeToken<ItemCounts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsCountsAsync(String userId, Boolean isFavorite, final ApiCallback<ItemCounts> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsCountsValidateBeforeCall(userId, isFavorite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ItemCounts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsIntros
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsIntrosCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/Intros";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsIntrosValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getItemsIntrosCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets info to debug intros
     * Requires authentication as administrator
     * @return List&lt;PersistenceIntroDebugInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PersistenceIntroDebugInfo> getItemsIntros() throws ApiException {
        ApiResponse<List<PersistenceIntroDebugInfo>> resp = getItemsIntrosWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets info to debug intros
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;PersistenceIntroDebugInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PersistenceIntroDebugInfo>> getItemsIntrosWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getItemsIntrosValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<PersistenceIntroDebugInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets info to debug intros (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsIntrosAsync(final ApiCallback<List<PersistenceIntroDebugInfo>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getItemsIntrosValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PersistenceIntroDebugInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibrariesAvailableoptions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLibrariesAvailableoptionsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Libraries/AvailableOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLibrariesAvailableoptionsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibrariesAvailableoptionsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @return LibraryOptionsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryOptionsResult getLibrariesAvailableoptions() throws ApiException {
        ApiResponse<LibraryOptionsResult> resp = getLibrariesAvailableoptionsWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @return ApiResponse&lt;LibraryOptionsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryOptionsResult> getLibrariesAvailableoptionsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLibrariesAvailableoptionsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<LibraryOptionsResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLibrariesAvailableoptionsAsync(final ApiCallback<LibraryOptionsResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLibrariesAvailableoptionsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryOptionsResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibraryMediafolders
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public com.squareup.okhttp.Call getLibraryMediafoldersCall(Boolean isHidden, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/MediaFolders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isHidden != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHidden", isHidden));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLibraryMediafoldersValidateBeforeCall(Boolean isHidden, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibraryMediafoldersCall(isHidden, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public QueryResultBaseItemDto getLibraryMediafolders(Boolean isHidden) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getLibraryMediafoldersWithHttpInfo(isHidden);
        return resp.getData();
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getLibraryMediafoldersWithHttpInfo(Boolean isHidden) throws ApiException {
        com.squareup.okhttp.Call call = getLibraryMediafoldersValidateBeforeCall(isHidden, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all user media folders. (asynchronously)
     * Requires authentication as user
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public com.squareup.okhttp.Call getLibraryMediafoldersAsync(Boolean isHidden, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLibraryMediafoldersValidateBeforeCall(isHidden, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibraryPhysicalpaths
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLibraryPhysicalpathsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/PhysicalPaths";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLibraryPhysicalpathsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibraryPhysicalpathsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of physical paths from virtual folders
     * Requires authentication as administrator
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getLibraryPhysicalpaths() throws ApiException {
        ApiResponse<List<String>> resp = getLibraryPhysicalpathsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets a list of physical paths from virtual folders
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getLibraryPhysicalpathsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLibraryPhysicalpathsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of physical paths from virtual folders (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLibraryPhysicalpathsAsync(final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLibraryPhysicalpathsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibrarySelectablemediafolders
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLibrarySelectablemediafoldersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/SelectableMediaFolders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLibrarySelectablemediafoldersValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibrarySelectablemediafoldersCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @return List&lt;LibraryMediaFolder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LibraryMediaFolder> getLibrarySelectablemediafolders() throws ApiException {
        ApiResponse<List<LibraryMediaFolder>> resp = getLibrarySelectablemediafoldersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;LibraryMediaFolder&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LibraryMediaFolder>> getLibrarySelectablemediafoldersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLibrarySelectablemediafoldersValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<LibraryMediaFolder>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all user media folders. (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLibrarySelectablemediafoldersAsync(final ApiCallback<List<LibraryMediaFolder>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLibrarySelectablemediafoldersValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LibraryMediaFolder>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMoviesByIdSimilar
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public com.squareup.okhttp.Call getMoviesByIdSimilarCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Movies/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMoviesByIdSimilarValidateBeforeCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getMoviesByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getMoviesByIdSimilarCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds movies and trailers similar to a given movie.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public QueryResultBaseItemDto getMoviesByIdSimilar(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getMoviesByIdSimilarWithHttpInfo(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Finds movies and trailers similar to a given movie.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getMoviesByIdSimilarWithHttpInfo(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getMoviesByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds movies and trailers similar to a given movie. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public com.squareup.okhttp.Call getMoviesByIdSimilarAsync(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMoviesByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getShowsByIdSimilar
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public com.squareup.okhttp.Call getShowsByIdSimilarCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Shows/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShowsByIdSimilarValidateBeforeCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getShowsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getShowsByIdSimilarCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds tv shows similar to a given one.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public QueryResultBaseItemDto getShowsByIdSimilar(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getShowsByIdSimilarWithHttpInfo(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Finds tv shows similar to a given one.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getShowsByIdSimilarWithHttpInfo(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getShowsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds tv shows similar to a given one. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public com.squareup.okhttp.Call getShowsByIdSimilarAsync(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getShowsByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTrailersByIdSimilar
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public com.squareup.okhttp.Call getTrailersByIdSimilarCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Trailers/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (isSpecialSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSpecialSeason", isSpecialSeason));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (startItemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartItemId", startItemId));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTrailersByIdSimilarValidateBeforeCall(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTrailersByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getTrailersByIdSimilarCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds movies and trailers similar to a given trailer.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public QueryResultBaseItemDto getTrailersByIdSimilar(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getTrailersByIdSimilarWithHttpInfo(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Finds movies and trailers similar to a given trailer.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getTrailersByIdSimilarWithHttpInfo(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getTrailersByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds movies and trailers similar to a given trailer. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param isSpecialSeason Optional. Filter by special season. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param startItemId Optional. Skip through the list until a given item is found. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://betadev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public com.squareup.okhttp.Call getTrailersByIdSimilarAsync(String id, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, Boolean isSpecialSeason, String adjacentTo, String startItemId, Integer minIndexNumber, OffsetDateTime minStartDate, OffsetDateTime maxStartDate, OffsetDateTime minEndDate, OffsetDateTime maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, OffsetDateTime minPremiereDate, OffsetDateTime minDateLastSaved, OffsetDateTime minDateLastSavedForUser, OffsetDateTime maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTrailersByIdSimilarValidateBeforeCall(id, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, isSpecialSeason, adjacentTo, startItemId, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdDelete
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postItemsByIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdDelete(String id) throws ApiException {
        postItemsByIdDeleteWithHttpInfo(id);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postItemsByIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsDelete
     * @param ids Ids (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsDeleteCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/Delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postItemsDeleteValidateBeforeCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling postItemsDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsDeleteCall(ids, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsDelete(String ids) throws ApiException {
        postItemsDeleteWithHttpInfo(ids);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsDeleteWithHttpInfo(String ids) throws ApiException {
        com.squareup.okhttp.Call call = postItemsDeleteValidateBeforeCall(ids, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param ids Ids (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsDeleteAsync(String ids, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postItemsDeleteValidateBeforeCall(ids, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryMediaUpdated
     * @param body PostUpdatedMedia (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryMediaUpdatedCall(LibraryPostUpdatedMedia body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Library/Media/Updated";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postLibraryMediaUpdatedValidateBeforeCall(LibraryPostUpdatedMedia body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLibraryMediaUpdated(Async)");
        }
        
        com.squareup.okhttp.Call call = postLibraryMediaUpdatedCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports that new movies have been added by an external source
     * Requires authentication as user
     * @param body PostUpdatedMedia (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryMediaUpdated(LibraryPostUpdatedMedia body) throws ApiException {
        postLibraryMediaUpdatedWithHttpInfo(body);
    }

    /**
     * Reports that new movies have been added by an external source
     * Requires authentication as user
     * @param body PostUpdatedMedia (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryMediaUpdatedWithHttpInfo(LibraryPostUpdatedMedia body) throws ApiException {
        com.squareup.okhttp.Call call = postLibraryMediaUpdatedValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports that new movies have been added by an external source (asynchronously)
     * Requires authentication as user
     * @param body PostUpdatedMedia (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryMediaUpdatedAsync(LibraryPostUpdatedMedia body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postLibraryMediaUpdatedValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryMoviesAdded
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesAddedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Movies/Added";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postLibraryMoviesAddedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibraryMoviesAddedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryMoviesAdded() throws ApiException {
        postLibraryMoviesAddedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryMoviesAddedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibraryMoviesAddedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesAddedAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postLibraryMoviesAddedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryMoviesUpdated
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesUpdatedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Movies/Updated";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postLibraryMoviesUpdatedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibraryMoviesUpdatedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryMoviesUpdated() throws ApiException {
        postLibraryMoviesUpdatedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryMoviesUpdatedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibraryMoviesUpdatedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesUpdatedAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postLibraryMoviesUpdatedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryRefresh
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryRefreshCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Refresh";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postLibraryRefreshValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibraryRefreshCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Starts a library scan
     * Requires authentication as administrator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryRefresh() throws ApiException {
        postLibraryRefreshWithHttpInfo();
    }

    /**
     * Starts a library scan
     * Requires authentication as administrator
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryRefreshWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibraryRefreshValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Starts a library scan (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryRefreshAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postLibraryRefreshValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibrarySeriesAdded
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesAddedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Series/Added";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postLibrarySeriesAddedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibrarySeriesAddedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibrarySeriesAdded() throws ApiException {
        postLibrarySeriesAddedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibrarySeriesAddedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibrarySeriesAddedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesAddedAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postLibrarySeriesAddedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibrarySeriesUpdated
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesUpdatedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Series/Updated";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postLibrarySeriesUpdatedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibrarySeriesUpdatedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibrarySeriesUpdated() throws ApiException {
        postLibrarySeriesUpdatedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibrarySeriesUpdatedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibrarySeriesUpdatedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesUpdatedAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postLibrarySeriesUpdatedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
