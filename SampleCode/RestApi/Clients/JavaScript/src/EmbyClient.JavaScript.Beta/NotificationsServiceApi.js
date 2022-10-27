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
import EmbyNotificationsApiNotificationResult from '../model/EmbyNotificationsApiNotificationResult';
import EmbyNotificationsApiNotificationsSummary from '../model/EmbyNotificationsApiNotificationsSummary';
import NameIdPair from '../model/NameIdPair';
import NotificationsNotificationLevel from '../model/NotificationsNotificationLevel';
import NotificationsNotificationTypeInfo from '../model/NotificationsNotificationTypeInfo';

/**
* NotificationsService service.
* @module EmbyClient.JavaScript.Beta/NotificationsServiceApi
* @version 4.8.0.14
*/
export default class NotificationsServiceApi {

    /**
    * Constructs a new NotificationsServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/NotificationsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getNotificationsByUserid operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsByUseridCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyNotificationsApiNotificationResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets notifications
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsByUseridCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyNotificationsApiNotificationResult}
     */
    getNotificationsByUserid() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId
      };
      let queryParams = {
        'IsRead': opts['isRead'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = EmbyNotificationsApiNotificationResult;

      return this.apiClient.callApi(
        '/Notifications/{UserId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getNotificationsByUseridSummary operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsByUseridSummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyNotificationsApiNotificationsSummary} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a notification summary for a user
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsByUseridSummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyNotificationsApiNotificationsSummary}
     */
    getNotificationsByUseridSummary() {
      let postBody = null;

      let pathParams = {
        'UserId': userId
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
      let returnType = EmbyNotificationsApiNotificationsSummary;

      return this.apiClient.callApi(
        '/Notifications/{UserId}/Summary', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getNotificationsServices operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsServicesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NameIdPair>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets notification types
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsServicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NameIdPair>}
     */
    getNotificationsServices() {
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
      let returnType = [NameIdPair];

      return this.apiClient.callApi(
        '/Notifications/Services', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getNotificationsTypes operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsTypesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NotificationsNotificationTypeInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets notification types
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~getNotificationsTypesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NotificationsNotificationTypeInfo>}
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
      let returnType = [NotificationsNotificationTypeInfo];

      return this.apiClient.callApi(
        '/Notifications/Types', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postNotificationsAdmin operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~postNotificationsAdminCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Sends a notification to all admin users
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~postNotificationsAdminCallback} callback The callback function, accepting three arguments: error, data, response
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
    /**
     * Callback function to receive the result of the postNotificationsByUseridRead operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~postNotificationsByUseridReadCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks notifications as read
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~postNotificationsByUseridReadCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postNotificationsByUseridRead() {
      let postBody = null;

      let pathParams = {
        'UserId': userId
      };
      let queryParams = {
        'Ids': ids
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
        '/Notifications/{UserId}/Read', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postNotificationsByUseridUnread operation.
     * @callback module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~postNotificationsByUseridUnreadCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks notifications as unread
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/NotificationsServiceApi~postNotificationsByUseridUnreadCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postNotificationsByUseridUnread() {
      let postBody = null;

      let pathParams = {
        'UserId': userId
      };
      let queryParams = {
        'Ids': ids
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
        '/Notifications/{UserId}/Unread', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
