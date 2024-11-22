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
import AllThemeMediaResult from '../model/AllThemeMediaResult';
import BaseItemDto from '../model/BaseItemDto';
import ItemCounts from '../model/ItemCounts';
import LibraryDeleteInfo from '../model/LibraryDeleteInfo';
import LibraryMediaFolder from '../model/LibraryMediaFolder';
import LibraryOptionsResult from '../model/LibraryOptionsResult';
import LibraryPostUpdatedMedia from '../model/LibraryPostUpdatedMedia';
import PersistenceIntroDebugInfo from '../model/PersistenceIntroDebugInfo';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';
import ThemeMediaResult from '../model/ThemeMediaResult';

/**
* LibraryService service.
* @module api/LibraryServiceApi
* @version 4.9.0.32
*/
export default class LibraryServiceApi {

    /**
    * Constructs a new LibraryServiceApi. 
    * @alias module:api/LibraryServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteItemsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Ids': Ids
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteItems() {
      return this.deleteItemsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteItemsByIdWithHttpInfo() {
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
        '/Items/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteItemsById() {
      return this.deleteItemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getAlbumsByIdSimilarWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getAlbumsByIdSimilar() {
      return this.getAlbumsByIdSimilarWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getArtistsByIdSimilarWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getArtistsByIdSimilar() {
      return this.getArtistsByIdSimilarWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getGamesByIdSimilarWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getGamesByIdSimilar() {
      return this.getGamesByIdSimilarWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets all parents of an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/BaseItemDto>} and HTTP response
     */
    getItemsByIdAncestorsWithHttpInfo() {
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
      let returnType = [BaseItemDto];

      return this.apiClient.callApi(
        '/Items/{Id}/Ancestors', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets all parents of an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/BaseItemDto>}
     */
    getItemsByIdAncestors() {
      return this.getItemsByIdAncestorsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets critic reviews for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getItemsByIdCriticreviewsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
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
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/Items/{Id}/CriticReviews', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets critic reviews for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getItemsByIdCriticreviews() {
      return this.getItemsByIdCriticreviewsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets delete info for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LibraryDeleteInfo} and HTTP response
     */
    getItemsByIdDeleteinfoWithHttpInfo() {
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
      let returnType = LibraryDeleteInfo;

      return this.apiClient.callApi(
        '/Items/{Id}/DeleteInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets delete info for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LibraryDeleteInfo}
     */
    getItemsByIdDeleteinfo() {
      return this.getItemsByIdDeleteinfoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Downloads item media
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsByIdDownloadWithHttpInfo() {
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
        '/Items/{Id}/Download', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Downloads item media
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsByIdDownload() {
      return this.getItemsByIdDownloadWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the original file of an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsByIdFileWithHttpInfo() {
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
        '/Items/{Id}/File', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the original file of an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsByIdFile() {
      return this.getItemsByIdFileWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets similar items
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getItemsByIdSimilarWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets similar items
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getItemsByIdSimilar() {
      return this.getItemsByIdSimilarWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets theme videos and songs for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/AllThemeMediaResult} and HTTP response
     */
    getItemsByIdThememediaWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'InheritFromParent': opts['InheritFromParent'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets theme videos and songs for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/AllThemeMediaResult}
     */
    getItemsByIdThememedia() {
      return this.getItemsByIdThememediaWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets theme songs for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ThemeMediaResult} and HTTP response
     */
    getItemsByIdThemesongsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'InheritFromParent': opts['InheritFromParent'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets theme songs for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ThemeMediaResult}
     */
    getItemsByIdThemesongs() {
      return this.getItemsByIdThemesongsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets theme videos for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ThemeMediaResult} and HTTP response
     */
    getItemsByIdThemevideosWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'InheritFromParent': opts['InheritFromParent'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets theme videos for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ThemeMediaResult}
     */
    getItemsByIdThemevideos() {
      return this.getItemsByIdThemevideosWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ItemCounts} and HTTP response
     */
    getItemsCountsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'IsFavorite': opts['IsFavorite']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ItemCounts}
     */
    getItemsCounts() {
      return this.getItemsCountsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets info to debug intros
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/PersistenceIntroDebugInfo>} and HTTP response
     */
    getItemsIntrosWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets info to debug intros
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PersistenceIntroDebugInfo>}
     */
    getItemsIntros() {
      return this.getItemsIntrosWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LibraryOptionsResult} and HTTP response
     */
    getLibrariesAvailableoptionsWithHttpInfo() {
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
      let returnType = LibraryOptionsResult;

      return this.apiClient.callApi(
        '/Libraries/AvailableOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LibraryOptionsResult}
     */
    getLibrariesAvailableoptions() {
      return this.getLibrariesAvailableoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getLibraryMediafoldersWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'IsHidden': opts['IsHidden']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getLibraryMediafolders() {
      return this.getLibraryMediafoldersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of physical paths from virtual folders
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<'String'>} and HTTP response
     */
    getLibraryPhysicalpathsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of physical paths from virtual folders
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<'String'>}
     */
    getLibraryPhysicalpaths() {
      return this.getLibraryPhysicalpathsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/LibraryMediaFolder>} and HTTP response
     */
    getLibrarySelectablemediafoldersWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/LibraryMediaFolder>}
     */
    getLibrarySelectablemediafolders() {
      return this.getLibrarySelectablemediafoldersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds movies and trailers similar to a given movie.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getMoviesByIdSimilarWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds movies and trailers similar to a given movie.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getMoviesByIdSimilar() {
      return this.getMoviesByIdSimilarWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds tv shows similar to a given one.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getShowsByIdSimilarWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds tv shows similar to a given one.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getShowsByIdSimilar() {
      return this.getShowsByIdSimilarWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds movies and trailers similar to a given trailer.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getTrailersByIdSimilarWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'UserId': opts['UserId'],
        'Limit': opts['Limit'],
        'Fields': opts['Fields']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds movies and trailers similar to a given trailer.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getTrailersByIdSimilar() {
      return this.getTrailersByIdSimilarWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdDeleteWithHttpInfo() {
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
        '/Items/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdDelete() {
      return this.postItemsByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Ids': Ids
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsDelete() {
      return this.postItemsDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports that new movies have been added by an external source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryMediaUpdatedWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports that new movies have been added by an external source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryMediaUpdated() {
      return this.postLibraryMediaUpdatedWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryMoviesAddedWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryMoviesAdded() {
      return this.postLibraryMoviesAddedWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryMoviesUpdatedWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryMoviesUpdated() {
      return this.postLibraryMoviesUpdatedWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Starts a library scan
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryRefreshWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Starts a library scan
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryRefresh() {
      return this.postLibraryRefreshWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibrarySeriesAddedWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibrarySeriesAdded() {
      return this.postLibrarySeriesAddedWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibrarySeriesUpdatedWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibrarySeriesUpdated() {
      return this.postLibrarySeriesUpdatedWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
