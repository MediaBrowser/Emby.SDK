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
import NotificationCategoryInfo from '../model/NotificationCategoryInfo';

/**
* NotificationsService service.
* @module EmbyClient.JavaScript/NotificationsServiceApi
* @version 4.8.10.0
*/
export default class NotificationsServiceApi {

    /**
    * Constructs a new NotificationsServiceApi. 
    * @alias module:EmbyClient.JavaScript/NotificationsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getNotificationsTypes operation.
     * @callback module:EmbyClient.JavaScript/NotificationsServiceApi~getNotificationsTypesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NotificationCategoryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets notification types
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/NotificationsServiceApi~getNotificationsTypesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NotificationCategoryInfo>}
     */
    getNotificationsTypes() {
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
      let returnType = [NotificationCategoryInfo];

      return this.apiClient.callApi(
        '/Notifications/Types', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postNotificationsAdmin operation.
     * @callback module:EmbyClient.JavaScript/NotificationsServiceApi~postNotificationsAdminCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Sends a notification to all admin users
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/NotificationsServiceApi~postNotificationsAdminCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postNotificationsAdmin() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Name': name,
        'Description': description,
        'ImageUrl': opts['imageUrl'],
        'Url': opts['url'],
        'Level': opts['level']
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
        '/Notifications/Admin', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
