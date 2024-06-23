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
* HlsSegmentService service.
* @module api/HlsSegmentServiceApi
* @version 4.9.0.26
*/
export default class HlsSegmentServiceApi {

    /**
    * Constructs a new HlsSegmentServiceApi. 
    * @alias module:api/HlsSegmentServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteVideosActiveencodingsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'DeviceId': DeviceId,
        'PlaySessionId': PlaySessionId
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
        '/Videos/ActiveEncodings', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteVideosActiveencodings() {
      return this.deleteVideosActiveencodingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postVideosActiveencodingsDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'DeviceId': DeviceId,
        'PlaySessionId': PlaySessionId
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
        '/Videos/ActiveEncodings/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postVideosActiveencodingsDelete() {
      return this.postVideosActiveencodingsDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
