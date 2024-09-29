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
import PluginsPluginInfo from '../model/PluginsPluginInfo';

/**
* PluginService service.
* @module EmbyClient.JavaScript/PluginServiceApi
* @version 4.8.10.0
*/
export default class PluginServiceApi {

    /**
    * Constructs a new PluginServiceApi. 
    * @alias module:EmbyClient.JavaScript/PluginServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deletePluginsById operation.
     * @callback module:EmbyClient.JavaScript/PluginServiceApi~deletePluginsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uninstalls a plugin
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PluginServiceApi~deletePluginsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deletePluginsById() {
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
        '/Plugins/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPlugins operation.
     * @callback module:EmbyClient.JavaScript/PluginServiceApi~getPluginsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/PluginsPluginInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of currently installed plugins
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PluginServiceApi~getPluginsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/PluginsPluginInfo>}
     */
    getPlugins() {
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
      let returnType = [PluginsPluginInfo];

      return this.apiClient.callApi(
        '/Plugins', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPluginsByIdConfiguration operation.
     * @callback module:EmbyClient.JavaScript/PluginServiceApi~getPluginsByIdConfigurationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a plugin&#x27;s configuration
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PluginServiceApi~getPluginsByIdConfigurationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getPluginsByIdConfiguration() {
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
        '/Plugins/{Id}/Configuration', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPluginsByIdThumb operation.
     * @callback module:EmbyClient.JavaScript/PluginServiceApi~getPluginsByIdThumbCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a plugin thumb image
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/PluginServiceApi~getPluginsByIdThumbCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getPluginsByIdThumb() {
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
        '/Plugins/{Id}/Thumb', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPluginsByIdConfiguration operation.
     * @callback module:EmbyClient.JavaScript/PluginServiceApi~postPluginsByIdConfigurationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a plugin&#x27;s configuration
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PluginServiceApi~postPluginsByIdConfigurationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postPluginsByIdConfiguration() {
      let postBody = body;

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
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Plugins/{Id}/Configuration', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPluginsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript/PluginServiceApi~postPluginsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uninstalls a plugin
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PluginServiceApi~postPluginsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postPluginsByIdDelete() {
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
        '/Plugins/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
