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
import TaskInfo from '../model/TaskInfo';
import TaskTriggerInfo from '../model/TaskTriggerInfo';

/**
* ScheduledTaskService service.
* @module EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi
* @version 4.9.0.14
*/
export default class ScheduledTaskServiceApi {

    /**
    * Constructs a new ScheduledTaskServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteScheduledtasksRunningById operation.
     * @callback module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~deleteScheduledtasksRunningByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Stops a scheduled task
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~deleteScheduledtasksRunningByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteScheduledtasksRunningById() {
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
        '/ScheduledTasks/Running/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getScheduledtasks operation.
     * @callback module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~getScheduledtasksCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/TaskInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets scheduled tasks
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~getScheduledtasksCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/TaskInfo>}
     */
    getScheduledtasks() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'IsHidden': opts['isHidden'],
        'IsEnabled': opts['isEnabled']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [TaskInfo];

      return this.apiClient.callApi(
        '/ScheduledTasks', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getScheduledtasksById operation.
     * @callback module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~getScheduledtasksByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TaskInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a scheduled task, by Id
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~getScheduledtasksByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TaskInfo}
     */
    getScheduledtasksById() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = TaskInfo;

      return this.apiClient.callApi(
        '/ScheduledTasks/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postScheduledtasksByIdTriggers operation.
     * @callback module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~postScheduledtasksByIdTriggersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates the triggers for a scheduled task
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~postScheduledtasksByIdTriggersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postScheduledtasksByIdTriggers() {
      let postBody = body;

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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/ScheduledTasks/{Id}/Triggers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postScheduledtasksRunningById operation.
     * @callback module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~postScheduledtasksRunningByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Starts a scheduled task
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~postScheduledtasksRunningByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postScheduledtasksRunningById() {
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
        '/ScheduledTasks/Running/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postScheduledtasksRunningByIdDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~postScheduledtasksRunningByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Stops a scheduled task
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ScheduledTaskServiceApi~postScheduledtasksRunningByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postScheduledtasksRunningByIdDelete() {
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
        '/ScheduledTasks/Running/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
