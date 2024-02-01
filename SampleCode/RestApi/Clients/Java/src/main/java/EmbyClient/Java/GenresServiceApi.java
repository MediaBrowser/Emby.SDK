/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import EmbyClient.ApiCallback;
import EmbyClient.ApiClient;
import EmbyClient.ApiException;
import EmbyClient.ApiResponse;
import EmbyClient.Configuration;
import EmbyClient.Pair;
import EmbyClient.ProgressRequestBody;
import EmbyClient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.QueryResultBaseItemDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenresServiceApi {
    private ApiClient apiClient;

    public GenresServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GenresServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getGenres
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
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
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets all genres from a given item, folder, or the entire library Documentation</a>
     */
    public com.squareup.okhttp.Call getGenresCall(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Genres";

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
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
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
    private com.squareup.okhttp.Call getGenresValidateBeforeCall(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getGenresCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all genres from a given item, folder, or the entire library
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
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
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets all genres from a given item, folder, or the entire library Documentation</a>
     */
    public QueryResultBaseItemDto getGenres(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getGenresWithHttpInfo(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets all genres from a given item, folder, or the entire library
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
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
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets all genres from a given item, folder, or the entire library Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getGenresWithHttpInfo(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getGenresValidateBeforeCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all genres from a given item, folder, or the entire library (asynchronously)
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
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
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets all genres from a given item, folder, or the entire library Documentation</a>
     */
    public com.squareup.okhttp.Call getGenresAsync(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGenresValidateBeforeCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGenresByName
     * @param name The genre name (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets a genre, by name Documentation</a>
     */
    public com.squareup.okhttp.Call getGenresByNameCall(String name, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Genres/{Name}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()));

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
    private com.squareup.okhttp.Call getGenresByNameValidateBeforeCall(String name, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getGenresByName(Async)");
        }
        
        com.squareup.okhttp.Call call = getGenresByNameCall(name, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a genre, by name
     * Requires authentication as user
     * @param name The genre name (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @return BaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets a genre, by name Documentation</a>
     */
    public BaseItemDto getGenresByName(String name, String userId) throws ApiException {
        ApiResponse<BaseItemDto> resp = getGenresByNameWithHttpInfo(name, userId);
        return resp.getData();
    }

    /**
     * Gets a genre, by name
     * Requires authentication as user
     * @param name The genre name (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @return ApiResponse&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets a genre, by name Documentation</a>
     */
    public ApiResponse<BaseItemDto> getGenresByNameWithHttpInfo(String name, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getGenresByNameValidateBeforeCall(name, userId, null, null);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a genre, by name (asynchronously)
     * Requires authentication as user
     * @param name The genre name (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Items by name
     * @see <a href="https://dev.emby.media/doc/restapi/Items-by-Name.html">Gets a genre, by name Documentation</a>
     */
    public com.squareup.okhttp.Call getGenresByNameAsync(String name, String userId, final ApiCallback<BaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGenresByNameValidateBeforeCall(name, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
