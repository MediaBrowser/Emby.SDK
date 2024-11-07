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
import ConnectConnectAuthenticationExchangeResult from '../model/ConnectConnectAuthenticationExchangeResult';
import ConnectUserLinkResult from '../model/ConnectUserLinkResult';

/**
* ConnectService service.
* @module api/ConnectServiceApi
* @version 4.9.0.31
*/
export default class ConnectServiceApi {

    /**
    * Constructs a new ConnectServiceApi. 
    * @alias module:api/ConnectServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Removes a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteUsersByIdConnectLinkWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        '/Users/{Id}/Connect/Link', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Removes a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteUsersByIdConnectLink() {
      return this.deleteUsersByIdConnectLinkWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the corresponding local user from a connect user id
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConnectConnectAuthenticationExchangeResult} and HTTP response
     */
    getConnectExchangeWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ConnectUserId': ConnectUserId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = ConnectConnectAuthenticationExchangeResult;

      return this.apiClient.callApi(
        '/Connect/Exchange', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the corresponding local user from a connect user id
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConnectConnectAuthenticationExchangeResult}
     */
    getConnectExchange() {
      return this.getConnectExchangeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Creates a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getConnectPendingWithHttpInfo() {
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
        '/Connect/Pending', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Creates a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getConnectPending() {
      return this.getConnectPendingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Creates a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConnectUserLinkResult} and HTTP response
     */
    postUsersByIdConnectLinkWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'ConnectUsername': ConnectUsername
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = ConnectUserLinkResult;

      return this.apiClient.callApi(
        '/Users/{Id}/Connect/Link', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Creates a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConnectUserLinkResult}
     */
    postUsersByIdConnectLink() {
      return this.postUsersByIdConnectLinkWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Removes a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersByIdConnectLinkDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        '/Users/{Id}/Connect/Link/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Removes a Connect link for a user
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersByIdConnectLinkDelete() {
      return this.postUsersByIdConnectLinkDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
