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
import ApiOnPlaybackProgress from '../model/ApiOnPlaybackProgress';
import PlayMethod from '../model/PlayMethod';
import PlaybackProgressInfo from '../model/PlaybackProgressInfo';
import PlaybackStartInfo from '../model/PlaybackStartInfo';
import PlaybackStopInfo from '../model/PlaybackStopInfo';
import RepeatMode from '../model/RepeatMode';
import UserItemDataDto from '../model/UserItemDataDto';

/**
* PlaystateService service.
* @module EmbyClient.JavaScript/PlaystateServiceApi
* @version 4.8.10.0
*/
export default class PlaystateServiceApi {

    /**
    * Constructs a new PlaystateServiceApi. 
    * @alias module:EmbyClient.JavaScript/PlaystateServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteUsersByUseridPlayeditemsById operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~deleteUsersByUseridPlayeditemsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~deleteUsersByUseridPlayeditemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    deleteUsersByUseridPlayeditemsById() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/PlayedItems/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteUsersByUseridPlayingitemsById operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~deleteUsersByUseridPlayingitemsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~deleteUsersByUseridPlayingitemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteUsersByUseridPlayingitemsById() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId,
        'NextMediaType': nextMediaType,
        'PositionTicks': opts['positionTicks'],
        'LiveStreamId': opts['liveStreamId'],
        'PlaySessionId': opts['playSessionId']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsPlaying operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports playback has started within a session
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsPlaying() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsPlayingPing operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingPingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Pings a playback session
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingPingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsPlayingPing() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PlaySessionId': opts['playSessionId']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsPlayingProgress operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingProgressCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports playback progress within a session
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingProgressCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsPlayingProgress() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsPlayingStopped operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingStoppedCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports playback has stopped within a session
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postSessionsPlayingStoppedCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsPlayingStopped() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridItemsByItemidUserdata operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridItemsByItemidUserdataCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates userdata for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridItemsByItemidUserdataCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByUseridItemsByItemidUserdata() {
      let postBody = body;

      let pathParams = {
        'UserId': userId,
        'ItemId': itemId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridPlayeditemsById operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayeditemsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks an item as played
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayeditemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    postUsersByUseridPlayeditemsById() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'DatePlayed': opts['datePlayed']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridPlayeditemsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayeditemsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayeditemsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    postUsersByUseridPlayeditemsByIdDelete() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/PlayedItems/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridPlayingitemsById operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayingitemsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports that a user has begun playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayingitemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByUseridPlayingitemsById() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId,
        'CanSeek': opts['canSeek'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'PlayMethod': opts['playMethod'],
        'LiveStreamId': opts['liveStreamId'],
        'PlaySessionId': opts['playSessionId']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridPlayingitemsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayingitemsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayingitemsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByUseridPlayingitemsByIdDelete() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId,
        'NextMediaType': nextMediaType,
        'PositionTicks': opts['positionTicks'],
        'LiveStreamId': opts['liveStreamId'],
        'PlaySessionId': opts['playSessionId']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridPlayingitemsByIdProgress operation.
     * @callback module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayingitemsByIdProgressCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports a user&#x27;s playback progress
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PlaystateServiceApi~postUsersByUseridPlayingitemsByIdProgressCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByUseridPlayingitemsByIdProgress() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId,
        'PositionTicks': opts['positionTicks'],
        'IsPaused': opts['isPaused'],
        'IsMuted': opts['isMuted'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'VolumeLevel': opts['volumeLevel'],
        'PlayMethod': opts['playMethod'],
        'LiveStreamId': opts['liveStreamId'],
        'PlaySessionId': opts['playSessionId'],
        'RepeatMode': opts['repeatMode'],
        'SubtitleOffset': opts['subtitleOffset'],
        'PlaybackRate': opts['playbackRate']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
