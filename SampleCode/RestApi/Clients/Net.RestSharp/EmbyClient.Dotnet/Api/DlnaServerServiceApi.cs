/*
 * EmbyClient.Dotnet
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using EmbyClient.Dotnet.Client;

namespace EmbyClient.Dotnet.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IDlnaServerServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void GetDlnaByUuidConnectionmanagerConnectionmanager (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void GetDlnaByUuidConnectionmanagerConnectionmanagerXml (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void GetDlnaByUuidContentdirectoryContentdirectory (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void GetDlnaByUuidContentdirectoryContentdirectoryXml (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void GetDlnaByUuidDescription (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaByUuidDescriptionWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void GetDlnaByUuidDescriptionXml (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaByUuidDescriptionXmlWithHttpInfo (string uuId);
        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns></returns>
        void GetDlnaByUuidIconsByFilename (string uuId, string filename);

        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaByUuidIconsByFilenameWithHttpInfo (string uuId, string filename);
        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns></returns>
        void GetDlnaIconsByFilename (string uuId, string filename);

        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetDlnaIconsByFilenameWithHttpInfo (string uuId, string filename);
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void HeadDlnaByUuidConnectionmanagerConnectionmanager (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void HeadDlnaByUuidConnectionmanagerConnectionmanagerXml (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void HeadDlnaByUuidContentdirectoryContentdirectory (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void HeadDlnaByUuidContentdirectoryContentdirectoryXml (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void HeadDlnaByUuidDescription (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadDlnaByUuidDescriptionWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void HeadDlnaByUuidDescriptionXml (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadDlnaByUuidDescriptionXmlWithHttpInfo (string uuId);
        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void PostDlnaByUuidConnectionmanagerControl (Object body, string uuId);

        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostDlnaByUuidConnectionmanagerControlWithHttpInfo (Object body, string uuId);
        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        void PostDlnaByUuidContentdirectoryControl (Object body, string uuId);

        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostDlnaByUuidContentdirectoryControlWithHttpInfo (Object body, string uuId);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaByUuidConnectionmanagerConnectionmanagerAsync (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidConnectionmanagerConnectionmanagerAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaByUuidConnectionmanagerConnectionmanagerXmlAsync (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidConnectionmanagerConnectionmanagerXmlAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaByUuidContentdirectoryContentdirectoryAsync (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidContentdirectoryContentdirectoryAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaByUuidContentdirectoryContentdirectoryXmlAsync (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidContentdirectoryContentdirectoryXmlAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaByUuidDescriptionAsync (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidDescriptionAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaByUuidDescriptionXmlAsync (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidDescriptionXmlAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaByUuidIconsByFilenameAsync (string uuId, string filename);

        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidIconsByFilenameAsyncWithHttpInfo (string uuId, string filename);
        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetDlnaIconsByFilenameAsync (string uuId, string filename);

        /// <summary>
        /// Gets a server icon
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaIconsByFilenameAsyncWithHttpInfo (string uuId, string filename);
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadDlnaByUuidConnectionmanagerConnectionmanagerAsync (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidConnectionmanagerConnectionmanagerAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlAsync (string uuId);

        /// <summary>
        /// Gets dlna connection manager xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadDlnaByUuidContentdirectoryContentdirectoryAsync (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidContentdirectoryContentdirectoryAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadDlnaByUuidContentdirectoryContentdirectoryXmlAsync (string uuId);

        /// <summary>
        /// Gets dlna content directory xml
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidContentdirectoryContentdirectoryXmlAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadDlnaByUuidDescriptionAsync (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidDescriptionAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadDlnaByUuidDescriptionXmlAsync (string uuId);

        /// <summary>
        /// Gets dlna server info
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidDescriptionXmlAsyncWithHttpInfo (string uuId);
        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostDlnaByUuidConnectionmanagerControlAsync (Object body, string uuId);

        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostDlnaByUuidConnectionmanagerControlAsyncWithHttpInfo (Object body, string uuId);
        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostDlnaByUuidContentdirectoryControlAsync (Object body, string uuId);

        /// <summary>
        /// Processes a control request
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostDlnaByUuidContentdirectoryControlAsyncWithHttpInfo (Object body, string uuId);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class DlnaServerServiceApi : IDlnaServerServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaServerServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DlnaServerServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaServerServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public DlnaServerServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaServerServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DlnaServerServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void GetDlnaByUuidConnectionmanagerConnectionmanager (string uuId)
        {
             GetDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidConnectionmanagerConnectionmanager");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidConnectionmanagerConnectionmanager", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaByUuidConnectionmanagerConnectionmanagerAsync (string uuId)
        {
             await GetDlnaByUuidConnectionmanagerConnectionmanagerAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidConnectionmanagerConnectionmanagerAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidConnectionmanagerConnectionmanager");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidConnectionmanagerConnectionmanager", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void GetDlnaByUuidConnectionmanagerConnectionmanagerXml (string uuId)
        {
             GetDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidConnectionmanagerConnectionmanagerXml");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidConnectionmanagerConnectionmanagerXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaByUuidConnectionmanagerConnectionmanagerXmlAsync (string uuId)
        {
             await GetDlnaByUuidConnectionmanagerConnectionmanagerXmlAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidConnectionmanagerConnectionmanagerXmlAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidConnectionmanagerConnectionmanagerXml");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidConnectionmanagerConnectionmanagerXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void GetDlnaByUuidContentdirectoryContentdirectory (string uuId)
        {
             GetDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidContentdirectoryContentdirectory");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidContentdirectoryContentdirectory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaByUuidContentdirectoryContentdirectoryAsync (string uuId)
        {
             await GetDlnaByUuidContentdirectoryContentdirectoryAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidContentdirectoryContentdirectoryAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidContentdirectoryContentdirectory");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidContentdirectoryContentdirectory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void GetDlnaByUuidContentdirectoryContentdirectoryXml (string uuId)
        {
             GetDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidContentdirectoryContentdirectoryXml");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidContentdirectoryContentdirectoryXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaByUuidContentdirectoryContentdirectoryXmlAsync (string uuId)
        {
             await GetDlnaByUuidContentdirectoryContentdirectoryXmlAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidContentdirectoryContentdirectoryXmlAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidContentdirectoryContentdirectoryXml");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidContentdirectoryContentdirectoryXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void GetDlnaByUuidDescription (string uuId)
        {
             GetDlnaByUuidDescriptionWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaByUuidDescriptionWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidDescription");

            var localVarPath = "/Dlna/{UuId}/description";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidDescription", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaByUuidDescriptionAsync (string uuId)
        {
             await GetDlnaByUuidDescriptionAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidDescriptionAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidDescription");

            var localVarPath = "/Dlna/{UuId}/description";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidDescription", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void GetDlnaByUuidDescriptionXml (string uuId)
        {
             GetDlnaByUuidDescriptionXmlWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaByUuidDescriptionXmlWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidDescriptionXml");

            var localVarPath = "/Dlna/{UuId}/description.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidDescriptionXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaByUuidDescriptionXmlAsync (string uuId)
        {
             await GetDlnaByUuidDescriptionXmlAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidDescriptionXmlAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidDescriptionXml");

            var localVarPath = "/Dlna/{UuId}/description.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidDescriptionXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns></returns>
        public void GetDlnaByUuidIconsByFilename (string uuId, string filename)
        {
             GetDlnaByUuidIconsByFilenameWithHttpInfo(uuId, filename);
        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaByUuidIconsByFilenameWithHttpInfo (string uuId, string filename)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidIconsByFilename");
            // verify the required parameter 'filename' is set
            if (filename == null)
                throw new ApiException(400, "Missing required parameter 'filename' when calling DlnaServerServiceApi->GetDlnaByUuidIconsByFilename");

            var localVarPath = "/Dlna/{UuId}/icons/{Filename}";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter
            if (filename != null) localVarPathParams.Add("Filename", this.Configuration.ApiClient.ParameterToString(filename)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidIconsByFilename", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaByUuidIconsByFilenameAsync (string uuId, string filename)
        {
             await GetDlnaByUuidIconsByFilenameAsyncWithHttpInfo(uuId, filename);

        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaByUuidIconsByFilenameAsyncWithHttpInfo (string uuId, string filename)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->GetDlnaByUuidIconsByFilename");
            // verify the required parameter 'filename' is set
            if (filename == null)
                throw new ApiException(400, "Missing required parameter 'filename' when calling DlnaServerServiceApi->GetDlnaByUuidIconsByFilename");

            var localVarPath = "/Dlna/{UuId}/icons/{Filename}";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter
            if (filename != null) localVarPathParams.Add("Filename", this.Configuration.ApiClient.ParameterToString(filename)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaByUuidIconsByFilename", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns></returns>
        public void GetDlnaIconsByFilename (string uuId, string filename)
        {
             GetDlnaIconsByFilenameWithHttpInfo(uuId, filename);
        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetDlnaIconsByFilenameWithHttpInfo (string uuId, string filename)
        {
            // verify the required parameter 'filename' is set
            if (filename == null)
                throw new ApiException(400, "Missing required parameter 'filename' when calling DlnaServerServiceApi->GetDlnaIconsByFilename");

            var localVarPath = "/Dlna/icons/{Filename}";
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

            if (filename != null) localVarPathParams.Add("Filename", this.Configuration.ApiClient.ParameterToString(filename)); // path parameter
            if (uuId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UuId", uuId)); // query parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaIconsByFilename", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetDlnaIconsByFilenameAsync (string uuId, string filename)
        {
             await GetDlnaIconsByFilenameAsyncWithHttpInfo(uuId, filename);

        }

        /// <summary>
        /// Gets a server icon No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId (optional)</param>
        /// <param name="filename">The icon filename</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetDlnaIconsByFilenameAsyncWithHttpInfo (string uuId, string filename)
        {
            // verify the required parameter 'filename' is set
            if (filename == null)
                throw new ApiException(400, "Missing required parameter 'filename' when calling DlnaServerServiceApi->GetDlnaIconsByFilename");

            var localVarPath = "/Dlna/icons/{Filename}";
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

            if (filename != null) localVarPathParams.Add("Filename", this.Configuration.ApiClient.ParameterToString(filename)); // path parameter
            if (uuId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UuId", uuId)); // query parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDlnaIconsByFilename", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void HeadDlnaByUuidConnectionmanagerConnectionmanager (string uuId)
        {
             HeadDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidConnectionmanagerConnectionmanager");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidConnectionmanagerConnectionmanager", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadDlnaByUuidConnectionmanagerConnectionmanagerAsync (string uuId)
        {
             await HeadDlnaByUuidConnectionmanagerConnectionmanagerAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidConnectionmanagerConnectionmanagerAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidConnectionmanagerConnectionmanager");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidConnectionmanagerConnectionmanager", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void HeadDlnaByUuidConnectionmanagerConnectionmanagerXml (string uuId)
        {
             HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidConnectionmanagerConnectionmanagerXml");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidConnectionmanagerConnectionmanagerXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlAsync (string uuId)
        {
             await HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna connection manager xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidConnectionmanagerConnectionmanagerXmlAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidConnectionmanagerConnectionmanagerXml");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidConnectionmanagerConnectionmanagerXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void HeadDlnaByUuidContentdirectoryContentdirectory (string uuId)
        {
             HeadDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidContentdirectoryContentdirectory");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidContentdirectoryContentdirectory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadDlnaByUuidContentdirectoryContentdirectoryAsync (string uuId)
        {
             await HeadDlnaByUuidContentdirectoryContentdirectoryAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidContentdirectoryContentdirectoryAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidContentdirectoryContentdirectory");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidContentdirectoryContentdirectory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void HeadDlnaByUuidContentdirectoryContentdirectoryXml (string uuId)
        {
             HeadDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidContentdirectoryContentdirectoryXml");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidContentdirectoryContentdirectoryXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadDlnaByUuidContentdirectoryContentdirectoryXmlAsync (string uuId)
        {
             await HeadDlnaByUuidContentdirectoryContentdirectoryXmlAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna content directory xml No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidContentdirectoryContentdirectoryXmlAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidContentdirectoryContentdirectoryXml");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidContentdirectoryContentdirectoryXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void HeadDlnaByUuidDescription (string uuId)
        {
             HeadDlnaByUuidDescriptionWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadDlnaByUuidDescriptionWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidDescription");

            var localVarPath = "/Dlna/{UuId}/description";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidDescription", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadDlnaByUuidDescriptionAsync (string uuId)
        {
             await HeadDlnaByUuidDescriptionAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidDescriptionAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidDescription");

            var localVarPath = "/Dlna/{UuId}/description";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidDescription", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void HeadDlnaByUuidDescriptionXml (string uuId)
        {
             HeadDlnaByUuidDescriptionXmlWithHttpInfo(uuId);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadDlnaByUuidDescriptionXmlWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidDescriptionXml");

            var localVarPath = "/Dlna/{UuId}/description.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidDescriptionXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadDlnaByUuidDescriptionXmlAsync (string uuId)
        {
             await HeadDlnaByUuidDescriptionXmlAsyncWithHttpInfo(uuId);

        }

        /// <summary>
        /// Gets dlna server info No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadDlnaByUuidDescriptionXmlAsyncWithHttpInfo (string uuId)
        {
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->HeadDlnaByUuidDescriptionXml");

            var localVarPath = "/Dlna/{UuId}/description.xml";
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

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadDlnaByUuidDescriptionXml", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void PostDlnaByUuidConnectionmanagerControl (Object body, string uuId)
        {
             PostDlnaByUuidConnectionmanagerControlWithHttpInfo(body, uuId);
        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostDlnaByUuidConnectionmanagerControlWithHttpInfo (Object body, string uuId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling DlnaServerServiceApi->PostDlnaByUuidConnectionmanagerControl");
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->PostDlnaByUuidConnectionmanagerControl");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/control";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostDlnaByUuidConnectionmanagerControl", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostDlnaByUuidConnectionmanagerControlAsync (Object body, string uuId)
        {
             await PostDlnaByUuidConnectionmanagerControlAsyncWithHttpInfo(body, uuId);

        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostDlnaByUuidConnectionmanagerControlAsyncWithHttpInfo (Object body, string uuId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling DlnaServerServiceApi->PostDlnaByUuidConnectionmanagerControl");
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->PostDlnaByUuidConnectionmanagerControl");

            var localVarPath = "/Dlna/{UuId}/connectionmanager/control";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostDlnaByUuidConnectionmanagerControl", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns></returns>
        public void PostDlnaByUuidContentdirectoryControl (Object body, string uuId)
        {
             PostDlnaByUuidContentdirectoryControlWithHttpInfo(body, uuId);
        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostDlnaByUuidContentdirectoryControlWithHttpInfo (Object body, string uuId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling DlnaServerServiceApi->PostDlnaByUuidContentdirectoryControl");
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->PostDlnaByUuidContentdirectoryControl");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/control";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostDlnaByUuidContentdirectoryControl", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostDlnaByUuidContentdirectoryControlAsync (Object body, string uuId)
        {
             await PostDlnaByUuidContentdirectoryControlAsyncWithHttpInfo(body, uuId);

        }

        /// <summary>
        /// Processes a control request No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="uuId">Server UuId</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostDlnaByUuidContentdirectoryControlAsyncWithHttpInfo (Object body, string uuId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling DlnaServerServiceApi->PostDlnaByUuidContentdirectoryControl");
            // verify the required parameter 'uuId' is set
            if (uuId == null)
                throw new ApiException(400, "Missing required parameter 'uuId' when calling DlnaServerServiceApi->PostDlnaByUuidContentdirectoryControl");

            var localVarPath = "/Dlna/{UuId}/contentdirectory/control";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (uuId != null) localVarPathParams.Add("UuId", this.Configuration.ApiClient.ParameterToString(uuId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostDlnaByUuidContentdirectoryControl", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
