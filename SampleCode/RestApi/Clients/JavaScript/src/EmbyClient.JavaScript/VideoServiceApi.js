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
import SubtitleDeliveryMethod from '../model/SubtitleDeliveryMethod';

/**
* VideoService service.
* @module EmbyClient.JavaScript/VideoServiceApi
* @version 4.8.10.0
*/
export default class VideoServiceApi {

    /**
    * Constructs a new VideoServiceApi. 
    * @alias module:EmbyClient.JavaScript/VideoServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getVideosByIdByStreamfilename operation.
     * @callback module:EmbyClient.JavaScript/VideoServiceApi~getVideosByIdByStreamfilenameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/VideoServiceApi~getVideosByIdByStreamfilenameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdByStreamfilename() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'StreamFileName': streamFileName,
        'Id': id
      };
      let queryParams = {
        'DeviceProfileId': opts['deviceProfileId'],
        'DeviceId': opts['deviceId'],
        'Container': container,
        'AudioCodec': opts['audioCodec'],
        'EnableAutoStreamCopy': opts['enableAutoStreamCopy'],
        'AudioSampleRate': opts['audioSampleRate'],
        'AudioBitRate': opts['audioBitRate'],
        'AudioChannels': opts['audioChannels'],
        'MaxAudioChannels': opts['maxAudioChannels'],
        'Static': opts['_static'],
        'CopyTimestamps': opts['copyTimestamps'],
        'StartTimeTicks': opts['startTimeTicks'],
        'Width': opts['width'],
        'Height': opts['height'],
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'VideoBitRate': opts['videoBitRate'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'SubtitleMethod': opts['subtitleMethod'],
        'MaxVideoBitDepth': opts['maxVideoBitDepth'],
        'VideoCodec': opts['videoCodec'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'VideoStreamIndex': opts['videoStreamIndex']
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
        '/Videos/{Id}/{StreamFileName}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdStream operation.
     * @callback module:EmbyClient.JavaScript/VideoServiceApi~getVideosByIdStreamCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/VideoServiceApi~getVideosByIdStreamCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdStream() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'DeviceProfileId': opts['deviceProfileId'],
        'DeviceId': opts['deviceId'],
        'Container': container,
        'AudioCodec': opts['audioCodec'],
        'EnableAutoStreamCopy': opts['enableAutoStreamCopy'],
        'AudioSampleRate': opts['audioSampleRate'],
        'AudioBitRate': opts['audioBitRate'],
        'AudioChannels': opts['audioChannels'],
        'MaxAudioChannels': opts['maxAudioChannels'],
        'Static': opts['_static'],
        'CopyTimestamps': opts['copyTimestamps'],
        'StartTimeTicks': opts['startTimeTicks'],
        'Width': opts['width'],
        'Height': opts['height'],
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'VideoBitRate': opts['videoBitRate'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'SubtitleMethod': opts['subtitleMethod'],
        'MaxVideoBitDepth': opts['maxVideoBitDepth'],
        'VideoCodec': opts['videoCodec'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'VideoStreamIndex': opts['videoStreamIndex']
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
        '/Videos/{Id}/stream', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdStreamByContainer operation.
     * @callback module:EmbyClient.JavaScript/VideoServiceApi~getVideosByIdStreamByContainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/VideoServiceApi~getVideosByIdStreamByContainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdStreamByContainer() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Container': container
      };
      let queryParams = {
        'DeviceProfileId': opts['deviceProfileId'],
        'DeviceId': opts['deviceId'],
        'AudioCodec': opts['audioCodec'],
        'EnableAutoStreamCopy': opts['enableAutoStreamCopy'],
        'AudioSampleRate': opts['audioSampleRate'],
        'AudioBitRate': opts['audioBitRate'],
        'AudioChannels': opts['audioChannels'],
        'MaxAudioChannels': opts['maxAudioChannels'],
        'Static': opts['_static'],
        'CopyTimestamps': opts['copyTimestamps'],
        'StartTimeTicks': opts['startTimeTicks'],
        'Width': opts['width'],
        'Height': opts['height'],
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'VideoBitRate': opts['videoBitRate'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'SubtitleMethod': opts['subtitleMethod'],
        'MaxVideoBitDepth': opts['maxVideoBitDepth'],
        'VideoCodec': opts['videoCodec'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'VideoStreamIndex': opts['videoStreamIndex']
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
        '/Videos/{Id}/stream.{Container}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headVideosByIdByStreamfilename operation.
     * @callback module:EmbyClient.JavaScript/VideoServiceApi~headVideosByIdByStreamfilenameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/VideoServiceApi~headVideosByIdByStreamfilenameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headVideosByIdByStreamfilename() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'StreamFileName': streamFileName,
        'Id': id
      };
      let queryParams = {
        'DeviceProfileId': opts['deviceProfileId'],
        'DeviceId': opts['deviceId'],
        'Container': container,
        'AudioCodec': opts['audioCodec'],
        'EnableAutoStreamCopy': opts['enableAutoStreamCopy'],
        'AudioSampleRate': opts['audioSampleRate'],
        'AudioBitRate': opts['audioBitRate'],
        'AudioChannels': opts['audioChannels'],
        'MaxAudioChannels': opts['maxAudioChannels'],
        'Static': opts['_static'],
        'CopyTimestamps': opts['copyTimestamps'],
        'StartTimeTicks': opts['startTimeTicks'],
        'Width': opts['width'],
        'Height': opts['height'],
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'VideoBitRate': opts['videoBitRate'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'SubtitleMethod': opts['subtitleMethod'],
        'MaxVideoBitDepth': opts['maxVideoBitDepth'],
        'VideoCodec': opts['videoCodec'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'VideoStreamIndex': opts['videoStreamIndex']
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
        '/Videos/{Id}/{StreamFileName}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headVideosByIdStream operation.
     * @callback module:EmbyClient.JavaScript/VideoServiceApi~headVideosByIdStreamCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/VideoServiceApi~headVideosByIdStreamCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headVideosByIdStream() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'DeviceProfileId': opts['deviceProfileId'],
        'DeviceId': opts['deviceId'],
        'Container': container,
        'AudioCodec': opts['audioCodec'],
        'EnableAutoStreamCopy': opts['enableAutoStreamCopy'],
        'AudioSampleRate': opts['audioSampleRate'],
        'AudioBitRate': opts['audioBitRate'],
        'AudioChannels': opts['audioChannels'],
        'MaxAudioChannels': opts['maxAudioChannels'],
        'Static': opts['_static'],
        'CopyTimestamps': opts['copyTimestamps'],
        'StartTimeTicks': opts['startTimeTicks'],
        'Width': opts['width'],
        'Height': opts['height'],
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'VideoBitRate': opts['videoBitRate'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'SubtitleMethod': opts['subtitleMethod'],
        'MaxVideoBitDepth': opts['maxVideoBitDepth'],
        'VideoCodec': opts['videoCodec'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'VideoStreamIndex': opts['videoStreamIndex']
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
        '/Videos/{Id}/stream', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headVideosByIdStreamByContainer operation.
     * @callback module:EmbyClient.JavaScript/VideoServiceApi~headVideosByIdStreamByContainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/VideoServiceApi~headVideosByIdStreamByContainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headVideosByIdStreamByContainer() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Container': container
      };
      let queryParams = {
        'DeviceProfileId': opts['deviceProfileId'],
        'DeviceId': opts['deviceId'],
        'AudioCodec': opts['audioCodec'],
        'EnableAutoStreamCopy': opts['enableAutoStreamCopy'],
        'AudioSampleRate': opts['audioSampleRate'],
        'AudioBitRate': opts['audioBitRate'],
        'AudioChannels': opts['audioChannels'],
        'MaxAudioChannels': opts['maxAudioChannels'],
        'Static': opts['_static'],
        'CopyTimestamps': opts['copyTimestamps'],
        'StartTimeTicks': opts['startTimeTicks'],
        'Width': opts['width'],
        'Height': opts['height'],
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'VideoBitRate': opts['videoBitRate'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'SubtitleMethod': opts['subtitleMethod'],
        'MaxVideoBitDepth': opts['maxVideoBitDepth'],
        'VideoCodec': opts['videoCodec'],
        'AudioStreamIndex': opts['audioStreamIndex'],
        'VideoStreamIndex': opts['videoStreamIndex']
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
        '/Videos/{Id}/stream.{Container}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
