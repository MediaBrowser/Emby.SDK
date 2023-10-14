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
import SubtitleDeliveryMethod from '../model/SubtitleDeliveryMethod';

/**
* VideoHlsService service.
* @module EmbyClient.JavaScript.Beta/VideoHlsServiceApi
* @version 4.8.0.53
*/
export default class VideoHlsServiceApi {

    /**
    * Constructs a new VideoHlsServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/VideoHlsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer operation.
     * @callback module:EmbyClient.JavaScript.Beta/VideoHlsServiceApi~getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/VideoHlsServiceApi~getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer() {
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
        '/Videos/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdLiveM3u8 operation.
     * @callback module:EmbyClient.JavaScript.Beta/VideoHlsServiceApi~getVideosByIdLiveM3u8Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/VideoHlsServiceApi~getVideosByIdLiveM3u8Callback} callback The callback function, accepting three arguments: error, data, response
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
        'Profile': opts['profile'],
        'Level': opts['level'],
        'Framerate': opts['framerate'],
        'MaxFramerate': opts['maxFramerate'],
        'CopyTimestamps': opts['copyTimestamps'],
        'StartTimeTicks': opts['startTimeTicks'],
        'Width': opts['width'],
        'Height': opts['height'],
        'MaxWidth': opts['maxWidth'],
        'MaxHeight': opts['maxHeight'],
        'VideoBitRate': opts['videoBitRate'],
        'SubtitleStreamIndex': opts['subtitleStreamIndex'],
        'SubtitleMethod': opts['subtitleMethod'],
        'MaxRefFrames': opts['maxRefFrames'],
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

}
