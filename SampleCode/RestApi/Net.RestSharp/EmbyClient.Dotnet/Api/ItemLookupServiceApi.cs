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
        public interface IItemLookupServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets external id infos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>List&lt;ExternalIdInfo&gt;</returns>
        List<ExternalIdInfo> GetItemsByIdExternalidinfos (string id);

        /// <summary>
        /// Gets external id infos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of List&lt;ExternalIdInfo&gt;</returns>
        ApiResponse<List<ExternalIdInfo>> GetItemsByIdExternalidinfosWithHttpInfo (string id);
        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns></returns>
        void GetItemsRemotesearchImage (string imageUrl, string providerName);

        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetItemsRemotesearchImageWithHttpInfo (string imageUrl, string providerName);
        /// <summary>
        /// Resets metadata for one or more items
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns></returns>
        void PostItemsMetadataReset (string itemIds);

        /// <summary>
        /// Resets metadata for one or more items
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsMetadataResetWithHttpInfo (string itemIds);
        /// <summary>
        /// Applies search criteria to an item and refreshes metadata
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns></returns>
        void PostItemsRemotesearchApplyById (RemoteSearchResult body, string id, bool? replaceAllImages);

        /// <summary>
        /// Applies search criteria to an item and refreshes metadata
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsRemotesearchApplyByIdWithHttpInfo (RemoteSearchResult body, string id, bool? replaceAllImages);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchBook (RemoteSearchQueryBookInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchBookWithHttpInfo (RemoteSearchQueryBookInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchBoxset (RemoteSearchQueryItemLookupInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchBoxsetWithHttpInfo (RemoteSearchQueryItemLookupInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchGame (RemoteSearchQueryGameInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchGameWithHttpInfo (RemoteSearchQueryGameInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchMovie (RemoteSearchQueryMovieInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchMovieWithHttpInfo (RemoteSearchQueryMovieInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchMusicalbum (RemoteSearchQueryAlbumInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchMusicalbumWithHttpInfo (RemoteSearchQueryAlbumInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchMusicartist (RemoteSearchQueryArtistInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchMusicartistWithHttpInfo (RemoteSearchQueryArtistInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchMusicvideo (RemoteSearchQueryMusicVideoInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchMusicvideoWithHttpInfo (RemoteSearchQueryMusicVideoInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchPerson (RemoteSearchQueryPersonLookupInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchPersonWithHttpInfo (RemoteSearchQueryPersonLookupInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchSeries (RemoteSearchQuerySeriesInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchSeriesWithHttpInfo (RemoteSearchQuerySeriesInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        List<RemoteSearchResult> PostItemsRemotesearchTrailer (RemoteSearchQueryTrailerInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        ApiResponse<List<RemoteSearchResult>> PostItemsRemotesearchTrailerWithHttpInfo (RemoteSearchQueryTrailerInfo body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets external id infos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of List&lt;ExternalIdInfo&gt;</returns>
        System.Threading.Tasks.Task<List<ExternalIdInfo>> GetItemsByIdExternalidinfosAsync (string id);

        /// <summary>
        /// Gets external id infos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (List&lt;ExternalIdInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ExternalIdInfo>>> GetItemsByIdExternalidinfosAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetItemsRemotesearchImageAsync (string imageUrl, string providerName);

        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsRemotesearchImageAsyncWithHttpInfo (string imageUrl, string providerName);
        /// <summary>
        /// Resets metadata for one or more items
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsMetadataResetAsync (string itemIds);

        /// <summary>
        /// Resets metadata for one or more items
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsMetadataResetAsyncWithHttpInfo (string itemIds);
        /// <summary>
        /// Applies search criteria to an item and refreshes metadata
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsRemotesearchApplyByIdAsync (RemoteSearchResult body, string id, bool? replaceAllImages);

        /// <summary>
        /// Applies search criteria to an item and refreshes metadata
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsRemotesearchApplyByIdAsyncWithHttpInfo (RemoteSearchResult body, string id, bool? replaceAllImages);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchBookAsync (RemoteSearchQueryBookInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchBookAsyncWithHttpInfo (RemoteSearchQueryBookInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchBoxsetAsync (RemoteSearchQueryItemLookupInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchBoxsetAsyncWithHttpInfo (RemoteSearchQueryItemLookupInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchGameAsync (RemoteSearchQueryGameInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchGameAsyncWithHttpInfo (RemoteSearchQueryGameInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMovieAsync (RemoteSearchQueryMovieInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMovieAsyncWithHttpInfo (RemoteSearchQueryMovieInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMusicalbumAsync (RemoteSearchQueryAlbumInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMusicalbumAsyncWithHttpInfo (RemoteSearchQueryAlbumInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMusicartistAsync (RemoteSearchQueryArtistInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMusicartistAsyncWithHttpInfo (RemoteSearchQueryArtistInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMusicvideoAsync (RemoteSearchQueryMusicVideoInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMusicvideoAsyncWithHttpInfo (RemoteSearchQueryMusicVideoInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchPersonAsync (RemoteSearchQueryPersonLookupInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchPersonAsyncWithHttpInfo (RemoteSearchQueryPersonLookupInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchSeriesAsync (RemoteSearchQuerySeriesInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchSeriesAsyncWithHttpInfo (RemoteSearchQuerySeriesInfo body);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchTrailerAsync (RemoteSearchQueryTrailerInfo body);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchTrailerAsyncWithHttpInfo (RemoteSearchQueryTrailerInfo body);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class ItemLookupServiceApi : IItemLookupServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ItemLookupServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ItemLookupServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ItemLookupServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public ItemLookupServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ItemLookupServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ItemLookupServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets external id infos for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>List&lt;ExternalIdInfo&gt;</returns>
        public List<ExternalIdInfo> GetItemsByIdExternalidinfos (string id)
        {
             ApiResponse<List<ExternalIdInfo>> localVarResponse = GetItemsByIdExternalidinfosWithHttpInfo(id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets external id infos for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of List&lt;ExternalIdInfo&gt;</returns>
        public ApiResponse< List<ExternalIdInfo> > GetItemsByIdExternalidinfosWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling ItemLookupServiceApi->GetItemsByIdExternalidinfos");

            var localVarPath = "/Items/{Id}/ExternalIdInfos";
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
                Exception exception = ExceptionFactory("GetItemsByIdExternalidinfos", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ExternalIdInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ExternalIdInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ExternalIdInfo>)));
        }

        /// <summary>
        /// Gets external id infos for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of List&lt;ExternalIdInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<ExternalIdInfo>> GetItemsByIdExternalidinfosAsync (string id)
        {
             ApiResponse<List<ExternalIdInfo>> localVarResponse = await GetItemsByIdExternalidinfosAsyncWithHttpInfo(id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets external id infos for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (List&lt;ExternalIdInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<ExternalIdInfo>>> GetItemsByIdExternalidinfosAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling ItemLookupServiceApi->GetItemsByIdExternalidinfos");

            var localVarPath = "/Items/{Id}/ExternalIdInfos";
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
                Exception exception = ExceptionFactory("GetItemsByIdExternalidinfos", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ExternalIdInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ExternalIdInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ExternalIdInfo>)));
        }

        /// <summary>
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns></returns>
        public void GetItemsRemotesearchImage (string imageUrl, string providerName)
        {
             GetItemsRemotesearchImageWithHttpInfo(imageUrl, providerName);
        }

        /// <summary>
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetItemsRemotesearchImageWithHttpInfo (string imageUrl, string providerName)
        {
            // verify the required parameter 'imageUrl' is set
            if (imageUrl == null)
                throw new ApiException(400, "Missing required parameter 'imageUrl' when calling ItemLookupServiceApi->GetItemsRemotesearchImage");
            // verify the required parameter 'providerName' is set
            if (providerName == null)
                throw new ApiException(400, "Missing required parameter 'providerName' when calling ItemLookupServiceApi->GetItemsRemotesearchImage");

            var localVarPath = "/Items/RemoteSearch/Image";
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

            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
            if (providerName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProviderName", providerName)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsRemotesearchImage", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetItemsRemotesearchImageAsync (string imageUrl, string providerName)
        {
             await GetItemsRemotesearchImageAsyncWithHttpInfo(imageUrl, providerName);

        }

        /// <summary>
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <param name="providerName"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsRemotesearchImageAsyncWithHttpInfo (string imageUrl, string providerName)
        {
            // verify the required parameter 'imageUrl' is set
            if (imageUrl == null)
                throw new ApiException(400, "Missing required parameter 'imageUrl' when calling ItemLookupServiceApi->GetItemsRemotesearchImage");
            // verify the required parameter 'providerName' is set
            if (providerName == null)
                throw new ApiException(400, "Missing required parameter 'providerName' when calling ItemLookupServiceApi->GetItemsRemotesearchImage");

            var localVarPath = "/Items/RemoteSearch/Image";
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

            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
            if (providerName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProviderName", providerName)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsRemotesearchImage", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Resets metadata for one or more items Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns></returns>
        public void PostItemsMetadataReset (string itemIds)
        {
             PostItemsMetadataResetWithHttpInfo(itemIds);
        }

        /// <summary>
        /// Resets metadata for one or more items Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsMetadataResetWithHttpInfo (string itemIds)
        {
            // verify the required parameter 'itemIds' is set
            if (itemIds == null)
                throw new ApiException(400, "Missing required parameter 'itemIds' when calling ItemLookupServiceApi->PostItemsMetadataReset");

            var localVarPath = "/Items/Metadata/Reset";
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
                Exception exception = ExceptionFactory("PostItemsMetadataReset", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Resets metadata for one or more items Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsMetadataResetAsync (string itemIds)
        {
             await PostItemsMetadataResetAsyncWithHttpInfo(itemIds);

        }

        /// <summary>
        /// Resets metadata for one or more items Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="itemIds">The item ids</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsMetadataResetAsyncWithHttpInfo (string itemIds)
        {
            // verify the required parameter 'itemIds' is set
            if (itemIds == null)
                throw new ApiException(400, "Missing required parameter 'itemIds' when calling ItemLookupServiceApi->PostItemsMetadataReset");

            var localVarPath = "/Items/Metadata/Reset";
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
                Exception exception = ExceptionFactory("PostItemsMetadataReset", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Applies search criteria to an item and refreshes metadata Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns></returns>
        public void PostItemsRemotesearchApplyById (RemoteSearchResult body, string id, bool? replaceAllImages)
        {
             PostItemsRemotesearchApplyByIdWithHttpInfo(body, id, replaceAllImages);
        }

        /// <summary>
        /// Applies search criteria to an item and refreshes metadata Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsRemotesearchApplyByIdWithHttpInfo (RemoteSearchResult body, string id, bool? replaceAllImages)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchApplyById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling ItemLookupServiceApi->PostItemsRemotesearchApplyById");

            var localVarPath = "/Items/RemoteSearch/Apply/{Id}";
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
            if (replaceAllImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ReplaceAllImages", replaceAllImages)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchApplyById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Applies search criteria to an item and refreshes metadata Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsRemotesearchApplyByIdAsync (RemoteSearchResult body, string id, bool? replaceAllImages)
        {
             await PostItemsRemotesearchApplyByIdAsyncWithHttpInfo(body, id, replaceAllImages);

        }

        /// <summary>
        /// Applies search criteria to an item and refreshes metadata Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchResult: </param>
        /// <param name="id">The item id</param>
        /// <param name="replaceAllImages">Whether or not to replace all images (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsRemotesearchApplyByIdAsyncWithHttpInfo (RemoteSearchResult body, string id, bool? replaceAllImages)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchApplyById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling ItemLookupServiceApi->PostItemsRemotesearchApplyById");

            var localVarPath = "/Items/RemoteSearch/Apply/{Id}";
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
            if (replaceAllImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ReplaceAllImages", replaceAllImages)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchApplyById", localVarResponse);
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
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchBook (RemoteSearchQueryBookInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchBookWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchBookWithHttpInfo (RemoteSearchQueryBookInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchBook");

            var localVarPath = "/Items/RemoteSearch/Book";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchBook", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchBookAsync (RemoteSearchQueryBookInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchBookAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchBookAsyncWithHttpInfo (RemoteSearchQueryBookInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchBook");

            var localVarPath = "/Items/RemoteSearch/Book";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchBook", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchBoxset (RemoteSearchQueryItemLookupInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchBoxsetWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchBoxsetWithHttpInfo (RemoteSearchQueryItemLookupInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchBoxset");

            var localVarPath = "/Items/RemoteSearch/BoxSet";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchBoxset", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchBoxsetAsync (RemoteSearchQueryItemLookupInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchBoxsetAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchBoxsetAsyncWithHttpInfo (RemoteSearchQueryItemLookupInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchBoxset");

            var localVarPath = "/Items/RemoteSearch/BoxSet";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchBoxset", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchGame (RemoteSearchQueryGameInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchGameWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchGameWithHttpInfo (RemoteSearchQueryGameInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchGame");

            var localVarPath = "/Items/RemoteSearch/Game";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchGame", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchGameAsync (RemoteSearchQueryGameInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchGameAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchGameAsyncWithHttpInfo (RemoteSearchQueryGameInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchGame");

            var localVarPath = "/Items/RemoteSearch/Game";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchGame", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchMovie (RemoteSearchQueryMovieInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchMovieWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchMovieWithHttpInfo (RemoteSearchQueryMovieInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMovie");

            var localVarPath = "/Items/RemoteSearch/Movie";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMovie", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMovieAsync (RemoteSearchQueryMovieInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchMovieAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMovieAsyncWithHttpInfo (RemoteSearchQueryMovieInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMovie");

            var localVarPath = "/Items/RemoteSearch/Movie";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMovie", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchMusicalbum (RemoteSearchQueryAlbumInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchMusicalbumWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchMusicalbumWithHttpInfo (RemoteSearchQueryAlbumInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMusicalbum");

            var localVarPath = "/Items/RemoteSearch/MusicAlbum";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMusicalbum", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMusicalbumAsync (RemoteSearchQueryAlbumInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchMusicalbumAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMusicalbumAsyncWithHttpInfo (RemoteSearchQueryAlbumInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMusicalbum");

            var localVarPath = "/Items/RemoteSearch/MusicAlbum";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMusicalbum", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchMusicartist (RemoteSearchQueryArtistInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchMusicartistWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchMusicartistWithHttpInfo (RemoteSearchQueryArtistInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMusicartist");

            var localVarPath = "/Items/RemoteSearch/MusicArtist";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMusicartist", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMusicartistAsync (RemoteSearchQueryArtistInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchMusicartistAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMusicartistAsyncWithHttpInfo (RemoteSearchQueryArtistInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMusicartist");

            var localVarPath = "/Items/RemoteSearch/MusicArtist";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMusicartist", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchMusicvideo (RemoteSearchQueryMusicVideoInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchMusicvideoWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchMusicvideoWithHttpInfo (RemoteSearchQueryMusicVideoInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMusicvideo");

            var localVarPath = "/Items/RemoteSearch/MusicVideo";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMusicvideo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchMusicvideoAsync (RemoteSearchQueryMusicVideoInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchMusicvideoAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchMusicvideoAsyncWithHttpInfo (RemoteSearchQueryMusicVideoInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchMusicvideo");

            var localVarPath = "/Items/RemoteSearch/MusicVideo";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchMusicvideo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchPerson (RemoteSearchQueryPersonLookupInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchPersonWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchPersonWithHttpInfo (RemoteSearchQueryPersonLookupInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchPerson");

            var localVarPath = "/Items/RemoteSearch/Person";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchPerson", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchPersonAsync (RemoteSearchQueryPersonLookupInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchPersonAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchPersonAsyncWithHttpInfo (RemoteSearchQueryPersonLookupInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchPerson");

            var localVarPath = "/Items/RemoteSearch/Person";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchPerson", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchSeries (RemoteSearchQuerySeriesInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchSeriesWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchSeriesWithHttpInfo (RemoteSearchQuerySeriesInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchSeries");

            var localVarPath = "/Items/RemoteSearch/Series";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchSeries", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchSeriesAsync (RemoteSearchQuerySeriesInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchSeriesAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchSeriesAsyncWithHttpInfo (RemoteSearchQuerySeriesInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchSeries");

            var localVarPath = "/Items/RemoteSearch/Series";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchSeries", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>List&lt;RemoteSearchResult&gt;</returns>
        public List<RemoteSearchResult> PostItemsRemotesearchTrailer (RemoteSearchQueryTrailerInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = PostItemsRemotesearchTrailerWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>ApiResponse of List&lt;RemoteSearchResult&gt;</returns>
        public ApiResponse< List<RemoteSearchResult> > PostItemsRemotesearchTrailerWithHttpInfo (RemoteSearchQueryTrailerInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchTrailer");

            var localVarPath = "/Items/RemoteSearch/Trailer";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchTrailer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of List&lt;RemoteSearchResult&gt;</returns>
        public async System.Threading.Tasks.Task<List<RemoteSearchResult>> PostItemsRemotesearchTrailerAsync (RemoteSearchQueryTrailerInfo body)
        {
             ApiResponse<List<RemoteSearchResult>> localVarResponse = await PostItemsRemotesearchTrailerAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RemoteSearchQuery&#x60;1: </param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSearchResult&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RemoteSearchResult>>> PostItemsRemotesearchTrailerAsyncWithHttpInfo (RemoteSearchQueryTrailerInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ItemLookupServiceApi->PostItemsRemotesearchTrailer");

            var localVarPath = "/Items/RemoteSearch/Trailer";
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
                Exception exception = ExceptionFactory("PostItemsRemotesearchTrailer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RemoteSearchResult>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RemoteSearchResult>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RemoteSearchResult>)));
        }

    }
}
