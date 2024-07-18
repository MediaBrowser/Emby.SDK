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
import BaseItemDto from '../model/BaseItemDto';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';

/**
* ArtistsService service.
* @module api/ArtistsServiceApi
* @version 4.9.0.27
*/
export default class ArtistsServiceApi {

    /**
    * Constructs a new ArtistsServiceApi. 
    * @alias module:api/ArtistsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets all artists from a given item, folder, or the entire library
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getArtistsWithHttpInfo() {
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
        '/Artists', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets all artists from a given item, folder, or the entire library
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getArtists() {
      return this.getArtistsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets all album artists from a given item, folder, or the entire library
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getArtistsAlbumartistsWithHttpInfo() {
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
        '/Artists/AlbumArtists', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets all album artists from a given item, folder, or the entire library
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getArtistsAlbumartists() {
      return this.getArtistsAlbumartistsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an artist, by name
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BaseItemDto} and HTTP response
     */
    getArtistsByNameWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name
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
        '/Artists/{Name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an artist, by name
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BaseItemDto}
     */
    getArtistsByName() {
      return this.getArtistsByNameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
