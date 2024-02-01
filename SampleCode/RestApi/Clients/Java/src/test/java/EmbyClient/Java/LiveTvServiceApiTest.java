/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ApiAvailableRecordingOptions;
import io.swagger.client.model.ApiBaseItemsRequest;
import io.swagger.client.model.ApiListingProviderTypeInfo;
import io.swagger.client.model.ApiSetChannelDisabled;
import io.swagger.client.model.ApiSetChannelMapping;
import io.swagger.client.model.ApiSetChannelSortIndex;
import io.swagger.client.model.ApiTagItem;
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.LiveTvChannelType;
import io.swagger.client.model.LiveTvGuideInfo;
import io.swagger.client.model.LiveTvListingsProviderInfo;
import io.swagger.client.model.LiveTvLiveTvInfo;
import io.swagger.client.model.LiveTvRecordingStatus;
import io.swagger.client.model.LiveTvSeriesTimerInfo;
import io.swagger.client.model.LiveTvSeriesTimerInfoDto;
import io.swagger.client.model.LiveTvTimerInfoDto;
import io.swagger.client.model.LiveTvTunerHostInfo;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.QueryResultApiEpgRow;
import io.swagger.client.model.QueryResultBaseItemDto;
import io.swagger.client.model.QueryResultChannelManagementInfo;
import io.swagger.client.model.QueryResultLiveTvSeriesTimerInfoDto;
import io.swagger.client.model.QueryResultLiveTvTimerInfoDto;
import io.swagger.client.model.SortOrder;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LiveTvServiceApi
 */
@Ignore
public class LiveTvServiceApiTest {

