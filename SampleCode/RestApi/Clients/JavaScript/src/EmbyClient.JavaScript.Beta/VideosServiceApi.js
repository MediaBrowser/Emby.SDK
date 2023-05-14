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

/**
* VideosService service.
* @module EmbyClient.JavaScript.Beta/VideosServiceApi
* @version 4.8.0.35
*/
export default class VideosServiceApi {

    /**
    * Constructs a new VideosServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/VideosServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteVideosByIdAlternatesources operation.
     * @callback module:EmbyClient.JavaScript.Beta/VideosServiceApi~deleteVideosByIdAlternatesourcesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes alternate video sources.
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/VideosServiceApi~deleteVideosByIdAlternatesourcesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteVideosByIdAlternatesources() {
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
        '/Videos/{Id}/AlternateSources', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postVideosByIdAlternatesourcesDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/VideosServiceApi~postVideosByIdAlternatesourcesDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes alternate video sources.
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/VideosServiceApi~postVideosByIdAlternatesourcesDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postVideosByIdAlternatesourcesDelete() {
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
        '/Videos/{Id}/AlternateSources/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postVideosMergeversions operation.
     * @callback module:EmbyClient.JavaScript.Beta/VideosServiceApi~postVideosMergeversionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Merges videos into a single record
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/VideosServiceApi~postVideosMergeversionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postVideosMergeversions() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Ids': opts['ids']
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
        '/Videos/MergeVersions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
