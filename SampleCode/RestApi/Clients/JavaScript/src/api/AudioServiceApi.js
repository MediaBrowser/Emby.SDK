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
* AudioService service.
* @module api/AudioServiceApi
* @version 4.9.0.26
*/
export default class AudioServiceApi {

    /**
    * Constructs a new AudioServiceApi. 
    * @alias module:api/AudioServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdByStreamfilenameWithHttpInfo() {
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
        '/Audio/{Id}/{StreamFileName}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdByStreamfilename() {
      return this.getAudioByIdByStreamfilenameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdStreamWithHttpInfo() {
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
        '/Audio/{Id}/stream', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdStream() {
      return this.getAudioByIdStreamWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdStreamByContainerWithHttpInfo() {
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
        '/Audio/{Id}/stream.{Container}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdStreamByContainer() {
      return this.getAudioByIdStreamByContainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headAudioByIdByStreamfilenameWithHttpInfo() {
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
        '/Audio/{Id}/{StreamFileName}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headAudioByIdByStreamfilename() {
      return this.headAudioByIdByStreamfilenameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headAudioByIdStreamWithHttpInfo() {
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
        '/Audio/{Id}/stream', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headAudioByIdStream() {
      return this.headAudioByIdStreamWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headAudioByIdStreamByContainerWithHttpInfo() {
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
        '/Audio/{Id}/stream.{Container}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headAudioByIdStreamByContainer() {
      return this.headAudioByIdStreamByContainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
