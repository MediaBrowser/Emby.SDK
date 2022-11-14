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
import EmbyNotificationsNotificationCategoryInfo from '../model/EmbyNotificationsNotificationCategoryInfo';

/**
* NotificationsApi service.
* @module EmbyClient.JavaScript.Beta/NotificationsApiApi
* @version 4.8.0.17
*/
export default class NotificationsApiApi {

    /**
    * Constructs a new NotificationsApiApi. 
    * @alias module:EmbyClient.JavaScript.Beta/NotificationsApiApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getNotificationsAll operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsApiApi~getNotificationsAllCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/EmbyNotificationsNotificationCategoryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets notification types
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsApiApi~getNotificationsAllCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/EmbyNotificationsNotificationCategoryInfo>}
     */
    getNotificationsAll() {
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
      let returnType = [EmbyNotificationsNotificationCategoryInfo];

      return this.apiClient.callApi(
        '/Notifications/All', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
