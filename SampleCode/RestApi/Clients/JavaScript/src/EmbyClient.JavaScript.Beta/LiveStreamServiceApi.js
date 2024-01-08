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
* LiveStreamService service.
* @module EmbyClient.JavaScript.Beta/LiveStreamServiceApi
* @version 4.8.0.67
*/
export default class LiveStreamServiceApi {

    /**
    * Constructs a new LiveStreamServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getLivetvLiverecordingsByIdStream operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLiverecordingsByIdStreamCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLiverecordingsByIdStreamCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvLiverecordingsByIdStream() {
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
        '/LiveTv/LiveRecordings/{Id}/stream', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvLivestreamfilesByIdHlsBySegment operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdHlsBySegmentCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdHlsBySegmentCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvLivestreamfilesByIdHlsBySegment() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Segment': segment
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
        '/LiveTv/LiveStreamFiles/{Id}/hls/{Segment}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvLivestreamfilesByIdHlsLiveM3u8 operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdHlsLiveM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdHlsLiveM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvLivestreamfilesByIdHlsLiveM3u8() {
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
        '/LiveTv/LiveStreamFiles/{Id}/hls/live.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvLivestreamfilesByIdHlsMasterM3u8 operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdHlsMasterM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdHlsMasterM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvLivestreamfilesByIdHlsMasterM3u8() {
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
        '/LiveTv/LiveStreamFiles/{Id}/hls/master.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvLivestreamfilesByIdStreamByContainer operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdStreamByContainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~getLivetvLivestreamfilesByIdStreamByContainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getLivetvLivestreamfilesByIdStreamByContainer() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Container': container
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
        '/LiveTv/LiveStreamFiles/{Id}/stream.{Container}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headLivetvLivestreamfilesByIdHlsBySegment operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~headLivetvLivestreamfilesByIdHlsBySegmentCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~headLivetvLivestreamfilesByIdHlsBySegmentCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headLivetvLivestreamfilesByIdHlsBySegment() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Segment': segment
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
        '/LiveTv/LiveStreamFiles/{Id}/hls/{Segment}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headLivetvLivestreamfilesByIdHlsLiveM3u8 operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~headLivetvLivestreamfilesByIdHlsLiveM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~headLivetvLivestreamfilesByIdHlsLiveM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    headLivetvLivestreamfilesByIdHlsLiveM3u8() {
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
        '/LiveTv/LiveStreamFiles/{Id}/hls/live.m3u8', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headLivetvLivestreamfilesByIdHlsMasterM3u8 operation.
     * @callback module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~headLivetvLivestreamfilesByIdHlsMasterM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/LiveStreamServiceApi~headLivetvLivestreamfilesByIdHlsMasterM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    headLivetvLivestreamfilesByIdHlsMasterM3u8() {
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
        '/LiveTv/LiveStreamFiles/{Id}/hls/master.m3u8', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
