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
        public interface ISubtitleServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        void DeleteItemsByIdSubtitlesByIndex (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteItemsByIdSubtitlesByIndexWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        void DeleteVideosByIdSubtitlesByIndex (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteVideosByIdSubtitlesByIndexWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>List&lt;RemoteSubtitleInfo&gt;</returns>
        List<RemoteSubtitleInfo> GetItemsByIdRemotesearchSubtitlesByLanguage (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>ApiResponse of List&lt;RemoteSubtitleInfo&gt;</returns>
        ApiResponse<List<RemoteSubtitleInfo>> GetItemsByIdRemotesearchSubtitlesByLanguageWithHttpInfo (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        void GetProvidersSubtitlesSubtitlesById (string id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetProvidersSubtitlesSubtitlesByIdWithHttpInfo (string id);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        void GetVideosByIdByMediasourceidAttachmentsByIndexStream (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdByMediasourceidAttachmentsByIndexStreamWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        void HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>SubtitlesSubtitleDownloadResult</returns>
        SubtitlesSubtitleDownloadResult PostItemsByIdRemotesearchSubtitlesBySubtitleid (string id, string mediaSourceId, string subtitleId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>ApiResponse of SubtitlesSubtitleDownloadResult</returns>
        ApiResponse<SubtitlesSubtitleDownloadResult> PostItemsByIdRemotesearchSubtitlesBySubtitleidWithHttpInfo (string id, string mediaSourceId, string subtitleId);
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        void PostItemsByIdSubtitlesByIndexDelete (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsByIdSubtitlesByIndexDeleteWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        void PostVideosByIdSubtitlesByIndexDelete (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostVideosByIdSubtitlesByIndexDeleteWithHttpInfo (string id, string mediaSourceId, int? index);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteItemsByIdSubtitlesByIndexAsync (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteItemsByIdSubtitlesByIndexAsyncWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteVideosByIdSubtitlesByIndexAsync (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteVideosByIdSubtitlesByIndexAsyncWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>Task of List&lt;RemoteSubtitleInfo&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSubtitleInfo>> GetItemsByIdRemotesearchSubtitlesByLanguageAsync (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSubtitleInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSubtitleInfo>>> GetItemsByIdRemotesearchSubtitlesByLanguageAsyncWithHttpInfo (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetProvidersSubtitlesSubtitlesByIdAsync (string id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetProvidersSubtitlesSubtitlesByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdByMediasourceidAttachmentsByIndexStreamAsync (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdByMediasourceidAttachmentsByIndexStreamAsyncWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>Task of SubtitlesSubtitleDownloadResult</returns>
        System.Threading.Tasks.Task<SubtitlesSubtitleDownloadResult> PostItemsByIdRemotesearchSubtitlesBySubtitleidAsync (string id, string mediaSourceId, string subtitleId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>Task of ApiResponse (SubtitlesSubtitleDownloadResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<SubtitlesSubtitleDownloadResult>> PostItemsByIdRemotesearchSubtitlesBySubtitleidAsyncWithHttpInfo (string id, string mediaSourceId, string subtitleId);
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsByIdSubtitlesByIndexDeleteAsync (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdSubtitlesByIndexDeleteAsyncWithHttpInfo (string id, string mediaSourceId, int? index);
        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostVideosByIdSubtitlesByIndexDeleteAsync (string id, string mediaSourceId, int? index);

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostVideosByIdSubtitlesByIndexDeleteAsyncWithHttpInfo (string id, string mediaSourceId, int? index);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class SubtitleServiceApi : ISubtitleServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="SubtitleServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SubtitleServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SubtitleServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public SubtitleServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SubtitleServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SubtitleServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        public void DeleteItemsByIdSubtitlesByIndex (string id, string mediaSourceId, int? index)
        {
             DeleteItemsByIdSubtitlesByIndexWithHttpInfo(id, mediaSourceId, index);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteItemsByIdSubtitlesByIndexWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");

            var localVarPath = "/Items/{Id}/Subtitles/{Index}";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteItemsByIdSubtitlesByIndex", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteItemsByIdSubtitlesByIndexAsync (string id, string mediaSourceId, int? index)
        {
             await DeleteItemsByIdSubtitlesByIndexAsyncWithHttpInfo(id, mediaSourceId, index);

        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteItemsByIdSubtitlesByIndexAsyncWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");

            var localVarPath = "/Items/{Id}/Subtitles/{Index}";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteItemsByIdSubtitlesByIndex", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        public void DeleteVideosByIdSubtitlesByIndex (string id, string mediaSourceId, int? index)
        {
             DeleteVideosByIdSubtitlesByIndexWithHttpInfo(id, mediaSourceId, index);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteVideosByIdSubtitlesByIndexWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");

            var localVarPath = "/Videos/{Id}/Subtitles/{Index}";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteVideosByIdSubtitlesByIndex", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteVideosByIdSubtitlesByIndexAsync (string id, string mediaSourceId, int? index)
        {
             await DeleteVideosByIdSubtitlesByIndexAsyncWithHttpInfo(id, mediaSourceId, index);

        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteVideosByIdSubtitlesByIndexAsyncWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");

            var localVarPath = "/Videos/{Id}/Subtitles/{Index}";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteVideosByIdSubtitlesByIndex", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>List&lt;RemoteSubtitleInfo&gt;</returns>
        public List<RemoteSubtitleInfo> GetItemsByIdRemotesearchSubtitlesByLanguage (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired)
        {
             ApiResponse<List<RemoteSubtitleInfo>> localVarResponse = GetItemsByIdRemotesearchSubtitlesByLanguageWithHttpInfo(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>ApiResponse of List&lt;RemoteSubtitleInfo&gt;</returns>
        public ApiResponse< List<RemoteSubtitleInfo> > GetItemsByIdRemotesearchSubtitlesByLanguageWithHttpInfo (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");
            // verify the required parameter 'language' is set
            if (language == null)
                throw new ApiException(400, "Missing required parameter 'language' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");

            var localVarPath = "/Items/{Id}/RemoteSearch/Subtitles/{Language}";
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
            if (language != null) localVarPathParams.Add("Language", this.Configuration.ApiClient.ParameterToString(language)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (isPerfectMatch != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPerfectMatch", isPerfectMatch)); // query parameter
            if (isForced != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsForced", isForced)); // query parameter
            if (isHearingImpaired != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHearingImpaired", isHearingImpaired)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdRemotesearchSubtitlesByLanguage", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSubtitleInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSubtitleInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSubtitleInfo>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>Task of List&lt;RemoteSubtitleInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSubtitleInfo>> GetItemsByIdRemotesearchSubtitlesByLanguageAsync (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired)
        {
             ApiResponse<List<RemoteSubtitleInfo>> localVarResponse = await GetItemsByIdRemotesearchSubtitlesByLanguageAsyncWithHttpInfo(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSubtitleInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSubtitleInfo>>> GetItemsByIdRemotesearchSubtitlesByLanguageAsyncWithHttpInfo (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");
            // verify the required parameter 'language' is set
            if (language == null)
                throw new ApiException(400, "Missing required parameter 'language' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");

            var localVarPath = "/Items/{Id}/RemoteSearch/Subtitles/{Language}";
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
            if (language != null) localVarPathParams.Add("Language", this.Configuration.ApiClient.ParameterToString(language)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
            if (isPerfectMatch != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPerfectMatch", isPerfectMatch)); // query parameter
            if (isForced != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsForced", isForced)); // query parameter
            if (isHearingImpaired != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHearingImpaired", isHearingImpaired)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdRemotesearchSubtitlesByLanguage", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSubtitleInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSubtitleInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSubtitleInfo>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        public void GetProvidersSubtitlesSubtitlesById (string id)
        {
             GetProvidersSubtitlesSubtitlesByIdWithHttpInfo(id);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetProvidersSubtitlesSubtitlesByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetProvidersSubtitlesSubtitlesById");

            var localVarPath = "/Providers/Subtitles/Subtitles/{Id}";
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
                Exception exception = ExceptionFactory("GetProvidersSubtitlesSubtitlesById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetProvidersSubtitlesSubtitlesByIdAsync (string id)
        {
             await GetProvidersSubtitlesSubtitlesByIdAsyncWithHttpInfo(id);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetProvidersSubtitlesSubtitlesByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetProvidersSubtitlesSubtitlesById");

            var localVarPath = "/Providers/Subtitles/Subtitles/{Id}";
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
                Exception exception = ExceptionFactory("GetProvidersSubtitlesSubtitlesById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        public void GetVideosByIdByMediasourceidAttachmentsByIndexStream (string id, string mediaSourceId, int? index)
        {
             GetVideosByIdByMediasourceidAttachmentsByIndexStreamWithHttpInfo(id, mediaSourceId, index);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdByMediasourceidAttachmentsByIndexStreamWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidAttachmentsByIndexStream");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidAttachmentsByIndexStream");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidAttachmentsByIndexStream");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Attachments/{Index}/Stream";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdByMediasourceidAttachmentsByIndexStream", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdByMediasourceidAttachmentsByIndexStreamAsync (string id, string mediaSourceId, int? index)
        {
             await GetVideosByIdByMediasourceidAttachmentsByIndexStreamAsyncWithHttpInfo(id, mediaSourceId, index);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdByMediasourceidAttachmentsByIndexStreamAsyncWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidAttachmentsByIndexStream");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidAttachmentsByIndexStream");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidAttachmentsByIndexStream");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Attachments/{Index}/Stream";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdByMediasourceidAttachmentsByIndexStream", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
                throw new ApiException(400, "Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarPathParams.Add("StartPositionTicks", this.Configuration.ApiClient.ParameterToString(startPositionTicks)); // path parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns></returns>
        public void HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
             await HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        }

        /// <summary>
        /// Gets subtitles in a specified format. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsyncWithHttpInfo (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            // verify the required parameter 'format' is set
            if (format == null)
                throw new ApiException(400, "Missing required parameter 'format' when calling SubtitleServiceApi->HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");

            var localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}";
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
            if (mediaSourceId != null) localVarPathParams.Add("MediaSourceId", this.Configuration.ApiClient.ParameterToString(mediaSourceId)); // path parameter
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (format != null) localVarPathParams.Add("Format", this.Configuration.ApiClient.ParameterToString(format)); // path parameter
            if (startPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartPositionTicks", startPositionTicks)); // query parameter
            if (endPositionTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EndPositionTicks", endPositionTicks)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
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
                Exception exception = ExceptionFactory("HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>SubtitlesSubtitleDownloadResult</returns>
        public SubtitlesSubtitleDownloadResult PostItemsByIdRemotesearchSubtitlesBySubtitleid (string id, string mediaSourceId, string subtitleId)
        {
             ApiResponse<SubtitlesSubtitleDownloadResult> localVarResponse = PostItemsByIdRemotesearchSubtitlesBySubtitleidWithHttpInfo(id, mediaSourceId, subtitleId);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>ApiResponse of SubtitlesSubtitleDownloadResult</returns>
        public ApiResponse< SubtitlesSubtitleDownloadResult > PostItemsByIdRemotesearchSubtitlesBySubtitleidWithHttpInfo (string id, string mediaSourceId, string subtitleId)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");
            // verify the required parameter 'subtitleId' is set
            if (subtitleId == null)
                throw new ApiException(400, "Missing required parameter 'subtitleId' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");

            var localVarPath = "/Items/{Id}/RemoteSearch/Subtitles/{SubtitleId}";
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
            if (subtitleId != null) localVarPathParams.Add("SubtitleId", this.Configuration.ApiClient.ParameterToString(subtitleId)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdRemotesearchSubtitlesBySubtitleid", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SubtitlesSubtitleDownloadResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SubtitlesSubtitleDownloadResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SubtitlesSubtitleDownloadResult)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>Task of SubtitlesSubtitleDownloadResult</returns>
        public async System.Threading.Tasks.Task<SubtitlesSubtitleDownloadResult> PostItemsByIdRemotesearchSubtitlesBySubtitleidAsync (string id, string mediaSourceId, string subtitleId)
        {
             ApiResponse<SubtitlesSubtitleDownloadResult> localVarResponse = await PostItemsByIdRemotesearchSubtitlesBySubtitleidAsyncWithHttpInfo(id, mediaSourceId, subtitleId);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>Task of ApiResponse (SubtitlesSubtitleDownloadResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SubtitlesSubtitleDownloadResult>> PostItemsByIdRemotesearchSubtitlesBySubtitleidAsyncWithHttpInfo (string id, string mediaSourceId, string subtitleId)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");
            // verify the required parameter 'subtitleId' is set
            if (subtitleId == null)
                throw new ApiException(400, "Missing required parameter 'subtitleId' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");

            var localVarPath = "/Items/{Id}/RemoteSearch/Subtitles/{SubtitleId}";
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
            if (subtitleId != null) localVarPathParams.Add("SubtitleId", this.Configuration.ApiClient.ParameterToString(subtitleId)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdRemotesearchSubtitlesBySubtitleid", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SubtitlesSubtitleDownloadResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (SubtitlesSubtitleDownloadResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(SubtitlesSubtitleDownloadResult)));
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        public void PostItemsByIdSubtitlesByIndexDelete (string id, string mediaSourceId, int? index)
        {
             PostItemsByIdSubtitlesByIndexDeleteWithHttpInfo(id, mediaSourceId, index);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsByIdSubtitlesByIndexDeleteWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");

            var localVarPath = "/Items/{Id}/Subtitles/{Index}/Delete";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdSubtitlesByIndexDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsByIdSubtitlesByIndexDeleteAsync (string id, string mediaSourceId, int? index)
        {
             await PostItemsByIdSubtitlesByIndexDeleteAsyncWithHttpInfo(id, mediaSourceId, index);

        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdSubtitlesByIndexDeleteAsyncWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");

            var localVarPath = "/Items/{Id}/Subtitles/{Index}/Delete";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdSubtitlesByIndexDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns></returns>
        public void PostVideosByIdSubtitlesByIndexDelete (string id, string mediaSourceId, int? index)
        {
             PostVideosByIdSubtitlesByIndexDeleteWithHttpInfo(id, mediaSourceId, index);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostVideosByIdSubtitlesByIndexDeleteWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");

            var localVarPath = "/Videos/{Id}/Subtitles/{Index}/Delete";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("PostVideosByIdSubtitlesByIndexDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostVideosByIdSubtitlesByIndexDeleteAsync (string id, string mediaSourceId, int? index)
        {
             await PostVideosByIdSubtitlesByIndexDeleteAsyncWithHttpInfo(id, mediaSourceId, index);

        }

        /// <summary>
        /// Deletes an external subtitle file Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostVideosByIdSubtitlesByIndexDeleteAsyncWithHttpInfo (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
                throw new ApiException(400, "Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");
            // verify the required parameter 'index' is set
            if (index == null)
                throw new ApiException(400, "Missing required parameter 'index' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");

            var localVarPath = "/Videos/{Id}/Subtitles/{Index}/Delete";
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
            if (index != null) localVarPathParams.Add("Index", this.Configuration.ApiClient.ParameterToString(index)); // path parameter
            if (mediaSourceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MediaSourceId", mediaSourceId)); // query parameter
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
                Exception exception = ExceptionFactory("PostVideosByIdSubtitlesByIndexDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
