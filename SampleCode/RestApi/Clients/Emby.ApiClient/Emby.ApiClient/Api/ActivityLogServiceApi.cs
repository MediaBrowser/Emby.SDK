// <copyright file="ActivityLogServiceApi.cs" company="Emby LLC">
// Emby.ApiClient. Autogenerated Code. No license applied. 
// </copyright>
// <autogenerated />
namespace Emby.ApiClient.Api
{
	using System;
	using System.Collections.Generic;
	using System.Collections.ObjectModel;
	using System.Linq;
    using System.Threading.Tasks;
	using RestSharp;
	using Emby.ApiClient.Client;
	using Emby.ApiClient.Model;

    /// <summary>
    /// Provides a collection of service methods to interact with the API endpoints.
    /// </summary>
    public partial class ActivityLogServiceApi : IApiAccessor
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ActivityLogServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ActivityLogServiceApi(ApiClient apiClient)
        {
            this.ApiClient = apiClient;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.ApiClient.RestClient.Options.BaseUrl?.ToString();
        }

        /// <summary>Gets the ApiClient object</summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; }

        /// <summary>
        /// Gets activity log entries
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="minDate">Optional. The minimum date. Format &#x3D; ISO (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultActivityLogEntry)</returns>
        public async Task<RestResponse<QueryResultActivityLogEntry>> GetSystemActivitylogEntries (int? startIndex, int? limit, string minDate)
        {
            var request = new RestRequest("/System/ActivityLog/Entries", Method.Get);

            if (startIndex != null)
            {
                request.AddQueryParameter("StartIndex", this.ApiClient.ParameterToString(startIndex));
            }

            if (limit != null)
            {
                request.AddQueryParameter("Limit", this.ApiClient.ParameterToString(limit));
            }

            if (minDate != null)
            {
                request.AddQueryParameter("MinDate", this.ApiClient.ParameterToString(minDate));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<QueryResultActivityLogEntry>(request).ConfigureAwait(false);
            return localVarResponse;
        }

    }
}