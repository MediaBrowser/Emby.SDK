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
import PlaylistsAddToPlaylistResult from '../model/PlaylistsAddToPlaylistResult';
import PlaylistsPlaylistCreationResult from '../model/PlaylistsPlaylistCreationResult';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';

/**
* PlaylistService service.
* @module EmbyClient.JavaScript/PlaylistServiceApi
* @version 4.8.10.0
*/
export default class PlaylistServiceApi {

    /**
    * Constructs a new PlaylistServiceApi. 
    * @alias module:EmbyClient.JavaScript/PlaylistServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deletePlaylistsByIdItems operation.
     * @callback module:EmbyClient.JavaScript/PlaylistServiceApi~deletePlaylistsByIdItemsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes items from a playlist
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaylistServiceApi~deletePlaylistsByIdItemsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deletePlaylistsByIdItems() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'EntryIds': entryIds
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
        '/Playlists/{Id}/Items', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPlaylistsByIdAddtoplaylistinfo operation.
     * @callback module:EmbyClient.JavaScript/PlaylistServiceApi~getPlaylistsByIdAddtoplaylistinfoCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets add to playlist info
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaylistServiceApi~getPlaylistsByIdAddtoplaylistinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    getPlaylistsByIdAddtoplaylistinfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId'],
        'Ids': ids
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = Object;

      return this.apiClient.callApi(
        '/Playlists/{Id}/AddToPlaylistInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPlaylistsByIdItems operation.
     * @callback module:EmbyClient.JavaScript/PlaylistServiceApi~getPlaylistsByIdItemsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the original items of a playlist
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaylistServiceApi~getPlaylistsByIdItemsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getPlaylistsByIdItems() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'Fields': opts['fields'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes']
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
        '/Playlists/{Id}/Items', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPlaylists operation.
     * @callback module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PlaylistsPlaylistCreationResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a new playlist
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PlaylistsPlaylistCreationResult}
     */
    postPlaylists() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Name': opts['name'],
        'Ids': opts['ids'],
        'MediaType': opts['mediaType']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = PlaylistsPlaylistCreationResult;

      return this.apiClient.callApi(
        '/Playlists', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPlaylistsByIdItems operation.
     * @callback module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsByIdItemsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PlaylistsAddToPlaylistResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Adds items to a playlist
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsByIdItemsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PlaylistsAddToPlaylistResult}
     */
    postPlaylistsByIdItems() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId'],
        'Ids': ids
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = PlaylistsAddToPlaylistResult;

      return this.apiClient.callApi(
        '/Playlists/{Id}/Items', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPlaylistsByIdItemsByItemidMoveByNewindex operation.
     * @callback module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsByIdItemsByItemidMoveByNewindexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Moves a playlist item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsByIdItemsByItemidMoveByNewindexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postPlaylistsByIdItemsByItemidMoveByNewindex() {
      let postBody = null;

      let pathParams = {
        'ItemId': itemId,
        'Id': id,
        'NewIndex': newIndex
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
        '/Playlists/{Id}/Items/{ItemId}/Move/{NewIndex}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPlaylistsByIdItemsDelete operation.
     * @callback module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsByIdItemsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes items from a playlist
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaylistServiceApi~postPlaylistsByIdItemsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postPlaylistsByIdItemsDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'EntryIds': entryIds
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
        '/Playlists/{Id}/Items/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
