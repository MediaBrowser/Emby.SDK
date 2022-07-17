/**
 * Emby REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from "../ApiClient";
import EmbyWebApiConfigurationPageInfo from '../model/EmbyWebApiConfigurationPageInfo';

/**
* DashboardService service.
* @module EmbyClient.JavaScript/DashboardServiceApi
* @version 4.7.5.0
*/
export default class DashboardServiceApi {

    /**
    * Constructs a new DashboardServiceApi. 
    * @alias module:EmbyClient.JavaScript/DashboardServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getWebConfigurationpage operation.
     * @callback module:EmbyClient.JavaScript/DashboardServiceApi~getWebConfigurationpageCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DashboardServiceApi~getWebConfigurationpageCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getWebConfigurationpage() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/web/ConfigurationPage', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getWebConfigurationpages operation.
     * @callback module:EmbyClient.JavaScript/DashboardServiceApi~getWebConfigurationpagesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/EmbyWebApiConfigurationPageInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DashboardServiceApi~getWebConfigurationpagesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/EmbyWebApiConfigurationPageInfo>}
     */
    getWebConfigurationpages() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [EmbyWebApiConfigurationPageInfo];

      return this.apiClient.callApi(
        '/web/ConfigurationPages', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getWebStrings operation.
     * @callback module:EmbyClient.JavaScript/DashboardServiceApi~getWebStringsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DashboardServiceApi~getWebStringsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getWebStrings() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/web/strings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