    private final LiveTvServiceApi api = new LiveTvServiceApi();

    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLivetvChannelmappingoptionsTest() throws Exception {
        String providerId = null;
        api.deleteLivetvChannelmappingoptions(providerId);

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
    public void deleteLivetvChannelmappingsTest() throws Exception {
        String providerId = null;
        api.deleteLivetvChannelmappings(providerId);

        // TODO: test validations
    }
    /**
     * Deletes a listing provider
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLivetvListingprovidersTest() throws Exception {
        String id = null;
        api.deleteLivetvListingproviders(id);

        // TODO: test validations
    }
    /**
     * Deletes a live tv recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLivetvRecordingsByIdTest() throws Exception {
        String id = null;
        api.deleteLivetvRecordingsById(id);

        // TODO: test validations
    }
    /**
     * Cancels a live tv series timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLivetvSeriestimersByIdTest() throws Exception {
        String id = null;
        api.deleteLivetvSeriestimersById(id);

        // TODO: test validations
    }
    /**
     * Cancels a live tv timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLivetvTimersByIdTest() throws Exception {
        String id = null;
        api.deleteLivetvTimersById(id);

        // TODO: test validations
    }
    /**
     * Deletes a tuner host
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLivetvTunerhostsTest() throws Exception {
        String id = null;
        api.deleteLivetvTunerhosts(id);

        // TODO: test validations
    }
    /**
     * Gets available recording options
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvAvailablerecordingoptionsTest() throws Exception {
        ApiAvailableRecordingOptions response = api.getLivetvAvailablerecordingoptions();

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
    public void getLivetvChannelmappingoptionsTest() throws Exception {
        String providerId = null;
        api.getLivetvChannelmappingoptions(providerId);

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
    public void getLivetvChannelmappingsTest() throws Exception {
        String providerId = null;
        api.getLivetvChannelmappings(providerId);

        // TODO: test validations
    }
    /**
     * Gets available live tv channels.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvChannelsTest() throws Exception {
        LiveTvChannelType type = null;
        Boolean isLiked = null;
        Boolean isDisliked = null;
        Boolean enableFavoriteSorting = null;
        Boolean addCurrentProgram = null;
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        String minStartDate = null;
        String maxStartDate = null;
        String minEndDate = null;
        String maxEndDate = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isFolder = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean isNew = null;
        Boolean isPremiere = null;
        Boolean isNewOrPremiere = null;
        Boolean isRepeat = null;
        Boolean projectToMedia = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String excludeTags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String audioLayouts = null;
        String videoCodecs = null;
        String extendedVideoTypes = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultBaseItemDto response = api.getLivetvChannels(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvChannelsByIdTest() throws Exception {
        String id = null;
        String userId = null;
        BaseItemDto response = api.getLivetvChannelsById(id, userId);

        // TODO: test validations
    }
    /**
     * Gets live tv channel tags
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvChanneltagsTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        String minStartDate = null;
        String maxStartDate = null;
        String minEndDate = null;
        String maxEndDate = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isFolder = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean isNew = null;
        Boolean isPremiere = null;
        Boolean isNewOrPremiere = null;
        Boolean isRepeat = null;
        Boolean projectToMedia = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String excludeTags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String audioLayouts = null;
        String videoCodecs = null;
        String extendedVideoTypes = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultBaseItemDto response = api.getLivetvChanneltags(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets live tv channel tag prefixes
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvChanneltagsPrefixesTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        String minStartDate = null;
        String maxStartDate = null;
        String minEndDate = null;
        String maxEndDate = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isFolder = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean isNew = null;
        Boolean isPremiere = null;
        Boolean isNewOrPremiere = null;
        Boolean isRepeat = null;
        Boolean projectToMedia = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String excludeTags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String audioLayouts = null;
        String videoCodecs = null;
        String extendedVideoTypes = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        List<ApiTagItem> response = api.getLivetvChanneltagsPrefixes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets the epg.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvEPGTest() throws Exception {
        LiveTvChannelType type = null;
        Boolean isLiked = null;
        Boolean isDisliked = null;
        Boolean enableFavoriteSorting = null;
        Boolean addCurrentProgram = null;
        String channelIds = null;
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        String minStartDate = null;
        String maxStartDate = null;
        String minEndDate = null;
        String maxEndDate = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isFolder = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean isNew = null;
        Boolean isPremiere = null;
        Boolean isNewOrPremiere = null;
        Boolean isRepeat = null;
        Boolean projectToMedia = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String excludeTags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String audioLayouts = null;
        String videoCodecs = null;
        String extendedVideoTypes = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultApiEpgRow response = api.getLivetvEPG(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets the top level live tv folder
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvFolderTest() throws Exception {
        BaseItemDto response = api.getLivetvFolder();

        // TODO: test validations
    }
    /**
     * Gets guide info
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvGuideinfoTest() throws Exception {
        LiveTvGuideInfo response = api.getLivetvGuideinfo();

        // TODO: test validations
    }
    /**
     * Gets available live tv services.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvInfoTest() throws Exception {
        LiveTvLiveTvInfo response = api.getLivetvInfo();

        // TODO: test validations
    }
    /**
     * Gets current listing providers
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvListingprovidersTest() throws Exception {
        String channelId = null;
        List<LiveTvListingsProviderInfo> response = api.getLivetvListingproviders(channelId);

        // TODO: test validations
    }
    /**
     * Gets listing provider
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvListingprovidersAvailableTest() throws Exception {
        List<ApiListingProviderTypeInfo> response = api.getLivetvListingprovidersAvailable();

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
    public void getLivetvListingprovidersDefaultTest() throws Exception {
        LiveTvListingsProviderInfo response = api.getLivetvListingprovidersDefault();

        // TODO: test validations
    }
    /**
     * Gets available lineups
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvListingprovidersLineupsTest() throws Exception {
        String id = null;
        String type = null;
        String location = null;
        String country = null;
        List<NameIdPair> response = api.getLivetvListingprovidersLineups(id, type, location, country);

        // TODO: test validations
    }
    /**
     * Gets available lineups
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvListingprovidersSchedulesdirectCountriesTest() throws Exception {
        api.getLivetvListingprovidersSchedulesdirectCountries();

        // TODO: test validations
    }
    /**
     * Gets the channel management list
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvManageChannelsTest() throws Exception {
        Integer startIndex = null;
        Integer limit = null;
        String sortBy = null;
        String sortOrder = null;
        QueryResultChannelManagementInfo response = api.getLivetvManageChannels(startIndex, limit, sortBy, sortOrder);

        // TODO: test validations
    }
    /**
     * Gets available live tv epgs..
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvProgramsTest() throws Exception {
        String channelIds = null;
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        String minStartDate = null;
        String maxStartDate = null;
        String minEndDate = null;
        String maxEndDate = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isFolder = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean isNew = null;
        Boolean isPremiere = null;
        Boolean isNewOrPremiere = null;
        Boolean isRepeat = null;
        Boolean projectToMedia = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String excludeTags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String audioLayouts = null;
        String videoCodecs = null;
        String extendedVideoTypes = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        api.getLivetvPrograms(channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets available live tv epgs..
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvProgramsRecommendedTest() throws Exception {
        String userId = null;
        Integer limit = null;
        Boolean isAiring = null;
        Boolean hasAired = null;
        Boolean isSeries = null;
        Boolean isMovie = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String genreIds = null;
        String fields = null;
        Boolean enableUserData = null;
        QueryResultBaseItemDto response = api.getLivetvProgramsRecommended(userId, limit, isAiring, hasAired, isSeries, isMovie, isNews, isKids, isSports, enableImages, imageTypeLimit, enableImageTypes, genreIds, fields, enableUserData);

        // TODO: test validations
    }
    /**
     * Gets live tv recordings
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvRecordingsTest() throws Exception {
        String channelId = null;
        LiveTvRecordingStatus status = null;
        Boolean isInProgress = null;
        String seriesTimerId = null;
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        String minStartDate = null;
        String maxStartDate = null;
        String minEndDate = null;
        String maxEndDate = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isFolder = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean isNew = null;
        Boolean isPremiere = null;
        Boolean isNewOrPremiere = null;
        Boolean isRepeat = null;
        Boolean projectToMedia = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String excludeTags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String audioLayouts = null;
        String videoCodecs = null;
        String extendedVideoTypes = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        api.getLivetvRecordings(channelId, status, isInProgress, seriesTimerId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets a live tv recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvRecordingsByIdTest() throws Exception {
        String id = null;
        String userId = null;
        BaseItemDto response = api.getLivetvRecordingsById(id, userId);

        // TODO: test validations
    }
    /**
     * Gets recording folders
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvRecordingsFoldersTest() throws Exception {
        String userId = null;
        String fields = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        List<BaseItemDto> response = api.getLivetvRecordingsFolders(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
    /**
     * Gets live tv recording groups
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvRecordingsGroupsTest() throws Exception {
        QueryResultBaseItemDto response = api.getLivetvRecordingsGroups();

        // TODO: test validations
    }
    /**
     * Gets live tv recordings
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvRecordingsSeriesTest() throws Exception {
        QueryResultBaseItemDto response = api.getLivetvRecordingsSeries();

        // TODO: test validations
    }
    /**
     * Gets live tv series timers
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvSeriestimersTest() throws Exception {
        String sortBy = null;
        SortOrder sortOrder = null;
        Integer startIndex = null;
        Integer limit = null;
        QueryResultLiveTvSeriesTimerInfoDto response = api.getLivetvSeriestimers(sortBy, sortOrder, startIndex, limit);

        // TODO: test validations
    }
    /**
     * Gets a live tv series timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvSeriestimersByIdTest() throws Exception {
        String id = null;
        LiveTvTimerInfoDto response = api.getLivetvSeriestimersById(id);

        // TODO: test validations
    }
    /**
     * Gets live tv timers
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvTimersTest() throws Exception {
        String channelId = null;
        String seriesTimerId = null;
        QueryResultLiveTvTimerInfoDto response = api.getLivetvTimers(channelId, seriesTimerId);

        // TODO: test validations
    }
    /**
     * Gets a live tv timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvTimersByIdTest() throws Exception {
        String id = null;
        LiveTvTimerInfoDto response = api.getLivetvTimersById(id);

        // TODO: test validations
    }
    /**
     * Gets default values for a new timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvTimersDefaultsTest() throws Exception {
        String programId = null;
        LiveTvSeriesTimerInfoDto response = api.getLivetvTimersDefaults(programId);

        // TODO: test validations
    }
    /**
     * Gets tuner hosts
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvTunerhostsTest() throws Exception {
        List<LiveTvTunerHostInfo> response = api.getLivetvTunerhosts();

        // TODO: test validations
    }
    /**
     * Gets tuner hosts
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvTunerhostsDefaultByTypeTest() throws Exception {
        String type = null;
        LiveTvTunerHostInfo response = api.getLivetvTunerhostsDefaultByType(type);

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
    public void getLivetvTunerhostsTypesTest() throws Exception {
        List<NameIdPair> response = api.getLivetvTunerhostsTypes();

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
    public void getLivetvTunersDiscvoverTest() throws Exception {
        List<LiveTvTunerHostInfo> response = api.getLivetvTunersDiscvover();

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
    public void headLivetvChannelmappingoptionsTest() throws Exception {
        String providerId = null;
        api.headLivetvChannelmappingoptions(providerId);

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
    public void headLivetvChannelmappingsTest() throws Exception {
        String providerId = null;
        api.headLivetvChannelmappings(providerId);

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
    public void postLivetvChannelmappingoptionsTest() throws Exception {
        String providerId = null;
        api.postLivetvChannelmappingoptions(providerId);

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
    public void postLivetvChannelmappingsTest() throws Exception {
        ApiSetChannelMapping body = null;
        String providerId = null;
        api.postLivetvChannelmappings(body, providerId);

        // TODO: test validations
    }
    /**
     * Adds a listing provider
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvListingprovidersTest() throws Exception {
        LiveTvListingsProviderInfo body = null;
        LiveTvListingsProviderInfo response = api.postLivetvListingproviders(body);

        // TODO: test validations
    }
    /**
     * Deletes a listing provider
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvListingprovidersDeleteTest() throws Exception {
        String id = null;
        api.postLivetvListingprovidersDelete(id);

        // TODO: test validations
    }
    /**
     * Sets a channel disabled or not
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvManageChannelsByIdDisabledTest() throws Exception {
        ApiSetChannelDisabled body = null;
        String id = null;
        QueryResultChannelManagementInfo response = api.postLivetvManageChannelsByIdDisabled(body, id);

        // TODO: test validations
    }
    /**
     * Sets a channel sort index
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvManageChannelsByIdSortindexTest() throws Exception {
        ApiSetChannelSortIndex body = null;
        String id = null;
        QueryResultChannelManagementInfo response = api.postLivetvManageChannelsByIdSortindex(body, id);

        // TODO: test validations
    }
    /**
     * Gets available live tv epgs..
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvProgramsTest() throws Exception {
        ApiBaseItemsRequest body = null;
        String channelIds = null;
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        String minStartDate = null;
        String maxStartDate = null;
        String minEndDate = null;
        String maxEndDate = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isFolder = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        Boolean isNew = null;
        Boolean isPremiere = null;
        Boolean isNewOrPremiere = null;
        Boolean isRepeat = null;
        Boolean projectToMedia = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String excludeTags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String audioLayouts = null;
        String videoCodecs = null;
        String extendedVideoTypes = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        api.postLivetvPrograms(body, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Deletes a live tv recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvRecordingsByIdDeleteTest() throws Exception {
        String id = null;
        api.postLivetvRecordingsByIdDelete(id);

        // TODO: test validations
    }
    /**
     * Creates a live tv series timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvSeriestimersTest() throws Exception {
        LiveTvSeriesTimerInfo body = null;
        api.postLivetvSeriestimers(body);

        // TODO: test validations
    }
    /**
     * Updates a live tv series timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvSeriestimersByIdTest() throws Exception {
        LiveTvSeriesTimerInfo body = null;
        String id = null;
        api.postLivetvSeriestimersById(body, id);

        // TODO: test validations
    }
    /**
     * Cancels a live tv series timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvSeriestimersByIdDeleteTest() throws Exception {
        String id = null;
        api.postLivetvSeriestimersByIdDelete(id);

        // TODO: test validations
    }
    /**
     * Creates a live tv timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvTimersTest() throws Exception {
        LiveTvTimerInfoDto body = null;
        api.postLivetvTimers(body);

        // TODO: test validations
    }
    /**
     * Updates a live tv timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvTimersByIdTest() throws Exception {
        LiveTvTimerInfoDto body = null;
        String id = null;
        api.postLivetvTimersById(body, id);

        // TODO: test validations
    }
    /**
     * Cancels a live tv timer
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvTimersByIdDeleteTest() throws Exception {
        String id = null;
        api.postLivetvTimersByIdDelete(id);

        // TODO: test validations
    }
    /**
     * Adds a tuner host
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvTunerhostsTest() throws Exception {
        LiveTvTunerHostInfo body = null;
        LiveTvTunerHostInfo response = api.postLivetvTunerhosts(body);

        // TODO: test validations
    }
    /**
     * Deletes a tuner host
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvTunerhostsDeleteTest() throws Exception {
        String id = null;
        api.postLivetvTunerhostsDelete(id);

        // TODO: test validations
    }
    /**
     * Resets a tv tuner
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivetvTunersByIdResetTest() throws Exception {
        String id = null;
        api.postLivetvTunersByIdReset(id);

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
    public void putLivetvChannelmappingoptionsTest() throws Exception {
        String providerId = null;
        api.putLivetvChannelmappingoptions(providerId);

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
    public void putLivetvChannelmappingsTest() throws Exception {
        ApiSetChannelMapping body = null;
        String providerId = null;
        api.putLivetvChannelmappings(body, providerId);

        // TODO: test validations
    }
}
