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
        public interface IHwaConfigServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        MediaEncodingSettingsHwaProjectionHwaConfigView GetEncodingHwaconfig ();

        /// <summary>
        /// Gets the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> GetEncodingHwaconfigWithHttpInfo ();
        /// <summary>
        /// Gets whether the active configuration has unsaved changes
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>bool?</returns>
        bool? GetEncodingHwaconfighaschanges ();

        /// <summary>
        /// Gets whether the active configuration has unsaved changes
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of bool?</returns>
        ApiResponse<bool?> GetEncodingHwaconfighaschangesWithHttpInfo ();
        /// <summary>
        /// Gets an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        MediaEncodingSettingsHwaEditingNodeOptionsForm GetEncodingHwanodeoptions (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);

        /// <summary>
        /// Gets an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> GetEncodingHwanodeoptionsWithHttpInfo (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);
        /// <summary>
        /// Chooses the device Basic mode uses
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        MediaEncodingSettingsHwaProjectionHwaConfigView PostEncodingHwabasicdevice (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body);

        /// <summary>
        /// Chooses the device Basic mode uses
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwabasicdeviceWithHttpInfo (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body);
        /// <summary>
        /// Runs a command against the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        MediaEncodingSettingsHwaProjectionHwaConfigView PostEncodingHwaconfigcommand (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body);

        /// <summary>
        /// Runs a command against the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwaconfigcommandWithHttpInfo (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body);
        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        MediaEncodingSettingsHwaProjectionHwaConfigView PostEncodingHwaconfigdiscardchanges ();

        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwaconfigdiscardchangesWithHttpInfo ();
        /// <summary>
        /// Saves the transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>MediaEncodingSettingsApiHwaSaveHwaConfigResult</returns>
        MediaEncodingSettingsApiHwaSaveHwaConfigResult PostEncodingHwaconfigsave (MediaEncodingSettingsApiHwaSaveHwaConfig body);

        /// <summary>
        /// Saves the transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>ApiResponse of MediaEncodingSettingsApiHwaSaveHwaConfigResult</returns>
        ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult> PostEncodingHwaconfigsaveWithHttpInfo (MediaEncodingSettingsApiHwaSaveHwaConfig body);
        /// <summary>
        /// Stores an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns></returns>
        void PostEncodingHwanodeoptions (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);

        /// <summary>
        /// Stores an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostEncodingHwanodeoptionsWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);
        /// <summary>
        /// Discards an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns></returns>
        void PostEncodingHwanodeoptionscancel (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body);

        /// <summary>
        /// Discards an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostEncodingHwanodeoptionscancelWithHttpInfo (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body);
        /// <summary>
        /// Runs a postback within an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        MediaEncodingSettingsHwaEditingNodeOptionsForm PostEncodingHwanodeoptionscommand (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data);

        /// <summary>
        /// Runs a postback within an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> PostEncodingHwanodeoptionscommandWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data);
        /// <summary>
        /// Closes a form opened from within another one
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        MediaEncodingSettingsHwaEditingNodeOptionsForm PostEncodingHwanodesuboptions (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted);

        /// <summary>
        /// Closes a form opened from within another one
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> PostEncodingHwanodesuboptionsWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> GetEncodingHwaconfigAsync ();

        /// <summary>
        /// Gets the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> GetEncodingHwaconfigAsyncWithHttpInfo ();
        /// <summary>
        /// Gets whether the active configuration has unsaved changes
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of bool?</returns>
        System.Threading.Tasks.Task<bool?> GetEncodingHwaconfighaschangesAsync ();

        /// <summary>
        /// Gets whether the active configuration has unsaved changes
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (bool?)</returns>
        System.Threading.Tasks.Task<ApiResponse<bool?>> GetEncodingHwaconfighaschangesAsyncWithHttpInfo ();
        /// <summary>
        /// Gets an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>Task of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsHwaEditingNodeOptionsForm> GetEncodingHwanodeoptionsAsync (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);

        /// <summary>
        /// Gets an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaEditingNodeOptionsForm)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>> GetEncodingHwanodeoptionsAsyncWithHttpInfo (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);
        /// <summary>
        /// Chooses the device Basic mode uses
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwabasicdeviceAsync (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body);

        /// <summary>
        /// Chooses the device Basic mode uses
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> PostEncodingHwabasicdeviceAsyncWithHttpInfo (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body);
        /// <summary>
        /// Runs a command against the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwaconfigcommandAsync (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body);

        /// <summary>
        /// Runs a command against the transcoding configuration graph
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> PostEncodingHwaconfigcommandAsyncWithHttpInfo (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body);
        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwaconfigdiscardchangesAsync ();

        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> PostEncodingHwaconfigdiscardchangesAsyncWithHttpInfo ();
        /// <summary>
        /// Saves the transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>Task of MediaEncodingSettingsApiHwaSaveHwaConfigResult</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsApiHwaSaveHwaConfigResult> PostEncodingHwaconfigsaveAsync (MediaEncodingSettingsApiHwaSaveHwaConfig body);

        /// <summary>
        /// Saves the transcoding configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsApiHwaSaveHwaConfigResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult>> PostEncodingHwaconfigsaveAsyncWithHttpInfo (MediaEncodingSettingsApiHwaSaveHwaConfig body);
        /// <summary>
        /// Stores an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostEncodingHwanodeoptionsAsync (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);

        /// <summary>
        /// Stores an options form for a graph node
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingHwanodeoptionsAsyncWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType);
        /// <summary>
        /// Discards an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostEncodingHwanodeoptionscancelAsync (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body);

        /// <summary>
        /// Discards an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingHwanodeoptionscancelAsyncWithHttpInfo (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body);
        /// <summary>
        /// Runs a postback within an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>Task of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsHwaEditingNodeOptionsForm> PostEncodingHwanodeoptionscommandAsync (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data);

        /// <summary>
        /// Runs a postback within an open options form
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaEditingNodeOptionsForm)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>> PostEncodingHwanodeoptionscommandAsyncWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data);
        /// <summary>
        /// Closes a form opened from within another one
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>Task of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsHwaEditingNodeOptionsForm> PostEncodingHwanodesuboptionsAsync (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted);

        /// <summary>
        /// Closes a form opened from within another one
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaEditingNodeOptionsForm)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>> PostEncodingHwanodesuboptionsAsyncWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class HwaConfigServiceApi : IHwaConfigServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="HwaConfigServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public HwaConfigServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="HwaConfigServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public HwaConfigServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="HwaConfigServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public HwaConfigServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public MediaEncodingSettingsHwaProjectionHwaConfigView GetEncodingHwaconfig ()
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = GetEncodingHwaconfigWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public ApiResponse< MediaEncodingSettingsHwaProjectionHwaConfigView > GetEncodingHwaconfigWithHttpInfo ()
        {

            var localVarPath = "/Encoding/HwaConfig";
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
                Exception exception = ExceptionFactory("GetEncodingHwaconfig", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Gets the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> GetEncodingHwaconfigAsync ()
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = await GetEncodingHwaconfigAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> GetEncodingHwaconfigAsyncWithHttpInfo ()
        {

            var localVarPath = "/Encoding/HwaConfig";
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
                Exception exception = ExceptionFactory("GetEncodingHwaconfig", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Gets whether the active configuration has unsaved changes Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>bool?</returns>
        public bool? GetEncodingHwaconfighaschanges ()
        {
             ApiResponse<bool?> localVarResponse = GetEncodingHwaconfighaschangesWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets whether the active configuration has unsaved changes Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of bool?</returns>
        public ApiResponse< bool? > GetEncodingHwaconfighaschangesWithHttpInfo ()
        {

            var localVarPath = "/Encoding/HwaConfigHasChanges";
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
                Exception exception = ExceptionFactory("GetEncodingHwaconfighaschanges", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<bool?>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (bool?) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(bool?)));
        }

        /// <summary>
        /// Gets whether the active configuration has unsaved changes Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of bool?</returns>
        public async System.Threading.Tasks.Task<bool?> GetEncodingHwaconfighaschangesAsync ()
        {
             ApiResponse<bool?> localVarResponse = await GetEncodingHwaconfighaschangesAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets whether the active configuration has unsaved changes Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (bool?)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<bool?>> GetEncodingHwaconfighaschangesAsyncWithHttpInfo ()
        {

            var localVarPath = "/Encoding/HwaConfigHasChanges";
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
                Exception exception = ExceptionFactory("GetEncodingHwaconfighaschanges", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<bool?>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (bool?) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(bool?)));
        }

        /// <summary>
        /// Gets an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public MediaEncodingSettingsHwaEditingNodeOptionsForm GetEncodingHwanodeoptions (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
             ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> localVarResponse = GetEncodingHwanodeoptionsWithHttpInfo(nodeId, editorType);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public ApiResponse< MediaEncodingSettingsHwaEditingNodeOptionsForm > GetEncodingHwanodeoptionsWithHttpInfo (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->GetEncodingHwanodeoptions");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->GetEncodingHwanodeoptions");

            var localVarPath = "/Encoding/HwaNodeOptions";
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

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
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
                Exception exception = ExceptionFactory("GetEncodingHwanodeoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaEditingNodeOptionsForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaEditingNodeOptionsForm)));
        }

        /// <summary>
        /// Gets an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>Task of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsHwaEditingNodeOptionsForm> GetEncodingHwanodeoptionsAsync (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
             ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> localVarResponse = await GetEncodingHwanodeoptionsAsyncWithHttpInfo(nodeId, editorType);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms is wanted</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaEditingNodeOptionsForm)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>> GetEncodingHwanodeoptionsAsyncWithHttpInfo (string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->GetEncodingHwanodeoptions");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->GetEncodingHwanodeoptions");

            var localVarPath = "/Encoding/HwaNodeOptions";
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

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
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
                Exception exception = ExceptionFactory("GetEncodingHwanodeoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaEditingNodeOptionsForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaEditingNodeOptionsForm)));
        }

        /// <summary>
        /// Chooses the device Basic mode uses Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public MediaEncodingSettingsHwaProjectionHwaConfigView PostEncodingHwabasicdevice (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body)
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = PostEncodingHwabasicdeviceWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Chooses the device Basic mode uses Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public ApiResponse< MediaEncodingSettingsHwaProjectionHwaConfigView > PostEncodingHwabasicdeviceWithHttpInfo (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwabasicdevice");

            var localVarPath = "/Encoding/HwaBasicDevice";
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
                Exception exception = ExceptionFactory("PostEncodingHwabasicdevice", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Chooses the device Basic mode uses Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwabasicdeviceAsync (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body)
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = await PostEncodingHwabasicdeviceAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Chooses the device Basic mode uses Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SelectHwaBasicDevice</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> PostEncodingHwabasicdeviceAsyncWithHttpInfo (MediaEncodingSettingsApiHwaSelectHwaBasicDevice body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwabasicdevice");

            var localVarPath = "/Encoding/HwaBasicDevice";
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
                Exception exception = ExceptionFactory("PostEncodingHwabasicdevice", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Runs a command against the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public MediaEncodingSettingsHwaProjectionHwaConfigView PostEncodingHwaconfigcommand (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body)
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = PostEncodingHwaconfigcommandWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Runs a command against the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public ApiResponse< MediaEncodingSettingsHwaProjectionHwaConfigView > PostEncodingHwaconfigcommandWithHttpInfo (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwaconfigcommand");

            var localVarPath = "/Encoding/HwaConfigCommand";
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
                Exception exception = ExceptionFactory("PostEncodingHwaconfigcommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Runs a command against the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwaconfigcommandAsync (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body)
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = await PostEncodingHwaconfigcommandAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Runs a command against the transcoding configuration graph Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ExecuteHwaConfigCommand</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> PostEncodingHwaconfigcommandAsyncWithHttpInfo (MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwaconfigcommand");

            var localVarPath = "/Encoding/HwaConfigCommand";
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
                Exception exception = ExceptionFactory("PostEncodingHwaconfigcommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public MediaEncodingSettingsHwaProjectionHwaConfigView PostEncodingHwaconfigdiscardchanges ()
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = PostEncodingHwaconfigdiscardchangesWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public ApiResponse< MediaEncodingSettingsHwaProjectionHwaConfigView > PostEncodingHwaconfigdiscardchangesWithHttpInfo ()
        {

            var localVarPath = "/Encoding/HwaConfigDiscardChanges";
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingHwaconfigdiscardchanges", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingSettingsHwaProjectionHwaConfigView</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsHwaProjectionHwaConfigView> PostEncodingHwaconfigdiscardchangesAsync ()
        {
             ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> localVarResponse = await PostEncodingHwaconfigdiscardchangesAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Discards the in-progress edit and reloads the active transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaProjectionHwaConfigView)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>> PostEncodingHwaconfigdiscardchangesAsyncWithHttpInfo ()
        {

            var localVarPath = "/Encoding/HwaConfigDiscardChanges";
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingHwaconfigdiscardchanges", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaProjectionHwaConfigView) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaProjectionHwaConfigView)));
        }

        /// <summary>
        /// Saves the transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>MediaEncodingSettingsApiHwaSaveHwaConfigResult</returns>
        public MediaEncodingSettingsApiHwaSaveHwaConfigResult PostEncodingHwaconfigsave (MediaEncodingSettingsApiHwaSaveHwaConfig body)
        {
             ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult> localVarResponse = PostEncodingHwaconfigsaveWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Saves the transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>ApiResponse of MediaEncodingSettingsApiHwaSaveHwaConfigResult</returns>
        public ApiResponse< MediaEncodingSettingsApiHwaSaveHwaConfigResult > PostEncodingHwaconfigsaveWithHttpInfo (MediaEncodingSettingsApiHwaSaveHwaConfig body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwaconfigsave");

            var localVarPath = "/Encoding/HwaConfigSave";
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
                Exception exception = ExceptionFactory("PostEncodingHwaconfigsave", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsApiHwaSaveHwaConfigResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsApiHwaSaveHwaConfigResult)));
        }

        /// <summary>
        /// Saves the transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>Task of MediaEncodingSettingsApiHwaSaveHwaConfigResult</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsApiHwaSaveHwaConfigResult> PostEncodingHwaconfigsaveAsync (MediaEncodingSettingsApiHwaSaveHwaConfig body)
        {
             ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult> localVarResponse = await PostEncodingHwaconfigsaveAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Saves the transcoding configuration Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">SaveHwaConfig</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsApiHwaSaveHwaConfigResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult>> PostEncodingHwaconfigsaveAsyncWithHttpInfo (MediaEncodingSettingsApiHwaSaveHwaConfig body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwaconfigsave");

            var localVarPath = "/Encoding/HwaConfigSave";
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
                Exception exception = ExceptionFactory("PostEncodingHwaconfigsave", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsApiHwaSaveHwaConfigResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsApiHwaSaveHwaConfigResult)));
        }

        /// <summary>
        /// Stores an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns></returns>
        public void PostEncodingHwanodeoptions (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
             PostEncodingHwanodeoptionsWithHttpInfo(body, nodeId, editorType);
        }

        /// <summary>
        /// Stores an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostEncodingHwanodeoptionsWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodeoptions");
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->PostEncodingHwanodeoptions");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->PostEncodingHwanodeoptions");

            var localVarPath = "/Encoding/HwaNodeOptions";
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

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingHwanodeoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Stores an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostEncodingHwanodeoptionsAsync (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
             await PostEncodingHwanodeoptionsAsyncWithHttpInfo(body, nodeId, editorType);

        }

        /// <summary>
        /// Stores an options form for a graph node Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node</param>
        /// <param name="editorType">Which of the node&#x27;s forms was edited</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingHwanodeoptionsAsyncWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodeoptions");
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->PostEncodingHwanodeoptions");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->PostEncodingHwanodeoptions");

            var localVarPath = "/Encoding/HwaNodeOptions";
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

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingHwanodeoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Discards an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns></returns>
        public void PostEncodingHwanodeoptionscancel (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body)
        {
             PostEncodingHwanodeoptionscancelWithHttpInfo(body);
        }

        /// <summary>
        /// Discards an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostEncodingHwanodeoptionscancelWithHttpInfo (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscancel");

            var localVarPath = "/Encoding/HwaNodeOptionsCancel";
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
                Exception exception = ExceptionFactory("PostEncodingHwanodeoptionscancel", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Discards an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostEncodingHwanodeoptionscancelAsync (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body)
        {
             await PostEncodingHwanodeoptionscancelAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Discards an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CancelHwaNodeOptions</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingHwanodeoptionscancelAsyncWithHttpInfo (MediaEncodingSettingsApiHwaCancelHwaNodeOptions body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscancel");

            var localVarPath = "/Encoding/HwaNodeOptionsCancel";
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
                Exception exception = ExceptionFactory("PostEncodingHwanodeoptionscancel", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Runs a postback within an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public MediaEncodingSettingsHwaEditingNodeOptionsForm PostEncodingHwanodeoptionscommand (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data)
        {
             ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> localVarResponse = PostEncodingHwanodeoptionscommandWithHttpInfo(body, nodeId, editorType, commandId, itemId, data);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Runs a postback within an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public ApiResponse< MediaEncodingSettingsHwaEditingNodeOptionsForm > PostEncodingHwanodeoptionscommandWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");
            // verify the required parameter 'commandId' is set
            if (commandId == null)
                throw new ApiException(400, "Missing required parameter 'commandId' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");

            var localVarPath = "/Encoding/HwaNodeOptionsCommand";
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
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
            if (commandId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CommandId", commandId)); // query parameter
            if (itemId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemId", itemId)); // query parameter
            if (data != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Data", data)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingHwanodeoptionscommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaEditingNodeOptionsForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaEditingNodeOptionsForm)));
        }

        /// <summary>
        /// Runs a postback within an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>Task of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsHwaEditingNodeOptionsForm> PostEncodingHwanodeoptionscommandAsync (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data)
        {
             ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> localVarResponse = await PostEncodingHwanodeoptionscommandAsyncWithHttpInfo(body, nodeId, editorType, commandId, itemId, data);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Runs a postback within an open options form Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms is open</param>
        /// <param name="commandId">The postback command</param>
        /// <param name="itemId">The item the command came from (optional)</param>
        /// <param name="data">The command&#x27;s value (optional)</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaEditingNodeOptionsForm)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>> PostEncodingHwanodeoptionscommandAsyncWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, string commandId, string itemId, string data)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");
            // verify the required parameter 'commandId' is set
            if (commandId == null)
                throw new ApiException(400, "Missing required parameter 'commandId' when calling HwaConfigServiceApi->PostEncodingHwanodeoptionscommand");

            var localVarPath = "/Encoding/HwaNodeOptionsCommand";
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
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
            if (commandId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CommandId", commandId)); // query parameter
            if (itemId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemId", itemId)); // query parameter
            if (data != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Data", data)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingHwanodeoptionscommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaEditingNodeOptionsForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaEditingNodeOptionsForm)));
        }

        /// <summary>
        /// Closes a form opened from within another one Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public MediaEncodingSettingsHwaEditingNodeOptionsForm PostEncodingHwanodesuboptions (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted)
        {
             ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> localVarResponse = PostEncodingHwanodesuboptionsWithHttpInfo(body, nodeId, editorType, isAccepted);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Closes a form opened from within another one Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>ApiResponse of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public ApiResponse< MediaEncodingSettingsHwaEditingNodeOptionsForm > PostEncodingHwanodesuboptionsWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodesuboptions");
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->PostEncodingHwanodesuboptions");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->PostEncodingHwanodesuboptions");

            var localVarPath = "/Encoding/HwaNodeSubOptions";
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
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
            if (isAccepted != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsAccepted", isAccepted)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingHwanodesuboptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaEditingNodeOptionsForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaEditingNodeOptionsForm)));
        }

        /// <summary>
        /// Closes a form opened from within another one Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>Task of MediaEncodingSettingsHwaEditingNodeOptionsForm</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsHwaEditingNodeOptionsForm> PostEncodingHwanodesuboptionsAsync (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted)
        {
             ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> localVarResponse = await PostEncodingHwanodesuboptionsAsyncWithHttpInfo(body, nodeId, editorType, isAccepted);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Closes a form opened from within another one Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="nodeId">Id of the node being edited</param>
        /// <param name="editorType">Which of the node&#x27;s forms it was opened from</param>
        /// <param name="isAccepted">Whether to keep what the form holds (optional)</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsHwaEditingNodeOptionsForm)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>> PostEncodingHwanodesuboptionsAsyncWithHttpInfo (Object body, string nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, bool? isAccepted)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling HwaConfigServiceApi->PostEncodingHwanodesuboptions");
            // verify the required parameter 'nodeId' is set
            if (nodeId == null)
                throw new ApiException(400, "Missing required parameter 'nodeId' when calling HwaConfigServiceApi->PostEncodingHwanodesuboptions");
            // verify the required parameter 'editorType' is set
            if (editorType == null)
                throw new ApiException(400, "Missing required parameter 'editorType' when calling HwaConfigServiceApi->PostEncodingHwanodesuboptions");

            var localVarPath = "/Encoding/HwaNodeSubOptions";
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
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (nodeId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NodeId", nodeId)); // query parameter
            if (editorType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EditorType", editorType)); // query parameter
            if (isAccepted != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsAccepted", isAccepted)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingHwanodesuboptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsHwaEditingNodeOptionsForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsHwaEditingNodeOptionsForm)));
        }

    }
}
