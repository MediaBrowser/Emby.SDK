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
* @module api/SyncServiceApi
* @version 4.9.0.31
*/
export default class SyncServiceApi {

    /**
    * Constructs a new SyncServiceApi. 
    * @alias module:api/SyncServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteSyncByTargetidItemsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'TargetId': TargetId
      };
      let queryParams = {
        'ItemIds': opts['ItemIds']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteSyncByTargetidItems() {
      return this.deleteSyncByTargetidItemsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteSyncJobitemsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteSyncJobitemsById() {
      return this.deleteSyncJobitemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteSyncJobsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteSyncJobsById() {
      return this.deleteSyncJobsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets ready to download sync items.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/SyncedItem>} and HTTP response
     */
    getSyncItemsReadyWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'TargetId': TargetId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets ready to download sync items.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/SyncedItem>}
     */
    getSyncItemsReady() {
      return this.getSyncItemsReadyWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets sync job items.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultSyncJobItem} and HTTP response
     */
    getSyncJobitemsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'TargetId': TargetId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets sync job items.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultSyncJobItem}
     */
    getSyncJobitems() {
      return this.getSyncJobitemsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getSyncJobitemsByIdAdditionalfilesWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'Name': Name
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getSyncJobitemsByIdAdditionalfiles() {
      return this.getSyncJobitemsByIdAdditionalfilesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getSyncJobitemsByIdFileWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getSyncJobitemsByIdFile() {
      return this.getSyncJobitemsByIdFileWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultSyncJob} and HTTP response
     */
    getSyncJobsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultSyncJob}
     */
    getSyncJobs() {
      return this.getSyncJobsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SyncJob} and HTTP response
     */
    getSyncJobsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/SyncJob}
     */
    getSyncJobsById() {
      return this.getSyncJobsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SyncDialogOptions} and HTTP response
     */
    getSyncOptionsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': UserId,
        'ItemIds': opts['ItemIds'],
        'ParentId': opts['ParentId'],
        'TargetId': opts['TargetId'],
        'Category': opts['Category']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/SyncDialogOptions}
     */
    getSyncOptions() {
      return this.getSyncOptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/SyncTarget>} and HTTP response
     */
    getSyncTargetsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': UserId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of available sync targets.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/SyncTarget>}
     */
    getSyncTargets() {
      return this.getSyncTargetsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headSyncJobitemsByIdFileWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a sync job item file
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headSyncJobitemsByIdFile() {
      return this.headSyncJobitemsByIdFileWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets sync status for an item.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncByItemidStatusWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'ItemId': ItemId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets sync status for an item.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncByItemidStatus() {
      return this.postSyncByItemidStatusWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncByTargetidItemsDeleteWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'TargetId': TargetId
      };
      let queryParams = {
        'ItemIds': opts['ItemIds']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncByTargetidItemsDelete() {
      return this.postSyncByTargetidItemsDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Syncs data between device and server
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SyncDataResponse} and HTTP response
     */
    postSyncDataWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'TargetId': TargetId
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Syncs data between device and server
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/SyncDataResponse}
     */
    postSyncData() {
      return this.postSyncDataWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncItemsCancelWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ItemIds': opts['ItemIds']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels items from a sync target
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncItemsCancel() {
      return this.postSyncItemsCancelWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncJobitemsByIdDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a sync job item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncJobitemsByIdDelete() {
      return this.postSyncJobitemsByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Enables a cancelled or queued sync job item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncJobitemsByIdEnableWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Enables a cancelled or queued sync job item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncJobitemsByIdEnable() {
      return this.postSyncJobitemsByIdEnableWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Marks a job item for removal
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncJobitemsByIdMarkforremovalWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Marks a job item for removal
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncJobitemsByIdMarkforremoval() {
      return this.postSyncJobitemsByIdMarkforremovalWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports that a sync job item has successfully been transferred.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncJobitemsByIdTransferredWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports that a sync job item has successfully been transferred.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncJobitemsByIdTransferred() {
      return this.postSyncJobitemsByIdTransferredWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Unmarks a job item for removal
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncJobitemsByIdUnmarkforremovalWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Unmarks a job item for removal
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncJobitemsByIdUnmarkforremoval() {
      return this.postSyncJobitemsByIdUnmarkforremovalWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SyncJobCreationResult} and HTTP response
     */
    postSyncJobsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets sync jobs.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/SyncJobCreationResult}
     */
    postSyncJobs() {
      return this.postSyncJobsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncJobsByIdWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncJobsById() {
      return this.postSyncJobsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncJobsByIdDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a sync job.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncJobsByIdDelete() {
      return this.postSyncJobsByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports an action that occurred while offline.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSyncOfflineactionsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports an action that occurred while offline.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSyncOfflineactions() {
      return this.postSyncOfflineactionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
