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
import LiveStreamRequest from '../model/LiveStreamRequest';
import LiveStreamResponse from '../model/LiveStreamResponse';
import PlaybackInfoRequest from '../model/PlaybackInfoRequest';
import PlaybackInfoResponse from '../model/PlaybackInfoResponse';

/**
* MediaInfoService service.
* @module api/MediaInfoServiceApi
* @version 4.9.0.27
*/
export default class MediaInfoServiceApi {

    /**
    * Constructs a new MediaInfoServiceApi. 
    * @alias module:api/MediaInfoServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PlaybackInfoResponse} and HTTP response
     */
    getItemsByIdPlaybackinfoWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': UserId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PlaybackInfoResponse}
     */
    getItemsByIdPlaybackinfo() {
      return this.getItemsByIdPlaybackinfoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getPlaybackBitratetestWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Size': Size
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getPlaybackBitratetest() {
      return this.getPlaybackBitratetestWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PlaybackInfoResponse} and HTTP response
     */
    postItemsByIdPlaybackinfoWithHttpInfo() {
      let postBody = body;

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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = PlaybackInfoResponse;

      return this.apiClient.callApi(
        '/Items/{Id}/PlaybackInfo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PlaybackInfoResponse}
     */
    postItemsByIdPlaybackinfo() {
      return this.postItemsByIdPlaybackinfoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Closes a media source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivestreamsCloseWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'LiveStreamId': LiveStreamId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Closes a media source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivestreamsClose() {
      return this.postLivestreamsCloseWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Closes a media source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLivestreamsMediainfoWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'LiveStreamId': LiveStreamId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Closes a media source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLivestreamsMediainfo() {
      return this.postLivestreamsMediainfoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Opens a media source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LiveStreamResponse} and HTTP response
     */
    postLivestreamsOpenWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Opens a media source
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LiveStreamResponse}
     */
    postLivestreamsOpen() {
      return this.postLivestreamsOpenWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
