/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from "../ApiClient";
import EmbyPluginGenericEditDemoDataDemoTypeInfo from '../model/EmbyPluginGenericEditDemoDataDemoTypeInfo';
import EmbyWebGenericEditEditObjectContainer from '../model/EmbyWebGenericEditEditObjectContainer';

/**
* DemoApiService service.
* @module EmbyClient.JavaScript.Beta/DemoApiServiceApi
* @version 4.8.0.3
*/
export default class DemoApiServiceApi {

    /**
    * Constructs a new DemoApiServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/DemoApiServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getGenericeditdemoDemo operation.
     * @callback module:EmbyClient.JavaScript.Beta/DemoApiServiceApi~getGenericeditdemoDemoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyWebGenericEditEditObjectContainer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets GenericEdit demo data
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DemoApiServiceApi~getGenericeditdemoDemoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyWebGenericEditEditObjectContainer}
     */
    getGenericeditdemoDemo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'DemoSet': demoSet,
        'DemoType': demoType
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = EmbyWebGenericEditEditObjectContainer;

      return this.apiClient.callApi(
        '/GenericEditDemo/Demo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getGenericeditdemoDemotypes operation.
     * @callback module:EmbyClient.JavaScript.Beta/DemoApiServiceApi~getGenericeditdemoDemotypesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/EmbyPluginGenericEditDemoDataDemoTypeInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of demos
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DemoApiServiceApi~getGenericeditdemoDemotypesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/EmbyPluginGenericEditDemoDataDemoTypeInfo>}
     */
    getGenericeditdemoDemotypes() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'DemoSet': demoSet
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [EmbyPluginGenericEditDemoDataDemoTypeInfo];

      return this.apiClient.callApi(
        '/GenericEditDemo/DemoTypes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postGenericeditdemoDemo operation.
     * @callback module:EmbyClient.JavaScript.Beta/DemoApiServiceApi~postGenericeditdemoDemoCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates GenericEdit demo data
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DemoApiServiceApi~postGenericeditdemoDemoCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postGenericeditdemoDemo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'DemoSet': demoSet,
        'DemoType': demoType
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
        '/GenericEditDemo/Demo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
