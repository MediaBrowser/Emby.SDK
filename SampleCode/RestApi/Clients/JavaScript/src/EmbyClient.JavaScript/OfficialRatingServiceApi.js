/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from "../ApiClient";
import QueryResultUserLibraryOfficialRatingItem from '../model/QueryResultUserLibraryOfficialRatingItem';

/**
* OfficialRatingService service.
* @module EmbyClient.JavaScript/OfficialRatingServiceApi
* @version 4.8.10.0
*/
export default class OfficialRatingServiceApi {

    /**
    * Constructs a new OfficialRatingServiceApi. 
    * @alias module:EmbyClient.JavaScript/OfficialRatingServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getOfficialratings operation.
     * @callback module:EmbyClient.JavaScript/OfficialRatingServiceApi~getOfficialratingsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultUserLibraryOfficialRatingItem} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets items based on a query.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/OfficialRatingServiceApi~getOfficialratingsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultUserLibraryOfficialRatingItem}
     */
    getOfficialratings() {
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
        'MinStartDate': opts['minStartDate'],
        'MaxStartDate': opts['maxStartDate'],
        'MinEndDate': opts['minEndDate'],
        'MaxEndDate': opts['maxEndDate'],
        'MinPlayers': opts['minPlayers'],
        'MaxPlayers': opts['maxPlayers'],
        'ParentIndexNumber': opts['parentIndexNumber'],
        'HasParentalRating': opts['hasParentalRating'],
        'IsHD': opts['isHD'],
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
        'IsFolder': opts['isFolder'],
        'IsNews': opts['isNews'],
        'IsKids': opts['isKids'],
        'IsSports': opts['isSports'],
        'IsNew': opts['isNew'],
        'IsPremiere': opts['isPremiere'],
        'IsNewOrPremiere': opts['isNewOrPremiere'],
        'IsRepeat': opts['isRepeat'],
        'ProjectToMedia': opts['projectToMedia'],
        'MediaTypes': opts['mediaTypes'],
        'ImageTypes': opts['imageTypes'],
        'SortBy': opts['sortBy'],
        'IsPlayed': opts['isPlayed'],
        'Genres': opts['genres'],
        'OfficialRatings': opts['officialRatings'],
        'Tags': opts['tags'],
        'ExcludeTags': opts['excludeTags'],
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
        'AudioLayouts': opts['audioLayouts'],
        'VideoCodecs': opts['videoCodecs'],
        'ExtendedVideoTypes': opts['extendedVideoTypes'],
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
      let returnType = QueryResultUserLibraryOfficialRatingItem;

      return this.apiClient.callApi(
        '/OfficialRatings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
