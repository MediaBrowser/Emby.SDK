/**
 * Emby REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from "../ApiClient";
import ImageByNameInfo from '../model/ImageByNameInfo';

/**
* ImageByNameService service.
* @module EmbyClient.JavaScript/ImageByNameServiceApi
* @version 4.7.5.0
*/
export default class ImageByNameServiceApi {

    /**
    * Constructs a new ImageByNameServiceApi. 
    * @alias module:EmbyClient.JavaScript/ImageByNameServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getImagesGeneral operation.
     * @callback module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesGeneralCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ImageByNameInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all general images by name
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesGeneralCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ImageByNameInfo>}
     */
    getImagesGeneral() {
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
      let returnType = [ImageByNameInfo];

      return this.apiClient.callApi(
        '/Images/General', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getImagesGeneralByNameByType operation.
     * @callback module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesGeneralByNameByTypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a general image by name
     * No authentication required
     * @param {module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesGeneralByNameByTypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getImagesGeneralByNameByType() {
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Type': type
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Images/General/{Name}/{Type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getImagesMediainfo operation.
     * @callback module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesMediainfoCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ImageByNameInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all media info image by name
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesMediainfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ImageByNameInfo>}
     */
    getImagesMediainfo() {
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
      let returnType = [ImageByNameInfo];

      return this.apiClient.callApi(
        '/Images/MediaInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getImagesMediainfoByThemeByName operation.
     * @callback module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesMediainfoByThemeByNameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a media info image by name
     * No authentication required
     * @param {module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesMediainfoByThemeByNameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getImagesMediainfoByThemeByName() {
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Theme': theme
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Images/MediaInfo/{Theme}/{Name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getImagesRatings operation.
     * @callback module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesRatingsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ImageByNameInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all rating images by name
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesRatingsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ImageByNameInfo>}
     */
    getImagesRatings() {
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
      let returnType = [ImageByNameInfo];

      return this.apiClient.callApi(
        '/Images/Ratings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getImagesRatingsByThemeByName operation.
     * @callback module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesRatingsByThemeByNameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a rating image by name
     * No authentication required
     * @param {module:EmbyClient.JavaScript/ImageByNameServiceApi~getImagesRatingsByThemeByNameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getImagesRatingsByThemeByName() {
      let postBody = null;

      let pathParams = {
        'Name': name,
        'Theme': theme
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Images/Ratings/{Theme}/{Name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
