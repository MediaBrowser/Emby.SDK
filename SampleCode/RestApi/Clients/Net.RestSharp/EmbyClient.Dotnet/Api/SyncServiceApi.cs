/*
 * EmbyClient.Dotnet
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using EmbyClient.Dotnet.Client;
using EmbyClient.Dotnet.Model;

namespace EmbyClient.Dotnet.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface ISyncServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns></returns>
        void DeleteSyncByTargetidItems (string targetId, string itemIds);

        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteSyncByTargetidItemsWithHttpInfo (string targetId, string itemIds);
        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void DeleteSyncJobitemsById (string id);

        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteSyncJobitemsByIdWithHttpInfo (string id);
        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void DeleteSyncJobsById (string id);

        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteSyncJobsByIdWithHttpInfo (string id);
        /// <summary>
        /// Gets ready to download sync items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>List&lt;SyncedItem&gt;</returns>
        List<SyncedItem> GetSyncItemsReady (string targetId);

        /// <summary>
        /// Gets ready to download sync items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>ApiResponse of List&lt;SyncedItem&gt;</returns>
        ApiResponse<List<SyncedItem>> GetSyncItemsReadyWithHttpInfo (string targetId);
        /// <summary>
        /// Gets sync job items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>QueryResultSyncJobItem</returns>
        QueryResultSyncJobItem GetSyncJobitems (string targetId);

        /// <summary>
        /// Gets sync job items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>ApiResponse of QueryResultSyncJobItem</returns>
        ApiResponse<QueryResultSyncJobItem> GetSyncJobitemsWithHttpInfo (string targetId);
        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns></returns>
        void GetSyncJobitemsByIdAdditionalfiles (string id, string name);

        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetSyncJobitemsByIdAdditionalfilesWithHttpInfo (string id, string name);
        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void GetSyncJobitemsByIdFile (string id);

        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetSyncJobitemsByIdFileWithHttpInfo (string id);
        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>QueryResultSyncJob</returns>
        QueryResultSyncJob GetSyncJobs ();

        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of QueryResultSyncJob</returns>
        ApiResponse<QueryResultSyncJob> GetSyncJobsWithHttpInfo ();
        /// <summary>
        /// Gets a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>SyncJob</returns>
        SyncJob GetSyncJobsById (string id);

        /// <summary>
        /// Gets a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of SyncJob</returns>
        ApiResponse<SyncJob> GetSyncJobsByIdWithHttpInfo (string id);
        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>SyncDialogOptions</returns>
        SyncDialogOptions GetSyncOptions (string userId, string itemIds, string parentId, string targetId, SyncCategory category);

        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>ApiResponse of SyncDialogOptions</returns>
        ApiResponse<SyncDialogOptions> GetSyncOptionsWithHttpInfo (string userId, string itemIds, string parentId, string targetId, SyncCategory category);
        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>List&lt;SyncTarget&gt;</returns>
        List<SyncTarget> GetSyncTargets (string userId);

        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>ApiResponse of List&lt;SyncTarget&gt;</returns>
        ApiResponse<List<SyncTarget>> GetSyncTargetsWithHttpInfo (string userId);
        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void HeadSyncJobitemsByIdFile (string id);

        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadSyncJobitemsByIdFileWithHttpInfo (string id);
        /// <summary>
        /// Gets sync status for an item.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns></returns>
        void PostSyncByItemidStatus (SyncedItemProgress body, string itemId);

        /// <summary>
        /// Gets sync status for an item.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncByItemidStatusWithHttpInfo (SyncedItemProgress body, string itemId);
        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns></returns>
        void PostSyncByTargetidItemsDelete (string targetId, string itemIds);

        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncByTargetidItemsDeleteWithHttpInfo (string targetId, string itemIds);
        /// <summary>
        /// Syncs data between device and server
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>SyncDataResponse</returns>
        SyncDataResponse PostSyncData (SyncDataRequest body, string targetId);

        /// <summary>
        /// Syncs data between device and server
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>ApiResponse of SyncDataResponse</returns>
        ApiResponse<SyncDataResponse> PostSyncDataWithHttpInfo (SyncDataRequest body, string targetId);
        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns></returns>
        void PostSyncItemsCancel (string itemIds);

        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncItemsCancelWithHttpInfo (string itemIds);
        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void PostSyncJobitemsByIdDelete (string id);

        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncJobitemsByIdDeleteWithHttpInfo (string id);
        /// <summary>
        /// Enables a cancelled or queued sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void PostSyncJobitemsByIdEnable (string id);

        /// <summary>
        /// Enables a cancelled or queued sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncJobitemsByIdEnableWithHttpInfo (string id);
        /// <summary>
        /// Marks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void PostSyncJobitemsByIdMarkforremoval (string id);

        /// <summary>
        /// Marks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncJobitemsByIdMarkforremovalWithHttpInfo (string id);
        /// <summary>
        /// Reports that a sync job item has successfully been transferred.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void PostSyncJobitemsByIdTransferred (string id);

        /// <summary>
        /// Reports that a sync job item has successfully been transferred.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncJobitemsByIdTransferredWithHttpInfo (string id);
        /// <summary>
        /// Unmarks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void PostSyncJobitemsByIdUnmarkforremoval (string id);

        /// <summary>
        /// Unmarks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncJobitemsByIdUnmarkforremovalWithHttpInfo (string id);
        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>SyncJobCreationResult</returns>
        SyncJobCreationResult PostSyncJobs (SyncJobRequest body);

        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>ApiResponse of SyncJobCreationResult</returns>
        ApiResponse<SyncJobCreationResult> PostSyncJobsWithHttpInfo (SyncJobRequest body);
        /// <summary>
        /// Updates a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        void PostSyncJobsById (SyncJob body, long? id);

        /// <summary>
        /// Updates a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncJobsByIdWithHttpInfo (SyncJob body, long? id);
        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        void PostSyncJobsByIdDelete (string id);

        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncJobsByIdDeleteWithHttpInfo (string id);
        /// <summary>
        /// Reports an action that occurred while offline.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns></returns>
        void PostSyncOfflineactions (List<UserAction> body);

        /// <summary>
        /// Reports an action that occurred while offline.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSyncOfflineactionsWithHttpInfo (List<UserAction> body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteSyncByTargetidItemsAsync (string targetId, string itemIds);

        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteSyncByTargetidItemsAsyncWithHttpInfo (string targetId, string itemIds);
        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteSyncJobitemsByIdAsync (string id);

        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteSyncJobitemsByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteSyncJobsByIdAsync (string id);

        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteSyncJobsByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets ready to download sync items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of List&lt;SyncedItem&gt;</returns>
        System.Threading.Tasks.Task<List<SyncedItem>> GetSyncItemsReadyAsync (string targetId);

        /// <summary>
        /// Gets ready to download sync items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of ApiResponse (List&lt;SyncedItem&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<SyncedItem>>> GetSyncItemsReadyAsyncWithHttpInfo (string targetId);
        /// <summary>
        /// Gets sync job items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of QueryResultSyncJobItem</returns>
        System.Threading.Tasks.Task<QueryResultSyncJobItem> GetSyncJobitemsAsync (string targetId);

        /// <summary>
        /// Gets sync job items.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of ApiResponse (QueryResultSyncJobItem)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultSyncJobItem>> GetSyncJobitemsAsyncWithHttpInfo (string targetId);
        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetSyncJobitemsByIdAdditionalfilesAsync (string id, string name);

        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetSyncJobitemsByIdAdditionalfilesAsyncWithHttpInfo (string id, string name);
        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetSyncJobitemsByIdFileAsync (string id);

        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetSyncJobitemsByIdFileAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of QueryResultSyncJob</returns>
        System.Threading.Tasks.Task<QueryResultSyncJob> GetSyncJobsAsync ();

        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (QueryResultSyncJob)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultSyncJob>> GetSyncJobsAsyncWithHttpInfo ();
        /// <summary>
        /// Gets a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of SyncJob</returns>
        System.Threading.Tasks.Task<SyncJob> GetSyncJobsByIdAsync (string id);

        /// <summary>
        /// Gets a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse (SyncJob)</returns>
        System.Threading.Tasks.Task<ApiResponse<SyncJob>> GetSyncJobsByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>Task of SyncDialogOptions</returns>
        System.Threading.Tasks.Task<SyncDialogOptions> GetSyncOptionsAsync (string userId, string itemIds, string parentId, string targetId, SyncCategory category);

        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>Task of ApiResponse (SyncDialogOptions)</returns>
        System.Threading.Tasks.Task<ApiResponse<SyncDialogOptions>> GetSyncOptionsAsyncWithHttpInfo (string userId, string itemIds, string parentId, string targetId, SyncCategory category);
        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>Task of List&lt;SyncTarget&gt;</returns>
        System.Threading.Tasks.Task<List<SyncTarget>> GetSyncTargetsAsync (string userId);

        /// <summary>
        /// Gets a list of available sync targets.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>Task of ApiResponse (List&lt;SyncTarget&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<SyncTarget>>> GetSyncTargetsAsyncWithHttpInfo (string userId);
        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadSyncJobitemsByIdFileAsync (string id);

        /// <summary>
        /// Gets a sync job item file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadSyncJobitemsByIdFileAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets sync status for an item.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncByItemidStatusAsync (SyncedItemProgress body, string itemId);

        /// <summary>
        /// Gets sync status for an item.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncByItemidStatusAsyncWithHttpInfo (SyncedItemProgress body, string itemId);
        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncByTargetidItemsDeleteAsync (string targetId, string itemIds);

        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncByTargetidItemsDeleteAsyncWithHttpInfo (string targetId, string itemIds);
        /// <summary>
        /// Syncs data between device and server
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of SyncDataResponse</returns>
        System.Threading.Tasks.Task<SyncDataResponse> PostSyncDataAsync (SyncDataRequest body, string targetId);

        /// <summary>
        /// Syncs data between device and server
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of ApiResponse (SyncDataResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<SyncDataResponse>> PostSyncDataAsyncWithHttpInfo (SyncDataRequest body, string targetId);
        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncItemsCancelAsync (string itemIds);

        /// <summary>
        /// Cancels items from a sync target
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncItemsCancelAsyncWithHttpInfo (string itemIds);
        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncJobitemsByIdDeleteAsync (string id);

        /// <summary>
        /// Cancels a sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdDeleteAsyncWithHttpInfo (string id);
        /// <summary>
        /// Enables a cancelled or queued sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncJobitemsByIdEnableAsync (string id);

        /// <summary>
        /// Enables a cancelled or queued sync job item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdEnableAsyncWithHttpInfo (string id);
        /// <summary>
        /// Marks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncJobitemsByIdMarkforremovalAsync (string id);

        /// <summary>
        /// Marks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdMarkforremovalAsyncWithHttpInfo (string id);
        /// <summary>
        /// Reports that a sync job item has successfully been transferred.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncJobitemsByIdTransferredAsync (string id);

        /// <summary>
        /// Reports that a sync job item has successfully been transferred.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdTransferredAsyncWithHttpInfo (string id);
        /// <summary>
        /// Unmarks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncJobitemsByIdUnmarkforremovalAsync (string id);

        /// <summary>
        /// Unmarks a job item for removal
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdUnmarkforremovalAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>Task of SyncJobCreationResult</returns>
        System.Threading.Tasks.Task<SyncJobCreationResult> PostSyncJobsAsync (SyncJobRequest body);

        /// <summary>
        /// Gets sync jobs.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>Task of ApiResponse (SyncJobCreationResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<SyncJobCreationResult>> PostSyncJobsAsyncWithHttpInfo (SyncJobRequest body);
        /// <summary>
        /// Updates a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncJobsByIdAsync (SyncJob body, long? id);

        /// <summary>
        /// Updates a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobsByIdAsyncWithHttpInfo (SyncJob body, long? id);
        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncJobsByIdDeleteAsync (string id);

        /// <summary>
        /// Cancels a sync job.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobsByIdDeleteAsyncWithHttpInfo (string id);
        /// <summary>
        /// Reports an action that occurred while offline.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSyncOfflineactionsAsync (List<UserAction> body);

        /// <summary>
        /// Reports an action that occurred while offline.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncOfflineactionsAsyncWithHttpInfo (List<UserAction> body);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class SyncServiceApi : ISyncServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="SyncServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SyncServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SyncServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public SyncServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SyncServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SyncServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public EmbyClient.Dotnet.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public EmbyClient.Dotnet.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns></returns>
        public void DeleteSyncByTargetidItems (string targetId, string itemIds)
        {
             DeleteSyncByTargetidItemsWithHttpInfo(targetId, itemIds);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteSyncByTargetidItemsWithHttpInfo (string targetId, string itemIds)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->DeleteSyncByTargetidItems");

            var localVarPath = "/Sync/{TargetId}/Items";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarPathParams.Add("TargetId", this.Configuration.ApiClient.ParameterToString(targetId)); // path parameter
            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteSyncByTargetidItems", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteSyncByTargetidItemsAsync (string targetId, string itemIds)
        {
             await DeleteSyncByTargetidItemsAsyncWithHttpInfo(targetId, itemIds);

        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteSyncByTargetidItemsAsyncWithHttpInfo (string targetId, string itemIds)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->DeleteSyncByTargetidItems");

            var localVarPath = "/Sync/{TargetId}/Items";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarPathParams.Add("TargetId", this.Configuration.ApiClient.ParameterToString(targetId)); // path parameter
            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteSyncByTargetidItems", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void DeleteSyncJobitemsById (string id)
        {
             DeleteSyncJobitemsByIdWithHttpInfo(id);
        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteSyncJobitemsByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->DeleteSyncJobitemsById");

            var localVarPath = "/Sync/JobItems/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteSyncJobitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteSyncJobitemsByIdAsync (string id)
        {
             await DeleteSyncJobitemsByIdAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteSyncJobitemsByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->DeleteSyncJobitemsById");

            var localVarPath = "/Sync/JobItems/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteSyncJobitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void DeleteSyncJobsById (string id)
        {
             DeleteSyncJobsByIdWithHttpInfo(id);
        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteSyncJobsByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->DeleteSyncJobsById");

            var localVarPath = "/Sync/Jobs/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteSyncJobsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteSyncJobsByIdAsync (string id)
        {
             await DeleteSyncJobsByIdAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteSyncJobsByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->DeleteSyncJobsById");

            var localVarPath = "/Sync/Jobs/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteSyncJobsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets ready to download sync items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>List&lt;SyncedItem&gt;</returns>
        public List<SyncedItem> GetSyncItemsReady (string targetId)
        {
             ApiResponse<List<SyncedItem>> localVarResponse = GetSyncItemsReadyWithHttpInfo(targetId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets ready to download sync items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>ApiResponse of List&lt;SyncedItem&gt;</returns>
        public ApiResponse< List<SyncedItem> > GetSyncItemsReadyWithHttpInfo (string targetId)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->GetSyncItemsReady");

            var localVarPath = "/Sync/Items/Ready";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncItemsReady", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<SyncedItem>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<SyncedItem>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<SyncedItem>)));
        }

        /// <summary>
        /// Gets ready to download sync items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of List&lt;SyncedItem&gt;</returns>
        public async System.Threading.Tasks.Task<List<SyncedItem>> GetSyncItemsReadyAsync (string targetId)
        {
             ApiResponse<List<SyncedItem>> localVarResponse = await GetSyncItemsReadyAsyncWithHttpInfo(targetId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets ready to download sync items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of ApiResponse (List&lt;SyncedItem&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<SyncedItem>>> GetSyncItemsReadyAsyncWithHttpInfo (string targetId)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->GetSyncItemsReady");

            var localVarPath = "/Sync/Items/Ready";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncItemsReady", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<SyncedItem>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<SyncedItem>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<SyncedItem>)));
        }

        /// <summary>
        /// Gets sync job items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>QueryResultSyncJobItem</returns>
        public QueryResultSyncJobItem GetSyncJobitems (string targetId)
        {
             ApiResponse<QueryResultSyncJobItem> localVarResponse = GetSyncJobitemsWithHttpInfo(targetId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets sync job items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>ApiResponse of QueryResultSyncJobItem</returns>
        public ApiResponse< QueryResultSyncJobItem > GetSyncJobitemsWithHttpInfo (string targetId)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->GetSyncJobitems");

            var localVarPath = "/Sync/JobItems";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobitems", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultSyncJobItem>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultSyncJobItem) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultSyncJobItem)));
        }

        /// <summary>
        /// Gets sync job items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of QueryResultSyncJobItem</returns>
        public async System.Threading.Tasks.Task<QueryResultSyncJobItem> GetSyncJobitemsAsync (string targetId)
        {
             ApiResponse<QueryResultSyncJobItem> localVarResponse = await GetSyncJobitemsAsyncWithHttpInfo(targetId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets sync job items. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of ApiResponse (QueryResultSyncJobItem)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultSyncJobItem>> GetSyncJobitemsAsyncWithHttpInfo (string targetId)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->GetSyncJobitems");

            var localVarPath = "/Sync/JobItems";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobitems", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultSyncJobItem>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultSyncJobItem) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultSyncJobItem)));
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns></returns>
        public void GetSyncJobitemsByIdAdditionalfiles (string id, string name)
        {
             GetSyncJobitemsByIdAdditionalfilesWithHttpInfo(id, name);
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetSyncJobitemsByIdAdditionalfilesWithHttpInfo (string id, string name)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->GetSyncJobitemsByIdAdditionalfiles");
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling SyncServiceApi->GetSyncJobitemsByIdAdditionalfiles");

            var localVarPath = "/Sync/JobItems/{Id}/AdditionalFiles";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (name != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Name", name)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobitemsByIdAdditionalfiles", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetSyncJobitemsByIdAdditionalfilesAsync (string id, string name)
        {
             await GetSyncJobitemsByIdAdditionalfilesAsyncWithHttpInfo(id, name);

        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <param name="name">Name</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetSyncJobitemsByIdAdditionalfilesAsyncWithHttpInfo (string id, string name)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->GetSyncJobitemsByIdAdditionalfiles");
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling SyncServiceApi->GetSyncJobitemsByIdAdditionalfiles");

            var localVarPath = "/Sync/JobItems/{Id}/AdditionalFiles";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (name != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Name", name)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobitemsByIdAdditionalfiles", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void GetSyncJobitemsByIdFile (string id)
        {
             GetSyncJobitemsByIdFileWithHttpInfo(id);
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetSyncJobitemsByIdFileWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->GetSyncJobitemsByIdFile");

            var localVarPath = "/Sync/JobItems/{Id}/File";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobitemsByIdFile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetSyncJobitemsByIdFileAsync (string id)
        {
             await GetSyncJobitemsByIdFileAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetSyncJobitemsByIdFileAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->GetSyncJobitemsByIdFile");

            var localVarPath = "/Sync/JobItems/{Id}/File";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobitemsByIdFile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>QueryResultSyncJob</returns>
        public QueryResultSyncJob GetSyncJobs ()
        {
             ApiResponse<QueryResultSyncJob> localVarResponse = GetSyncJobsWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of QueryResultSyncJob</returns>
        public ApiResponse< QueryResultSyncJob > GetSyncJobsWithHttpInfo ()
        {

            var localVarPath = "/Sync/Jobs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultSyncJob>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultSyncJob) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultSyncJob)));
        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of QueryResultSyncJob</returns>
        public async System.Threading.Tasks.Task<QueryResultSyncJob> GetSyncJobsAsync ()
        {
             ApiResponse<QueryResultSyncJob> localVarResponse = await GetSyncJobsAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (QueryResultSyncJob)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultSyncJob>> GetSyncJobsAsyncWithHttpInfo ()
        {

            var localVarPath = "/Sync/Jobs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultSyncJob>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultSyncJob) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultSyncJob)));
        }

        /// <summary>
        /// Gets a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>SyncJob</returns>
        public SyncJob GetSyncJobsById (string id)
        {
             ApiResponse<SyncJob> localVarResponse = GetSyncJobsByIdWithHttpInfo(id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of SyncJob</returns>
        public ApiResponse< SyncJob > GetSyncJobsByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->GetSyncJobsById");

            var localVarPath = "/Sync/Jobs/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncJob>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncJob) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncJob)));
        }

        /// <summary>
        /// Gets a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of SyncJob</returns>
        public async System.Threading.Tasks.Task<SyncJob> GetSyncJobsByIdAsync (string id)
        {
             ApiResponse<SyncJob> localVarResponse = await GetSyncJobsByIdAsyncWithHttpInfo(id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse (SyncJob)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SyncJob>> GetSyncJobsByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->GetSyncJobsById");

            var localVarPath = "/Sync/Jobs/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncJobsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncJob>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncJob) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncJob)));
        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>SyncDialogOptions</returns>
        public SyncDialogOptions GetSyncOptions (string userId, string itemIds, string parentId, string targetId, SyncCategory category)
        {
             ApiResponse<SyncDialogOptions> localVarResponse = GetSyncOptionsWithHttpInfo(userId, itemIds, parentId, targetId, category);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>ApiResponse of SyncDialogOptions</returns>
        public ApiResponse< SyncDialogOptions > GetSyncOptionsWithHttpInfo (string userId, string itemIds, string parentId, string targetId, SyncCategory category)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling SyncServiceApi->GetSyncOptions");

            var localVarPath = "/Sync/Options";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            if (category != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Category", category)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncOptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncDialogOptions>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncDialogOptions) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncDialogOptions)));
        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>Task of SyncDialogOptions</returns>
        public async System.Threading.Tasks.Task<SyncDialogOptions> GetSyncOptionsAsync (string userId, string itemIds, string parentId, string targetId, SyncCategory category)
        {
             ApiResponse<SyncDialogOptions> localVarResponse = await GetSyncOptionsAsyncWithHttpInfo(userId, itemIds, parentId, targetId, category);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <param name="parentId">ParentId (optional)</param>
        /// <param name="targetId">TargetId (optional)</param>
        /// <param name="category">Category (optional)</param>
        /// <returns>Task of ApiResponse (SyncDialogOptions)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SyncDialogOptions>> GetSyncOptionsAsyncWithHttpInfo (string userId, string itemIds, string parentId, string targetId, SyncCategory category)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling SyncServiceApi->GetSyncOptions");

            var localVarPath = "/Sync/Options";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            if (category != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Category", category)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncOptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncDialogOptions>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncDialogOptions) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncDialogOptions)));
        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>List&lt;SyncTarget&gt;</returns>
        public List<SyncTarget> GetSyncTargets (string userId)
        {
             ApiResponse<List<SyncTarget>> localVarResponse = GetSyncTargetsWithHttpInfo(userId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>ApiResponse of List&lt;SyncTarget&gt;</returns>
        public ApiResponse< List<SyncTarget> > GetSyncTargetsWithHttpInfo (string userId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling SyncServiceApi->GetSyncTargets");

            var localVarPath = "/Sync/Targets";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncTargets", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<SyncTarget>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<SyncTarget>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<SyncTarget>)));
        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>Task of List&lt;SyncTarget&gt;</returns>
        public async System.Threading.Tasks.Task<List<SyncTarget>> GetSyncTargetsAsync (string userId)
        {
             ApiResponse<List<SyncTarget>> localVarResponse = await GetSyncTargetsAsyncWithHttpInfo(userId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a list of available sync targets. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">UserId</param>
        /// <returns>Task of ApiResponse (List&lt;SyncTarget&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<SyncTarget>>> GetSyncTargetsAsyncWithHttpInfo (string userId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling SyncServiceApi->GetSyncTargets");

            var localVarPath = "/Sync/Targets";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetSyncTargets", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<SyncTarget>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<SyncTarget>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<SyncTarget>)));
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void HeadSyncJobitemsByIdFile (string id)
        {
             HeadSyncJobitemsByIdFileWithHttpInfo(id);
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadSyncJobitemsByIdFileWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->HeadSyncJobitemsByIdFile");

            var localVarPath = "/Sync/JobItems/{Id}/File";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadSyncJobitemsByIdFile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadSyncJobitemsByIdFileAsync (string id)
        {
             await HeadSyncJobitemsByIdFileAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Gets a sync job item file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadSyncJobitemsByIdFileAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->HeadSyncJobitemsByIdFile");

            var localVarPath = "/Sync/JobItems/{Id}/File";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadSyncJobitemsByIdFile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets sync status for an item. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns></returns>
        public void PostSyncByItemidStatus (SyncedItemProgress body, string itemId)
        {
             PostSyncByItemidStatusWithHttpInfo(body, itemId);
        }

        /// <summary>
        /// Gets sync status for an item. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncByItemidStatusWithHttpInfo (SyncedItemProgress body, string itemId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncByItemidStatus");
            // verify the required parameter 'itemId' is set
            if (itemId == null)
                throw new ApiException(400, "Missing required parameter 'itemId' when calling SyncServiceApi->PostSyncByItemidStatus");

            var localVarPath = "/Sync/{ItemId}/Status";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (itemId != null) localVarPathParams.Add("ItemId", this.Configuration.ApiClient.ParameterToString(itemId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncByItemidStatus", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets sync status for an item. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncByItemidStatusAsync (SyncedItemProgress body, string itemId)
        {
             await PostSyncByItemidStatusAsyncWithHttpInfo(body, itemId);

        }

        /// <summary>
        /// Gets sync status for an item. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncedItemProgress: </param>
        /// <param name="itemId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncByItemidStatusAsyncWithHttpInfo (SyncedItemProgress body, string itemId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncByItemidStatus");
            // verify the required parameter 'itemId' is set
            if (itemId == null)
                throw new ApiException(400, "Missing required parameter 'itemId' when calling SyncServiceApi->PostSyncByItemidStatus");

            var localVarPath = "/Sync/{ItemId}/Status";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (itemId != null) localVarPathParams.Add("ItemId", this.Configuration.ApiClient.ParameterToString(itemId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncByItemidStatus", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns></returns>
        public void PostSyncByTargetidItemsDelete (string targetId, string itemIds)
        {
             PostSyncByTargetidItemsDeleteWithHttpInfo(targetId, itemIds);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncByTargetidItemsDeleteWithHttpInfo (string targetId, string itemIds)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->PostSyncByTargetidItemsDelete");

            var localVarPath = "/Sync/{TargetId}/Items/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarPathParams.Add("TargetId", this.Configuration.ApiClient.ParameterToString(targetId)); // path parameter
            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncByTargetidItemsDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncByTargetidItemsDeleteAsync (string targetId, string itemIds)
        {
             await PostSyncByTargetidItemsDeleteAsyncWithHttpInfo(targetId, itemIds);

        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="targetId">TargetId</param>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncByTargetidItemsDeleteAsyncWithHttpInfo (string targetId, string itemIds)
        {
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->PostSyncByTargetidItemsDelete");

            var localVarPath = "/Sync/{TargetId}/Items/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarPathParams.Add("TargetId", this.Configuration.ApiClient.ParameterToString(targetId)); // path parameter
            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncByTargetidItemsDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Syncs data between device and server Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>SyncDataResponse</returns>
        public SyncDataResponse PostSyncData (SyncDataRequest body, string targetId)
        {
             ApiResponse<SyncDataResponse> localVarResponse = PostSyncDataWithHttpInfo(body, targetId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Syncs data between device and server Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>ApiResponse of SyncDataResponse</returns>
        public ApiResponse< SyncDataResponse > PostSyncDataWithHttpInfo (SyncDataRequest body, string targetId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncData");
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->PostSyncData");

            var localVarPath = "/Sync/Data";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncData", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncDataResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncDataResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncDataResponse)));
        }

        /// <summary>
        /// Syncs data between device and server Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of SyncDataResponse</returns>
        public async System.Threading.Tasks.Task<SyncDataResponse> PostSyncDataAsync (SyncDataRequest body, string targetId)
        {
             ApiResponse<SyncDataResponse> localVarResponse = await PostSyncDataAsyncWithHttpInfo(body, targetId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Syncs data between device and server Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncDataRequest: </param>
        /// <param name="targetId">TargetId</param>
        /// <returns>Task of ApiResponse (SyncDataResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SyncDataResponse>> PostSyncDataAsyncWithHttpInfo (SyncDataRequest body, string targetId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncData");
            // verify the required parameter 'targetId' is set
            if (targetId == null)
                throw new ApiException(400, "Missing required parameter 'targetId' when calling SyncServiceApi->PostSyncData");

            var localVarPath = "/Sync/Data";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (targetId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetId", targetId)); // query parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncData", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncDataResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncDataResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncDataResponse)));
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns></returns>
        public void PostSyncItemsCancel (string itemIds)
        {
             PostSyncItemsCancelWithHttpInfo(itemIds);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncItemsCancelWithHttpInfo (string itemIds)
        {

            var localVarPath = "/Sync/Items/Cancel";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncItemsCancel", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncItemsCancelAsync (string itemIds)
        {
             await PostSyncItemsCancelAsyncWithHttpInfo(itemIds);

        }

        /// <summary>
        /// Cancels items from a sync target Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">ItemIds (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncItemsCancelAsyncWithHttpInfo (string itemIds)
        {

            var localVarPath = "/Sync/Items/Cancel";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (itemIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemIds", itemIds)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncItemsCancel", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void PostSyncJobitemsByIdDelete (string id)
        {
             PostSyncJobitemsByIdDeleteWithHttpInfo(id);
        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncJobitemsByIdDeleteWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdDelete");

            var localVarPath = "/Sync/JobItems/{Id}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncJobitemsByIdDeleteAsync (string id)
        {
             await PostSyncJobitemsByIdDeleteAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Cancels a sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdDeleteAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdDelete");

            var localVarPath = "/Sync/JobItems/{Id}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Enables a cancelled or queued sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void PostSyncJobitemsByIdEnable (string id)
        {
             PostSyncJobitemsByIdEnableWithHttpInfo(id);
        }

        /// <summary>
        /// Enables a cancelled or queued sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncJobitemsByIdEnableWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdEnable");

            var localVarPath = "/Sync/JobItems/{Id}/Enable";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdEnable", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Enables a cancelled or queued sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncJobitemsByIdEnableAsync (string id)
        {
             await PostSyncJobitemsByIdEnableAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Enables a cancelled or queued sync job item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdEnableAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdEnable");

            var localVarPath = "/Sync/JobItems/{Id}/Enable";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdEnable", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Marks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void PostSyncJobitemsByIdMarkforremoval (string id)
        {
             PostSyncJobitemsByIdMarkforremovalWithHttpInfo(id);
        }

        /// <summary>
        /// Marks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncJobitemsByIdMarkforremovalWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdMarkforremoval");

            var localVarPath = "/Sync/JobItems/{Id}/MarkForRemoval";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdMarkforremoval", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Marks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncJobitemsByIdMarkforremovalAsync (string id)
        {
             await PostSyncJobitemsByIdMarkforremovalAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Marks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdMarkforremovalAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdMarkforremoval");

            var localVarPath = "/Sync/JobItems/{Id}/MarkForRemoval";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdMarkforremoval", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that a sync job item has successfully been transferred. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void PostSyncJobitemsByIdTransferred (string id)
        {
             PostSyncJobitemsByIdTransferredWithHttpInfo(id);
        }

        /// <summary>
        /// Reports that a sync job item has successfully been transferred. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncJobitemsByIdTransferredWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdTransferred");

            var localVarPath = "/Sync/JobItems/{Id}/Transferred";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdTransferred", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that a sync job item has successfully been transferred. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncJobitemsByIdTransferredAsync (string id)
        {
             await PostSyncJobitemsByIdTransferredAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Reports that a sync job item has successfully been transferred. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdTransferredAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdTransferred");

            var localVarPath = "/Sync/JobItems/{Id}/Transferred";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdTransferred", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Unmarks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void PostSyncJobitemsByIdUnmarkforremoval (string id)
        {
             PostSyncJobitemsByIdUnmarkforremovalWithHttpInfo(id);
        }

        /// <summary>
        /// Unmarks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncJobitemsByIdUnmarkforremovalWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdUnmarkforremoval");

            var localVarPath = "/Sync/JobItems/{Id}/UnmarkForRemoval";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdUnmarkforremoval", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Unmarks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncJobitemsByIdUnmarkforremovalAsync (string id)
        {
             await PostSyncJobitemsByIdUnmarkforremovalAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Unmarks a job item for removal Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobitemsByIdUnmarkforremovalAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobitemsByIdUnmarkforremoval");

            var localVarPath = "/Sync/JobItems/{Id}/UnmarkForRemoval";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobitemsByIdUnmarkforremoval", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>SyncJobCreationResult</returns>
        public SyncJobCreationResult PostSyncJobs (SyncJobRequest body)
        {
             ApiResponse<SyncJobCreationResult> localVarResponse = PostSyncJobsWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>ApiResponse of SyncJobCreationResult</returns>
        public ApiResponse< SyncJobCreationResult > PostSyncJobsWithHttpInfo (SyncJobRequest body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncJobs");

            var localVarPath = "/Sync/Jobs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncJobCreationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncJobCreationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncJobCreationResult)));
        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>Task of SyncJobCreationResult</returns>
        public async System.Threading.Tasks.Task<SyncJobCreationResult> PostSyncJobsAsync (SyncJobRequest body)
        {
             ApiResponse<SyncJobCreationResult> localVarResponse = await PostSyncJobsAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets sync jobs. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJobRequest: </param>
        /// <returns>Task of ApiResponse (SyncJobCreationResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SyncJobCreationResult>> PostSyncJobsAsyncWithHttpInfo (SyncJobRequest body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncJobs");

            var localVarPath = "/Sync/Jobs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SyncJobCreationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SyncJobCreationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SyncJobCreationResult)));
        }

        /// <summary>
        /// Updates a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        public void PostSyncJobsById (SyncJob body, long? id)
        {
             PostSyncJobsByIdWithHttpInfo(body, id);
        }

        /// <summary>
        /// Updates a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncJobsByIdWithHttpInfo (SyncJob body, long? id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncJobsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobsById");

            var localVarPath = "/Sync/Jobs/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncJobsByIdAsync (SyncJob body, long? id)
        {
             await PostSyncJobsByIdAsyncWithHttpInfo(body, id);

        }

        /// <summary>
        /// Updates a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SyncJob: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobsByIdAsyncWithHttpInfo (SyncJob body, long? id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncJobsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobsById");

            var localVarPath = "/Sync/Jobs/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns></returns>
        public void PostSyncJobsByIdDelete (string id)
        {
             PostSyncJobsByIdDeleteWithHttpInfo(id);
        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncJobsByIdDeleteWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobsByIdDelete");

            var localVarPath = "/Sync/Jobs/{Id}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncJobsByIdDeleteAsync (string id)
        {
             await PostSyncJobsByIdDeleteAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Cancels a sync job. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncJobsByIdDeleteAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SyncServiceApi->PostSyncJobsByIdDelete");

            var localVarPath = "/Sync/Jobs/{Id}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncJobsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports an action that occurred while offline. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns></returns>
        public void PostSyncOfflineactions (List<UserAction> body)
        {
             PostSyncOfflineactionsWithHttpInfo(body);
        }

        /// <summary>
        /// Reports an action that occurred while offline. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSyncOfflineactionsWithHttpInfo (List<UserAction> body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncOfflineactions");

            var localVarPath = "/Sync/OfflineActions";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncOfflineactions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports an action that occurred while offline. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSyncOfflineactionsAsync (List<UserAction> body)
        {
             await PostSyncOfflineactionsAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Reports an action that occurred while offline. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">List&#x60;1: </param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSyncOfflineactionsAsyncWithHttpInfo (List<UserAction> body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling SyncServiceApi->PostSyncOfflineactions");

            var localVarPath = "/Sync/OfflineActions";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostSyncOfflineactions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
