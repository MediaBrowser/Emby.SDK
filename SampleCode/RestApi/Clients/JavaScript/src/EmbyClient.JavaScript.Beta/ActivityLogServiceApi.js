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
import QueryResultActivityLogEntry from '../model/QueryResultActivityLogEntry';

/**
* ActivityLogService service.
* @module EmbyClient.JavaScript.Beta/ActivityLogServiceApi
* @version 4.8.0.78
*/
export default class ActivityLogServiceApi {

    /**
    * Constructs a new ActivityLogServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/ActivityLogServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getSystemActivitylogEntries operation.
     * @callback module:EmbyClient.JavaScript.Beta/ActivityLogServiceApi~getSystemActivitylogEntriesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultActivityLogEntry} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets activity log entries
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/ActivityLogServiceApi~getSystemActivitylogEntriesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultActivityLogEntry}
     */
    getSystemActivitylogEntries() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'MinDate': opts['minDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultActivityLogEntry;

      return this.apiClient.callApi(
        '/System/ActivityLog/Entries', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
