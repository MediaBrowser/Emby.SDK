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
import RemoteSubtitleInfo from '../model/RemoteSubtitleInfo';
import SubtitlesSubtitleDownloadResult from '../model/SubtitlesSubtitleDownloadResult';

/**
* SubtitleService service.
* @module api/SubtitleServiceApi
* @version 4.9.0.29
*/
export default class SubtitleServiceApi {

    /**
    * Constructs a new SubtitleServiceApi. 
    * @alias module:api/SubtitleServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteItemsByIdSubtitlesByIndexWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId
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
        '/Items/{Id}/Subtitles/{Index}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteItemsByIdSubtitlesByIndex() {
      return this.deleteItemsByIdSubtitlesByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteVideosByIdSubtitlesByIndexWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId
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
        '/Videos/{Id}/Subtitles/{Index}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteVideosByIdSubtitlesByIndex() {
      return this.deleteVideosByIdSubtitlesByIndexWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format,
        'StartPositionTicks': StartPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      return this.getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format
      };
      let queryParams = {
        'StartPositionTicks': opts['StartPositionTicks'],
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      return this.getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSubtitleInfo>} and HTTP response
     */
    getItemsByIdRemotesearchSubtitlesByLanguageWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Language': Language
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId,
        'IsPerfectMatch': opts['IsPerfectMatch'],
        'IsForced': opts['IsForced'],
        'IsHearingImpaired': opts['IsHearingImpaired']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSubtitleInfo];

      return this.apiClient.callApi(
        '/Items/{Id}/RemoteSearch/Subtitles/{Language}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSubtitleInfo>}
     */
    getItemsByIdRemotesearchSubtitlesByLanguage() {
      return this.getItemsByIdRemotesearchSubtitlesByLanguageWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getProvidersSubtitlesSubtitlesByIdWithHttpInfo() {
      let postBody = null;

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
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Providers/Subtitles/Subtitles/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getProvidersSubtitlesSubtitlesById() {
      return this.getProvidersSubtitlesSubtitlesByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format,
        'StartPositionTicks': StartPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      return this.getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format
      };
      let queryParams = {
        'StartPositionTicks': opts['StartPositionTicks'],
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      return this.getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format,
        'StartPositionTicks': StartPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      return this.headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format
      };
      let queryParams = {
        'StartPositionTicks': opts['StartPositionTicks'],
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      return this.headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format,
        'StartPositionTicks': StartPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      return this.headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'MediaSourceId': MediaSourceId,
        'Index': Index,
        'Format': Format
      };
      let queryParams = {
        'StartPositionTicks': opts['StartPositionTicks'],
        'EndPositionTicks': opts['EndPositionTicks'],
        'CopyTimestamps': opts['CopyTimestamps']
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
        '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      return this.headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SubtitlesSubtitleDownloadResult} and HTTP response
     */
    postItemsByIdRemotesearchSubtitlesBySubtitleidWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'SubtitleId': SubtitleId
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = SubtitlesSubtitleDownloadResult;

      return this.apiClient.callApi(
        '/Items/{Id}/RemoteSearch/Subtitles/{SubtitleId}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/SubtitlesSubtitleDownloadResult}
     */
    postItemsByIdRemotesearchSubtitlesBySubtitleid() {
      return this.postItemsByIdRemotesearchSubtitlesBySubtitleidWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdSubtitlesByIndexDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId
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
        '/Items/{Id}/Subtitles/{Index}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdSubtitlesByIndexDelete() {
      return this.postItemsByIdSubtitlesByIndexDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postVideosByIdSubtitlesByIndexDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Index': Index
      };
      let queryParams = {
        'MediaSourceId': MediaSourceId
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
        '/Videos/{Id}/Subtitles/{Index}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postVideosByIdSubtitlesByIndexDelete() {
      return this.postVideosByIdSubtitlesByIndexDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
