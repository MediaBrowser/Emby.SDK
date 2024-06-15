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
import DisplayPreferences from '../model/DisplayPreferences';

/**
* DisplayPreferencesService service.
* @module api/DisplayPreferencesServiceApi
* @version 4.9.0.25
*/
export default class DisplayPreferencesServiceApi {

    /**
    * Constructs a new DisplayPreferencesServiceApi. 
    * @alias module:api/DisplayPreferencesServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/DisplayPreferences} and HTTP response
     */
    getDisplaypreferencesByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': UserId,
        'Client': Client
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = DisplayPreferences;

      return this.apiClient.callApi(
        '/DisplayPreferences/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/DisplayPreferences}
     */
    getDisplaypreferencesById() {
      return this.getDisplaypreferencesByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets user settings
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Object.<String, {'String': 'String'}>} and HTTP response
     */
    getUsersettingsByUseridWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId
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
      let returnType = {'String': 'String'};

      return this.apiClient.callApi(
        '/UserSettings/{UserId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets user settings
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Object.<String, {'String': 'String'}>}
     */
    getUsersettingsByUserid() {
      return this.getUsersettingsByUseridWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postDisplaypreferencesByDisplaypreferencesidWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'DisplayPreferencesId': DisplayPreferencesId
      };
      let queryParams = {
        'UserId': UserId
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
        '/DisplayPreferences/{DisplayPreferencesId}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postDisplaypreferencesByDisplaypreferencesid() {
      return this.postDisplaypreferencesByDisplaypreferencesidWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersettingsByUseridWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'UserId': UserId
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
        '/UserSettings/{UserId}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersettingsByUserid() {
      return this.postUsersettingsByUseridWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postUsersettingsByUseridPartialWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'UserId': UserId
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
        '/UserSettings/{UserId}/Partial', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postUsersettingsByUseridPartial() {
      return this.postUsersettingsByUseridPartialWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
