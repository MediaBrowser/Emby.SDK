/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from "../ApiClient";
import ApiBaseItemsRequest from '../model/ApiBaseItemsRequest';
import BaseItemDto from '../model/BaseItemDto';
import LiveTVApiListingProviderTypeInfo from '../model/LiveTVApiListingProviderTypeInfo';
import LiveTVApiSetChannelDisabled from '../model/LiveTVApiSetChannelDisabled';
import LiveTVApiSetChannelMapping from '../model/LiveTVApiSetChannelMapping';
import LiveTVApiSetChannelSortIndex from '../model/LiveTVApiSetChannelSortIndex';
import LiveTVApiTagItem from '../model/LiveTVApiTagItem';
import LiveTvChannelType from '../model/LiveTvChannelType';
import LiveTvGuideInfo from '../model/LiveTvGuideInfo';
import LiveTvListingsProviderInfo from '../model/LiveTvListingsProviderInfo';
import LiveTvLiveTvInfo from '../model/LiveTvLiveTvInfo';
import LiveTvRecordingStatus from '../model/LiveTvRecordingStatus';
import LiveTvSeriesTimerInfo from '../model/LiveTvSeriesTimerInfo';
import LiveTvSeriesTimerInfoDto from '../model/LiveTvSeriesTimerInfoDto';
import LiveTvTimerInfoDto from '../model/LiveTvTimerInfoDto';
import LiveTvTunerHostInfo from '../model/LiveTvTunerHostInfo';
import NameIdPair from '../model/NameIdPair';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';
import QueryResultEmbyLiveTVChannelManagementInfo from '../model/QueryResultEmbyLiveTVChannelManagementInfo';
import QueryResultLiveTVApiEpgRow from '../model/QueryResultLiveTVApiEpgRow';
import QueryResultLiveTvSeriesTimerInfoDto from '../model/QueryResultLiveTvSeriesTimerInfoDto';
import QueryResultLiveTvTimerInfoDto from '../model/QueryResultLiveTvTimerInfoDto';
import SortOrder from '../model/SortOrder';

/**
* LiveTvService service.
* @module EmbyClient.JavaScript.Beta/LiveTvServiceApi
* @version 4.8.0.19
*/
export default class LiveTvServiceApi {

