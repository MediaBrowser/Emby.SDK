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

/**
* OpenApiService service.
* @module EmbyClient.JavaScript/OpenApiServiceApi
* @version 4.8.10.0
*/
export default class OpenApiServiceApi {

    /**
    * Constructs a new OpenApiServiceApi. 
    * @alias module:EmbyClient.JavaScript/OpenApiServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getOpenapi operation.
     * @callback module:EmbyClient.JavaScript/OpenApiServiceApi~getOpenapiCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the OpenAPI 3 specifications
     * No authentication required
     * @param {module:EmbyClient.JavaScript/OpenApiServiceApi~getOpenapiCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    getOpenapi() {
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
      let returnType = 'String';

      return this.apiClient.callApi(
        '/openapi', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getOpenapiJson operation.
     * @callback module:EmbyClient.JavaScript/OpenApiServiceApi~getOpenapiJsonCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets OpenAPI 3 specifications
     * No authentication required
     * @param {module:EmbyClient.JavaScript/OpenApiServiceApi~getOpenapiJsonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    getOpenapiJson() {
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
      let returnType = 'String';

      return this.apiClient.callApi(
        '/openapi.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSwagger operation.
     * @callback module:EmbyClient.JavaScript/OpenApiServiceApi~getSwaggerCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the swagger specifications
     * No authentication required
     * @param {module:EmbyClient.JavaScript/OpenApiServiceApi~getSwaggerCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    getSwagger() {
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
      let returnType = 'String';

      return this.apiClient.callApi(
        '/swagger', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSwaggerJson operation.
     * @callback module:EmbyClient.JavaScript/OpenApiServiceApi~getSwaggerJsonCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the swagger specifications
     * No authentication required
     * @param {module:EmbyClient.JavaScript/OpenApiServiceApi~getSwaggerJsonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    getSwaggerJson() {
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
      let returnType = 'String';

      return this.apiClient.callApi(
        '/swagger.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
