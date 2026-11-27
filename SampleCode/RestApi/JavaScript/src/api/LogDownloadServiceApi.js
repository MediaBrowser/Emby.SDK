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

/**
* LogDownloadService service.
* @module api/LogDownloadServiceApi
* @version 4.11.0.19
*/
export default class LogDownloadServiceApi {

    /**
    * Constructs a new LogDownloadServiceApi. 
    * @alias module:api/LogDownloadServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Downloads logs for the ticket of a download link
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getEncodingLogsDownloadWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Ticket': Ticket
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
        '/Encoding/Logs/Download', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Downloads logs for the ticket of a download link
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getEncodingLogsDownload() {
      return this.getEncodingLogsDownloadWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
