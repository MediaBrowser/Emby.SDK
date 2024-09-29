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
import AllThemeMediaResult from '../model/AllThemeMediaResult';
import BaseItemDto from '../model/BaseItemDto';
import ItemCounts from '../model/ItemCounts';
import LibraryDeleteInfo from '../model/LibraryDeleteInfo';
import LibraryLibraryOptionsResult from '../model/LibraryLibraryOptionsResult';
import LibraryMediaFolder from '../model/LibraryMediaFolder';
import LibraryPostUpdatedMedia from '../model/LibraryPostUpdatedMedia';
import PersistenceIntroDebugInfo from '../model/PersistenceIntroDebugInfo';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';
import ThemeMediaResult from '../model/ThemeMediaResult';

/**
* LibraryService service.
* @module EmbyClient.JavaScript/LibraryServiceApi
* @version 4.8.10.0
*/
export default class LibraryServiceApi {

    /**
    * Constructs a new LibraryServiceApi. 
    * @alias module:EmbyClient.JavaScript/LibraryServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteItems operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~deleteItemsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~deleteItemsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteItems() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Ids': ids
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
        '/Items', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteItemsById operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~deleteItemsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~deleteItemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteItemsById() {
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
        '/Items/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getAlbumsByIdSimilar operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getAlbumsByIdSimilarCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getAlbumsByIdSimilarCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getAlbumsByIdSimilar() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'IncludeItemTypes': opts['includeItemTypes'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'Fields': opts['fields']
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
        '/Albums/{Id}/Similar', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getArtistsByIdSimilar operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getArtistsByIdSimilarCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getArtistsByIdSimilarCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getArtistsByIdSimilar() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'IncludeItemTypes': opts['includeItemTypes'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'Fields': opts['fields']
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
        '/Artists/{Id}/Similar', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getGamesByIdSimilar operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getGamesByIdSimilarCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getGamesByIdSimilarCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getGamesByIdSimilar() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'IncludeItemTypes': opts['includeItemTypes'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'Fields': opts['fields']
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
        '/Games/{Id}/Similar', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdAncestors operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdAncestorsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/BaseItemDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all parents of an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdAncestorsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/BaseItemDto>}
     */
    getItemsByIdAncestors() {
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
      let returnType = [BaseItemDto];

      return this.apiClient.callApi(
        '/Items/{Id}/Ancestors', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdCriticreviews operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdCriticreviewsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets critic reviews for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdCriticreviewsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getItemsByIdCriticreviews() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
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
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/Items/{Id}/CriticReviews', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdDeleteinfo operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdDeleteinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LibraryDeleteInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets delete info for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdDeleteinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LibraryDeleteInfo}
     */
    getItemsByIdDeleteinfo() {
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
      let returnType = LibraryDeleteInfo;

      return this.apiClient.callApi(
        '/Items/{Id}/DeleteInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdDownload operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdDownloadCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Downloads item media
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdDownloadCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsByIdDownload() {
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
        '/Items/{Id}/Download', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdFile operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdFileCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the original file of an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdFileCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsByIdFile() {
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
        '/Items/{Id}/File', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdSimilar operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdSimilarCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets similar items
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdSimilarCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getItemsByIdSimilar() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'IncludeItemTypes': opts['includeItemTypes'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'Fields': opts['fields']
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
        '/Items/{Id}/Similar', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdThememedia operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdThememediaCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AllThemeMediaResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets theme videos and songs for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdThememediaCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AllThemeMediaResult}
     */
    getItemsByIdThememedia() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId'],
        'InheritFromParent': opts['inheritFromParent'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData'],
        'Fields': opts['fields']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = AllThemeMediaResult;

      return this.apiClient.callApi(
        '/Items/{Id}/ThemeMedia', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdThemesongs operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdThemesongsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ThemeMediaResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets theme songs for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdThemesongsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ThemeMediaResult}
     */
    getItemsByIdThemesongs() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId'],
        'InheritFromParent': opts['inheritFromParent'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData'],
        'Fields': opts['fields']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = ThemeMediaResult;

      return this.apiClient.callApi(
        '/Items/{Id}/ThemeSongs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdThemevideos operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdThemevideosCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ThemeMediaResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets theme videos for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsByIdThemevideosCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ThemeMediaResult}
     */
    getItemsByIdThemevideos() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId'],
        'InheritFromParent': opts['inheritFromParent'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData'],
        'Fields': opts['fields']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = ThemeMediaResult;

      return this.apiClient.callApi(
        '/Items/{Id}/ThemeVideos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsCounts operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsCountsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ItemCounts} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsCountsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ItemCounts}
     */
    getItemsCounts() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['userId'],
        'IsFavorite': opts['isFavorite']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = ItemCounts;

      return this.apiClient.callApi(
        '/Items/Counts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsIntros operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getItemsIntrosCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/PersistenceIntroDebugInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets info to debug intros
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getItemsIntrosCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/PersistenceIntroDebugInfo>}
     */
    getItemsIntros() {
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
      let returnType = [PersistenceIntroDebugInfo];

      return this.apiClient.callApi(
        '/Items/Intros', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLibrariesAvailableoptions operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getLibrariesAvailableoptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LibraryLibraryOptionsResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getLibrariesAvailableoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LibraryLibraryOptionsResult}
     */
    getLibrariesAvailableoptions() {
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
      let returnType = LibraryLibraryOptionsResult;

      return this.apiClient.callApi(
        '/Libraries/AvailableOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLibraryMediafolders operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getLibraryMediafoldersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getLibraryMediafoldersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getLibraryMediafolders() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'IsHidden': opts['isHidden']
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
        '/Library/MediaFolders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLibraryPhysicalpaths operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getLibraryPhysicalpathsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of physical paths from virtual folders
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getLibraryPhysicalpathsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<'String'>}
     */
    getLibraryPhysicalpaths() {
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
      let returnType = ['String'];

      return this.apiClient.callApi(
        '/Library/PhysicalPaths', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLibrarySelectablemediafolders operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getLibrarySelectablemediafoldersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LibraryMediaFolder>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getLibrarySelectablemediafoldersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LibraryMediaFolder>}
     */
    getLibrarySelectablemediafolders() {
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
      let returnType = [LibraryMediaFolder];

      return this.apiClient.callApi(
        '/Library/SelectableMediaFolders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getMoviesByIdSimilar operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getMoviesByIdSimilarCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds movies and trailers similar to a given movie.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getMoviesByIdSimilarCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getMoviesByIdSimilar() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'IncludeItemTypes': opts['includeItemTypes'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'Fields': opts['fields']
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
        '/Movies/{Id}/Similar', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getShowsByIdSimilar operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getShowsByIdSimilarCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds tv shows similar to a given one.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getShowsByIdSimilarCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getShowsByIdSimilar() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'IncludeItemTypes': opts['includeItemTypes'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'Fields': opts['fields']
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
        '/Shows/{Id}/Similar', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getTrailersByIdSimilar operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~getTrailersByIdSimilarCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds movies and trailers similar to a given trailer.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~getTrailersByIdSimilarCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getTrailersByIdSimilar() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'IncludeItemTypes': opts['includeItemTypes'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'UserId': opts['userId'],
        'Limit': opts['limit'],
        'Fields': opts['fields']
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
        '/Trailers/{Id}/Similar', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postItemsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postItemsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdDelete() {
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
        '/Items/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsDelete operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postItemsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postItemsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsDelete() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Ids': ids
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
        '/Items/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryMediaUpdated operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryMediaUpdatedCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports that new movies have been added by an external source
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryMediaUpdatedCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryMediaUpdated() {
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
        '/Library/Media/Updated', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryMoviesAdded operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryMoviesAddedCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryMoviesAddedCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryMoviesAdded() {
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
        '/Library/Movies/Added', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryMoviesUpdated operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryMoviesUpdatedCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryMoviesUpdatedCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryMoviesUpdated() {
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
        '/Library/Movies/Updated', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryRefresh operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryRefreshCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Starts a library scan
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postLibraryRefreshCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryRefresh() {
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
        '/Library/Refresh', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibrarySeriesAdded operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postLibrarySeriesAddedCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postLibrarySeriesAddedCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibrarySeriesAdded() {
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
        '/Library/Series/Added', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibrarySeriesUpdated operation.
     * @callback module:EmbyClient.JavaScript/LibraryServiceApi~postLibrarySeriesUpdatedCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LibraryServiceApi~postLibrarySeriesUpdatedCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibrarySeriesUpdated() {
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
        '/Library/Series/Updated', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
