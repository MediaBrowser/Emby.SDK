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
import EmbyWebGenericEditEditObjectContainer from '../model/EmbyWebGenericEditEditObjectContainer';

/**
* DiagnosticsPluginService service.
* @module EmbyClient.JavaScript.Beta/DiagnosticsPluginServiceApi
* @version 4.8.0.3
*/
export default class DiagnosticsPluginServiceApi {

    /**
    * Constructs a new DiagnosticsPluginServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/DiagnosticsPluginServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getEncodingdiagnosticsDiagnosticoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/DiagnosticsPluginServiceApi~getEncodingdiagnosticsDiagnosticoptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyWebGenericEditEditObjectContainer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the EncodingDiagnosticOptions for generic editor
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/DiagnosticsPluginServiceApi~getEncodingdiagnosticsDiagnosticoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyWebGenericEditEditObjectContainer}
     */
    getEncodingdiagnosticsDiagnosticoptions() {
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
      let returnType = EmbyWebGenericEditEditObjectContainer;

      return this.apiClient.callApi(
        '/EncodingDiagnostics/DiagnosticOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postEncodingdiagnosticsDiagnosticoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/DiagnosticsPluginServiceApi~postEncodingdiagnosticsDiagnosticoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates EncodingDiagnosticOptions from generic editor
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DiagnosticsPluginServiceApi~postEncodingdiagnosticsDiagnosticoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postEncodingdiagnosticsDiagnosticoptions() {
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
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/EncodingDiagnostics/DiagnosticOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
