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
import ImageInfo from '../model/ImageInfo';
import ImageType from '../model/ImageType';

/**
* ImageService service.
* @module EmbyClient.JavaScript/ImageServiceApi
* @version 4.8.10.0
*/
export default class ImageServiceApi {

    /**
    * Constructs a new ImageServiceApi. 
    * @alias module:EmbyClient.JavaScript/ImageServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteItemsByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~deleteItemsByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~deleteItemsByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteItemsByIdImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'Index': opts['index']
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
        '/Items/{Id}/Images/{Type}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteItemsByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~deleteItemsByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~deleteItemsByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteItemsByIdImagesByTypeByIndex() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
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
        '/Items/{Id}/Images/{Type}/{Index}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteUsersByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~deleteUsersByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~deleteUsersByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteUsersByIdImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'Index': opts['index']
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
        '/Users/{Id}/Images/{Type}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteUsersByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~deleteUsersByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~deleteUsersByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteUsersByIdImagesByTypeByIndex() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
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
        '/Users/{Id}/Images/{Type}/{Index}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getArtistsByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getArtistsByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getArtistsByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getArtistsByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Artists/{Name}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getArtistsByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getArtistsByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getArtistsByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getArtistsByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Artists/{Name}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getGamegenresByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getGamegenresByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getGamegenresByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getGamegenresByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/GameGenres/{Name}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getGamegenresByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getGamegenresByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getGamegenresByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getGamegenresByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/GameGenres/{Name}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getGenresByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getGenresByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getGenresByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getGenresByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Genres/{Name}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getGenresByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getGenresByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getGenresByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getGenresByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Genres/{Name}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdImages operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ImageInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets information about an item&#x27;s images
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ImageInfo>}
     */
    getItemsByIdImages() {
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
      let returnType = [ImageInfo];

      return this.apiClient.callApi(
        '/Items/{Id}/Images', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsByIdImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Items/{Id}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsByIdImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Items/{Id}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'PercentPlayed': percentPlayed,
        'UnPlayedCount': unPlayedCount,
        'Id': id,
        'MaxWidth': maxWidth,
        'MaxHeight': maxHeight,
        'Tag': tag,
        'Format': format,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getMusicgenresByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getMusicgenresByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getMusicgenresByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getMusicgenresByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/MusicGenres/{Name}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getMusicgenresByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getMusicgenresByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getMusicgenresByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getMusicgenresByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/MusicGenres/{Name}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPersonsByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getPersonsByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getPersonsByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getPersonsByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Persons/{Name}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPersonsByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getPersonsByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getPersonsByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getPersonsByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Persons/{Name}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getStudiosByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getStudiosByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getStudiosByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getStudiosByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Studios/{Name}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getStudiosByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getStudiosByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getStudiosByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getStudiosByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Studios/{Name}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getUsersByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getUsersByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getUsersByIdImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Users/{Id}/Images/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~getUsersByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~getUsersByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getUsersByIdImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Users/{Id}/Images/{Type}/{Index}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headArtistsByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headArtistsByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headArtistsByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headArtistsByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Artists/{Name}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headArtistsByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headArtistsByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headArtistsByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headArtistsByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Artists/{Name}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headGamegenresByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headGamegenresByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headGamegenresByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headGamegenresByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/GameGenres/{Name}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headGamegenresByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headGamegenresByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headGamegenresByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headGamegenresByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/GameGenres/{Name}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headGenresByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headGenresByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headGenresByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headGenresByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Genres/{Name}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headGenresByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headGenresByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headGenresByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headGenresByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Genres/{Name}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headItemsByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headItemsByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headItemsByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headItemsByIdImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Items/{Id}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headItemsByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headItemsByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headItemsByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headItemsByIdImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Items/{Id}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'PercentPlayed': percentPlayed,
        'UnPlayedCount': unPlayedCount,
        'Id': id,
        'MaxWidth': maxWidth,
        'MaxHeight': maxHeight,
        'Tag': tag,
        'Format': format,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headMusicgenresByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headMusicgenresByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headMusicgenresByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headMusicgenresByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/MusicGenres/{Name}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headMusicgenresByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headMusicgenresByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headMusicgenresByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headMusicgenresByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/MusicGenres/{Name}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headPersonsByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headPersonsByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headPersonsByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headPersonsByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Persons/{Name}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headPersonsByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headPersonsByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headPersonsByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headPersonsByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Persons/{Name}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headStudiosByNameImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headStudiosByNameImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headStudiosByNameImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headStudiosByNameImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Studios/{Name}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headStudiosByNameImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headStudiosByNameImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headStudiosByNameImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headStudiosByNameImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Studios/{Name}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headUsersByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headUsersByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headUsersByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headUsersByIdImagesByType() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation'],
        'Index': opts['index']
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
        '/Users/{Id}/Images/{Type}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headUsersByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~headUsersByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~headUsersByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headUsersByIdImagesByTypeByIndex() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'Width': opts['width'],
        'Height': opts['height'],
        'Quality': opts['quality'],
        'Tag': opts['tag'],
        'CropWhitespace': opts['cropWhitespace'],
        'EnableImageEnhancers': opts['enableImageEnhancers'],
        'Format': opts['format'],
        'BackgroundColor': opts['backgroundColor'],
        'ForegroundLayer': opts['foregroundLayer'],
        'AutoOrient': opts['autoOrient'],
        'KeepAnimation': opts['keepAnimation']
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
        '/Users/{Id}/Images/{Type}/{Index}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdImagesByType() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'Index': opts['index']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Items/{Id}/Images/{Type}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdImagesByTypeByIndex() {
      let postBody = body;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Items/{Id}/Images/{Type}/{Index}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdImagesByTypeByIndexDelete operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdImagesByTypeByIndexDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
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
        '/Items/{Id}/Images/{Type}/{Index}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdImagesByTypeByIndexIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdImagesByTypeByIndexIndex() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'NewIndex': newIndex
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
        '/Items/{Id}/Images/{Type}/{Index}/Index', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdImagesByTypeByIndexUrl operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexUrlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeByIndexUrlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdImagesByTypeByIndexUrl() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
        'Url': url
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
        '/Items/{Id}/Images/{Type}/{Index}/Url', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdImagesByTypeDelete operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postItemsByIdImagesByTypeDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdImagesByTypeDelete() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'Index': opts['index']
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
        '/Items/{Id}/Images/{Type}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdImagesByType operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdImagesByType() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'Index': opts['index']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{Id}/Images/{Type}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdImagesByTypeByIndex operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdImagesByTypeByIndex() {
      let postBody = body;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{Id}/Images/{Type}/{Index}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdImagesByTypeByIndexDelete operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeByIndexDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeByIndexDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdImagesByTypeByIndexDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type,
        'Index': index
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
        '/Users/{Id}/Images/{Type}/{Index}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdImagesByTypeDelete operation.
     * @callback module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ImageServiceApi~postUsersByIdImagesByTypeDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdImagesByTypeDelete() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Type': type
      };
      let queryParams = {
        'Index': opts['index']
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
        '/Users/{Id}/Images/{Type}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
