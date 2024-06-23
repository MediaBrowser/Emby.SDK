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
import ImageInfo from '../model/ImageInfo';
import ImageType from '../model/ImageType';

/**
* ImageService service.
* @module api/ImageServiceApi
* @version 4.9.0.26
*/
export default class ImageServiceApi {

    /**
    * Constructs a new ImageServiceApi. 
    * @alias module:api/ImageServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteItemsByIdImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteItemsByIdImagesByType() {
      return this.deleteItemsByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteItemsByIdImagesByTypeByIndexWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Items/{Id}/Images/{Type}/{Index}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteItemsByIdImagesByTypeByIndex() {
      return this.deleteItemsByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteUsersByIdImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteUsersByIdImagesByType() {
      return this.deleteUsersByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteUsersByIdImagesByTypeByIndexWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{Id}/Images/{Type}/{Index}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteUsersByIdImagesByTypeByIndex() {
      return this.deleteUsersByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getArtistsByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getArtistsByNameImagesByType() {
      return this.getArtistsByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getArtistsByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getArtistsByNameImagesByTypeByIndex() {
      return this.getArtistsByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getGamegenresByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getGamegenresByNameImagesByType() {
      return this.getGamegenresByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getGamegenresByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getGamegenresByNameImagesByTypeByIndex() {
      return this.getGamegenresByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getGenresByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getGenresByNameImagesByType() {
      return this.getGenresByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getGenresByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getGenresByNameImagesByTypeByIndex() {
      return this.getGenresByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets information about an item&#x27;s images
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ImageInfo>} and HTTP response
     */
    getItemsByIdImagesWithHttpInfo() {
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
      let returnType = [ImageInfo];

      return this.apiClient.callApi(
        '/Items/{Id}/Images', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets information about an item&#x27;s images
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ImageInfo>}
     */
    getItemsByIdImages() {
      return this.getItemsByIdImagesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsByIdImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsByIdImagesByType() {
      return this.getItemsByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsByIdImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsByIdImagesByTypeByIndex() {
      return this.getItemsByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'PercentPlayed': PercentPlayed,
        'UnPlayedCount': UnPlayedCount,
        'Id': Id,
        'MaxWidth': MaxWidth,
        'MaxHeight': MaxHeight,
        'Tag': Tag,
        'Format': Format,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount() {
      return this.getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getMusicgenresByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getMusicgenresByNameImagesByType() {
      return this.getMusicgenresByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getMusicgenresByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getMusicgenresByNameImagesByTypeByIndex() {
      return this.getMusicgenresByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getPersonsByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getPersonsByNameImagesByType() {
      return this.getPersonsByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getPersonsByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getPersonsByNameImagesByTypeByIndex() {
      return this.getPersonsByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getStudiosByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getStudiosByNameImagesByType() {
      return this.getStudiosByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getStudiosByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getStudiosByNameImagesByTypeByIndex() {
      return this.getStudiosByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getUsersByIdImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getUsersByIdImagesByType() {
      return this.getUsersByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getUsersByIdImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getUsersByIdImagesByTypeByIndex() {
      return this.getUsersByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headArtistsByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headArtistsByNameImagesByType() {
      return this.headArtistsByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headArtistsByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headArtistsByNameImagesByTypeByIndex() {
      return this.headArtistsByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headGamegenresByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headGamegenresByNameImagesByType() {
      return this.headGamegenresByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headGamegenresByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headGamegenresByNameImagesByTypeByIndex() {
      return this.headGamegenresByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headGenresByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headGenresByNameImagesByType() {
      return this.headGenresByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headGenresByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headGenresByNameImagesByTypeByIndex() {
      return this.headGenresByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headItemsByIdImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headItemsByIdImagesByType() {
      return this.headItemsByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headItemsByIdImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headItemsByIdImagesByTypeByIndex() {
      return this.headItemsByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'PercentPlayed': PercentPlayed,
        'UnPlayedCount': UnPlayedCount,
        'Id': Id,
        'MaxWidth': MaxWidth,
        'MaxHeight': MaxHeight,
        'Tag': Tag,
        'Format': Format,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount() {
      return this.headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headMusicgenresByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headMusicgenresByNameImagesByType() {
      return this.headMusicgenresByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headMusicgenresByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headMusicgenresByNameImagesByTypeByIndex() {
      return this.headMusicgenresByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headPersonsByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headPersonsByNameImagesByType() {
      return this.headPersonsByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headPersonsByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headPersonsByNameImagesByTypeByIndex() {
      return this.headPersonsByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headStudiosByNameImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headStudiosByNameImagesByType() {
      return this.headStudiosByNameImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headStudiosByNameImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headStudiosByNameImagesByTypeByIndex() {
      return this.headStudiosByNameImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headUsersByIdImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation'],
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headUsersByIdImagesByType() {
      return this.headUsersByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headUsersByIdImagesByTypeByIndexWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
        'Type': Type
      };
      let queryParams = {
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'Quality': opts['Quality'],
        'Tag': opts['Tag'],
        'CropWhitespace': opts['CropWhitespace'],
        'EnableImageEnhancers': opts['EnableImageEnhancers'],
        'Format': opts['Format'],
        'BackgroundColor': opts['BackgroundColor'],
        'ForegroundLayer': opts['ForegroundLayer'],
        'AutoOrient': opts['AutoOrient'],
        'KeepAnimation': opts['KeepAnimation']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headUsersByIdImagesByTypeByIndex() {
      return this.headUsersByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdImagesByTypeWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdImagesByType() {
      return this.postItemsByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdImagesByTypeByIndexWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id,
        'Index': Index,
        'Type': Type
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdImagesByTypeByIndex() {
      return this.postItemsByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdImagesByTypeByIndexDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Items/{Id}/Images/{Type}/{Index}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdImagesByTypeByIndexDelete() {
      return this.postItemsByIdImagesByTypeByIndexDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdImagesByTypeByIndexIndexWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type,
        'Index': Index
      };
      let queryParams = {
        'NewIndex': NewIndex
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdImagesByTypeByIndexIndex() {
      return this.postItemsByIdImagesByTypeByIndexIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdImagesByTypeByIndexUrlWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type,
        'Index': Index
      };
      let queryParams = {
        'Url': Url
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdImagesByTypeByIndexUrl() {
      return this.postItemsByIdImagesByTypeByIndexUrlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdImagesByTypeDeleteWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdImagesByTypeDelete() {
      return this.postItemsByIdImagesByTypeDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByIdImagesByTypeWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id,
        'Type': Type
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
        '/Users/{Id}/Images/{Type}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByIdImagesByType() {
      return this.postUsersByIdImagesByTypeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByIdImagesByTypeByIndexWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id,
        'Type': Type
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByIdImagesByTypeByIndex() {
      return this.postUsersByIdImagesByTypeByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByIdImagesByTypeByIndexDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index,
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{Id}/Images/{Type}/{Index}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByIdImagesByTypeByIndexDelete() {
      return this.postUsersByIdImagesByTypeByIndexDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByIdImagesByTypeDeleteWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Type': Type
      };
      let queryParams = {
        'Index': opts['Index']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByIdImagesByTypeDelete() {
      return this.postUsersByIdImagesByTypeDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
