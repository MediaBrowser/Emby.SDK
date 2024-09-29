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
import ApiConfigurationPageInfo from '../model/ApiConfigurationPageInfo';

/**
* WebAppService service.
* @module EmbyClient.JavaScript/WebAppServiceApi
* @version 4.8.10.0
*/
export default class WebAppServiceApi {

    /**
    * Constructs a new WebAppServiceApi. 
    * @alias module:EmbyClient.JavaScript/WebAppServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getWebConfigurationpage operation.
     * @callback module:EmbyClient.JavaScript/WebAppServiceApi~getWebConfigurationpageCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/WebAppServiceApi~getWebConfigurationpageCallback} callback The callback function, accepting three arguments: error, data, response
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

      let authNames = ['apikeyauth', 'embyauth'];
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
     * @callback module:EmbyClient.JavaScript/WebAppServiceApi~getWebConfigurationpagesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ApiConfigurationPageInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/WebAppServiceApi~getWebConfigurationpagesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ApiConfigurationPageInfo>}
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

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [ApiConfigurationPageInfo];

      return this.apiClient.callApi(
        '/web/ConfigurationPages', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getWebStrings operation.
     * @callback module:EmbyClient.JavaScript/WebAppServiceApi~getWebStringsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/WebAppServiceApi~getWebStringsCallback} callback The callback function, accepting three arguments: error, data, response
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

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/web/strings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getWebStringset operation.
     * @callback module:EmbyClient.JavaScript/WebAppServiceApi~getWebStringsetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<'String'>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/WebAppServiceApi~getWebStringsetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<'String'>}
     */
    getWebStringset() {
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
      let returnType = ['String'];

      return this.apiClient.callApi(
        '/web/stringset', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
