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
import MediaInfoLiveStreamRequest from '../model/MediaInfoLiveStreamRequest';
import MediaInfoLiveStreamResponse from '../model/MediaInfoLiveStreamResponse';
import MediaInfoPlaybackInfoRequest from '../model/MediaInfoPlaybackInfoRequest';
import MediaInfoPlaybackInfoResponse from '../model/MediaInfoPlaybackInfoResponse';

/**
* MediaInfoService service.
* @module EmbyClient.JavaScript.Beta/MediaInfoServiceApi
* @version 4.8.0.41
*/
export default class MediaInfoServiceApi {

    /**
    * Constructs a new MediaInfoServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getItemsByIdPlaybackinfo operation.
     * @callback module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~getItemsByIdPlaybackinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MediaInfoPlaybackInfoResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~getItemsByIdPlaybackinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MediaInfoPlaybackInfoResponse}
     */
    getItemsByIdPlaybackinfo() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': userId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaInfoPlaybackInfoResponse;

      return this.apiClient.callApi(
        '/Items/{Id}/PlaybackInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPlaybackBitratetest operation.
     * @callback module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~getPlaybackBitratetestCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~getPlaybackBitratetestCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getPlaybackBitratetest() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Size': size
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
        '/Playback/BitrateTest', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdPlaybackinfo operation.
     * @callback module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postItemsByIdPlaybackinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MediaInfoPlaybackInfoResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postItemsByIdPlaybackinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MediaInfoPlaybackInfoResponse}
     */
    postItemsByIdPlaybackinfo() {
      let postBody = body;

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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaInfoPlaybackInfoResponse;

      return this.apiClient.callApi(
        '/Items/{Id}/PlaybackInfo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivestreamsClose operation.
     * @callback module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postLivestreamsCloseCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Closes a media source
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postLivestreamsCloseCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivestreamsClose() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'LiveStreamId': liveStreamId
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
        '/LiveStreams/Close', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivestreamsMediainfo operation.
     * @callback module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postLivestreamsMediainfoCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Closes a media source
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postLivestreamsMediainfoCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLivestreamsMediainfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'LiveStreamId': liveStreamId
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
        '/LiveStreams/MediaInfo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivestreamsOpen operation.
     * @callback module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postLivestreamsOpenCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MediaInfoLiveStreamResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Opens a media source
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/MediaInfoServiceApi~postLivestreamsOpenCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MediaInfoLiveStreamResponse}
     */
    postLivestreamsOpen() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaInfoLiveStreamResponse;

      return this.apiClient.callApi(
        '/LiveStreams/Open', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
