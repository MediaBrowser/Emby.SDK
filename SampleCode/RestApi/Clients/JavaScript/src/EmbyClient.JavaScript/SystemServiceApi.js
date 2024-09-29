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
import NetEndPointInfo from '../model/NetEndPointInfo';
import PackageVersionInfo from '../model/PackageVersionInfo';
import PublicSystemInfo from '../model/PublicSystemInfo';
import QueryResultLogFile from '../model/QueryResultLogFile';
import QueryResultString from '../model/QueryResultString';
import SystemInfo from '../model/SystemInfo';
import WakeOnLanInfo from '../model/WakeOnLanInfo';

/**
* SystemService service.
* @module EmbyClient.JavaScript/SystemServiceApi
* @version 4.8.10.0
*/
export default class SystemServiceApi {

    /**
    * Constructs a new SystemServiceApi. 
    * @alias module:EmbyClient.JavaScript/SystemServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getSystemEndpoint operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemEndpointCallback
     * @param {String} error Error message, if any.
     * @param {module:model/NetEndPointInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets information about the request endpoint
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemEndpointCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/NetEndPointInfo}
     */
    getSystemEndpoint() {
      let postBody = null;

      let pathParams = {
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
      let returnType = NetEndPointInfo;

      return this.apiClient.callApi(
        '/System/Endpoint', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemInfo operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SystemInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets information about the server
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SystemInfo}
     */
    getSystemInfo() {
      let postBody = null;

      let pathParams = {
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
      let returnType = SystemInfo;

      return this.apiClient.callApi(
        '/System/Info', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemInfoPublic operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemInfoPublicCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PublicSystemInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets public information about the server
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemInfoPublicCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PublicSystemInfo}
     */
    getSystemInfoPublic() {
      let postBody = null;

      let pathParams = {
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
      let returnType = PublicSystemInfo;

      return this.apiClient.callApi(
        '/System/Info/Public', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemLogsByName operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemLogsByNameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a log file
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemLogsByNameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getSystemLogsByName() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name
      };
      let queryParams = {
        'Sanitize': opts['sanitize']
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
        '/System/Logs/{Name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemLogsByNameLines operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemLogsByNameLinesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultString} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a log file
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemLogsByNameLinesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultString}
     */
    getSystemLogsByNameLines() {
      let postBody = null;

      let pathParams = {
        'Name': name
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
      let returnType = QueryResultString;

      return this.apiClient.callApi(
        '/System/Logs/{Name}/Lines', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemLogsQuery operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemLogsQueryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultLogFile} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of available server log files
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemLogsQueryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultLogFile}
     */
    getSystemLogsQuery() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultLogFile;

      return this.apiClient.callApi(
        '/System/Logs/Query', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemPing operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemPingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemPingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getSystemPing() {
      let postBody = null;

      let pathParams = {
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
        '/System/Ping', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemReleasenotes operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemReleasenotesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PackageVersionInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets release notes
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemReleasenotesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PackageVersionInfo}
     */
    getSystemReleasenotes() {
      let postBody = null;

      let pathParams = {
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
      let returnType = PackageVersionInfo;

      return this.apiClient.callApi(
        '/System/ReleaseNotes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemReleasenotesVersions operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemReleasenotesVersionsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/PackageVersionInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets release notes
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemReleasenotesVersionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/PackageVersionInfo>}
     */
    getSystemReleasenotesVersions() {
      let postBody = null;

      let pathParams = {
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
      let returnType = [PackageVersionInfo];

      return this.apiClient.callApi(
        '/System/ReleaseNotes/Versions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemWakeonlaninfo operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~getSystemWakeonlaninfoCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/WakeOnLanInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets wake on lan information
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~getSystemWakeonlaninfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/WakeOnLanInfo>}
     */
    getSystemWakeonlaninfo() {
      let postBody = null;

      let pathParams = {
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
      let returnType = [WakeOnLanInfo];

      return this.apiClient.callApi(
        '/System/WakeOnLanInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSystemPing operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~postSystemPingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~postSystemPingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSystemPing() {
      let postBody = null;

      let pathParams = {
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
        '/System/Ping', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSystemRestart operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~postSystemRestartCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Restarts the application, if needed
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~postSystemRestartCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSystemRestart() {
      let postBody = null;

      let pathParams = {
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
        '/System/Restart', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSystemShutdown operation.
     * @callback module:EmbyClient.JavaScript/SystemServiceApi~postSystemShutdownCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Shuts down the application
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/SystemServiceApi~postSystemShutdownCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSystemShutdown() {
      let postBody = null;

      let pathParams = {
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
        '/System/Shutdown', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
