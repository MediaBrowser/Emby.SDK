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
import ApiOnPlaybackProgress from '../model/ApiOnPlaybackProgress';
import PlayMethod from '../model/PlayMethod';
import PlaybackProgressInfo from '../model/PlaybackProgressInfo';
import PlaybackStartInfo from '../model/PlaybackStartInfo';
import PlaybackStopInfo from '../model/PlaybackStopInfo';
import RepeatMode from '../model/RepeatMode';
import UserItemDataDto from '../model/UserItemDataDto';

/**
* PlaystateService service.
* @module api/PlaystateServiceApi
* @version 4.9.0.31
*/
export default class PlaystateServiceApi {

    /**
    * Constructs a new PlaystateServiceApi. 
    * @alias module:api/PlaystateServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    deleteUsersByUseridPlayeditemsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/PlayedItems/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    deleteUsersByUseridPlayeditemsById() {
      return this.deleteUsersByUseridPlayeditemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteUsersByUseridPlayingitemsByIdWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId,
        'NextMediaType': NextMediaType,
        'PositionTicks': opts['PositionTicks'],
        'LiveStreamId': opts['LiveStreamId'],
        'PlaySessionId': opts['PlaySessionId']
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
        '/Users/{UserId}/PlayingItems/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteUsersByUseridPlayingitemsById() {
      return this.deleteUsersByUseridPlayingitemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports playback has started within a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsPlayingWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Sessions/Playing', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports playback has started within a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsPlaying() {
      return this.postSessionsPlayingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Pings a playback session
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsPlayingPingWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PlaySessionId': opts['PlaySessionId']
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
        '/Sessions/Playing/Ping', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Pings a playback session
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsPlayingPing() {
      return this.postSessionsPlayingPingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports playback progress within a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsPlayingProgressWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Sessions/Playing/Progress', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports playback progress within a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsPlayingProgress() {
      return this.postSessionsPlayingProgressWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports playback has stopped within a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsPlayingStoppedWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Sessions/Playing/Stopped', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports playback has stopped within a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsPlayingStopped() {
      return this.postSessionsPlayingStoppedWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates userdata for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByUseridItemsByItemidUserdataWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'UserId': UserId,
        'ItemId': ItemId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{ItemId}/UserData', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates userdata for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByUseridItemsByItemidUserdata() {
      return this.postUsersByUseridItemsByItemidUserdataWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Marks an item as played
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    postUsersByUseridPlayeditemsByIdWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'DatePlayed': opts['DatePlayed']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/PlayedItems/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Marks an item as played
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    postUsersByUseridPlayeditemsById() {
      return this.postUsersByUseridPlayeditemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    postUsersByUseridPlayeditemsByIdDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/PlayedItems/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    postUsersByUseridPlayeditemsByIdDelete() {
      return this.postUsersByUseridPlayeditemsByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports that a user has begun playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByUseridPlayingitemsByIdWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId,
        'CanSeek': opts['CanSeek'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'PlayMethod': opts['PlayMethod'],
        'LiveStreamId': opts['LiveStreamId'],
        'PlaySessionId': opts['PlaySessionId']
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
        '/Users/{UserId}/PlayingItems/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports that a user has begun playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByUseridPlayingitemsById() {
      return this.postUsersByUseridPlayingitemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByUseridPlayingitemsByIdDeleteWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId,
        'NextMediaType': NextMediaType,
        'PositionTicks': opts['PositionTicks'],
        'LiveStreamId': opts['LiveStreamId'],
        'PlaySessionId': opts['PlaySessionId']
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
        '/Users/{UserId}/PlayingItems/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByUseridPlayingitemsByIdDelete() {
      return this.postUsersByUseridPlayingitemsByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports a user&#x27;s playback progress
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByUseridPlayingitemsByIdProgressWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId,
        'PositionTicks': opts['PositionTicks'],
        'IsPaused': opts['IsPaused'],
        'IsMuted': opts['IsMuted'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'VolumeLevel': opts['VolumeLevel'],
        'PlayMethod': opts['PlayMethod'],
        'LiveStreamId': opts['LiveStreamId'],
        'PlaySessionId': opts['PlaySessionId'],
        'RepeatMode': opts['RepeatMode'],
        'SubtitleOffset': opts['SubtitleOffset'],
        'PlaybackRate': opts['PlaybackRate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{UserId}/PlayingItems/{Id}/Progress', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports a user&#x27;s playback progress
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByUseridPlayingitemsByIdProgress() {
      return this.postUsersByUseridPlayingitemsByIdProgressWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
