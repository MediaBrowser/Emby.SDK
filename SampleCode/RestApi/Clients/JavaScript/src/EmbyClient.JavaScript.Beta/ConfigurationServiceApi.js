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
import ConfigurationServerConfiguration from '../model/ConfigurationServerConfiguration';

/**
* ConfigurationService service.
* @module EmbyClient.JavaScript.Beta/ConfigurationServiceApi
* @version 4.8.0.28
*/
export default class ConfigurationServiceApi {

    /**
    * Constructs a new ConfigurationServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getSystemConfiguration operation.
     * @callback module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~getSystemConfigurationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ConfigurationServerConfiguration} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets application configuration
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~getSystemConfigurationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ConfigurationServerConfiguration}
     */
    getSystemConfiguration() {
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
      let returnType = ConfigurationServerConfiguration;

      return this.apiClient.callApi(
        '/System/Configuration', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSystemConfigurationByKey operation.
     * @callback module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~getSystemConfigurationByKeyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a named configuration
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~getSystemConfigurationByKeyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getSystemConfigurationByKey() {
      let postBody = null;

      let pathParams = {
        'Key': key
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
        '/System/Configuration/{Key}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSystemConfiguration operation.
     * @callback module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~postSystemConfigurationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates application configuration
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~postSystemConfigurationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSystemConfiguration() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/System/Configuration', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSystemConfigurationByKey operation.
     * @callback module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~postSystemConfigurationByKeyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates named configuration
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ConfigurationServiceApi~postSystemConfigurationByKeyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSystemConfigurationByKey() {
      let postBody = body;

      let pathParams = {
        'Key': key
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/System/Configuration/{Key}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}