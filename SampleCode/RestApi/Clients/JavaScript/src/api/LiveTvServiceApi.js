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
import ApiAvailableRecordingOptions from '../model/ApiAvailableRecordingOptions';
import ApiBaseItemsRequest from '../model/ApiBaseItemsRequest';
import ApiListingProviderTypeInfo from '../model/ApiListingProviderTypeInfo';
import ApiSetChannelDisabled from '../model/ApiSetChannelDisabled';
import ApiSetChannelMapping from '../model/ApiSetChannelMapping';
import ApiSetChannelSortIndex from '../model/ApiSetChannelSortIndex';
import ApiTagItem from '../model/ApiTagItem';
import BaseItemDto from '../model/BaseItemDto';
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
import QueryResultApiEpgRow from '../model/QueryResultApiEpgRow';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';
import QueryResultChannelManagementInfo from '../model/QueryResultChannelManagementInfo';
import QueryResultLiveTvSeriesTimerInfoDto from '../model/QueryResultLiveTvSeriesTimerInfoDto';
import QueryResultLiveTvTimerInfoDto from '../model/QueryResultLiveTvTimerInfoDto';
import SortOrder from '../model/SortOrder';

/**
* LiveTvService service.
* @module api/LiveTvServiceApi
* @version 4.9.0.28
*/
export default class LiveTvServiceApi {

