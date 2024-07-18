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
* VideoService service.
* @module api/VideoServiceApi
* @version 4.9.0.27
*/
export default class VideoServiceApi {

    /**
    * Constructs a new VideoServiceApi. 
    * @alias module:api/VideoServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdByStreamfilenameWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'StreamFileName': StreamFileName,
        'Id': Id
      };
      let queryParams = {
        'DeviceProfileId': opts['DeviceProfileId'],
        'DeviceId': opts['DeviceId'],
        'Container': Container,
        'AudioCodec': opts['AudioCodec'],
        'EnableAutoStreamCopy': opts['EnableAutoStreamCopy'],
        'AudioSampleRate': opts['AudioSampleRate'],
        'AudioBitRate': opts['AudioBitRate'],
        'AudioChannels': opts['AudioChannels'],
        'MaxAudioChannels': opts['MaxAudioChannels'],
        'Static': opts['_Static'],
        'CopyTimestamps': opts['CopyTimestamps'],
        'StartTimeTicks': opts['StartTimeTicks'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'VideoBitRate': opts['VideoBitRate'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'SubtitleMethod': opts['SubtitleMethod'],
        'MaxVideoBitDepth': opts['MaxVideoBitDepth'],
        'VideoCodec': opts['VideoCodec'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'VideoStreamIndex': opts['VideoStreamIndex']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdByStreamfilename() {
      return this.getVideosByIdByStreamfilenameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdStreamWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'DeviceProfileId': opts['DeviceProfileId'],
        'DeviceId': opts['DeviceId'],
        'Container': Container,
        'AudioCodec': opts['AudioCodec'],
        'EnableAutoStreamCopy': opts['EnableAutoStreamCopy'],
        'AudioSampleRate': opts['AudioSampleRate'],
        'AudioBitRate': opts['AudioBitRate'],
        'AudioChannels': opts['AudioChannels'],
        'MaxAudioChannels': opts['MaxAudioChannels'],
        'Static': opts['_Static'],
        'CopyTimestamps': opts['CopyTimestamps'],
        'StartTimeTicks': opts['StartTimeTicks'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'VideoBitRate': opts['VideoBitRate'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'SubtitleMethod': opts['SubtitleMethod'],
        'MaxVideoBitDepth': opts['MaxVideoBitDepth'],
        'VideoCodec': opts['VideoCodec'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'VideoStreamIndex': opts['VideoStreamIndex']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdStream() {
      return this.getVideosByIdStreamWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdStreamByContainerWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Container': Container
      };
      let queryParams = {
        'DeviceProfileId': opts['DeviceProfileId'],
        'DeviceId': opts['DeviceId'],
        'AudioCodec': opts['AudioCodec'],
        'EnableAutoStreamCopy': opts['EnableAutoStreamCopy'],
        'AudioSampleRate': opts['AudioSampleRate'],
        'AudioBitRate': opts['AudioBitRate'],
        'AudioChannels': opts['AudioChannels'],
        'MaxAudioChannels': opts['MaxAudioChannels'],
        'Static': opts['_Static'],
        'CopyTimestamps': opts['CopyTimestamps'],
        'StartTimeTicks': opts['StartTimeTicks'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'VideoBitRate': opts['VideoBitRate'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'SubtitleMethod': opts['SubtitleMethod'],
        'MaxVideoBitDepth': opts['MaxVideoBitDepth'],
        'VideoCodec': opts['VideoCodec'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'VideoStreamIndex': opts['VideoStreamIndex']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdStreamByContainer() {
      return this.getVideosByIdStreamByContainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headVideosByIdByStreamfilenameWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'StreamFileName': StreamFileName,
        'Id': Id
      };
      let queryParams = {
        'DeviceProfileId': opts['DeviceProfileId'],
        'DeviceId': opts['DeviceId'],
        'Container': Container,
        'AudioCodec': opts['AudioCodec'],
        'EnableAutoStreamCopy': opts['EnableAutoStreamCopy'],
        'AudioSampleRate': opts['AudioSampleRate'],
        'AudioBitRate': opts['AudioBitRate'],
        'AudioChannels': opts['AudioChannels'],
        'MaxAudioChannels': opts['MaxAudioChannels'],
        'Static': opts['_Static'],
        'CopyTimestamps': opts['CopyTimestamps'],
        'StartTimeTicks': opts['StartTimeTicks'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'VideoBitRate': opts['VideoBitRate'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'SubtitleMethod': opts['SubtitleMethod'],
        'MaxVideoBitDepth': opts['MaxVideoBitDepth'],
        'VideoCodec': opts['VideoCodec'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'VideoStreamIndex': opts['VideoStreamIndex']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headVideosByIdByStreamfilename() {
      return this.headVideosByIdByStreamfilenameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headVideosByIdStreamWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'DeviceProfileId': opts['DeviceProfileId'],
        'DeviceId': opts['DeviceId'],
        'Container': Container,
        'AudioCodec': opts['AudioCodec'],
        'EnableAutoStreamCopy': opts['EnableAutoStreamCopy'],
        'AudioSampleRate': opts['AudioSampleRate'],
        'AudioBitRate': opts['AudioBitRate'],
        'AudioChannels': opts['AudioChannels'],
        'MaxAudioChannels': opts['MaxAudioChannels'],
        'Static': opts['_Static'],
        'CopyTimestamps': opts['CopyTimestamps'],
        'StartTimeTicks': opts['StartTimeTicks'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'VideoBitRate': opts['VideoBitRate'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'SubtitleMethod': opts['SubtitleMethod'],
        'MaxVideoBitDepth': opts['MaxVideoBitDepth'],
        'VideoCodec': opts['VideoCodec'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'VideoStreamIndex': opts['VideoStreamIndex']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headVideosByIdStream() {
      return this.headVideosByIdStreamWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headVideosByIdStreamByContainerWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Container': Container
      };
      let queryParams = {
        'DeviceProfileId': opts['DeviceProfileId'],
        'DeviceId': opts['DeviceId'],
        'AudioCodec': opts['AudioCodec'],
        'EnableAutoStreamCopy': opts['EnableAutoStreamCopy'],
        'AudioSampleRate': opts['AudioSampleRate'],
        'AudioBitRate': opts['AudioBitRate'],
        'AudioChannels': opts['AudioChannels'],
        'MaxAudioChannels': opts['MaxAudioChannels'],
        'Static': opts['_Static'],
        'CopyTimestamps': opts['CopyTimestamps'],
        'StartTimeTicks': opts['StartTimeTicks'],
        'Width': opts['Width'],
        'Height': opts['Height'],
        'MaxWidth': opts['MaxWidth'],
        'MaxHeight': opts['MaxHeight'],
        'VideoBitRate': opts['VideoBitRate'],
        'SubtitleStreamIndex': opts['SubtitleStreamIndex'],
        'SubtitleMethod': opts['SubtitleMethod'],
        'MaxVideoBitDepth': opts['MaxVideoBitDepth'],
        'VideoCodec': opts['VideoCodec'],
        'AudioStreamIndex': opts['AudioStreamIndex'],
        'VideoStreamIndex': opts['VideoStreamIndex']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headVideosByIdStreamByContainer() {
      return this.headVideosByIdStreamByContainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
