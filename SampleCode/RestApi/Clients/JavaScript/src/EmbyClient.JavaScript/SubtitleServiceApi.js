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
import RemoteSubtitleInfo from '../model/RemoteSubtitleInfo';
import SubtitlesSubtitleDownloadResult from '../model/SubtitlesSubtitleDownloadResult';

/**
* SubtitleService service.
* @module EmbyClient.JavaScript/SubtitleServiceApi
* @version 4.8.10.0
*/
export default class SubtitleServiceApi {

    /**
    * Constructs a new SubtitleServiceApi. 
    * @alias module:EmbyClient.JavaScript/SubtitleServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteItemsByIdSubtitlesByIndex operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~deleteItemsByIdSubtitlesByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~deleteItemsByIdSubtitlesByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteItemsByIdSubtitlesByIndex() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Index': index
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteVideosByIdSubtitlesByIndex operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~deleteVideosByIdSubtitlesByIndexCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~deleteVideosByIdSubtitlesByIndexCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteVideosByIdSubtitlesByIndex() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Index': index
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format,
        'StartPositionTicks': startPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format
      };
      let queryParams = {
        'StartPositionTicks': opts['startPositionTicks'],
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdRemotesearchSubtitlesByLanguage operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~getItemsByIdRemotesearchSubtitlesByLanguageCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSubtitleInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~getItemsByIdRemotesearchSubtitlesByLanguageCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSubtitleInfo>}
     */
    getItemsByIdRemotesearchSubtitlesByLanguage() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Language': language
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId,
        'IsPerfectMatch': opts['isPerfectMatch'],
        'IsForced': opts['isForced'],
        'IsHearingImpaired': opts['isHearingImpaired']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getProvidersSubtitlesSubtitlesById operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~getProvidersSubtitlesSubtitlesByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~getProvidersSubtitlesSubtitlesByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getProvidersSubtitlesSubtitlesById() {
      let postBody = null;

      let pathParams = {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Providers/Subtitles/Subtitles/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format,
        'StartPositionTicks': startPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format
      };
      let queryParams = {
        'StartPositionTicks': opts['startPositionTicks'],
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format,
        'StartPositionTicks': startPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format
      };
      let queryParams = {
        'StartPositionTicks': opts['startPositionTicks'],
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format,
        'StartPositionTicks': startPositionTicks
      };
      let queryParams = {
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'MediaSourceId': mediaSourceId,
        'Index': index,
        'Format': format
      };
      let queryParams = {
        'StartPositionTicks': opts['startPositionTicks'],
        'EndPositionTicks': opts['endPositionTicks'],
        'CopyTimestamps': opts['copyTimestamps']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdRemotesearchSubtitlesBySubtitleid operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~postItemsByIdRemotesearchSubtitlesBySubtitleidCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SubtitlesSubtitleDownloadResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~postItemsByIdRemotesearchSubtitlesBySubtitleidCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SubtitlesSubtitleDownloadResult}
     */
    postItemsByIdRemotesearchSubtitlesBySubtitleid() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'SubtitleId': subtitleId
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdSubtitlesByIndexDelete operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~postItemsByIdSubtitlesByIndexDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~postItemsByIdSubtitlesByIndexDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdSubtitlesByIndexDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Index': index
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postVideosByIdSubtitlesByIndexDelete operation.
     * @callback module:EmbyClient.JavaScript/SubtitleServiceApi~postVideosByIdSubtitlesByIndexDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SubtitleServiceApi~postVideosByIdSubtitlesByIndexDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postVideosByIdSubtitlesByIndexDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Index': index
      };
      let queryParams = {
        'MediaSourceId': mediaSourceId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
