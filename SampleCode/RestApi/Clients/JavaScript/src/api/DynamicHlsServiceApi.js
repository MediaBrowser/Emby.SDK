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
* DynamicHlsService service.
* @module api/DynamicHlsServiceApi
* @version 4.9.0.26
*/
export default class DynamicHlsServiceApi {

    /**
    * Constructs a new DynamicHlsServiceApi. 
    * @alias module:api/DynamicHlsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': SegmentContainer,
        'SegmentId': SegmentId,
        'Id': Id,
        'PlaylistId': PlaylistId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      return this.getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdLiveM3u8WithHttpInfo() {
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
        '/Audio/{Id}/live.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdLiveM3u8() {
      return this.getAudioByIdLiveM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdMainM3u8WithHttpInfo() {
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
        '/Audio/{Id}/main.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdMainM3u8() {
      return this.getAudioByIdMainM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdMasterM3u8WithHttpInfo() {
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
        '/Audio/{Id}/master.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdMasterM3u8() {
      return this.getAudioByIdMasterM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': SegmentContainer,
        'SegmentId': SegmentId,
        'Id': Id,
        'PlaylistId': PlaylistId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      return this.getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdLiveM3u8WithHttpInfo() {
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
        '/Videos/{Id}/live.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdLiveM3u8() {
      return this.getVideosByIdLiveM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdLiveSubtitlesM3u8WithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'SubtitleSegmentLength': SubtitleSegmentLength,
        'ManifestSubtitles': ManifestSubtitles
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdLiveSubtitlesM3u8() {
      return this.getVideosByIdLiveSubtitlesM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdMainM3u8WithHttpInfo() {
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
        '/Videos/{Id}/main.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdMainM3u8() {
      return this.getVideosByIdMainM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdMasterM3u8WithHttpInfo() {
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
        '/Videos/{Id}/master.m3u8', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdMasterM3u8() {
      return this.getVideosByIdMasterM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdSubtitlesM3u8WithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'SubtitleSegmentLength': SubtitleSegmentLength,
        'ManifestSubtitles': ManifestSubtitles
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdSubtitlesM3u8() {
      return this.getVideosByIdSubtitlesM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': SegmentContainer,
        'SegmentId': SegmentId,
        'Id': Id,
        'PlaylistId': PlaylistId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      return this.headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headAudioByIdMasterM3u8WithHttpInfo() {
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
        '/Audio/{Id}/master.m3u8', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headAudioByIdMasterM3u8() {
      return this.headAudioByIdMasterM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': SegmentContainer,
        'SegmentId': SegmentId,
        'Id': Id,
        'PlaylistId': PlaylistId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer() {
      return this.headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headVideosByIdMasterM3u8WithHttpInfo() {
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
        '/Videos/{Id}/master.m3u8', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headVideosByIdMasterM3u8() {
      return this.headVideosByIdMasterM3u8WithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
