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
import LiveStreamRequest from '../model/LiveStreamRequest';
import LiveStreamResponse from '../model/LiveStreamResponse';
import PlaybackInfoRequest from '../model/PlaybackInfoRequest';
import PlaybackInfoResponse from '../model/PlaybackInfoResponse';

/**
* MediaInfoService service.
* @module EmbyClient.JavaScript/MediaInfoServiceApi
* @version 4.8.10.0
*/
export default class MediaInfoServiceApi {

    /**
    * Constructs a new MediaInfoServiceApi. 
    * @alias module:EmbyClient.JavaScript/MediaInfoServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getItemsByIdPlaybackinfo operation.
     * @callback module:EmbyClient.JavaScript/MediaInfoServiceApi~getItemsByIdPlaybackinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PlaybackInfoResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/MediaInfoServiceApi~getItemsByIdPlaybackinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PlaybackInfoResponse}
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
      let returnType = PlaybackInfoResponse;

      return this.apiClient.callApi(
        '/Items/{Id}/PlaybackInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPlaybackBitratetest operation.
     * @callback module:EmbyClient.JavaScript/MediaInfoServiceApi~getPlaybackBitratetestCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/MediaInfoServiceApi~getPlaybackBitratetestCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/MediaInfoServiceApi~postItemsByIdPlaybackinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PlaybackInfoResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/MediaInfoServiceApi~postItemsByIdPlaybackinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PlaybackInfoResponse}
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
      let returnType = PlaybackInfoResponse;

      return this.apiClient.callApi(
        '/Items/{Id}/PlaybackInfo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLivestreamsClose operation.
     * @callback module:EmbyClient.JavaScript/MediaInfoServiceApi~postLivestreamsCloseCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Closes a media source
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/MediaInfoServiceApi~postLivestreamsCloseCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/MediaInfoServiceApi~postLivestreamsMediainfoCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Closes a media source
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/MediaInfoServiceApi~postLivestreamsMediainfoCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/MediaInfoServiceApi~postLivestreamsOpenCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LiveStreamResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Opens a media source
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/MediaInfoServiceApi~postLivestreamsOpenCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LiveStreamResponse}
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
      let returnType = LiveStreamResponse;

      return this.apiClient.callApi(
        '/LiveStreams/Open', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
