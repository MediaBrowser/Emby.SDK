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
import QueryResultSyncModelSyncJobItem from '../model/QueryResultSyncModelSyncJobItem';
import QueryResultSyncSyncJob from '../model/QueryResultSyncSyncJob';
import SyncModelSyncDataRequest from '../model/SyncModelSyncDataRequest';
import SyncModelSyncDataResponse from '../model/SyncModelSyncDataResponse';
import SyncModelSyncDialogOptions from '../model/SyncModelSyncDialogOptions';
import SyncModelSyncJobCreationResult from '../model/SyncModelSyncJobCreationResult';
import SyncModelSyncJobRequest from '../model/SyncModelSyncJobRequest';
import SyncModelSyncedItem from '../model/SyncModelSyncedItem';
import SyncModelSyncedItemProgress from '../model/SyncModelSyncedItemProgress';
import SyncSyncCategory from '../model/SyncSyncCategory';
import SyncSyncJob from '../model/SyncSyncJob';
import SyncSyncTarget from '../model/SyncSyncTarget';
import UsersUserAction from '../model/UsersUserAction';

/**
* SyncService service.
* @module EmbyClient.JavaScript.Beta/SyncServiceApi
* @version 4.8.0.51
*/
export default class SyncServiceApi {

    /**
    * Constructs a new SyncServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/SyncServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteSyncByTargetidItems operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~deleteSyncByTargetidItemsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~deleteSyncByTargetidItemsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteSyncByTargetidItems() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'TargetId': targetId
      };
      let queryParams = {
        'ItemIds': opts['itemIds']
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
        '/Sync/{TargetId}/Items', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteSyncJobitemsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~deleteSyncJobitemsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~deleteSyncJobitemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteSyncJobitemsById() {
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
        '/Sync/JobItems/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteSyncJobsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~deleteSyncJobsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~deleteSyncJobsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteSyncJobsById() {
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
        '/Sync/Jobs/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncItemsReady operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncItemsReadyCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SyncModelSyncedItem>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets ready to download sync items.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncItemsReadyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SyncModelSyncedItem>}
     */
    getSyncItemsReady() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'TargetId': targetId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [SyncModelSyncedItem];

      return this.apiClient.callApi(
        '/Sync/Items/Ready', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobitems operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobitemsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultSyncModelSyncJobItem} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync job items.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobitemsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultSyncModelSyncJobItem}
     */
    getSyncJobitems() {
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
      let returnType = QueryResultSyncModelSyncJobItem;

      return this.apiClient.callApi(
        '/Sync/JobItems', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobitemsByIdAdditionalfiles operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobitemsByIdAdditionalfilesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobitemsByIdAdditionalfilesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getSyncJobitemsByIdAdditionalfiles() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Name': name
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
        '/Sync/JobItems/{Id}/AdditionalFiles', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobitemsByIdFile operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobitemsByIdFileCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobitemsByIdFileCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getSyncJobitemsByIdFile() {
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
        '/Sync/JobItems/{Id}/File', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobs operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultSyncSyncJob} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultSyncSyncJob}
     */
    getSyncJobs() {
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
      let returnType = QueryResultSyncSyncJob;

      return this.apiClient.callApi(
        '/Sync/Jobs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncSyncJob} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncJobsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncSyncJob}
     */
    getSyncJobsById() {
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
      let returnType = SyncSyncJob;

      return this.apiClient.callApi(
        '/Sync/Jobs/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncOptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncOptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncModelSyncDialogOptions} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncOptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncModelSyncDialogOptions}
     */
    getSyncOptions() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': userId,
        'ItemIds': opts['itemIds'],
        'ParentId': opts['parentId'],
        'TargetId': opts['targetId'],
        'Category': opts['category']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = SyncModelSyncDialogOptions;

      return this.apiClient.callApi(
        '/Sync/Options', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncTargets operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncTargetsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SyncSyncTarget>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~getSyncTargetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SyncSyncTarget>}
     */
    getSyncTargets() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': userId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [SyncSyncTarget];

      return this.apiClient.callApi(
        '/Sync/Targets', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncByItemidStatus operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncByItemidStatusCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync status for an item.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncByItemidStatusCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncByItemidStatus() {
      let postBody = body;

      let pathParams = {
        'ItemId': itemId
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
        '/Sync/{ItemId}/Status', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncByTargetidItemsDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncByTargetidItemsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncByTargetidItemsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncByTargetidItemsDelete() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'TargetId': targetId
      };
      let queryParams = {
        'ItemIds': opts['itemIds']
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
        '/Sync/{TargetId}/Items/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncData operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncDataCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncModelSyncDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Syncs data between device and server
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncDataCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncModelSyncDataResponse}
     */
    postSyncData() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = SyncModelSyncDataResponse;

      return this.apiClient.callApi(
        '/Sync/Data', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncItemsCancel operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncItemsCancelCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncItemsCancelCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncItemsCancel() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ItemIds': opts['itemIds']
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
        '/Sync/Items/Cancel', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobitemsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncJobitemsByIdDelete() {
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
        '/Sync/JobItems/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobitemsByIdEnable operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdEnableCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enables a cancelled or queued sync job item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdEnableCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncJobitemsByIdEnable() {
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
        '/Sync/JobItems/{Id}/Enable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobitemsByIdMarkforremoval operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdMarkforremovalCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks a job item for removal
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdMarkforremovalCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncJobitemsByIdMarkforremoval() {
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
        '/Sync/JobItems/{Id}/MarkForRemoval', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobitemsByIdTransferred operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdTransferredCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports that a sync job item has successfully been transferred.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdTransferredCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncJobitemsByIdTransferred() {
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
        '/Sync/JobItems/{Id}/Transferred', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobitemsByIdUnmarkforremoval operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdUnmarkforremovalCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unmarks a job item for removal
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobitemsByIdUnmarkforremovalCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncJobitemsByIdUnmarkforremoval() {
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
        '/Sync/JobItems/{Id}/UnmarkForRemoval', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobs operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncModelSyncJobCreationResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncModelSyncJobCreationResult}
     */
    postSyncJobs() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = SyncModelSyncJobCreationResult;

      return this.apiClient.callApi(
        '/Sync/Jobs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncJobsById() {
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
        '/Sync/Jobs/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncJobsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncJobsByIdDelete() {
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
        '/Sync/Jobs/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncOfflineactions operation.
     * @callback module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncOfflineactionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports an action that occurred while offline.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/SyncServiceApi~postSyncOfflineactionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSyncOfflineactions() {
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
        '/Sync/OfflineActions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
