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
* GenresService service.
* @module EmbyClient.JavaScript.Beta/GenresServiceApi
* @version 4.8.0.19
*/
export default class GenresServiceApi {

    /**
    * Constructs a new GenresServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/GenresServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getGenres operation.
     * @callback module:EmbyClient.JavaScript.Beta/GenresServiceApi~getGenresCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all genres from a given item, folder, or the entire library
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/GenresServiceApi~getGenresCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getGenres() {
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

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/Genres', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getGenresByName operation.
     * @callback module:EmbyClient.JavaScript.Beta/GenresServiceApi~getGenresByNameCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a genre, by name
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/GenresServiceApi~getGenresByNameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseItemDto}
     */
    getGenresByName() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name
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
        '/Genres/{Name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