    /**
    * Constructs a new LiveTvServiceApi. 
    * @alias module:api/LiveTvServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLivetvChannelmappingoptionsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLivetvChannelmappingoptions() {
      return this.deleteLivetvChannelmappingoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLivetvChannelmappingsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLivetvChannelmappings() {
      return this.deleteLivetvChannelmappingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLivetvListingprovidersWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['Id']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLivetvListingproviders() {
      return this.deleteLivetvListingprovidersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLivetvRecordingsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLivetvRecordingsById() {
      return this.deleteLivetvRecordingsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLivetvSeriestimersByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLivetvSeriestimersById() {
      return this.deleteLivetvSeriestimersByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLivetvTimersByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLivetvTimersById() {
      return this.deleteLivetvTimersByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLivetvTunerhostsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['Id']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLivetvTunerhosts() {
      return this.deleteLivetvTunerhostsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available recording options
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ApiAvailableRecordingOptions} and HTTP response
     */
    getLivetvAvailablerecordingoptionsWithHttpInfo() {
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
      let returnType = ApiAvailableRecordingOptions;

      return this.apiClient.callApi(
        '/LiveTv/AvailableRecordingOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available recording options
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ApiAvailableRecordingOptions}
     */
    getLivetvAvailablerecordingoptions() {
      return this.getLivetvAvailablerecordingoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getLivetvChannelmappingoptionsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getLivetvChannelmappingoptions() {
      return this.getLivetvChannelmappingoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getLivetvChannelmappingsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getLivetvChannelmappings() {
      return this.getLivetvChannelmappingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available live tv channels.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getLivetvChannelsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Type': opts['Type'],
        'IsLiked': opts['IsLiked'],
        'IsDisliked': opts['IsDisliked'],
        'EnableFavoriteSorting': opts['EnableFavoriteSorting'],
        'AddCurrentProgram': opts['AddCurrentProgram'],
        'ArtistType': opts['ArtistType'],
        'MaxOfficialRating': opts['MaxOfficialRating'],
        'HasThemeSong': opts['HasThemeSong'],
        'HasThemeVideo': opts['HasThemeVideo'],
        'HasSubtitles': opts['HasSubtitles'],
        'HasSpecialFeature': opts['HasSpecialFeature'],
        'HasTrailer': opts['HasTrailer'],
        'AdjacentTo': opts['AdjacentTo'],
        'MinIndexNumber': opts['MinIndexNumber'],
        'MinStartDate': opts['MinStartDate'],
        'MaxStartDate': opts['MaxStartDate'],
        'MinEndDate': opts['MinEndDate'],
        'MaxEndDate': opts['MaxEndDate'],
        'MinPlayers': opts['MinPlayers'],
        'MaxPlayers': opts['MaxPlayers'],
        'ParentIndexNumber': opts['ParentIndexNumber'],
        'HasParentalRating': opts['HasParentalRating'],
        'IsHD': opts['IsHD'],
        'IsUnaired': opts['IsUnaired'],
        'MinCommunityRating': opts['MinCommunityRating'],
        'MinCriticRating': opts['MinCriticRating'],
        'AiredDuringSeason': opts['AiredDuringSeason'],
        'MinPremiereDate': opts['MinPremiereDate'],
        'MinDateLastSaved': opts['MinDateLastSaved'],
        'MinDateLastSavedForUser': opts['MinDateLastSavedForUser'],
        'MaxPremiereDate': opts['MaxPremiereDate'],
        'HasOverview': opts['HasOverview'],
        'HasImdbId': opts['HasImdbId'],
        'HasTmdbId': opts['HasTmdbId'],
        'HasTvdbId': opts['HasTvdbId'],
        'ExcludeItemIds': opts['ExcludeItemIds'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Recursive': opts['Recursive'],
        'SearchTerm': opts['SearchTerm'],
        'SortOrder': opts['SortOrder'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'ExcludeItemTypes': opts['ExcludeItemTypes'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'AnyProviderIdEquals': opts['AnyProviderIdEquals'],
        'Filters': opts['Filters'],
        'IsFavorite': opts['IsFavorite'],
        'IsMovie': opts['IsMovie'],
        'IsSeries': opts['IsSeries'],
        'IsFolder': opts['IsFolder'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'IsNew': opts['IsNew'],
        'IsPremiere': opts['IsPremiere'],
        'IsNewOrPremiere': opts['IsNewOrPremiere'],
        'IsRepeat': opts['IsRepeat'],
        'ProjectToMedia': opts['ProjectToMedia'],
        'MediaTypes': opts['MediaTypes'],
        'ImageTypes': opts['ImageTypes'],
        'SortBy': opts['SortBy'],
        'IsPlayed': opts['IsPlayed'],
        'Genres': opts['Genres'],
        'OfficialRatings': opts['OfficialRatings'],
        'Tags': opts['Tags'],
        'ExcludeTags': opts['ExcludeTags'],
        'Years': opts['Years'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'Person': opts['Person'],
        'PersonIds': opts['PersonIds'],
        'PersonTypes': opts['PersonTypes'],
        'Studios': opts['Studios'],
        'StudioIds': opts['StudioIds'],
        'Artists': opts['Artists'],
        'ArtistIds': opts['ArtistIds'],
        'Albums': opts['Albums'],
        'Ids': opts['Ids'],
        'VideoTypes': opts['VideoTypes'],
        'Containers': opts['Containers'],
        'AudioCodecs': opts['AudioCodecs'],
        'AudioLayouts': opts['AudioLayouts'],
        'VideoCodecs': opts['VideoCodecs'],
        'ExtendedVideoTypes': opts['ExtendedVideoTypes'],
        'SubtitleCodecs': opts['SubtitleCodecs'],
        'Path': opts['Path'],
        'UserId': opts['UserId'],
        'MinOfficialRating': opts['MinOfficialRating'],
        'IsLocked': opts['IsLocked'],
        'IsPlaceHolder': opts['IsPlaceHolder'],
        'HasOfficialRating': opts['HasOfficialRating'],
        'GroupItemsIntoCollections': opts['GroupItemsIntoCollections'],
        'Is3D': opts['Is3D'],
        'SeriesStatus': opts['SeriesStatus'],
        'NameStartsWithOrGreater': opts['NameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['ArtistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['AlbumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['NameStartsWith'],
        'NameLessThan': opts['NameLessThan']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available live tv channels.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvChannels() {
      return this.getLivetvChannelsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BaseItemDto} and HTTP response
     */
    getLivetvChannelsByIdWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': opts['UserId']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BaseItemDto}
     */
    getLivetvChannelsById() {
      return this.getLivetvChannelsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live tv channel tags
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getLivetvChanneltagsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ArtistType': opts['ArtistType'],
        'MaxOfficialRating': opts['MaxOfficialRating'],
        'HasThemeSong': opts['HasThemeSong'],
        'HasThemeVideo': opts['HasThemeVideo'],
        'HasSubtitles': opts['HasSubtitles'],
        'HasSpecialFeature': opts['HasSpecialFeature'],
        'HasTrailer': opts['HasTrailer'],
        'AdjacentTo': opts['AdjacentTo'],
        'MinIndexNumber': opts['MinIndexNumber'],
        'MinStartDate': opts['MinStartDate'],
        'MaxStartDate': opts['MaxStartDate'],
        'MinEndDate': opts['MinEndDate'],
        'MaxEndDate': opts['MaxEndDate'],
        'MinPlayers': opts['MinPlayers'],
        'MaxPlayers': opts['MaxPlayers'],
        'ParentIndexNumber': opts['ParentIndexNumber'],
        'HasParentalRating': opts['HasParentalRating'],
        'IsHD': opts['IsHD'],
        'IsUnaired': opts['IsUnaired'],
        'MinCommunityRating': opts['MinCommunityRating'],
        'MinCriticRating': opts['MinCriticRating'],
        'AiredDuringSeason': opts['AiredDuringSeason'],
        'MinPremiereDate': opts['MinPremiereDate'],
        'MinDateLastSaved': opts['MinDateLastSaved'],
        'MinDateLastSavedForUser': opts['MinDateLastSavedForUser'],
        'MaxPremiereDate': opts['MaxPremiereDate'],
        'HasOverview': opts['HasOverview'],
        'HasImdbId': opts['HasImdbId'],
        'HasTmdbId': opts['HasTmdbId'],
        'HasTvdbId': opts['HasTvdbId'],
        'ExcludeItemIds': opts['ExcludeItemIds'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Recursive': opts['Recursive'],
        'SearchTerm': opts['SearchTerm'],
        'SortOrder': opts['SortOrder'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'ExcludeItemTypes': opts['ExcludeItemTypes'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'AnyProviderIdEquals': opts['AnyProviderIdEquals'],
        'Filters': opts['Filters'],
        'IsFavorite': opts['IsFavorite'],
        'IsMovie': opts['IsMovie'],
        'IsSeries': opts['IsSeries'],
        'IsFolder': opts['IsFolder'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'IsNew': opts['IsNew'],
        'IsPremiere': opts['IsPremiere'],
        'IsNewOrPremiere': opts['IsNewOrPremiere'],
        'IsRepeat': opts['IsRepeat'],
        'ProjectToMedia': opts['ProjectToMedia'],
        'MediaTypes': opts['MediaTypes'],
        'ImageTypes': opts['ImageTypes'],
        'SortBy': opts['SortBy'],
        'IsPlayed': opts['IsPlayed'],
        'Genres': opts['Genres'],
        'OfficialRatings': opts['OfficialRatings'],
        'Tags': opts['Tags'],
        'ExcludeTags': opts['ExcludeTags'],
        'Years': opts['Years'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'Person': opts['Person'],
        'PersonIds': opts['PersonIds'],
        'PersonTypes': opts['PersonTypes'],
        'Studios': opts['Studios'],
        'StudioIds': opts['StudioIds'],
        'Artists': opts['Artists'],
        'ArtistIds': opts['ArtistIds'],
        'Albums': opts['Albums'],
        'Ids': opts['Ids'],
        'VideoTypes': opts['VideoTypes'],
        'Containers': opts['Containers'],
        'AudioCodecs': opts['AudioCodecs'],
        'AudioLayouts': opts['AudioLayouts'],
        'VideoCodecs': opts['VideoCodecs'],
        'ExtendedVideoTypes': opts['ExtendedVideoTypes'],
        'SubtitleCodecs': opts['SubtitleCodecs'],
        'Path': opts['Path'],
        'UserId': opts['UserId'],
        'MinOfficialRating': opts['MinOfficialRating'],
        'IsLocked': opts['IsLocked'],
        'IsPlaceHolder': opts['IsPlaceHolder'],
        'HasOfficialRating': opts['HasOfficialRating'],
        'GroupItemsIntoCollections': opts['GroupItemsIntoCollections'],
        'Is3D': opts['Is3D'],
        'SeriesStatus': opts['SeriesStatus'],
        'NameStartsWithOrGreater': opts['NameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['ArtistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['AlbumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['NameStartsWith'],
        'NameLessThan': opts['NameLessThan']
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
        '/LiveTv/ChannelTags', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live tv channel tags
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvChanneltags() {
      return this.getLivetvChanneltagsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live tv channel tag prefixes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ApiTagItem>} and HTTP response
     */
    getLivetvChanneltagsPrefixesWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ArtistType': opts['ArtistType'],
        'MaxOfficialRating': opts['MaxOfficialRating'],
        'HasThemeSong': opts['HasThemeSong'],
        'HasThemeVideo': opts['HasThemeVideo'],
        'HasSubtitles': opts['HasSubtitles'],
        'HasSpecialFeature': opts['HasSpecialFeature'],
        'HasTrailer': opts['HasTrailer'],
        'AdjacentTo': opts['AdjacentTo'],
        'MinIndexNumber': opts['MinIndexNumber'],
        'MinStartDate': opts['MinStartDate'],
        'MaxStartDate': opts['MaxStartDate'],
        'MinEndDate': opts['MinEndDate'],
        'MaxEndDate': opts['MaxEndDate'],
        'MinPlayers': opts['MinPlayers'],
        'MaxPlayers': opts['MaxPlayers'],
        'ParentIndexNumber': opts['ParentIndexNumber'],
        'HasParentalRating': opts['HasParentalRating'],
        'IsHD': opts['IsHD'],
        'IsUnaired': opts['IsUnaired'],
        'MinCommunityRating': opts['MinCommunityRating'],
        'MinCriticRating': opts['MinCriticRating'],
        'AiredDuringSeason': opts['AiredDuringSeason'],
        'MinPremiereDate': opts['MinPremiereDate'],
        'MinDateLastSaved': opts['MinDateLastSaved'],
        'MinDateLastSavedForUser': opts['MinDateLastSavedForUser'],
        'MaxPremiereDate': opts['MaxPremiereDate'],
        'HasOverview': opts['HasOverview'],
        'HasImdbId': opts['HasImdbId'],
        'HasTmdbId': opts['HasTmdbId'],
        'HasTvdbId': opts['HasTvdbId'],
        'ExcludeItemIds': opts['ExcludeItemIds'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Recursive': opts['Recursive'],
        'SearchTerm': opts['SearchTerm'],
        'SortOrder': opts['SortOrder'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'ExcludeItemTypes': opts['ExcludeItemTypes'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'AnyProviderIdEquals': opts['AnyProviderIdEquals'],
        'Filters': opts['Filters'],
        'IsFavorite': opts['IsFavorite'],
        'IsMovie': opts['IsMovie'],
        'IsSeries': opts['IsSeries'],
        'IsFolder': opts['IsFolder'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'IsNew': opts['IsNew'],
        'IsPremiere': opts['IsPremiere'],
        'IsNewOrPremiere': opts['IsNewOrPremiere'],
        'IsRepeat': opts['IsRepeat'],
        'ProjectToMedia': opts['ProjectToMedia'],
        'MediaTypes': opts['MediaTypes'],
        'ImageTypes': opts['ImageTypes'],
        'SortBy': opts['SortBy'],
        'IsPlayed': opts['IsPlayed'],
        'Genres': opts['Genres'],
        'OfficialRatings': opts['OfficialRatings'],
        'Tags': opts['Tags'],
        'ExcludeTags': opts['ExcludeTags'],
        'Years': opts['Years'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'Person': opts['Person'],
        'PersonIds': opts['PersonIds'],
        'PersonTypes': opts['PersonTypes'],
        'Studios': opts['Studios'],
        'StudioIds': opts['StudioIds'],
        'Artists': opts['Artists'],
        'ArtistIds': opts['ArtistIds'],
        'Albums': opts['Albums'],
        'Ids': opts['Ids'],
        'VideoTypes': opts['VideoTypes'],
        'Containers': opts['Containers'],
        'AudioCodecs': opts['AudioCodecs'],
        'AudioLayouts': opts['AudioLayouts'],
        'VideoCodecs': opts['VideoCodecs'],
        'ExtendedVideoTypes': opts['ExtendedVideoTypes'],
        'SubtitleCodecs': opts['SubtitleCodecs'],
        'Path': opts['Path'],
        'UserId': opts['UserId'],
        'MinOfficialRating': opts['MinOfficialRating'],
        'IsLocked': opts['IsLocked'],
        'IsPlaceHolder': opts['IsPlaceHolder'],
        'HasOfficialRating': opts['HasOfficialRating'],
        'GroupItemsIntoCollections': opts['GroupItemsIntoCollections'],
        'Is3D': opts['Is3D'],
        'SeriesStatus': opts['SeriesStatus'],
        'NameStartsWithOrGreater': opts['NameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['ArtistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['AlbumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['NameStartsWith'],
        'NameLessThan': opts['NameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [ApiTagItem];

      return this.apiClient.callApi(
        '/LiveTv/ChannelTags/Prefixes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live tv channel tag prefixes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ApiTagItem>}
     */
    getLivetvChanneltagsPrefixes() {
      return this.getLivetvChanneltagsPrefixesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the epg.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultApiEpgRow} and HTTP response
     */
    getLivetvEPGWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Type': opts['Type'],
        'IsLiked': opts['IsLiked'],
        'IsDisliked': opts['IsDisliked'],
        'EnableFavoriteSorting': opts['EnableFavoriteSorting'],
        'AddCurrentProgram': opts['AddCurrentProgram'],
        'ChannelIds': opts['ChannelIds'],
        'ArtistType': opts['ArtistType'],
        'MaxOfficialRating': opts['MaxOfficialRating'],
        'HasThemeSong': opts['HasThemeSong'],
        'HasThemeVideo': opts['HasThemeVideo'],
        'HasSubtitles': opts['HasSubtitles'],
        'HasSpecialFeature': opts['HasSpecialFeature'],
        'HasTrailer': opts['HasTrailer'],
        'AdjacentTo': opts['AdjacentTo'],
        'MinIndexNumber': opts['MinIndexNumber'],
        'MinStartDate': opts['MinStartDate'],
        'MaxStartDate': opts['MaxStartDate'],
        'MinEndDate': opts['MinEndDate'],
        'MaxEndDate': opts['MaxEndDate'],
        'MinPlayers': opts['MinPlayers'],
        'MaxPlayers': opts['MaxPlayers'],
        'ParentIndexNumber': opts['ParentIndexNumber'],
        'HasParentalRating': opts['HasParentalRating'],
        'IsHD': opts['IsHD'],
        'IsUnaired': opts['IsUnaired'],
        'MinCommunityRating': opts['MinCommunityRating'],
        'MinCriticRating': opts['MinCriticRating'],
        'AiredDuringSeason': opts['AiredDuringSeason'],
        'MinPremiereDate': opts['MinPremiereDate'],
        'MinDateLastSaved': opts['MinDateLastSaved'],
        'MinDateLastSavedForUser': opts['MinDateLastSavedForUser'],
        'MaxPremiereDate': opts['MaxPremiereDate'],
        'HasOverview': opts['HasOverview'],
        'HasImdbId': opts['HasImdbId'],
        'HasTmdbId': opts['HasTmdbId'],
        'HasTvdbId': opts['HasTvdbId'],
        'ExcludeItemIds': opts['ExcludeItemIds'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Recursive': opts['Recursive'],
        'SearchTerm': opts['SearchTerm'],
        'SortOrder': opts['SortOrder'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'ExcludeItemTypes': opts['ExcludeItemTypes'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'AnyProviderIdEquals': opts['AnyProviderIdEquals'],
        'Filters': opts['Filters'],
        'IsFavorite': opts['IsFavorite'],
        'IsMovie': opts['IsMovie'],
        'IsSeries': opts['IsSeries'],
        'IsFolder': opts['IsFolder'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'IsNew': opts['IsNew'],
        'IsPremiere': opts['IsPremiere'],
        'IsNewOrPremiere': opts['IsNewOrPremiere'],
        'IsRepeat': opts['IsRepeat'],
        'ProjectToMedia': opts['ProjectToMedia'],
        'MediaTypes': opts['MediaTypes'],
        'ImageTypes': opts['ImageTypes'],
        'SortBy': opts['SortBy'],
        'IsPlayed': opts['IsPlayed'],
        'Genres': opts['Genres'],
        'OfficialRatings': opts['OfficialRatings'],
        'Tags': opts['Tags'],
        'ExcludeTags': opts['ExcludeTags'],
        'Years': opts['Years'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'Person': opts['Person'],
        'PersonIds': opts['PersonIds'],
        'PersonTypes': opts['PersonTypes'],
        'Studios': opts['Studios'],
        'StudioIds': opts['StudioIds'],
        'Artists': opts['Artists'],
        'ArtistIds': opts['ArtistIds'],
        'Albums': opts['Albums'],
        'Ids': opts['Ids'],
        'VideoTypes': opts['VideoTypes'],
        'Containers': opts['Containers'],
        'AudioCodecs': opts['AudioCodecs'],
        'AudioLayouts': opts['AudioLayouts'],
        'VideoCodecs': opts['VideoCodecs'],
        'ExtendedVideoTypes': opts['ExtendedVideoTypes'],
        'SubtitleCodecs': opts['SubtitleCodecs'],
        'Path': opts['Path'],
        'UserId': opts['UserId'],
        'MinOfficialRating': opts['MinOfficialRating'],
        'IsLocked': opts['IsLocked'],
        'IsPlaceHolder': opts['IsPlaceHolder'],
        'HasOfficialRating': opts['HasOfficialRating'],
        'GroupItemsIntoCollections': opts['GroupItemsIntoCollections'],
        'Is3D': opts['Is3D'],
        'SeriesStatus': opts['SeriesStatus'],
        'NameStartsWithOrGreater': opts['NameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['ArtistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['AlbumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['NameStartsWith'],
        'NameLessThan': opts['NameLessThan']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultApiEpgRow;

      return this.apiClient.callApi(
        '/LiveTv/EPG', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the epg.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultApiEpgRow}
     */
    getLivetvEPG() {
      return this.getLivetvEPGWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the top level live tv folder
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BaseItemDto} and HTTP response
     */
    getLivetvFolderWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the top level live tv folder
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BaseItemDto}
     */
    getLivetvFolder() {
      return this.getLivetvFolderWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets guide info
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvGuideInfo} and HTTP response
     */
    getLivetvGuideinfoWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets guide info
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvGuideInfo}
     */
    getLivetvGuideinfo() {
      return this.getLivetvGuideinfoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available live tv services.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvLiveTvInfo} and HTTP response
     */
    getLivetvInfoWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available live tv services.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvLiveTvInfo}
     */
    getLivetvInfo() {
      return this.getLivetvInfoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets current listing providers
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/LiveTvListingsProviderInfo>} and HTTP response
     */
    getLivetvListingprovidersWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelId': ChannelId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets current listing providers
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/LiveTvListingsProviderInfo>}
     */
    getLivetvListingproviders() {
      return this.getLivetvListingprovidersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets listing provider
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ApiListingProviderTypeInfo>} and HTTP response
     */
    getLivetvListingprovidersAvailableWithHttpInfo() {
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
      let returnType = [ApiListingProviderTypeInfo];

      return this.apiClient.callApi(
        '/LiveTv/ListingProviders/Available', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets listing provider
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ApiListingProviderTypeInfo>}
     */
    getLivetvListingprovidersAvailable() {
      return this.getLivetvListingprovidersAvailableWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvListingsProviderInfo} and HTTP response
     */
    getLivetvListingprovidersDefaultWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvListingsProviderInfo}
     */
    getLivetvListingprovidersDefault() {
      return this.getLivetvListingprovidersDefaultWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/NameIdPair>} and HTTP response
     */
    getLivetvListingprovidersLineupsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['Id'],
        'Type': opts['Type'],
        'Location': opts['Location'],
        'Country': opts['Country']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/NameIdPair>}
     */
    getLivetvListingprovidersLineups() {
      return this.getLivetvListingprovidersLineupsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getLivetvListingprovidersSchedulesdirectCountriesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getLivetvListingprovidersSchedulesdirectCountries() {
      return this.getLivetvListingprovidersSchedulesdirectCountriesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the channel management list
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultChannelManagementInfo} and HTTP response
     */
    getLivetvManageChannelsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'SortBy': opts['SortBy'],
        'SortOrder': opts['SortOrder']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultChannelManagementInfo;

      return this.apiClient.callApi(
        '/LiveTv/Manage/Channels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the channel management list
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultChannelManagementInfo}
     */
    getLivetvManageChannels() {
      return this.getLivetvManageChannelsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getLivetvProgramsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelIds': opts['ChannelIds'],
        'ArtistType': opts['ArtistType'],
        'MaxOfficialRating': opts['MaxOfficialRating'],
        'HasThemeSong': opts['HasThemeSong'],
        'HasThemeVideo': opts['HasThemeVideo'],
        'HasSubtitles': opts['HasSubtitles'],
        'HasSpecialFeature': opts['HasSpecialFeature'],
        'HasTrailer': opts['HasTrailer'],
        'AdjacentTo': opts['AdjacentTo'],
        'MinIndexNumber': opts['MinIndexNumber'],
        'MinStartDate': opts['MinStartDate'],
        'MaxStartDate': opts['MaxStartDate'],
        'MinEndDate': opts['MinEndDate'],
        'MaxEndDate': opts['MaxEndDate'],
        'MinPlayers': opts['MinPlayers'],
        'MaxPlayers': opts['MaxPlayers'],
        'ParentIndexNumber': opts['ParentIndexNumber'],
        'HasParentalRating': opts['HasParentalRating'],
        'IsHD': opts['IsHD'],
        'IsUnaired': opts['IsUnaired'],
        'MinCommunityRating': opts['MinCommunityRating'],
        'MinCriticRating': opts['MinCriticRating'],
        'AiredDuringSeason': opts['AiredDuringSeason'],
        'MinPremiereDate': opts['MinPremiereDate'],
        'MinDateLastSaved': opts['MinDateLastSaved'],
        'MinDateLastSavedForUser': opts['MinDateLastSavedForUser'],
        'MaxPremiereDate': opts['MaxPremiereDate'],
        'HasOverview': opts['HasOverview'],
        'HasImdbId': opts['HasImdbId'],
        'HasTmdbId': opts['HasTmdbId'],
        'HasTvdbId': opts['HasTvdbId'],
        'ExcludeItemIds': opts['ExcludeItemIds'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Recursive': opts['Recursive'],
        'SearchTerm': opts['SearchTerm'],
        'SortOrder': opts['SortOrder'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'ExcludeItemTypes': opts['ExcludeItemTypes'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'AnyProviderIdEquals': opts['AnyProviderIdEquals'],
        'Filters': opts['Filters'],
        'IsFavorite': opts['IsFavorite'],
        'IsMovie': opts['IsMovie'],
        'IsSeries': opts['IsSeries'],
        'IsFolder': opts['IsFolder'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'IsNew': opts['IsNew'],
        'IsPremiere': opts['IsPremiere'],
        'IsNewOrPremiere': opts['IsNewOrPremiere'],
        'IsRepeat': opts['IsRepeat'],
        'ProjectToMedia': opts['ProjectToMedia'],
        'MediaTypes': opts['MediaTypes'],
        'ImageTypes': opts['ImageTypes'],
        'SortBy': opts['SortBy'],
        'IsPlayed': opts['IsPlayed'],
        'Genres': opts['Genres'],
        'OfficialRatings': opts['OfficialRatings'],
        'Tags': opts['Tags'],
        'ExcludeTags': opts['ExcludeTags'],
        'Years': opts['Years'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'Person': opts['Person'],
        'PersonIds': opts['PersonIds'],
        'PersonTypes': opts['PersonTypes'],
        'Studios': opts['Studios'],
        'StudioIds': opts['StudioIds'],
        'Artists': opts['Artists'],
        'ArtistIds': opts['ArtistIds'],
        'Albums': opts['Albums'],
        'Ids': opts['Ids'],
        'VideoTypes': opts['VideoTypes'],
        'Containers': opts['Containers'],
        'AudioCodecs': opts['AudioCodecs'],
        'AudioLayouts': opts['AudioLayouts'],
        'VideoCodecs': opts['VideoCodecs'],
        'ExtendedVideoTypes': opts['ExtendedVideoTypes'],
        'SubtitleCodecs': opts['SubtitleCodecs'],
        'Path': opts['Path'],
        'UserId': opts['UserId'],
        'MinOfficialRating': opts['MinOfficialRating'],
        'IsLocked': opts['IsLocked'],
        'IsPlaceHolder': opts['IsPlaceHolder'],
        'HasOfficialRating': opts['HasOfficialRating'],
        'GroupItemsIntoCollections': opts['GroupItemsIntoCollections'],
        'Is3D': opts['Is3D'],
        'SeriesStatus': opts['SeriesStatus'],
        'NameStartsWithOrGreater': opts['NameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['ArtistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['AlbumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['NameStartsWith'],
        'NameLessThan': opts['NameLessThan']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getLivetvPrograms() {
      return this.getLivetvProgramsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getLivetvProgramsRecommendedWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'IsAiring': opts['IsAiring'],
        'HasAired': opts['HasAired'],
        'IsSeries': opts['IsSeries'],
        'IsMovie': opts['IsMovie'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'GenreIds': opts['GenreIds'],
        'Fields': opts['Fields'],
        'EnableUserData': opts['EnableUserData']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvProgramsRecommended() {
      return this.getLivetvProgramsRecommendedWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getLivetvRecordingsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelId': opts['ChannelId'],
        'Status': opts['Status'],
        'IsInProgress': opts['IsInProgress'],
        'SeriesTimerId': opts['SeriesTimerId'],
        'ArtistType': opts['ArtistType'],
        'MaxOfficialRating': opts['MaxOfficialRating'],
        'HasThemeSong': opts['HasThemeSong'],
        'HasThemeVideo': opts['HasThemeVideo'],
        'HasSubtitles': opts['HasSubtitles'],
        'HasSpecialFeature': opts['HasSpecialFeature'],
        'HasTrailer': opts['HasTrailer'],
        'AdjacentTo': opts['AdjacentTo'],
        'MinIndexNumber': opts['MinIndexNumber'],
        'MinStartDate': opts['MinStartDate'],
        'MaxStartDate': opts['MaxStartDate'],
        'MinEndDate': opts['MinEndDate'],
        'MaxEndDate': opts['MaxEndDate'],
        'MinPlayers': opts['MinPlayers'],
        'MaxPlayers': opts['MaxPlayers'],
        'ParentIndexNumber': opts['ParentIndexNumber'],
        'HasParentalRating': opts['HasParentalRating'],
        'IsHD': opts['IsHD'],
        'IsUnaired': opts['IsUnaired'],
        'MinCommunityRating': opts['MinCommunityRating'],
        'MinCriticRating': opts['MinCriticRating'],
        'AiredDuringSeason': opts['AiredDuringSeason'],
        'MinPremiereDate': opts['MinPremiereDate'],
        'MinDateLastSaved': opts['MinDateLastSaved'],
        'MinDateLastSavedForUser': opts['MinDateLastSavedForUser'],
        'MaxPremiereDate': opts['MaxPremiereDate'],
        'HasOverview': opts['HasOverview'],
        'HasImdbId': opts['HasImdbId'],
        'HasTmdbId': opts['HasTmdbId'],
        'HasTvdbId': opts['HasTvdbId'],
        'ExcludeItemIds': opts['ExcludeItemIds'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Recursive': opts['Recursive'],
        'SearchTerm': opts['SearchTerm'],
        'SortOrder': opts['SortOrder'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'ExcludeItemTypes': opts['ExcludeItemTypes'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'AnyProviderIdEquals': opts['AnyProviderIdEquals'],
        'Filters': opts['Filters'],
        'IsFavorite': opts['IsFavorite'],
        'IsMovie': opts['IsMovie'],
        'IsSeries': opts['IsSeries'],
        'IsFolder': opts['IsFolder'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'IsNew': opts['IsNew'],
        'IsPremiere': opts['IsPremiere'],
        'IsNewOrPremiere': opts['IsNewOrPremiere'],
        'IsRepeat': opts['IsRepeat'],
        'ProjectToMedia': opts['ProjectToMedia'],
        'MediaTypes': opts['MediaTypes'],
        'ImageTypes': opts['ImageTypes'],
        'SortBy': opts['SortBy'],
        'IsPlayed': opts['IsPlayed'],
        'Genres': opts['Genres'],
        'OfficialRatings': opts['OfficialRatings'],
        'Tags': opts['Tags'],
        'ExcludeTags': opts['ExcludeTags'],
        'Years': opts['Years'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'Person': opts['Person'],
        'PersonIds': opts['PersonIds'],
        'PersonTypes': opts['PersonTypes'],
        'Studios': opts['Studios'],
        'StudioIds': opts['StudioIds'],
        'Artists': opts['Artists'],
        'ArtistIds': opts['ArtistIds'],
        'Albums': opts['Albums'],
        'Ids': opts['Ids'],
        'VideoTypes': opts['VideoTypes'],
        'Containers': opts['Containers'],
        'AudioCodecs': opts['AudioCodecs'],
        'AudioLayouts': opts['AudioLayouts'],
        'VideoCodecs': opts['VideoCodecs'],
        'ExtendedVideoTypes': opts['ExtendedVideoTypes'],
        'SubtitleCodecs': opts['SubtitleCodecs'],
        'Path': opts['Path'],
        'UserId': opts['UserId'],
        'MinOfficialRating': opts['MinOfficialRating'],
        'IsLocked': opts['IsLocked'],
        'IsPlaceHolder': opts['IsPlaceHolder'],
        'HasOfficialRating': opts['HasOfficialRating'],
        'GroupItemsIntoCollections': opts['GroupItemsIntoCollections'],
        'Is3D': opts['Is3D'],
        'SeriesStatus': opts['SeriesStatus'],
        'NameStartsWithOrGreater': opts['NameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['ArtistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['AlbumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['NameStartsWith'],
        'NameLessThan': opts['NameLessThan']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getLivetvRecordings() {
      return this.getLivetvRecordingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a live tv recording
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BaseItemDto} and HTTP response
     */
    getLivetvRecordingsByIdWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': opts['UserId']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a live tv recording
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BaseItemDto}
     */
    getLivetvRecordingsById() {
      return this.getLivetvRecordingsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets recording folders
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/BaseItemDto>} and HTTP response
     */
    getLivetvRecordingsFoldersWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'Fields': opts['Fields'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets recording folders
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/BaseItemDto>}
     */
    getLivetvRecordingsFolders() {
      return this.getLivetvRecordingsFoldersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live tv recording groups
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getLivetvRecordingsGroupsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live tv recording groups
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvRecordingsGroups() {
      return this.getLivetvRecordingsGroupsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getLivetvRecordingsSeriesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getLivetvRecordingsSeries() {
      return this.getLivetvRecordingsSeriesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live tv series timers
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultLiveTvSeriesTimerInfoDto} and HTTP response
     */
    getLivetvSeriestimersWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'SortBy': opts['SortBy'],
        'SortOrder': opts['SortOrder'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live tv series timers
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultLiveTvSeriesTimerInfoDto}
     */
    getLivetvSeriestimers() {
      return this.getLivetvSeriestimersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvTimerInfoDto} and HTTP response
     */
    getLivetvSeriestimersByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvTimerInfoDto}
     */
    getLivetvSeriestimersById() {
      return this.getLivetvSeriestimersByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live tv timers
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultLiveTvTimerInfoDto} and HTTP response
     */
    getLivetvTimersWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ChannelId': opts['ChannelId'],
        'SeriesTimerId': opts['SeriesTimerId']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live tv timers
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultLiveTvTimerInfoDto}
     */
    getLivetvTimers() {
      return this.getLivetvTimersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvTimerInfoDto} and HTTP response
     */
    getLivetvTimersByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvTimerInfoDto}
     */
    getLivetvTimersById() {
      return this.getLivetvTimersByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets default values for a new timer
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvSeriesTimerInfoDto} and HTTP response
     */
    getLivetvTimersDefaultsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProgramId': opts['ProgramId']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets default values for a new timer
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvSeriesTimerInfoDto}
     */
    getLivetvTimersDefaults() {
      return this.getLivetvTimersDefaultsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/LiveTvTunerHostInfo>} and HTTP response
     */
    getLivetvTunerhostsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/LiveTvTunerHostInfo>}
     */
    getLivetvTunerhosts() {
      return this.getLivetvTunerhostsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvTunerHostInfo} and HTTP response
     */
    getLivetvTunerhostsDefaultByTypeWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Type': Type
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvTunerHostInfo}
     */
    getLivetvTunerhostsDefaultByType() {
      return this.getLivetvTunerhostsDefaultByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/NameIdPair>} and HTTP response
     */
    getLivetvTunerhostsTypesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/NameIdPair>}
     */
    getLivetvTunerhostsTypes() {
      return this.getLivetvTunerhostsTypesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/LiveTvTunerHostInfo>} and HTTP response
     */
    getLivetvTunersDiscoverWithHttpInfo() {
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
        '/LiveTv/Tuners/Discover', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/LiveTvTunerHostInfo>}
     */
    getLivetvTunersDiscover() {
      return this.getLivetvTunersDiscoverWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/LiveTvTunerHostInfo>} and HTTP response
     */
    getLivetvTunersDiscvoverWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/LiveTvTunerHostInfo>}
     */
    getLivetvTunersDiscvover() {
      return this.getLivetvTunersDiscvoverWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headLivetvChannelmappingoptionsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headLivetvChannelmappingoptions() {
      return this.headLivetvChannelmappingoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headLivetvChannelmappingsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headLivetvChannelmappings() {
      return this.headLivetvChannelmappingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvChannelmappingoptionsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvChannelmappingoptions() {
      return this.postLivetvChannelmappingoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvChannelmappingsWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvChannelmappings() {
      return this.postLivetvChannelmappingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Adds a listing provider
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvListingsProviderInfo} and HTTP response
     */
    postLivetvListingprovidersWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Adds a listing provider
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvListingsProviderInfo}
     */
    postLivetvListingproviders() {
      return this.postLivetvListingprovidersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvListingprovidersDeleteWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['Id']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvListingprovidersDelete() {
      return this.postLivetvListingprovidersDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Sets a channel disabled or not
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultChannelManagementInfo} and HTTP response
     */
    postLivetvManageChannelsByIdDisabledWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id
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
      let returnType = QueryResultChannelManagementInfo;

      return this.apiClient.callApi(
        '/LiveTv/Manage/Channels/{Id}/Disabled', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Sets a channel disabled or not
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultChannelManagementInfo}
     */
    postLivetvManageChannelsByIdDisabled() {
      return this.postLivetvManageChannelsByIdDisabledWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Sets a channel sort index
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultChannelManagementInfo} and HTTP response
     */
    postLivetvManageChannelsByIdSortindexWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id
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
      let returnType = QueryResultChannelManagementInfo;

      return this.apiClient.callApi(
        '/LiveTv/Manage/Channels/{Id}/SortIndex', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Sets a channel sort index
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultChannelManagementInfo}
     */
    postLivetvManageChannelsByIdSortindex() {
      return this.postLivetvManageChannelsByIdSortindexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvProgramsWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'ChannelIds': opts['ChannelIds'],
        'ArtistType': opts['ArtistType'],
        'MaxOfficialRating': opts['MaxOfficialRating'],
        'HasThemeSong': opts['HasThemeSong'],
        'HasThemeVideo': opts['HasThemeVideo'],
        'HasSubtitles': opts['HasSubtitles'],
        'HasSpecialFeature': opts['HasSpecialFeature'],
        'HasTrailer': opts['HasTrailer'],
        'AdjacentTo': opts['AdjacentTo'],
        'MinIndexNumber': opts['MinIndexNumber'],
        'MinStartDate': opts['MinStartDate'],
        'MaxStartDate': opts['MaxStartDate'],
        'MinEndDate': opts['MinEndDate'],
        'MaxEndDate': opts['MaxEndDate'],
        'MinPlayers': opts['MinPlayers'],
        'MaxPlayers': opts['MaxPlayers'],
        'ParentIndexNumber': opts['ParentIndexNumber'],
        'HasParentalRating': opts['HasParentalRating'],
        'IsHD': opts['IsHD'],
        'IsUnaired': opts['IsUnaired'],
        'MinCommunityRating': opts['MinCommunityRating'],
        'MinCriticRating': opts['MinCriticRating'],
        'AiredDuringSeason': opts['AiredDuringSeason'],
        'MinPremiereDate': opts['MinPremiereDate'],
        'MinDateLastSaved': opts['MinDateLastSaved'],
        'MinDateLastSavedForUser': opts['MinDateLastSavedForUser'],
        'MaxPremiereDate': opts['MaxPremiereDate'],
        'HasOverview': opts['HasOverview'],
        'HasImdbId': opts['HasImdbId'],
        'HasTmdbId': opts['HasTmdbId'],
        'HasTvdbId': opts['HasTvdbId'],
        'ExcludeItemIds': opts['ExcludeItemIds'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Recursive': opts['Recursive'],
        'SearchTerm': opts['SearchTerm'],
        'SortOrder': opts['SortOrder'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'ExcludeItemTypes': opts['ExcludeItemTypes'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'AnyProviderIdEquals': opts['AnyProviderIdEquals'],
        'Filters': opts['Filters'],
        'IsFavorite': opts['IsFavorite'],
        'IsMovie': opts['IsMovie'],
        'IsSeries': opts['IsSeries'],
        'IsFolder': opts['IsFolder'],
        'IsNews': opts['IsNews'],
        'IsKids': opts['IsKids'],
        'IsSports': opts['IsSports'],
        'IsNew': opts['IsNew'],
        'IsPremiere': opts['IsPremiere'],
        'IsNewOrPremiere': opts['IsNewOrPremiere'],
        'IsRepeat': opts['IsRepeat'],
        'ProjectToMedia': opts['ProjectToMedia'],
        'MediaTypes': opts['MediaTypes'],
        'ImageTypes': opts['ImageTypes'],
        'SortBy': opts['SortBy'],
        'IsPlayed': opts['IsPlayed'],
        'Genres': opts['Genres'],
        'OfficialRatings': opts['OfficialRatings'],
        'Tags': opts['Tags'],
        'ExcludeTags': opts['ExcludeTags'],
        'Years': opts['Years'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'Person': opts['Person'],
        'PersonIds': opts['PersonIds'],
        'PersonTypes': opts['PersonTypes'],
        'Studios': opts['Studios'],
        'StudioIds': opts['StudioIds'],
        'Artists': opts['Artists'],
        'ArtistIds': opts['ArtistIds'],
        'Albums': opts['Albums'],
        'Ids': opts['Ids'],
        'VideoTypes': opts['VideoTypes'],
        'Containers': opts['Containers'],
        'AudioCodecs': opts['AudioCodecs'],
        'AudioLayouts': opts['AudioLayouts'],
        'VideoCodecs': opts['VideoCodecs'],
        'ExtendedVideoTypes': opts['ExtendedVideoTypes'],
        'SubtitleCodecs': opts['SubtitleCodecs'],
        'Path': opts['Path'],
        'UserId': opts['UserId'],
        'MinOfficialRating': opts['MinOfficialRating'],
        'IsLocked': opts['IsLocked'],
        'IsPlaceHolder': opts['IsPlaceHolder'],
        'HasOfficialRating': opts['HasOfficialRating'],
        'GroupItemsIntoCollections': opts['GroupItemsIntoCollections'],
        'Is3D': opts['Is3D'],
        'SeriesStatus': opts['SeriesStatus'],
        'NameStartsWithOrGreater': opts['NameStartsWithOrGreater'],
        'ArtistStartsWithOrGreater': opts['ArtistStartsWithOrGreater'],
        'AlbumArtistStartsWithOrGreater': opts['AlbumArtistStartsWithOrGreater'],
        'NameStartsWith': opts['NameStartsWith'],
        'NameLessThan': opts['NameLessThan']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvPrograms() {
      return this.postLivetvProgramsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvRecordingsByIdDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvRecordingsByIdDelete() {
      return this.postLivetvRecordingsByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Creates a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvSeriesTimerInfoDto} and HTTP response
     */
    postLivetvSeriestimersWithHttpInfo() {
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
      let returnType = LiveTvSeriesTimerInfoDto;

      return this.apiClient.callApi(
        '/LiveTv/SeriesTimers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Creates a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvSeriesTimerInfoDto}
     */
    postLivetvSeriestimers() {
      return this.postLivetvSeriestimersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvSeriestimersByIdWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvSeriestimersById() {
      return this.postLivetvSeriestimersByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvSeriestimersByIdDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvSeriestimersByIdDelete() {
      return this.postLivetvSeriestimersByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Creates a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvTimersWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Creates a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvTimers() {
      return this.postLivetvTimersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvTimersByIdWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvTimersById() {
      return this.postLivetvTimersByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvTimersByIdDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvTimersByIdDelete() {
      return this.postLivetvTimersByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Adds a tuner host
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveTvTunerHostInfo} and HTTP response
     */
    postLivetvTunerhostsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Adds a tuner host
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveTvTunerHostInfo}
     */
    postLivetvTunerhosts() {
      return this.postLivetvTunerhostsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvTunerhostsDeleteWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['Id']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvTunerhostsDelete() {
      return this.postLivetvTunerhostsDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Resets a tv tuner
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivetvTunersByIdResetWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Resets a tv tuner
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivetvTunersByIdReset() {
      return this.postLivetvTunersByIdResetWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    putLivetvChannelmappingoptionsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    putLivetvChannelmappingoptions() {
      return this.putLivetvChannelmappingoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    putLivetvChannelmappingsWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'ProviderId': ProviderId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    putLivetvChannelmappings() {
      return this.putLivetvChannelmappingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