    /**
    * Constructs a new LiveTvServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/LiveTvServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteLivetvChannelmappingoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvChannelmappingoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvChannelmappingoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLivetvChannelmappingoptions() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappingOptions', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteLivetvChannelmappings operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvChannelmappingsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvChannelmappingsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLivetvChannelmappings() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappings', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteLivetvListingproviders operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvListingprovidersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvListingprovidersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLivetvListingproviders() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteLivetvRecordingsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvRecordingsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvRecordingsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLivetvRecordingsById() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Recordings/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteLivetvSeriestimersById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvSeriestimersByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvSeriestimersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLivetvSeriestimersById() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/SeriesTimers/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteLivetvTimersById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvTimersByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvTimersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLivetvTimersById() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Timers/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteLivetvTunerhosts operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvTunerhostsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~deleteLivetvTunerhostsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLivetvTunerhosts() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/TunerHosts', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvChannelmappingoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelmappingoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelmappingoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvChannelmappingoptions() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappingOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvChannelmappings operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelmappingsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelmappingsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvChannelmappings() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvChannels operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available live tv channels.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvChannels() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Type': opts['type'],
        'IsLiked': opts['isLiked'],
        'IsDisliked': opts['isDisliked'],
        'EnableFavoriteSorting': opts['enableFavoriteSorting'],
        'AddCurrentProgram': opts['addCurrentProgram'],
        'ArtistType': opts['artistType'],
        'MaxOfficialRating': opts['maxOfficialRating'],
        'HasThemeSong': opts['hasThemeSong'],
        'HasThemeVideo': opts['hasThemeVideo'],
        'HasSubtitles': opts['hasSubtitles'],
        'HasSpecialFeature': opts['hasSpecialFeature'],
        'HasTrailer': opts['hasTrailer'],
        'AdjacentTo': opts['adjacentTo'],
        'MinIndexNumber': opts['minIndexNumber'],
        'MinPlayers': opts['minPlayers'],
        'MaxPlayers': opts['maxPlayers'],
        'ParentIndexNumber': opts['parentIndexNumber'],
        'HasParentalRating': opts['hasParentalRating'],
        'IsHD': opts['isHD'],
        'LocationTypes': opts['locationTypes'],
        'ExcludeLocationTypes': opts['excludeLocationTypes'],
        'IsMissing': opts['isMissing'],
        'IsUnaired': opts['isUnaired'],
        'MinCommunityRating': opts['minCommunityRating'],
        'MinCriticRating': opts['minCriticRating'],
        'AiredDuringSeason': opts['airedDuringSeason'],
        'MinPremiereDate': opts['minPremiereDate'],
        'MinDateLastSaved': opts['minDateLastSaved'],
        'MinDateLastSavedForUser': opts['minDateLastSavedForUser'],
        'MaxPremiereDate': opts['maxPremiereDate'],
        'HasOverview': opts['hasOverview'],
        'HasImdbId': opts['hasImdbId'],
        'HasTmdbId': opts['hasTmdbId'],
        'HasTvdbId': opts['hasTvdbId'],
        'ExcludeItemIds': opts['excludeItemIds'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'Recursive': opts['recursive'],
        'SearchTerm': opts['searchTerm'],
        'SortOrder': opts['sortOrder'],
        'ParentId': opts['parentId'],
        'Fields': opts['fields'],
        'ExcludeItemTypes': opts['excludeItemTypes'],
        'IncludeItemTypes': opts['includeItemTypes'],
        'AnyProviderIdEquals': opts['anyProviderIdEquals'],
        'Filters': opts['filters'],
        'IsFavorite': opts['isFavorite'],
        'IsMovie': opts['isMovie'],
        'IsSeries': opts['isSeries'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'MediaTypes': opts['mediaTypes'],
        'ImageTypes': opts['imageTypes'],
        'SortBy': opts['sortBy'],
        'IsPlayed': opts['isPlayed'],
        'Genres': opts['genres'],
        'OfficialRatings': opts['officialRatings'],
        'Tags': opts['tags'],
        'Years': opts['years'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'Person': opts['person'],
        'PersonIds': opts['personIds'],
        'PersonTypes': opts['personTypes'],
        'Studios': opts['studios'],
        'StudioIds': opts['studioIds'],
        'Artists': opts['artists'],
        'ArtistIds': opts['artistIds'],
        'Albums': opts['albums'],
        'Ids': opts['ids'],
        'VideoTypes': opts['videoTypes'],
        'Containers': opts['containers'],
        'AudioCodecs': opts['audioCodecs'],
        'VideoCodecs': opts['videoCodecs'],
        'SubtitleCodecs': opts['subtitleCodecs'],
        'Path': opts['path'],
        'UserId': opts['userId'],
        'MinOfficialRating': opts['minOfficialRating'],
        'IsLocked': opts['isLocked'],
        'IsPlaceHolder': opts['isPlaceHolder'],
        'HasOfficialRating': opts['hasOfficialRating'],
        'GroupItemsIntoCollections': opts['groupItemsIntoCollections'],
        'Is3D': opts['is3D'],
        'SeriesStatus': opts['seriesStatus'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['artistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['albumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['nameStartsWith'],
        'NameLessThan': opts['nameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Channels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvChannelsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChannelsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseItemDto}
     */
    getLivetvChannelsById() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Channels/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvChanneltags operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChanneltagsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live tv channel tags
     * No authentication required
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChanneltagsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvChanneltags() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ArtistType': opts['artistType'],
        'MaxOfficialRating': opts['maxOfficialRating'],
        'HasThemeSong': opts['hasThemeSong'],
        'HasThemeVideo': opts['hasThemeVideo'],
        'HasSubtitles': opts['hasSubtitles'],
        'HasSpecialFeature': opts['hasSpecialFeature'],
        'HasTrailer': opts['hasTrailer'],
        'AdjacentTo': opts['adjacentTo'],
        'MinIndexNumber': opts['minIndexNumber'],
        'MinPlayers': opts['minPlayers'],
        'MaxPlayers': opts['maxPlayers'],
        'ParentIndexNumber': opts['parentIndexNumber'],
        'HasParentalRating': opts['hasParentalRating'],
        'IsHD': opts['isHD'],
        'LocationTypes': opts['locationTypes'],
        'ExcludeLocationTypes': opts['excludeLocationTypes'],
        'IsMissing': opts['isMissing'],
        'IsUnaired': opts['isUnaired'],
        'MinCommunityRating': opts['minCommunityRating'],
        'MinCriticRating': opts['minCriticRating'],
        'AiredDuringSeason': opts['airedDuringSeason'],
        'MinPremiereDate': opts['minPremiereDate'],
        'MinDateLastSaved': opts['minDateLastSaved'],
        'MinDateLastSavedForUser': opts['minDateLastSavedForUser'],
        'MaxPremiereDate': opts['maxPremiereDate'],
        'HasOverview': opts['hasOverview'],
        'HasImdbId': opts['hasImdbId'],
        'HasTmdbId': opts['hasTmdbId'],
        'HasTvdbId': opts['hasTvdbId'],
        'ExcludeItemIds': opts['excludeItemIds'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'Recursive': opts['recursive'],
        'SearchTerm': opts['searchTerm'],
        'SortOrder': opts['sortOrder'],
        'ParentId': opts['parentId'],
        'Fields': opts['fields'],
        'ExcludeItemTypes': opts['excludeItemTypes'],
        'IncludeItemTypes': opts['includeItemTypes'],
        'AnyProviderIdEquals': opts['anyProviderIdEquals'],
        'Filters': opts['filters'],
        'IsFavorite': opts['isFavorite'],
        'IsMovie': opts['isMovie'],
        'IsSeries': opts['isSeries'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'MediaTypes': opts['mediaTypes'],
        'ImageTypes': opts['imageTypes'],
        'SortBy': opts['sortBy'],
        'IsPlayed': opts['isPlayed'],
        'Genres': opts['genres'],
        'OfficialRatings': opts['officialRatings'],
        'Tags': opts['tags'],
        'Years': opts['years'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'Person': opts['person'],
        'PersonIds': opts['personIds'],
        'PersonTypes': opts['personTypes'],
        'Studios': opts['studios'],
        'StudioIds': opts['studioIds'],
        'Artists': opts['artists'],
        'ArtistIds': opts['artistIds'],
        'Albums': opts['albums'],
        'Ids': opts['ids'],
        'VideoTypes': opts['videoTypes'],
        'Containers': opts['containers'],
        'AudioCodecs': opts['audioCodecs'],
        'VideoCodecs': opts['videoCodecs'],
        'SubtitleCodecs': opts['subtitleCodecs'],
        'Path': opts['path'],
        'UserId': opts['userId'],
        'MinOfficialRating': opts['minOfficialRating'],
        'IsLocked': opts['isLocked'],
        'IsPlaceHolder': opts['isPlaceHolder'],
        'HasOfficialRating': opts['hasOfficialRating'],
        'GroupItemsIntoCollections': opts['groupItemsIntoCollections'],
        'Is3D': opts['is3D'],
        'SeriesStatus': opts['seriesStatus'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['artistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['albumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['nameStartsWith'],
        'NameLessThan': opts['nameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/ChannelTags', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvChanneltagsPrefixes operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChanneltagsPrefixesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LiveTVApiTagItem>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live tv channel tag prefixes
     * No authentication required
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvChanneltagsPrefixesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LiveTVApiTagItem>}
     */
    getLivetvChanneltagsPrefixes() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ArtistType': opts['artistType'],
        'MaxOfficialRating': opts['maxOfficialRating'],
        'HasThemeSong': opts['hasThemeSong'],
        'HasThemeVideo': opts['hasThemeVideo'],
        'HasSubtitles': opts['hasSubtitles'],
        'HasSpecialFeature': opts['hasSpecialFeature'],
        'HasTrailer': opts['hasTrailer'],
        'AdjacentTo': opts['adjacentTo'],
        'MinIndexNumber': opts['minIndexNumber'],
        'MinPlayers': opts['minPlayers'],
        'MaxPlayers': opts['maxPlayers'],
        'ParentIndexNumber': opts['parentIndexNumber'],
        'HasParentalRating': opts['hasParentalRating'],
        'IsHD': opts['isHD'],
        'LocationTypes': opts['locationTypes'],
        'ExcludeLocationTypes': opts['excludeLocationTypes'],
        'IsMissing': opts['isMissing'],
        'IsUnaired': opts['isUnaired'],
        'MinCommunityRating': opts['minCommunityRating'],
        'MinCriticRating': opts['minCriticRating'],
        'AiredDuringSeason': opts['airedDuringSeason'],
        'MinPremiereDate': opts['minPremiereDate'],
        'MinDateLastSaved': opts['minDateLastSaved'],
        'MinDateLastSavedForUser': opts['minDateLastSavedForUser'],
        'MaxPremiereDate': opts['maxPremiereDate'],
        'HasOverview': opts['hasOverview'],
        'HasImdbId': opts['hasImdbId'],
        'HasTmdbId': opts['hasTmdbId'],
        'HasTvdbId': opts['hasTvdbId'],
        'ExcludeItemIds': opts['excludeItemIds'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'Recursive': opts['recursive'],
        'SearchTerm': opts['searchTerm'],
        'SortOrder': opts['sortOrder'],
        'ParentId': opts['parentId'],
        'Fields': opts['fields'],
        'ExcludeItemTypes': opts['excludeItemTypes'],
        'IncludeItemTypes': opts['includeItemTypes'],
        'AnyProviderIdEquals': opts['anyProviderIdEquals'],
        'Filters': opts['filters'],
        'IsFavorite': opts['isFavorite'],
        'IsMovie': opts['isMovie'],
        'IsSeries': opts['isSeries'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'MediaTypes': opts['mediaTypes'],
        'ImageTypes': opts['imageTypes'],
        'SortBy': opts['sortBy'],
        'IsPlayed': opts['isPlayed'],
        'Genres': opts['genres'],
        'OfficialRatings': opts['officialRatings'],
        'Tags': opts['tags'],
        'Years': opts['years'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'Person': opts['person'],
        'PersonIds': opts['personIds'],
        'PersonTypes': opts['personTypes'],
        'Studios': opts['studios'],
        'StudioIds': opts['studioIds'],
        'Artists': opts['artists'],
        'ArtistIds': opts['artistIds'],
        'Albums': opts['albums'],
        'Ids': opts['ids'],
        'VideoTypes': opts['videoTypes'],
        'Containers': opts['containers'],
        'AudioCodecs': opts['audioCodecs'],
        'VideoCodecs': opts['videoCodecs'],
        'SubtitleCodecs': opts['subtitleCodecs'],
        'Path': opts['path'],
        'UserId': opts['userId'],
        'MinOfficialRating': opts['minOfficialRating'],
        'IsLocked': opts['isLocked'],
        'IsPlaceHolder': opts['isPlaceHolder'],
        'HasOfficialRating': opts['hasOfficialRating'],
        'GroupItemsIntoCollections': opts['groupItemsIntoCollections'],
        'Is3D': opts['is3D'],
        'SeriesStatus': opts['seriesStatus'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['artistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['albumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['nameStartsWith'],
        'NameLessThan': opts['nameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [LiveTVApiTagItem];

      return this.apiClient.callApi(
        '/LiveTv/ChannelTags/Prefixes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvEPG operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvEPGCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultLiveTVApiEpgRow} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the epg.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvEPGCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultLiveTVApiEpgRow}
     */
    getLivetvEPG() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Type': opts['type'],
        'UserId': opts['userId'],
        'GenreIds': opts['genreIds'],
        'MinStartDate': opts['minStartDate'],
        'MaxStartDate': opts['maxStartDate'],
        'MinEndDate': opts['minEndDate'],
        'MaxEndDate': opts['maxEndDate'],
        'StartIndex': opts['startIndex'],
        'IsMovie': opts['isMovie'],
        'IsSeries': opts['isSeries'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'Limit': opts['limit'],
        'IsFavorite': opts['isFavorite'],
        'IsLiked': opts['isLiked'],
        'IsDisliked': opts['isDisliked'],
        'EnableFavoriteSorting': opts['enableFavoriteSorting'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'Fields': opts['fields'],
        'AddCurrentProgram': opts['addCurrentProgram'],
        'EnableUserData': opts['enableUserData'],
        'ChannelIds': opts['channelIds']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultLiveTVApiEpgRow;

      return this.apiClient.callApi(
        '/LiveTv/EPG', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvFolder operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvFolderCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the top level live tv folder
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvFolderCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseItemDto}
     */
    getLivetvFolder() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Folder', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvGuideinfo operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvGuideinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvGuideInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets guide info
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvGuideinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvGuideInfo}
     */
    getLivetvGuideinfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvGuideInfo;

      return this.apiClient.callApi(
        '/LiveTv/GuideInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvInfo operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvLiveTvInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available live tv services.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvLiveTvInfo}
     */
    getLivetvInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvLiveTvInfo;

      return this.apiClient.callApi(
        '/LiveTv/Info', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvListingproviders operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LiveTvListingsProviderInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets current listing providers
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LiveTvListingsProviderInfo>}
     */
    getLivetvListingproviders() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelId': channelId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [LiveTvListingsProviderInfo];

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvListingprovidersAvailable operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersAvailableCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LiveTVApiListingProviderTypeInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets listing provider
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersAvailableCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LiveTVApiListingProviderTypeInfo>}
     */
    getLivetvListingprovidersAvailable() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [LiveTVApiListingProviderTypeInfo];

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders/Available', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvListingprovidersDefault operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersDefaultCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvListingsProviderInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersDefaultCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvListingsProviderInfo}
     */
    getLivetvListingprovidersDefault() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvListingsProviderInfo;

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders/Default', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvListingprovidersLineups operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersLineupsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NameIdPair>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersLineupsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NameIdPair>}
     */
    getLivetvListingprovidersLineups() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['id'],
        'Type': opts['type'],
        'Location': opts['location'],
        'Country': opts['country']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [NameIdPair];

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders/Lineups', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvListingprovidersSchedulesdirectCountries operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersSchedulesdirectCountriesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvListingprovidersSchedulesdirectCountriesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvListingprovidersSchedulesdirectCountries() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders/SchedulesDirect/Countries', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvLiverecordingsByIdStream operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvLiverecordingsByIdStreamCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * No authentication required
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvLiverecordingsByIdStreamCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvLiverecordingsByIdStream() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/LiveRecordings/{Id}/stream', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvLivestreamfilesByIdStreamByContainer operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvLivestreamfilesByIdStreamByContainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * No authentication required
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvLivestreamfilesByIdStreamByContainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvLivestreamfilesByIdStreamByContainer() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Container': container
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/LiveStreamFiles/{Id}/stream.{Container}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvManageChannels operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvManageChannelsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultEmbyLiveTVChannelManagementInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the channel management list
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvManageChannelsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultEmbyLiveTVChannelManagementInfo}
     */
    getLivetvManageChannels() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'SortBy': opts['sortBy'],
        'SortOrder': opts['sortOrder']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultEmbyLiveTVChannelManagementInfo;

      return this.apiClient.callApi(
        '/LiveTv/Manage/Channels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvPrograms operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvProgramsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvProgramsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvPrograms() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelIds': opts['channelIds'],
        'MinStartDate': opts['minStartDate'],
        'MaxStartDate': opts['maxStartDate'],
        'MinEndDate': opts['minEndDate'],
        'MaxEndDate': opts['maxEndDate'],
        'ArtistType': opts['artistType'],
        'MaxOfficialRating': opts['maxOfficialRating'],
        'HasThemeSong': opts['hasThemeSong'],
        'HasThemeVideo': opts['hasThemeVideo'],
        'HasSubtitles': opts['hasSubtitles'],
        'HasSpecialFeature': opts['hasSpecialFeature'],
        'HasTrailer': opts['hasTrailer'],
        'AdjacentTo': opts['adjacentTo'],
        'MinIndexNumber': opts['minIndexNumber'],
        'MinPlayers': opts['minPlayers'],
        'MaxPlayers': opts['maxPlayers'],
        'ParentIndexNumber': opts['parentIndexNumber'],
        'HasParentalRating': opts['hasParentalRating'],
        'IsHD': opts['isHD'],
        'LocationTypes': opts['locationTypes'],
        'ExcludeLocationTypes': opts['excludeLocationTypes'],
        'IsMissing': opts['isMissing'],
        'IsUnaired': opts['isUnaired'],
        'MinCommunityRating': opts['minCommunityRating'],
        'MinCriticRating': opts['minCriticRating'],
        'AiredDuringSeason': opts['airedDuringSeason'],
        'MinPremiereDate': opts['minPremiereDate'],
        'MinDateLastSaved': opts['minDateLastSaved'],
        'MinDateLastSavedForUser': opts['minDateLastSavedForUser'],
        'MaxPremiereDate': opts['maxPremiereDate'],
        'HasOverview': opts['hasOverview'],
        'HasImdbId': opts['hasImdbId'],
        'HasTmdbId': opts['hasTmdbId'],
        'HasTvdbId': opts['hasTvdbId'],
        'ExcludeItemIds': opts['excludeItemIds'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'Recursive': opts['recursive'],
        'SearchTerm': opts['searchTerm'],
        'SortOrder': opts['sortOrder'],
        'ParentId': opts['parentId'],
        'Fields': opts['fields'],
        'ExcludeItemTypes': opts['excludeItemTypes'],
        'IncludeItemTypes': opts['includeItemTypes'],
        'AnyProviderIdEquals': opts['anyProviderIdEquals'],
        'Filters': opts['filters'],
        'IsFavorite': opts['isFavorite'],
        'IsMovie': opts['isMovie'],
        'IsSeries': opts['isSeries'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'MediaTypes': opts['mediaTypes'],
        'ImageTypes': opts['imageTypes'],
        'SortBy': opts['sortBy'],
        'IsPlayed': opts['isPlayed'],
        'Genres': opts['genres'],
        'OfficialRatings': opts['officialRatings'],
        'Tags': opts['tags'],
        'Years': opts['years'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'Person': opts['person'],
        'PersonIds': opts['personIds'],
        'PersonTypes': opts['personTypes'],
        'Studios': opts['studios'],
        'StudioIds': opts['studioIds'],
        'Artists': opts['artists'],
        'ArtistIds': opts['artistIds'],
        'Albums': opts['albums'],
        'Ids': opts['ids'],
        'VideoTypes': opts['videoTypes'],
        'Containers': opts['containers'],
        'AudioCodecs': opts['audioCodecs'],
        'VideoCodecs': opts['videoCodecs'],
        'SubtitleCodecs': opts['subtitleCodecs'],
        'Path': opts['path'],
        'UserId': opts['userId'],
        'MinOfficialRating': opts['minOfficialRating'],
        'IsLocked': opts['isLocked'],
        'IsPlaceHolder': opts['isPlaceHolder'],
        'HasOfficialRating': opts['hasOfficialRating'],
        'GroupItemsIntoCollections': opts['groupItemsIntoCollections'],
        'Is3D': opts['is3D'],
        'SeriesStatus': opts['seriesStatus'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['artistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['albumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['nameStartsWith'],
        'NameLessThan': opts['nameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Programs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvProgramsRecommended operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvProgramsRecommendedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvProgramsRecommendedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvProgramsRecommended() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'IsAiring': opts['isAiring'],
        'HasAired': opts['hasAired'],
        'IsSeries': opts['isSeries'],
        'IsMovie': opts['isMovie'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'GenreIds': opts['genreIds'],
        'Fields': opts['fields'],
        'EnableUserData': opts['enableUserData']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Programs/Recommended', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvRecordings operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvRecordings() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelId': opts['channelId'],
        'Status': opts['status'],
        'IsInProgress': opts['isInProgress'],
        'SeriesTimerId': opts['seriesTimerId'],
        'ArtistType': opts['artistType'],
        'MaxOfficialRating': opts['maxOfficialRating'],
        'HasThemeSong': opts['hasThemeSong'],
        'HasThemeVideo': opts['hasThemeVideo'],
        'HasSubtitles': opts['hasSubtitles'],
        'HasSpecialFeature': opts['hasSpecialFeature'],
        'HasTrailer': opts['hasTrailer'],
        'AdjacentTo': opts['adjacentTo'],
        'MinIndexNumber': opts['minIndexNumber'],
        'MinPlayers': opts['minPlayers'],
        'MaxPlayers': opts['maxPlayers'],
        'ParentIndexNumber': opts['parentIndexNumber'],
        'HasParentalRating': opts['hasParentalRating'],
        'IsHD': opts['isHD'],
        'LocationTypes': opts['locationTypes'],
        'ExcludeLocationTypes': opts['excludeLocationTypes'],
        'IsMissing': opts['isMissing'],
        'IsUnaired': opts['isUnaired'],
        'MinCommunityRating': opts['minCommunityRating'],
        'MinCriticRating': opts['minCriticRating'],
        'AiredDuringSeason': opts['airedDuringSeason'],
        'MinPremiereDate': opts['minPremiereDate'],
        'MinDateLastSaved': opts['minDateLastSaved'],
        'MinDateLastSavedForUser': opts['minDateLastSavedForUser'],
        'MaxPremiereDate': opts['maxPremiereDate'],
        'HasOverview': opts['hasOverview'],
        'HasImdbId': opts['hasImdbId'],
        'HasTmdbId': opts['hasTmdbId'],
        'HasTvdbId': opts['hasTvdbId'],
        'ExcludeItemIds': opts['excludeItemIds'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'Recursive': opts['recursive'],
        'SearchTerm': opts['searchTerm'],
        'SortOrder': opts['sortOrder'],
        'ParentId': opts['parentId'],
        'Fields': opts['fields'],
        'ExcludeItemTypes': opts['excludeItemTypes'],
        'IncludeItemTypes': opts['includeItemTypes'],
        'AnyProviderIdEquals': opts['anyProviderIdEquals'],
        'Filters': opts['filters'],
        'IsFavorite': opts['isFavorite'],
        'IsMovie': opts['isMovie'],
        'IsSeries': opts['isSeries'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'MediaTypes': opts['mediaTypes'],
        'ImageTypes': opts['imageTypes'],
        'SortBy': opts['sortBy'],
        'IsPlayed': opts['isPlayed'],
        'Genres': opts['genres'],
        'OfficialRatings': opts['officialRatings'],
        'Tags': opts['tags'],
        'Years': opts['years'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'Person': opts['person'],
        'PersonIds': opts['personIds'],
        'PersonTypes': opts['personTypes'],
        'Studios': opts['studios'],
        'StudioIds': opts['studioIds'],
        'Artists': opts['artists'],
        'ArtistIds': opts['artistIds'],
        'Albums': opts['albums'],
        'Ids': opts['ids'],
        'VideoTypes': opts['videoTypes'],
        'Containers': opts['containers'],
        'AudioCodecs': opts['audioCodecs'],
        'VideoCodecs': opts['videoCodecs'],
        'SubtitleCodecs': opts['subtitleCodecs'],
        'Path': opts['path'],
        'UserId': opts['userId'],
        'MinOfficialRating': opts['minOfficialRating'],
        'IsLocked': opts['isLocked'],
        'IsPlaceHolder': opts['isPlaceHolder'],
        'HasOfficialRating': opts['hasOfficialRating'],
        'GroupItemsIntoCollections': opts['groupItemsIntoCollections'],
        'Is3D': opts['is3D'],
        'SeriesStatus': opts['seriesStatus'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['artistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['albumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['nameStartsWith'],
        'NameLessThan': opts['nameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Recordings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvRecordingsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv recording
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseItemDto}
     */
    getLivetvRecordingsById() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Recordings/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvRecordingsFolders operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsFoldersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/BaseItemDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets recording folders
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsFoldersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/BaseItemDto>}
     */
    getLivetvRecordingsFolders() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['userId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [BaseItemDto];

      return this.apiClient.callApi(
        '/LiveTv/Recordings/Folders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvRecordingsGroups operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsGroupsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live tv recording groups
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsGroupsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvRecordingsGroups() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Recordings/Groups', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvRecordingsSeries operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsSeriesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvRecordingsSeriesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvRecordingsSeries() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Recordings/Series', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvSeriestimers operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvSeriestimersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultLiveTvSeriesTimerInfoDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live tv series timers
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvSeriestimersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultLiveTvSeriesTimerInfoDto}
     */
    getLivetvSeriestimers() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'SortBy': opts['sortBy'],
        'SortOrder': opts['sortOrder'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultLiveTvSeriesTimerInfoDto;

      return this.apiClient.callApi(
        '/LiveTv/SeriesTimers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvSeriestimersById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvSeriestimersByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvTimerInfoDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv series timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvSeriestimersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvTimerInfoDto}
     */
    getLivetvSeriestimersById() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvTimerInfoDto;

      return this.apiClient.callApi(
        '/LiveTv/SeriesTimers/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvTimers operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTimersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultLiveTvTimerInfoDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live tv timers
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTimersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultLiveTvTimerInfoDto}
     */
    getLivetvTimers() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelId': opts['channelId'],
        'SeriesTimerId': opts['seriesTimerId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultLiveTvTimerInfoDto;

      return this.apiClient.callApi(
        '/LiveTv/Timers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvTimersById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTimersByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvTimerInfoDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTimersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvTimerInfoDto}
     */
    getLivetvTimersById() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvTimerInfoDto;

      return this.apiClient.callApi(
        '/LiveTv/Timers/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvTimersDefaults operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTimersDefaultsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvSeriesTimerInfoDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets default values for a new timer
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTimersDefaultsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvSeriesTimerInfoDto}
     */
    getLivetvTimersDefaults() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProgramId': opts['programId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvSeriesTimerInfoDto;

      return this.apiClient.callApi(
        '/LiveTv/Timers/Defaults', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvTunerhosts operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunerhostsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LiveTvTunerHostInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunerhostsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LiveTvTunerHostInfo>}
     */
    getLivetvTunerhosts() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [LiveTvTunerHostInfo];

      return this.apiClient.callApi(
        '/LiveTv/TunerHosts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvTunerhostsDefaultByType operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunerhostsDefaultByTypeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvTunerHostInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunerhostsDefaultByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvTunerHostInfo}
     */
    getLivetvTunerhostsDefaultByType() {
      let postBody = null;

      let pathParams = {
        'Type': type
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvTunerHostInfo;

      return this.apiClient.callApi(
        '/LiveTv/TunerHosts/Default/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvTunerhostsTypes operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunerhostsTypesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NameIdPair>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunerhostsTypesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NameIdPair>}
     */
    getLivetvTunerhostsTypes() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [NameIdPair];

      return this.apiClient.callApi(
        '/LiveTv/TunerHosts/Types', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvTunersDiscvover operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunersDiscvoverCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LiveTvTunerHostInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~getLivetvTunersDiscvoverCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LiveTvTunerHostInfo>}
     */
    getLivetvTunersDiscvover() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [LiveTvTunerHostInfo];

      return this.apiClient.callApi(
        '/LiveTv/Tuners/Discvover', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headLivetvChannelmappingoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~headLivetvChannelmappingoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~headLivetvChannelmappingoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headLivetvChannelmappingoptions() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappingOptions', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headLivetvChannelmappings operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~headLivetvChannelmappingsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~headLivetvChannelmappingsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headLivetvChannelmappings() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappings', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvChannelmappingoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvChannelmappingoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvChannelmappingoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvChannelmappingoptions() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappingOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvChannelmappings operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvChannelmappingsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvChannelmappingsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvChannelmappings() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappings', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvListingproviders operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvListingprovidersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvListingsProviderInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Adds a listing provider
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvListingprovidersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvListingsProviderInfo}
     */
    postLivetvListingproviders() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvListingsProviderInfo;

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvListingprovidersDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvListingprovidersDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvListingprovidersDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvListingprovidersDelete() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvManageChannelsByIdDisabled operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvManageChannelsByIdDisabledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultEmbyLiveTVChannelManagementInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Sets a channel disabled or not
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvManageChannelsByIdDisabledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultEmbyLiveTVChannelManagementInfo}
     */
    postLivetvManageChannelsByIdDisabled() {
      let postBody = body;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultEmbyLiveTVChannelManagementInfo;

      return this.apiClient.callApi(
        '/LiveTv/Manage/Channels/{Id}/Disabled', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvManageChannelsByIdSortindex operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvManageChannelsByIdSortindexCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultEmbyLiveTVChannelManagementInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Sets a channel sort index
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvManageChannelsByIdSortindexCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultEmbyLiveTVChannelManagementInfo}
     */
    postLivetvManageChannelsByIdSortindex() {
      let postBody = body;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultEmbyLiveTVChannelManagementInfo;

      return this.apiClient.callApi(
        '/LiveTv/Manage/Channels/{Id}/SortIndex', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvPrograms operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvProgramsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvProgramsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvPrograms() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'ChannelIds': opts['channelIds'],
        'MinStartDate': opts['minStartDate'],
        'MaxStartDate': opts['maxStartDate'],
        'MinEndDate': opts['minEndDate'],
        'MaxEndDate': opts['maxEndDate'],
        'ArtistType': opts['artistType'],
        'MaxOfficialRating': opts['maxOfficialRating'],
        'HasThemeSong': opts['hasThemeSong'],
        'HasThemeVideo': opts['hasThemeVideo'],
        'HasSubtitles': opts['hasSubtitles'],
        'HasSpecialFeature': opts['hasSpecialFeature'],
        'HasTrailer': opts['hasTrailer'],
        'AdjacentTo': opts['adjacentTo'],
        'MinIndexNumber': opts['minIndexNumber'],
        'MinPlayers': opts['minPlayers'],
        'MaxPlayers': opts['maxPlayers'],
        'ParentIndexNumber': opts['parentIndexNumber'],
        'HasParentalRating': opts['hasParentalRating'],
        'IsHD': opts['isHD'],
        'LocationTypes': opts['locationTypes'],
        'ExcludeLocationTypes': opts['excludeLocationTypes'],
        'IsMissing': opts['isMissing'],
        'IsUnaired': opts['isUnaired'],
        'MinCommunityRating': opts['minCommunityRating'],
        'MinCriticRating': opts['minCriticRating'],
        'AiredDuringSeason': opts['airedDuringSeason'],
        'MinPremiereDate': opts['minPremiereDate'],
        'MinDateLastSaved': opts['minDateLastSaved'],
        'MinDateLastSavedForUser': opts['minDateLastSavedForUser'],
        'MaxPremiereDate': opts['maxPremiereDate'],
        'HasOverview': opts['hasOverview'],
        'HasImdbId': opts['hasImdbId'],
        'HasTmdbId': opts['hasTmdbId'],
        'HasTvdbId': opts['hasTvdbId'],
        'ExcludeItemIds': opts['excludeItemIds'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'Recursive': opts['recursive'],
        'SearchTerm': opts['searchTerm'],
        'SortOrder': opts['sortOrder'],
        'ParentId': opts['parentId'],
        'Fields': opts['fields'],
        'ExcludeItemTypes': opts['excludeItemTypes'],
        'IncludeItemTypes': opts['includeItemTypes'],
        'AnyProviderIdEquals': opts['anyProviderIdEquals'],
        'Filters': opts['filters'],
        'IsFavorite': opts['isFavorite'],
        'IsMovie': opts['isMovie'],
        'IsSeries': opts['isSeries'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'MediaTypes': opts['mediaTypes'],
        'ImageTypes': opts['imageTypes'],
        'SortBy': opts['sortBy'],
        'IsPlayed': opts['isPlayed'],
        'Genres': opts['genres'],
        'OfficialRatings': opts['officialRatings'],
        'Tags': opts['tags'],
        'Years': opts['years'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'Person': opts['person'],
        'PersonIds': opts['personIds'],
        'PersonTypes': opts['personTypes'],
        'Studios': opts['studios'],
        'StudioIds': opts['studioIds'],
        'Artists': opts['artists'],
        'ArtistIds': opts['artistIds'],
        'Albums': opts['albums'],
        'Ids': opts['ids'],
        'VideoTypes': opts['videoTypes'],
        'Containers': opts['containers'],
        'AudioCodecs': opts['audioCodecs'],
        'VideoCodecs': opts['videoCodecs'],
        'SubtitleCodecs': opts['subtitleCodecs'],
        'Path': opts['path'],
        'UserId': opts['userId'],
        'MinOfficialRating': opts['minOfficialRating'],
        'IsLocked': opts['isLocked'],
        'IsPlaceHolder': opts['isPlaceHolder'],
        'HasOfficialRating': opts['hasOfficialRating'],
        'GroupItemsIntoCollections': opts['groupItemsIntoCollections'],
        'Is3D': opts['is3D'],
        'SeriesStatus': opts['seriesStatus'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['artistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['albumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['nameStartsWith'],
        'NameLessThan': opts['nameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Programs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvRecordingsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvRecordingsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvRecordingsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvRecordingsByIdDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Recordings/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvSeriestimers operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvSeriestimersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a live tv series timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvSeriestimersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvSeriestimers() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/SeriesTimers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvSeriestimersById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvSeriestimersByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a live tv series timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvSeriestimersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvSeriestimersById() {
      let postBody = body;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/SeriesTimers/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvSeriestimersByIdDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvSeriestimersByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvSeriestimersByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvSeriestimersByIdDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/SeriesTimers/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvTimers operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTimersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a live tv timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTimersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvTimers() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Timers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvTimersById operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTimersByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a live tv timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTimersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvTimersById() {
      let postBody = body;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Timers/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvTimersByIdDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTimersByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTimersByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvTimersByIdDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Timers/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvTunerhosts operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTunerhostsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveTvTunerHostInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Adds a tuner host
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTunerhostsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveTvTunerHostInfo}
     */
    postLivetvTunerhosts() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = LiveTvTunerHostInfo;

      return this.apiClient.callApi(
        '/LiveTv/TunerHosts', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvTunerhostsDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTunerhostsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTunerhostsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvTunerhostsDelete() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/TunerHosts/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivetvTunersByIdReset operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTunersByIdResetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Resets a tv tuner
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~postLivetvTunersByIdResetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivetvTunersByIdReset() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/Tuners/{Id}/Reset', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the putLivetvChannelmappingoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~putLivetvChannelmappingoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~putLivetvChannelmappingoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    putLivetvChannelmappingoptions() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappingOptions', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the putLivetvChannelmappings operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~putLivetvChannelmappingsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/LiveTvServiceApi~putLivetvChannelmappingsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    putLivetvChannelmappings() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': providerId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/LiveTv/ChannelMappings', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
