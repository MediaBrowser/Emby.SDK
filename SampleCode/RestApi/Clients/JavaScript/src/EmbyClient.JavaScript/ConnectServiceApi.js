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
import ConnectConnectAuthenticationExchangeResult from '../model/ConnectConnectAuthenticationExchangeResult';
import ConnectUserLinkResult from '../model/ConnectUserLinkResult';

/**
* ConnectService service.
* @module EmbyClient.JavaScript/ConnectServiceApi
* @version 4.8.10.0
*/
export default class ConnectServiceApi {

    /**
    * Constructs a new ConnectServiceApi. 
    * @alias module:EmbyClient.JavaScript/ConnectServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteUsersByIdConnectLink operation.
     * @callback module:EmbyClient.JavaScript/ConnectServiceApi~deleteUsersByIdConnectLinkCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes a Connect link for a user
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ConnectServiceApi~deleteUsersByIdConnectLinkCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteUsersByIdConnectLink() {
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
        '/Users/{Id}/Connect/Link', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getConnectExchange operation.
     * @callback module:EmbyClient.JavaScript/ConnectServiceApi~getConnectExchangeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ConnectConnectAuthenticationExchangeResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the corresponding local user from a connect user id
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ConnectServiceApi~getConnectExchangeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ConnectConnectAuthenticationExchangeResult}
     */
    getConnectExchange() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ConnectUserId': connectUserId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getConnectPending operation.
     * @callback module:EmbyClient.JavaScript/ConnectServiceApi~getConnectPendingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a Connect link for a user
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ConnectServiceApi~getConnectPendingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getConnectPending() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdConnectLink operation.
     * @callback module:EmbyClient.JavaScript/ConnectServiceApi~postUsersByIdConnectLinkCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ConnectUserLinkResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a Connect link for a user
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ConnectServiceApi~postUsersByIdConnectLinkCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ConnectUserLinkResult}
     */
    postUsersByIdConnectLink() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'ConnectUsername': connectUsername
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdConnectLinkDelete operation.
     * @callback module:EmbyClient.JavaScript/ConnectServiceApi~postUsersByIdConnectLinkDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes a Connect link for a user
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ConnectServiceApi~postUsersByIdConnectLinkDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdConnectLinkDelete() {
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
        '/Users/{Id}/Connect/Link/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
