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

/**
* HlsSegmentService service.
* @module EmbyClient.JavaScript/HlsSegmentServiceApi
* @version 4.8.10.0
*/
export default class HlsSegmentServiceApi {

    /**
    * Constructs a new HlsSegmentServiceApi. 
    * @alias module:EmbyClient.JavaScript/HlsSegmentServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteVideosActiveencodings operation.
     * @callback module:EmbyClient.JavaScript/HlsSegmentServiceApi~deleteVideosActiveencodingsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/HlsSegmentServiceApi~deleteVideosActiveencodingsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteVideosActiveencodings() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'DeviceId': deviceId,
        'PlaySessionId': playSessionId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postVideosActiveencodingsDelete operation.
     * @callback module:EmbyClient.JavaScript/HlsSegmentServiceApi~postVideosActiveencodingsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/HlsSegmentServiceApi~postVideosActiveencodingsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postVideosActiveencodingsDelete() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'DeviceId': deviceId,
        'PlaySessionId': playSessionId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
