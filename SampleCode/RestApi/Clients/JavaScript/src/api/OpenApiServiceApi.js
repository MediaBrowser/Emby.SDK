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
* OpenApiService service.
* @module api/OpenApiServiceApi
* @version 4.9.0.26
*/
export default class OpenApiServiceApi {

    /**
    * Constructs a new OpenApiServiceApi. 
    * @alias module:api/OpenApiServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the OpenAPI 3 specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'String'} and HTTP response
     */
    getOpenapiWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the OpenAPI 3 specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'String'}
     */
    getOpenapi() {
      return this.getOpenapiWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets OpenAPI 3 specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'String'} and HTTP response
     */
    getOpenapiJsonWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets OpenAPI 3 specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'String'}
     */
    getOpenapiJson() {
      return this.getOpenapiJsonWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the swagger specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'String'} and HTTP response
     */
    getSwaggerWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the swagger specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'String'}
     */
    getSwagger() {
      return this.getSwaggerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the swagger specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'String'} and HTTP response
     */
    getSwaggerJsonWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the swagger specifications
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'String'}
     */
    getSwaggerJson() {
      return this.getSwaggerJsonWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
