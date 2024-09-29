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
* DynamicHlsService service.
* @module EmbyClient.JavaScript/DynamicHlsServiceApi
* @version 4.8.10.0
*/
export default class DynamicHlsServiceApi {

    /**
    * Constructs a new DynamicHlsServiceApi. 
    * @alias module:EmbyClient.JavaScript/DynamicHlsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': segmentContainer,
        'SegmentId': segmentId,
        'Id': id,
        'PlaylistId': playlistId
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
        '/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getAudioByIdLiveM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdLiveM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdLiveM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getAudioByIdLiveM3u8() {
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
        '/Audio/{Id}/live.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getAudioByIdMainM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdMainM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdMainM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getAudioByIdMainM3u8() {
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
        '/Audio/{Id}/main.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getAudioByIdMasterM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdMasterM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getAudioByIdMasterM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getAudioByIdMasterM3u8() {
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
        '/Audio/{Id}/master.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': segmentContainer,
        'SegmentId': segmentId,
        'Id': id,
        'PlaylistId': playlistId
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
        '/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdLiveM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdLiveM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdLiveM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdLiveM3u8() {
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
        '/Videos/{Id}/live.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdLiveSubtitlesM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdLiveSubtitlesM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdLiveSubtitlesM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdLiveSubtitlesM3u8() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'SubtitleSegmentLength': subtitleSegmentLength,
        'ManifestSubtitles': manifestSubtitles
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
        '/Videos/{Id}/live_subtitles.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdMainM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdMainM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdMainM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdMainM3u8() {
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
        '/Videos/{Id}/main.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdMasterM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdMasterM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdMasterM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdMasterM3u8() {
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
        '/Videos/{Id}/master.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdSubtitlesM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdSubtitlesM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~getVideosByIdSubtitlesM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdSubtitlesM3u8() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'SubtitleSegmentLength': subtitleSegmentLength,
        'ManifestSubtitles': manifestSubtitles
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
        '/Videos/{Id}/subtitles.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': segmentContainer,
        'SegmentId': segmentId,
        'Id': id,
        'PlaylistId': playlistId
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
        '/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headAudioByIdMasterM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~headAudioByIdMasterM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~headAudioByIdMasterM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    headAudioByIdMasterM3u8() {
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
        '/Audio/{Id}/master.m3u8', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': segmentContainer,
        'SegmentId': segmentId,
        'Id': id,
        'PlaylistId': playlistId
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
        '/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headVideosByIdMasterM3u8 operation.
     * @callback module:EmbyClient.JavaScript/DynamicHlsServiceApi~headVideosByIdMasterM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DynamicHlsServiceApi~headVideosByIdMasterM3u8Callback} callback The callback function, accepting three arguments: error, data, response
     */
    headVideosByIdMasterM3u8() {
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
        '/Videos/{Id}/master.m3u8', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
