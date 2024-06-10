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
* @module api/VideosServiceApi
* @version 4.9.0.24
*/
export default class VideosServiceApi {

    /**
    * Constructs a new VideosServiceApi. 
    * @alias module:api/VideosServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Removes alternate video sources.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteVideosByIdAlternatesourcesWithHttpInfo() {
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
        '/Videos/{Id}/AlternateSources', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Removes alternate video sources.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteVideosByIdAlternatesources() {
      return this.deleteVideosByIdAlternatesourcesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Removes alternate video sources.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postVideosByIdAlternatesourcesDeleteWithHttpInfo() {
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
        '/Videos/{Id}/AlternateSources/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Removes alternate video sources.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postVideosByIdAlternatesourcesDelete() {
      return this.postVideosByIdAlternatesourcesDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Merges videos into a single record
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postVideosMergeversionsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Ids': opts['Ids']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Merges videos into a single record
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postVideosMergeversions() {
      return this.postVideosMergeversionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
