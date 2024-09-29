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
import DisplayPreferences from '../model/DisplayPreferences';

/**
* DisplayPreferencesService service.
* @module EmbyClient.JavaScript/DisplayPreferencesServiceApi
* @version 4.8.10.0
*/
export default class DisplayPreferencesServiceApi {

    /**
    * Constructs a new DisplayPreferencesServiceApi. 
    * @alias module:EmbyClient.JavaScript/DisplayPreferencesServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getDisplaypreferencesById operation.
     * @callback module:EmbyClient.JavaScript/DisplayPreferencesServiceApi~getDisplaypreferencesByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DisplayPreferences} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DisplayPreferencesServiceApi~getDisplaypreferencesByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DisplayPreferences}
     */
    getDisplaypreferencesById() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': userId,
        'Client': client
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDisplaypreferencesByDisplaypreferencesid operation.
     * @callback module:EmbyClient.JavaScript/DisplayPreferencesServiceApi~postDisplaypreferencesByDisplaypreferencesidCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/DisplayPreferencesServiceApi~postDisplaypreferencesByDisplaypreferencesidCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDisplaypreferencesByDisplaypreferencesid() {
      let postBody = body;

      let pathParams = {
        'DisplayPreferencesId': displayPreferencesId
      };
      let queryParams = {
        'UserId': userId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
