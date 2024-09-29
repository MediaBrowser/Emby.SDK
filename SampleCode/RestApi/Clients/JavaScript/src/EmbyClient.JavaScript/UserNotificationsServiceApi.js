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
import UserNotificationInfo from '../model/UserNotificationInfo';

/**
* UserNotificationsService service.
* @module EmbyClient.JavaScript/UserNotificationsServiceApi
* @version 4.8.10.0
*/
export default class UserNotificationsServiceApi {

    /**
    * Constructs a new UserNotificationsServiceApi. 
    * @alias module:EmbyClient.JavaScript/UserNotificationsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getNotificationsServicesDefaults operation.
     * @callback module:EmbyClient.JavaScript/UserNotificationsServiceApi~getNotificationsServicesDefaultsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserNotificationInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets default notification info
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserNotificationsServiceApi~getNotificationsServicesDefaultsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserNotificationInfo}
     */
    getNotificationsServicesDefaults() {
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
      let returnType = UserNotificationInfo;

      return this.apiClient.callApi(
        '/Notifications/Services/Defaults', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postNotificationsServicesTest operation.
     * @callback module:EmbyClient.JavaScript/UserNotificationsServiceApi~postNotificationsServicesTestCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Sends a test notification
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserNotificationsServiceApi~postNotificationsServicesTestCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postNotificationsServicesTest() {
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
        '/Notifications/Services/Test', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
