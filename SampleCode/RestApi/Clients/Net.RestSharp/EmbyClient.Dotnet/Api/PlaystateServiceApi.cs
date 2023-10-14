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
        public interface IPlaystateServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto DeleteUsersByUseridPlayeditemsById (string userId, string id);

        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> DeleteUsersByUseridPlayeditemsByIdWithHttpInfo (string userId, string id);
        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        void DeleteUsersByUseridPlayingitemsById (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);

        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteUsersByUseridPlayingitemsByIdWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);
        /// <summary>
        /// Reports playback has started within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns></returns>
        void PostSessionsPlaying (PlaybackStartInfo body);

        /// <summary>
        /// Reports playback has started within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSessionsPlayingWithHttpInfo (PlaybackStartInfo body);
        /// <summary>
        /// Pings a playback session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        void PostSessionsPlayingPing (string playSessionId);

        /// <summary>
        /// Pings a playback session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSessionsPlayingPingWithHttpInfo (string playSessionId);
        /// <summary>
        /// Reports playback progress within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns></returns>
        void PostSessionsPlayingProgress (PlaybackProgressInfo body);

        /// <summary>
        /// Reports playback progress within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSessionsPlayingProgressWithHttpInfo (PlaybackProgressInfo body);
        /// <summary>
        /// Reports playback has stopped within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns></returns>
        void PostSessionsPlayingStopped (PlaybackStopInfo body);

        /// <summary>
        /// Reports playback has stopped within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostSessionsPlayingStoppedWithHttpInfo (PlaybackStopInfo body);
        /// <summary>
        /// Updates userdata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns></returns>
        void PostUsersByUseridItemsByItemidUserdata (UserItemDataDto body, string userId, string itemId);

        /// <summary>
        /// Updates userdata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByUseridItemsByItemidUserdataWithHttpInfo (UserItemDataDto body, string userId, string itemId);
        /// <summary>
        /// Marks an item as played
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto PostUsersByUseridPlayeditemsById (string userId, string datePlayed, string id);

        /// <summary>
        /// Marks an item as played
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> PostUsersByUseridPlayeditemsByIdWithHttpInfo (string userId, string datePlayed, string id);
        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        UserItemDataDto PostUsersByUseridPlayeditemsByIdDelete (string userId, string id);

        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        ApiResponse<UserItemDataDto> PostUsersByUseridPlayeditemsByIdDeleteWithHttpInfo (string userId, string id);
        /// <summary>
        /// Reports that a user has begun playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        void PostUsersByUseridPlayingitemsById (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId);

        /// <summary>
        /// Reports that a user has begun playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByUseridPlayingitemsByIdWithHttpInfo (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId);
        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        void PostUsersByUseridPlayingitemsByIdDelete (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);

        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByUseridPlayingitemsByIdDeleteWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);
        /// <summary>
        /// Reports a user&#x27;s playback progress
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns></returns>
        void PostUsersByUseridPlayingitemsByIdProgress (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate);

        /// <summary>
        /// Reports a user&#x27;s playback progress
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByUseridPlayingitemsByIdProgressWithHttpInfo (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> DeleteUsersByUseridPlayeditemsByIdAsync (string userId, string id);

        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> DeleteUsersByUseridPlayeditemsByIdAsyncWithHttpInfo (string userId, string id);
        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteUsersByUseridPlayingitemsByIdAsync (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);

        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteUsersByUseridPlayingitemsByIdAsyncWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);
        /// <summary>
        /// Reports playback has started within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSessionsPlayingAsync (PlaybackStartInfo body);

        /// <summary>
        /// Reports playback has started within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingAsyncWithHttpInfo (PlaybackStartInfo body);
        /// <summary>
        /// Pings a playback session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSessionsPlayingPingAsync (string playSessionId);

        /// <summary>
        /// Pings a playback session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingPingAsyncWithHttpInfo (string playSessionId);
        /// <summary>
        /// Reports playback progress within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSessionsPlayingProgressAsync (PlaybackProgressInfo body);

        /// <summary>
        /// Reports playback progress within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingProgressAsyncWithHttpInfo (PlaybackProgressInfo body);
        /// <summary>
        /// Reports playback has stopped within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostSessionsPlayingStoppedAsync (PlaybackStopInfo body);

        /// <summary>
        /// Reports playback has stopped within a session
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingStoppedAsyncWithHttpInfo (PlaybackStopInfo body);
        /// <summary>
        /// Updates userdata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByUseridItemsByItemidUserdataAsync (UserItemDataDto body, string userId, string itemId);

        /// <summary>
        /// Updates userdata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridItemsByItemidUserdataAsyncWithHttpInfo (UserItemDataDto body, string userId, string itemId);
        /// <summary>
        /// Marks an item as played
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridPlayeditemsByIdAsync (string userId, string datePlayed, string id);

        /// <summary>
        /// Marks an item as played
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridPlayeditemsByIdAsyncWithHttpInfo (string userId, string datePlayed, string id);
        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridPlayeditemsByIdDeleteAsync (string userId, string id);

        /// <summary>
        /// Marks an item as unplayed
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridPlayeditemsByIdDeleteAsyncWithHttpInfo (string userId, string id);
        /// <summary>
        /// Reports that a user has begun playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByUseridPlayingitemsByIdAsync (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId);

        /// <summary>
        /// Reports that a user has begun playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridPlayingitemsByIdAsyncWithHttpInfo (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId);
        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByUseridPlayingitemsByIdDeleteAsync (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);

        /// <summary>
        /// Reports that a user has stopped playing an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridPlayingitemsByIdDeleteAsyncWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId);
        /// <summary>
        /// Reports a user&#x27;s playback progress
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByUseridPlayingitemsByIdProgressAsync (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate);

        /// <summary>
        /// Reports a user&#x27;s playback progress
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridPlayingitemsByIdProgressAsyncWithHttpInfo (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class PlaystateServiceApi : IPlaystateServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="PlaystateServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PlaystateServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PlaystateServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public PlaystateServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PlaystateServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public PlaystateServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto DeleteUsersByUseridPlayeditemsById (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = DeleteUsersByUseridPlayeditemsByIdWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > DeleteUsersByUseridPlayeditemsByIdWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->DeleteUsersByUseridPlayeditemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->DeleteUsersByUseridPlayeditemsById");

            var localVarPath = "/Users/{UserId}/PlayedItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridPlayeditemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> DeleteUsersByUseridPlayeditemsByIdAsync (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await DeleteUsersByUseridPlayeditemsByIdAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> DeleteUsersByUseridPlayeditemsByIdAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->DeleteUsersByUseridPlayeditemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->DeleteUsersByUseridPlayeditemsById");

            var localVarPath = "/Users/{UserId}/PlayedItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridPlayeditemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        public void DeleteUsersByUseridPlayingitemsById (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
             DeleteUsersByUseridPlayingitemsByIdWithHttpInfo(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);
        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteUsersByUseridPlayingitemsByIdWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");
            // verify the required parameter 'nextMediaType' is set
            if (nextMediaType == null)
                throw new ApiException(400, "Missing required parameter 'nextMediaType' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (nextMediaType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NextMediaType", nextMediaType)); // query parameter
            if (positionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PositionTicks", positionTicks)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridPlayingitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteUsersByUseridPlayingitemsByIdAsync (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
             await DeleteUsersByUseridPlayingitemsByIdAsyncWithHttpInfo(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);

        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteUsersByUseridPlayingitemsByIdAsyncWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");
            // verify the required parameter 'nextMediaType' is set
            if (nextMediaType == null)
                throw new ApiException(400, "Missing required parameter 'nextMediaType' when calling PlaystateServiceApi->DeleteUsersByUseridPlayingitemsById");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (nextMediaType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NextMediaType", nextMediaType)); // query parameter
            if (positionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PositionTicks", positionTicks)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteUsersByUseridPlayingitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports playback has started within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns></returns>
        public void PostSessionsPlaying (PlaybackStartInfo body)
        {
             PostSessionsPlayingWithHttpInfo(body);
        }

        /// <summary>
        /// Reports playback has started within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSessionsPlayingWithHttpInfo (PlaybackStartInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostSessionsPlaying");

            var localVarPath = "/Sessions/Playing";
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
                Exception exception = ExceptionFactory("PostSessionsPlaying", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports playback has started within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSessionsPlayingAsync (PlaybackStartInfo body)
        {
             await PostSessionsPlayingAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Reports playback has started within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStartInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingAsyncWithHttpInfo (PlaybackStartInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostSessionsPlaying");

            var localVarPath = "/Sessions/Playing";
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
                Exception exception = ExceptionFactory("PostSessionsPlaying", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Pings a playback session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        public void PostSessionsPlayingPing (string playSessionId)
        {
             PostSessionsPlayingPingWithHttpInfo(playSessionId);
        }

        /// <summary>
        /// Pings a playback session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSessionsPlayingPingWithHttpInfo (string playSessionId)
        {

            var localVarPath = "/Sessions/Playing/Ping";
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

            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("PostSessionsPlayingPing", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Pings a playback session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSessionsPlayingPingAsync (string playSessionId)
        {
             await PostSessionsPlayingPingAsyncWithHttpInfo(playSessionId);

        }

        /// <summary>
        /// Pings a playback session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingPingAsyncWithHttpInfo (string playSessionId)
        {

            var localVarPath = "/Sessions/Playing/Ping";
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

            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("PostSessionsPlayingPing", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports playback progress within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns></returns>
        public void PostSessionsPlayingProgress (PlaybackProgressInfo body)
        {
             PostSessionsPlayingProgressWithHttpInfo(body);
        }

        /// <summary>
        /// Reports playback progress within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSessionsPlayingProgressWithHttpInfo (PlaybackProgressInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostSessionsPlayingProgress");

            var localVarPath = "/Sessions/Playing/Progress";
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
                Exception exception = ExceptionFactory("PostSessionsPlayingProgress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports playback progress within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSessionsPlayingProgressAsync (PlaybackProgressInfo body)
        {
             await PostSessionsPlayingProgressAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Reports playback progress within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackProgressInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingProgressAsyncWithHttpInfo (PlaybackProgressInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostSessionsPlayingProgress");

            var localVarPath = "/Sessions/Playing/Progress";
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
                Exception exception = ExceptionFactory("PostSessionsPlayingProgress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports playback has stopped within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns></returns>
        public void PostSessionsPlayingStopped (PlaybackStopInfo body)
        {
             PostSessionsPlayingStoppedWithHttpInfo(body);
        }

        /// <summary>
        /// Reports playback has stopped within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostSessionsPlayingStoppedWithHttpInfo (PlaybackStopInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostSessionsPlayingStopped");

            var localVarPath = "/Sessions/Playing/Stopped";
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
                Exception exception = ExceptionFactory("PostSessionsPlayingStopped", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports playback has stopped within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostSessionsPlayingStoppedAsync (PlaybackStopInfo body)
        {
             await PostSessionsPlayingStoppedAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Reports playback has stopped within a session Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PlaybackStopInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostSessionsPlayingStoppedAsyncWithHttpInfo (PlaybackStopInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostSessionsPlayingStopped");

            var localVarPath = "/Sessions/Playing/Stopped";
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
                Exception exception = ExceptionFactory("PostSessionsPlayingStopped", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates userdata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns></returns>
        public void PostUsersByUseridItemsByItemidUserdata (UserItemDataDto body, string userId, string itemId)
        {
             PostUsersByUseridItemsByItemidUserdataWithHttpInfo(body, userId, itemId);
        }

        /// <summary>
        /// Updates userdata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByUseridItemsByItemidUserdataWithHttpInfo (UserItemDataDto body, string userId, string itemId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostUsersByUseridItemsByItemidUserdata");
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridItemsByItemidUserdata");
            // verify the required parameter 'itemId' is set
            if (itemId == null)
                throw new ApiException(400, "Missing required parameter 'itemId' when calling PlaystateServiceApi->PostUsersByUseridItemsByItemidUserdata");

            var localVarPath = "/Users/{UserId}/Items/{ItemId}/UserData";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByItemidUserdata", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates userdata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByUseridItemsByItemidUserdataAsync (UserItemDataDto body, string userId, string itemId)
        {
             await PostUsersByUseridItemsByItemidUserdataAsyncWithHttpInfo(body, userId, itemId);

        }

        /// <summary>
        /// Updates userdata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserItemDataDto: </param>
        /// <param name="userId">User Id</param>
        /// <param name="itemId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridItemsByItemidUserdataAsyncWithHttpInfo (UserItemDataDto body, string userId, string itemId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostUsersByUseridItemsByItemidUserdata");
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridItemsByItemidUserdata");
            // verify the required parameter 'itemId' is set
            if (itemId == null)
                throw new ApiException(400, "Missing required parameter 'itemId' when calling PlaystateServiceApi->PostUsersByUseridItemsByItemidUserdata");

            var localVarPath = "/Users/{UserId}/Items/{ItemId}/UserData";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridItemsByItemidUserdata", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Marks an item as played Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto PostUsersByUseridPlayeditemsById (string userId, string datePlayed, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = PostUsersByUseridPlayeditemsByIdWithHttpInfo(userId, datePlayed, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Marks an item as played Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > PostUsersByUseridPlayeditemsByIdWithHttpInfo (string userId, string datePlayed, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsById");

            var localVarPath = "/Users/{UserId}/PlayedItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (datePlayed != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DatePlayed", datePlayed)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayeditemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Marks an item as played Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridPlayeditemsByIdAsync (string userId, string datePlayed, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await PostUsersByUseridPlayeditemsByIdAsyncWithHttpInfo(userId, datePlayed, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Marks an item as played Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="datePlayed">The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridPlayeditemsByIdAsyncWithHttpInfo (string userId, string datePlayed, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsById");

            var localVarPath = "/Users/{UserId}/PlayedItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (datePlayed != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DatePlayed", datePlayed)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayeditemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>UserItemDataDto</returns>
        public UserItemDataDto PostUsersByUseridPlayeditemsByIdDelete (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = PostUsersByUseridPlayeditemsByIdDeleteWithHttpInfo(userId, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of UserItemDataDto</returns>
        public ApiResponse< UserItemDataDto > PostUsersByUseridPlayeditemsByIdDeleteWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsByIdDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsByIdDelete");

            var localVarPath = "/Users/{UserId}/PlayedItems/{Id}/Delete";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayeditemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of UserItemDataDto</returns>
        public async System.Threading.Tasks.Task<UserItemDataDto> PostUsersByUseridPlayeditemsByIdDeleteAsync (string userId, string id)
        {
             ApiResponse<UserItemDataDto> localVarResponse = await PostUsersByUseridPlayeditemsByIdDeleteAsyncWithHttpInfo(userId, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Marks an item as unplayed Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (UserItemDataDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserItemDataDto>> PostUsersByUseridPlayeditemsByIdDeleteAsyncWithHttpInfo (string userId, string id)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsByIdDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayeditemsByIdDelete");

            var localVarPath = "/Users/{UserId}/PlayedItems/{Id}/Delete";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayeditemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserItemDataDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserItemDataDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserItemDataDto)));
        }

        /// <summary>
        /// Reports that a user has begun playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        public void PostUsersByUseridPlayingitemsById (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId)
        {
             PostUsersByUseridPlayingitemsByIdWithHttpInfo(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId);
        }

        /// <summary>
        /// Reports that a user has begun playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByUseridPlayingitemsByIdWithHttpInfo (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsById");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsById");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (canSeek != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CanSeek", canSeek)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (playMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlayMethod", playMethod)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayingitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that a user has begun playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByUseridPlayingitemsByIdAsync (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId)
        {
             await PostUsersByUseridPlayingitemsByIdAsyncWithHttpInfo(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId);

        }

        /// <summary>
        /// Reports that a user has begun playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="canSeek">Indicates if the client can seek (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridPlayingitemsByIdAsyncWithHttpInfo (string userId, string id, string mediaSourceId, bool? canSeek, int? audioStreamIndex, int? subtitleStreamIndex, PlayMethod playMethod, string liveStreamId, string playSessionId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsById");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsById");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (canSeek != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CanSeek", canSeek)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (playMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlayMethod", playMethod)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayingitemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns></returns>
        public void PostUsersByUseridPlayingitemsByIdDelete (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
             PostUsersByUseridPlayingitemsByIdDeleteWithHttpInfo(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);
        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByUseridPlayingitemsByIdDeleteWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");
            // verify the required parameter 'nextMediaType' is set
            if (nextMediaType == null)
                throw new ApiException(400, "Missing required parameter 'nextMediaType' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}/Delete";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (nextMediaType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NextMediaType", nextMediaType)); // query parameter
            if (positionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PositionTicks", positionTicks)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayingitemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByUseridPlayingitemsByIdDeleteAsync (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
             await PostUsersByUseridPlayingitemsByIdDeleteAsyncWithHttpInfo(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);

        }

        /// <summary>
        /// Reports that a user has stopped playing an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="nextMediaType">The next media type that will play</param>
        /// <param name="positionTicks">Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridPlayingitemsByIdDeleteAsyncWithHttpInfo (string userId, string id, string mediaSourceId, string nextMediaType, long? positionTicks, string liveStreamId, string playSessionId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");
            // verify the required parameter 'nextMediaType' is set
            if (nextMediaType == null)
                throw new ApiException(400, "Missing required parameter 'nextMediaType' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdDelete");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}/Delete";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (nextMediaType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NextMediaType", nextMediaType)); // query parameter
            if (positionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PositionTicks", positionTicks)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayingitemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports a user&#x27;s playback progress Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns></returns>
        public void PostUsersByUseridPlayingitemsByIdProgress (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate)
        {
             PostUsersByUseridPlayingitemsByIdProgressWithHttpInfo(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate);
        }

        /// <summary>
        /// Reports a user&#x27;s playback progress Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByUseridPlayingitemsByIdProgressWithHttpInfo (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}/Progress";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (positionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PositionTicks", positionTicks)); // query parameter
            if (isPaused != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPaused", isPaused)); // query parameter
            if (isMuted != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsMuted", isMuted)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (volumeLevel != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VolumeLevel", volumeLevel)); // query parameter
            if (playMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlayMethod", playMethod)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
            if (repeatMode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "RepeatMode", repeatMode)); // query parameter
            if (subtitleOffset != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleOffset", subtitleOffset)); // query parameter
            if (playbackRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaybackRate", playbackRate)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayingitemsByIdProgress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports a user&#x27;s playback progress Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByUseridPlayingitemsByIdProgressAsync (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate)
        {
             await PostUsersByUseridPlayingitemsByIdProgressAsyncWithHttpInfo(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate);

        }

        /// <summary>
        /// Reports a user&#x27;s playback progress Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">OnPlaybackProgress</param>
        /// <param name="mediaSourceId">The id of the MediaSource</param>
        /// <param name="userId">User Id</param>
        /// <param name="id">Item Id</param>
        /// <param name="positionTicks">Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="isPaused">Indicates if the player is paused. (optional)</param>
        /// <param name="isMuted">Indicates if the player is muted. (optional)</param>
        /// <param name="audioStreamIndex"> (optional)</param>
        /// <param name="subtitleStreamIndex"> (optional)</param>
        /// <param name="volumeLevel">Scale of 0-100 (optional)</param>
        /// <param name="playMethod"> (optional)</param>
        /// <param name="liveStreamId"> (optional)</param>
        /// <param name="playSessionId"> (optional)</param>
        /// <param name="repeatMode"> (optional)</param>
        /// <param name="subtitleOffset"> (optional)</param>
        /// <param name="playbackRate"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByUseridPlayingitemsByIdProgressAsyncWithHttpInfo (ApiOnPlaybackProgress body, string mediaSourceId, string userId, string id, long? positionTicks, bool? isPaused, bool? isMuted, int? audioStreamIndex, int? subtitleStreamIndex, int? volumeLevel, PlayMethod playMethod, string liveStreamId, string playSessionId, RepeatMode repeatMode, int? subtitleOffset, double? playbackRate)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PlaystateServiceApi->PostUsersByUseridPlayingitemsByIdProgress");

            var localVarPath = "/Users/{UserId}/PlayingItems/{Id}/Progress";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (positionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PositionTicks", positionTicks)); // query parameter
            if (isPaused != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPaused", isPaused)); // query parameter
            if (isMuted != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsMuted", isMuted)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (volumeLevel != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VolumeLevel", volumeLevel)); // query parameter
            if (playMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlayMethod", playMethod)); // query parameter
            if (liveStreamId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "LiveStreamId", liveStreamId)); // query parameter
            if (playSessionId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaySessionId", playSessionId)); // query parameter
            if (repeatMode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "RepeatMode", repeatMode)); // query parameter
            if (subtitleOffset != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleOffset", subtitleOffset)); // query parameter
            if (playbackRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PlaybackRate", playbackRate)); // query parameter
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
                Exception exception = ExceptionFactory("PostUsersByUseridPlayingitemsByIdProgress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
