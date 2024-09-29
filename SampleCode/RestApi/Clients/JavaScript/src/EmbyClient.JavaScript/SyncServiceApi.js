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
import QueryResultSyncJob from '../model/QueryResultSyncJob';
import QueryResultSyncJobItem from '../model/QueryResultSyncJobItem';
import SyncCategory from '../model/SyncCategory';
import SyncDataRequest from '../model/SyncDataRequest';
import SyncDataResponse from '../model/SyncDataResponse';
import SyncDialogOptions from '../model/SyncDialogOptions';
import SyncJob from '../model/SyncJob';
import SyncJobCreationResult from '../model/SyncJobCreationResult';
import SyncJobRequest from '../model/SyncJobRequest';
import SyncTarget from '../model/SyncTarget';
import SyncedItem from '../model/SyncedItem';
import SyncedItemProgress from '../model/SyncedItemProgress';
import UserAction from '../model/UserAction';

/**
* SyncService service.
* @module EmbyClient.JavaScript/SyncServiceApi
* @version 4.8.10.0
*/
export default class SyncServiceApi {

    /**
    * Constructs a new SyncServiceApi. 
    * @alias module:EmbyClient.JavaScript/SyncServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteSyncByTargetidItems operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~deleteSyncByTargetidItemsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~deleteSyncByTargetidItemsCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~deleteSyncJobitemsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~deleteSyncJobitemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~deleteSyncJobsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~deleteSyncJobsByIdCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncItemsReadyCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SyncedItem>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets ready to download sync items.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncItemsReadyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SyncedItem>}
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
      let returnType = [SyncedItem];

      return this.apiClient.callApi(
        '/Sync/Items/Ready', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobitems operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobitemsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultSyncJobItem} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync job items.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobitemsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultSyncJobItem}
     */
    getSyncJobitems() {
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
      let returnType = QueryResultSyncJobItem;

      return this.apiClient.callApi(
        '/Sync/JobItems', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobitemsByIdAdditionalfiles operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobitemsByIdAdditionalfilesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobitemsByIdAdditionalfilesCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobitemsByIdFileCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobitemsByIdFileCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultSyncJob} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultSyncJob}
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
      let returnType = QueryResultSyncJob;

      return this.apiClient.callApi(
        '/Sync/Jobs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncJobsById operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncJob} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncJobsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncJob}
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
      let returnType = SyncJob;

      return this.apiClient.callApi(
        '/Sync/Jobs/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncOptions operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncOptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncDialogOptions} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncOptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncDialogOptions}
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
      let returnType = SyncDialogOptions;

      return this.apiClient.callApi(
        '/Sync/Options', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSyncTargets operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~getSyncTargetsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SyncTarget>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~getSyncTargetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SyncTarget>}
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
      let returnType = [SyncTarget];

      return this.apiClient.callApi(
        '/Sync/Targets', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headSyncJobitemsByIdFile operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~headSyncJobitemsByIdFileCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~headSyncJobitemsByIdFileCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headSyncJobitemsByIdFile() {
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
        '/Sync/JobItems/{Id}/File', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncByItemidStatus operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncByItemidStatusCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync status for an item.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncByItemidStatusCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncByTargetidItemsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncByTargetidItemsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncDataCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Syncs data between device and server
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncDataCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncDataResponse}
     */
    postSyncData() {
      let postBody = body;

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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = SyncDataResponse;

      return this.apiClient.callApi(
        '/Sync/Data', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncItemsCancel operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncItemsCancelCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncItemsCancelCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdEnableCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enables a cancelled or queued sync job item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdEnableCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdMarkforremovalCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks a job item for removal
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdMarkforremovalCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdTransferredCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports that a sync job item has successfully been transferred.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdTransferredCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdUnmarkforremovalCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unmarks a job item for removal
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobitemsByIdUnmarkforremovalCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SyncJobCreationResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SyncJobCreationResult}
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
      let returnType = SyncJobCreationResult;

      return this.apiClient.callApi(
        '/Sync/Jobs', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSyncJobsById operation.
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobsByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobsByIdCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncJobsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript/SyncServiceApi~postSyncOfflineactionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports an action that occurred while offline.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SyncServiceApi~postSyncOfflineactionsCallback} callback The callback function, accepting three arguments: error, data, response
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
