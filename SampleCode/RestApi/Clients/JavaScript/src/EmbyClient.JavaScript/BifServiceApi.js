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
import RokuMetadataApiThumbnailSetInfo from '../model/RokuMetadataApiThumbnailSetInfo';

/**
* BifService service.
* @module EmbyClient.JavaScript/BifServiceApi
* @version 4.8.10.0
*/
export default class BifServiceApi {

    /**
    * Constructs a new BifServiceApi. 
    * @alias module:EmbyClient.JavaScript/BifServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getItemsByIdThumbnailset operation.
     * @callback module:EmbyClient.JavaScript/BifServiceApi~getItemsByIdThumbnailsetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RokuMetadataApiThumbnailSetInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/BifServiceApi~getItemsByIdThumbnailsetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RokuMetadataApiThumbnailSetInfo}
     */
    getItemsByIdThumbnailset() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Width': width
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = RokuMetadataApiThumbnailSetInfo;

      return this.apiClient.callApi(
        '/Items/{Id}/ThumbnailSet', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdIndexBif operation.
     * @callback module:EmbyClient.JavaScript/BifServiceApi~getVideosByIdIndexBifCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/BifServiceApi~getVideosByIdIndexBifCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdIndexBif() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Width': width
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
        '/Videos/{Id}/index.bif', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
