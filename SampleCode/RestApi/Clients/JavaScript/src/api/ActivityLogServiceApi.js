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
* @module api/ActivityLogServiceApi
* @version 4.9.0.25
*/
export default class ActivityLogServiceApi {

    /**
    * Constructs a new ActivityLogServiceApi. 
    * @alias module:api/ActivityLogServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets activity log entries
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultActivityLogEntry} and HTTP response
     */
    getSystemActivitylogEntriesWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'MinDate': opts['MinDate']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets activity log entries
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultActivityLogEntry}
     */
    getSystemActivitylogEntries() {
      return this.getSystemActivitylogEntriesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
