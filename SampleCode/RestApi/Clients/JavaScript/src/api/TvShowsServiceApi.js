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
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';

/**
* TvShowsService service.
* @module api/TvShowsServiceApi
* @version 4.9.0.25
*/
export default class TvShowsServiceApi {

    /**
    * Constructs a new TvShowsServiceApi. 
    * @alias module:api/TvShowsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets episodes for a tv season
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getShowsByIdEpisodesWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'Season': opts['Season'],
        'SeasonId': opts['SeasonId'],
        'StartItemId': opts['StartItemId'],
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
        '/Shows/{Id}/Episodes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets episodes for a tv season
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getShowsByIdEpisodes() {
      return this.getShowsByIdEpisodesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets seasons for a tv series
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getShowsByIdSeasonsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': UserId,
        'Fields': opts['Fields'],
        'IsSpecialSeason': opts['IsSpecialSeason'],
        'AdjacentTo': opts['AdjacentTo'],
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
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/Shows/{Id}/Seasons', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets seasons for a tv series
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getShowsByIdSeasons() {
      return this.getShowsByIdSeasonsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of missing episodes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getShowsMissingWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Shows/Missing', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of missing episodes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getShowsMissing() {
      return this.getShowsMissingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of next up episodes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getShowsNextupWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': UserId,
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields'],
        'SeriesId': opts['SeriesId'],
        'ParentId': opts['ParentId'],
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
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/Shows/NextUp', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of next up episodes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getShowsNextup() {
      return this.getShowsNextupWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of upcoming episodes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getShowsUpcomingWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Shows/Upcoming', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of upcoming episodes
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getShowsUpcoming() {
      return this.getShowsUpcomingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
