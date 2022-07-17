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
        public interface ILibraryServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns></returns>
        void DeleteItems (string ids);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteItemsWithHttpInfo (string ids);
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        void DeleteItemsById (string id);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteItemsByIdWithHttpInfo (string id);
        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetAlbumsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetAlbumsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetArtistsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetArtistsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds games similar to a given game.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetGamesByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds games similar to a given game.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetGamesByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Gets all parents of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        List<BaseItemDto> GetItemsByIdAncestors (string id, string userId);

        /// <summary>
        /// Gets all parents of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        ApiResponse<List<BaseItemDto>> GetItemsByIdAncestorsWithHttpInfo (string id, string userId);
        /// <summary>
        /// Gets critic reviews for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetItemsByIdCriticreviews (string id, int? startIndex, int? limit);

        /// <summary>
        /// Gets critic reviews for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetItemsByIdCriticreviewsWithHttpInfo (string id, int? startIndex, int? limit);
        /// <summary>
        /// Gets delete info for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>LibraryDeleteInfo</returns>
        LibraryDeleteInfo GetItemsByIdDeleteinfo (string id);

        /// <summary>
        /// Gets delete info for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of LibraryDeleteInfo</returns>
        ApiResponse<LibraryDeleteInfo> GetItemsByIdDeleteinfoWithHttpInfo (string id);
        /// <summary>
        /// Downloads item media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        void GetItemsByIdDownload (string id);

        /// <summary>
        /// Downloads item media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetItemsByIdDownloadWithHttpInfo (string id);
        /// <summary>
        /// Gets the original file of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        void GetItemsByIdFile (string id);

        /// <summary>
        /// Gets the original file of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetItemsByIdFileWithHttpInfo (string id);
        /// <summary>
        /// Gets similar items
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetItemsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Gets similar items
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetItemsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Gets theme videos and songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>AllThemeMediaResult</returns>
        AllThemeMediaResult GetItemsByIdThememedia (string id, string userId, bool? inheritFromParent);

        /// <summary>
        /// Gets theme videos and songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ApiResponse of AllThemeMediaResult</returns>
        ApiResponse<AllThemeMediaResult> GetItemsByIdThememediaWithHttpInfo (string id, string userId, bool? inheritFromParent);
        /// <summary>
        /// Gets theme songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ThemeMediaResult</returns>
        ThemeMediaResult GetItemsByIdThemesongs (string id, string userId, bool? inheritFromParent);

        /// <summary>
        /// Gets theme songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ApiResponse of ThemeMediaResult</returns>
        ApiResponse<ThemeMediaResult> GetItemsByIdThemesongsWithHttpInfo (string id, string userId, bool? inheritFromParent);
        /// <summary>
        /// Gets theme videos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ThemeMediaResult</returns>
        ThemeMediaResult GetItemsByIdThemevideos (string id, string userId, bool? inheritFromParent);

        /// <summary>
        /// Gets theme videos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ApiResponse of ThemeMediaResult</returns>
        ApiResponse<ThemeMediaResult> GetItemsByIdThemevideosWithHttpInfo (string id, string userId, bool? inheritFromParent);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>ItemCounts</returns>
        ItemCounts GetItemsCounts (string userId, bool? isFavorite);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>ApiResponse of ItemCounts</returns>
        ApiResponse<ItemCounts> GetItemsCountsWithHttpInfo (string userId, bool? isFavorite);
        /// <summary>
        /// Gets info to debug intros
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;PersistenceIntroDebugInfo&gt;</returns>
        List<PersistenceIntroDebugInfo> GetItemsIntros ();

        /// <summary>
        /// Gets info to debug intros
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;PersistenceIntroDebugInfo&gt;</returns>
        ApiResponse<List<PersistenceIntroDebugInfo>> GetItemsIntrosWithHttpInfo ();
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>LibraryLibraryOptionsResult</returns>
        LibraryLibraryOptionsResult GetLibrariesAvailableoptions ();

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of LibraryLibraryOptionsResult</returns>
        ApiResponse<LibraryLibraryOptionsResult> GetLibrariesAvailableoptionsWithHttpInfo ();
        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetLibraryMediafolders (bool? isHidden);

        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetLibraryMediafoldersWithHttpInfo (bool? isHidden);
        /// <summary>
        /// Gets a list of physical paths from virtual folders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;string&gt;</returns>
        List<string> GetLibraryPhysicalpaths ();

        /// <summary>
        /// Gets a list of physical paths from virtual folders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;string&gt;</returns>
        ApiResponse<List<string>> GetLibraryPhysicalpathsWithHttpInfo ();
        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;LibraryMediaFolder&gt;</returns>
        List<LibraryMediaFolder> GetLibrarySelectablemediafolders ();

        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;LibraryMediaFolder&gt;</returns>
        ApiResponse<List<LibraryMediaFolder>> GetLibrarySelectablemediafoldersWithHttpInfo ();
        /// <summary>
        /// Finds movies and trailers similar to a given movie.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetMoviesByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds movies and trailers similar to a given movie.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetMoviesByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds tv shows similar to a given one.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetShowsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds tv shows similar to a given one.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetShowsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetTrailersByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetTrailersByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        void PostItemsByIdDelete (string id);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsByIdDeleteWithHttpInfo (string id);
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns></returns>
        void PostItemsDelete (string ids);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsDeleteWithHttpInfo (string ids);
        /// <summary>
        /// Reports that new movies have been added by an external source
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns></returns>
        void PostLibraryMediaUpdated (LibraryPostUpdatedMedia body);

        /// <summary>
        /// Reports that new movies have been added by an external source
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostLibraryMediaUpdatedWithHttpInfo (LibraryPostUpdatedMedia body);
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        void PostLibraryMoviesAdded ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostLibraryMoviesAddedWithHttpInfo ();
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        void PostLibraryMoviesUpdated ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostLibraryMoviesUpdatedWithHttpInfo ();
        /// <summary>
        /// Starts a library scan
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        void PostLibraryRefresh ();

        /// <summary>
        /// Starts a library scan
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostLibraryRefreshWithHttpInfo ();
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        void PostLibrarySeriesAdded ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostLibrarySeriesAddedWithHttpInfo ();
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        void PostLibrarySeriesUpdated ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostLibrarySeriesUpdatedWithHttpInfo ();
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteItemsAsync (string ids);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteItemsAsyncWithHttpInfo (string ids);
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteItemsByIdAsync (string id);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteItemsByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetAlbumsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetAlbumsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetArtistsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds albums similar to a given album.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetArtistsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds games similar to a given game.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetGamesByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds games similar to a given game.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetGamesByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Gets all parents of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        System.Threading.Tasks.Task<List<BaseItemDto>> GetItemsByIdAncestorsAsync (string id, string userId);

        /// <summary>
        /// Gets all parents of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetItemsByIdAncestorsAsyncWithHttpInfo (string id, string userId);
        /// <summary>
        /// Gets critic reviews for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetItemsByIdCriticreviewsAsync (string id, int? startIndex, int? limit);

        /// <summary>
        /// Gets critic reviews for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetItemsByIdCriticreviewsAsyncWithHttpInfo (string id, int? startIndex, int? limit);
        /// <summary>
        /// Gets delete info for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of LibraryDeleteInfo</returns>
        System.Threading.Tasks.Task<LibraryDeleteInfo> GetItemsByIdDeleteinfoAsync (string id);

        /// <summary>
        /// Gets delete info for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (LibraryDeleteInfo)</returns>
        System.Threading.Tasks.Task<ApiResponse<LibraryDeleteInfo>> GetItemsByIdDeleteinfoAsyncWithHttpInfo (string id);
        /// <summary>
        /// Downloads item media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetItemsByIdDownloadAsync (string id);

        /// <summary>
        /// Downloads item media
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdDownloadAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets the original file of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetItemsByIdFileAsync (string id);

        /// <summary>
        /// Gets the original file of an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdFileAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets similar items
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetItemsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Gets similar items
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetItemsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Gets theme videos and songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of AllThemeMediaResult</returns>
        System.Threading.Tasks.Task<AllThemeMediaResult> GetItemsByIdThememediaAsync (string id, string userId, bool? inheritFromParent);

        /// <summary>
        /// Gets theme videos and songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ApiResponse (AllThemeMediaResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<AllThemeMediaResult>> GetItemsByIdThememediaAsyncWithHttpInfo (string id, string userId, bool? inheritFromParent);
        /// <summary>
        /// Gets theme songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ThemeMediaResult</returns>
        System.Threading.Tasks.Task<ThemeMediaResult> GetItemsByIdThemesongsAsync (string id, string userId, bool? inheritFromParent);

        /// <summary>
        /// Gets theme songs for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ApiResponse (ThemeMediaResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<ThemeMediaResult>> GetItemsByIdThemesongsAsyncWithHttpInfo (string id, string userId, bool? inheritFromParent);
        /// <summary>
        /// Gets theme videos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ThemeMediaResult</returns>
        System.Threading.Tasks.Task<ThemeMediaResult> GetItemsByIdThemevideosAsync (string id, string userId, bool? inheritFromParent);

        /// <summary>
        /// Gets theme videos for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ApiResponse (ThemeMediaResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<ThemeMediaResult>> GetItemsByIdThemevideosAsyncWithHttpInfo (string id, string userId, bool? inheritFromParent);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>Task of ItemCounts</returns>
        System.Threading.Tasks.Task<ItemCounts> GetItemsCountsAsync (string userId, bool? isFavorite);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>Task of ApiResponse (ItemCounts)</returns>
        System.Threading.Tasks.Task<ApiResponse<ItemCounts>> GetItemsCountsAsyncWithHttpInfo (string userId, bool? isFavorite);
        /// <summary>
        /// Gets info to debug intros
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;PersistenceIntroDebugInfo&gt;</returns>
        System.Threading.Tasks.Task<List<PersistenceIntroDebugInfo>> GetItemsIntrosAsync ();

        /// <summary>
        /// Gets info to debug intros
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;PersistenceIntroDebugInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<PersistenceIntroDebugInfo>>> GetItemsIntrosAsyncWithHttpInfo ();
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of LibraryLibraryOptionsResult</returns>
        System.Threading.Tasks.Task<LibraryLibraryOptionsResult> GetLibrariesAvailableoptionsAsync ();

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (LibraryLibraryOptionsResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<LibraryLibraryOptionsResult>> GetLibrariesAvailableoptionsAsyncWithHttpInfo ();
        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetLibraryMediafoldersAsync (bool? isHidden);

        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetLibraryMediafoldersAsyncWithHttpInfo (bool? isHidden);
        /// <summary>
        /// Gets a list of physical paths from virtual folders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;string&gt;</returns>
        System.Threading.Tasks.Task<List<string>> GetLibraryPhysicalpathsAsync ();

        /// <summary>
        /// Gets a list of physical paths from virtual folders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;string&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<string>>> GetLibraryPhysicalpathsAsyncWithHttpInfo ();
        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;LibraryMediaFolder&gt;</returns>
        System.Threading.Tasks.Task<List<LibraryMediaFolder>> GetLibrarySelectablemediafoldersAsync ();

        /// <summary>
        /// Gets all user media folders.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;LibraryMediaFolder&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<LibraryMediaFolder>>> GetLibrarySelectablemediafoldersAsyncWithHttpInfo ();
        /// <summary>
        /// Finds movies and trailers similar to a given movie.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetMoviesByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds movies and trailers similar to a given movie.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetMoviesByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds tv shows similar to a given one.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetShowsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds tv shows similar to a given one.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetShowsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetTrailersByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);

        /// <summary>
        /// Finds movies and trailers similar to a given trailer.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetTrailersByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields);
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsByIdDeleteAsync (string id);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdDeleteAsyncWithHttpInfo (string id);
        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsDeleteAsync (string ids);

        /// <summary>
        /// Deletes an item from the library and file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsDeleteAsyncWithHttpInfo (string ids);
        /// <summary>
        /// Reports that new movies have been added by an external source
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostLibraryMediaUpdatedAsync (LibraryPostUpdatedMedia body);

        /// <summary>
        /// Reports that new movies have been added by an external source
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryMediaUpdatedAsyncWithHttpInfo (LibraryPostUpdatedMedia body);
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostLibraryMoviesAddedAsync ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryMoviesAddedAsyncWithHttpInfo ();
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostLibraryMoviesUpdatedAsync ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryMoviesUpdatedAsyncWithHttpInfo ();
        /// <summary>
        /// Starts a library scan
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostLibraryRefreshAsync ();

        /// <summary>
        /// Starts a library scan
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryRefreshAsyncWithHttpInfo ();
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostLibrarySeriesAddedAsync ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostLibrarySeriesAddedAsyncWithHttpInfo ();
        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostLibrarySeriesUpdatedAsync ();

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostLibrarySeriesUpdatedAsyncWithHttpInfo ();
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class LibraryServiceApi : ILibraryServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LibraryServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public LibraryServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public LibraryServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns></returns>
        public void DeleteItems (string ids)
        {
             DeleteItemsWithHttpInfo(ids);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteItemsWithHttpInfo (string ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling LibraryServiceApi->DeleteItems");

            var localVarPath = "/Items";
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

            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteItems", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteItemsAsync (string ids)
        {
             await DeleteItemsAsyncWithHttpInfo(ids);

        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteItemsAsyncWithHttpInfo (string ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling LibraryServiceApi->DeleteItems");

            var localVarPath = "/Items";
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

            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("DeleteItems", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        public void DeleteItemsById (string id)
        {
             DeleteItemsByIdWithHttpInfo(id);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteItemsByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->DeleteItemsById");

            var localVarPath = "/Items/{Id}";
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
                Exception exception = ExceptionFactory("DeleteItemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteItemsByIdAsync (string id)
        {
             await DeleteItemsByIdAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteItemsByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->DeleteItemsById");

            var localVarPath = "/Items/{Id}";
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
                Exception exception = ExceptionFactory("DeleteItemsById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetAlbumsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetAlbumsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetAlbumsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetAlbumsByIdSimilar");

            var localVarPath = "/Albums/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetAlbumsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetAlbumsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetAlbumsByIdSimilarAsyncWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetAlbumsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetAlbumsByIdSimilar");

            var localVarPath = "/Albums/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetAlbumsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetArtistsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetArtistsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetArtistsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetArtistsByIdSimilar");

            var localVarPath = "/Artists/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetArtistsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetArtistsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetArtistsByIdSimilarAsyncWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Finds albums similar to a given album. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetArtistsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetArtistsByIdSimilar");

            var localVarPath = "/Artists/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetArtistsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds games similar to a given game. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetGamesByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetGamesByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Finds games similar to a given game. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetGamesByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetGamesByIdSimilar");

            var localVarPath = "/Games/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetGamesByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds games similar to a given game. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetGamesByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetGamesByIdSimilarAsyncWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Finds games similar to a given game. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetGamesByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetGamesByIdSimilar");

            var localVarPath = "/Games/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetGamesByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets all parents of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>List&lt;BaseItemDto&gt;</returns>
        public List<BaseItemDto> GetItemsByIdAncestors (string id, string userId)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = GetItemsByIdAncestorsWithHttpInfo(id, userId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all parents of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>ApiResponse of List&lt;BaseItemDto&gt;</returns>
        public ApiResponse< List<BaseItemDto> > GetItemsByIdAncestorsWithHttpInfo (string id, string userId)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdAncestors");

            var localVarPath = "/Items/{Id}/Ancestors";
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
                Exception exception = ExceptionFactory("GetItemsByIdAncestors", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets all parents of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>Task of List&lt;BaseItemDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<BaseItemDto>> GetItemsByIdAncestorsAsync (string id, string userId)
        {
             ApiResponse<List<BaseItemDto>> localVarResponse = await GetItemsByIdAncestorsAsyncWithHttpInfo(id, userId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets all parents of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;BaseItemDto&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<BaseItemDto>>> GetItemsByIdAncestorsAsyncWithHttpInfo (string id, string userId)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdAncestors");

            var localVarPath = "/Items/{Id}/Ancestors";
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
                Exception exception = ExceptionFactory("GetItemsByIdAncestors", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<BaseItemDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<BaseItemDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<BaseItemDto>)));
        }

        /// <summary>
        /// Gets critic reviews for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetItemsByIdCriticreviews (string id, int? startIndex, int? limit)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetItemsByIdCriticreviewsWithHttpInfo(id, startIndex, limit);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets critic reviews for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetItemsByIdCriticreviewsWithHttpInfo (string id, int? startIndex, int? limit)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdCriticreviews");

            var localVarPath = "/Items/{Id}/CriticReviews";
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
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdCriticreviews", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets critic reviews for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetItemsByIdCriticreviewsAsync (string id, int? startIndex, int? limit)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetItemsByIdCriticreviewsAsyncWithHttpInfo(id, startIndex, limit);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets critic reviews for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetItemsByIdCriticreviewsAsyncWithHttpInfo (string id, int? startIndex, int? limit)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdCriticreviews");

            var localVarPath = "/Items/{Id}/CriticReviews";
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
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdCriticreviews", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets delete info for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>LibraryDeleteInfo</returns>
        public LibraryDeleteInfo GetItemsByIdDeleteinfo (string id)
        {
             ApiResponse<LibraryDeleteInfo> localVarResponse = GetItemsByIdDeleteinfoWithHttpInfo(id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets delete info for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of LibraryDeleteInfo</returns>
        public ApiResponse< LibraryDeleteInfo > GetItemsByIdDeleteinfoWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdDeleteinfo");

            var localVarPath = "/Items/{Id}/DeleteInfo";
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
                Exception exception = ExceptionFactory("GetItemsByIdDeleteinfo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LibraryDeleteInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LibraryDeleteInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LibraryDeleteInfo)));
        }

        /// <summary>
        /// Gets delete info for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of LibraryDeleteInfo</returns>
        public async System.Threading.Tasks.Task<LibraryDeleteInfo> GetItemsByIdDeleteinfoAsync (string id)
        {
             ApiResponse<LibraryDeleteInfo> localVarResponse = await GetItemsByIdDeleteinfoAsyncWithHttpInfo(id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets delete info for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (LibraryDeleteInfo)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<LibraryDeleteInfo>> GetItemsByIdDeleteinfoAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdDeleteinfo");

            var localVarPath = "/Items/{Id}/DeleteInfo";
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
                Exception exception = ExceptionFactory("GetItemsByIdDeleteinfo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LibraryDeleteInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LibraryDeleteInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LibraryDeleteInfo)));
        }

        /// <summary>
        /// Downloads item media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        public void GetItemsByIdDownload (string id)
        {
             GetItemsByIdDownloadWithHttpInfo(id);
        }

        /// <summary>
        /// Downloads item media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetItemsByIdDownloadWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdDownload");

            var localVarPath = "/Items/{Id}/Download";
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
                Exception exception = ExceptionFactory("GetItemsByIdDownload", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Downloads item media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetItemsByIdDownloadAsync (string id)
        {
             await GetItemsByIdDownloadAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Downloads item media Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdDownloadAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdDownload");

            var localVarPath = "/Items/{Id}/Download";
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
                Exception exception = ExceptionFactory("GetItemsByIdDownload", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets the original file of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        public void GetItemsByIdFile (string id)
        {
             GetItemsByIdFileWithHttpInfo(id);
        }

        /// <summary>
        /// Gets the original file of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetItemsByIdFileWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdFile");

            var localVarPath = "/Items/{Id}/File";
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
                Exception exception = ExceptionFactory("GetItemsByIdFile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets the original file of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetItemsByIdFileAsync (string id)
        {
             await GetItemsByIdFileAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Gets the original file of an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetItemsByIdFileAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdFile");

            var localVarPath = "/Items/{Id}/File";
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
                Exception exception = ExceptionFactory("GetItemsByIdFile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets similar items Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetItemsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetItemsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets similar items Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetItemsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdSimilar");

            var localVarPath = "/Items/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets similar items Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetItemsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetItemsByIdSimilarAsyncWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets similar items Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetItemsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdSimilar");

            var localVarPath = "/Items/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets theme videos and songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>AllThemeMediaResult</returns>
        public AllThemeMediaResult GetItemsByIdThememedia (string id, string userId, bool? inheritFromParent)
        {
             ApiResponse<AllThemeMediaResult> localVarResponse = GetItemsByIdThememediaWithHttpInfo(id, userId, inheritFromParent);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets theme videos and songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ApiResponse of AllThemeMediaResult</returns>
        public ApiResponse< AllThemeMediaResult > GetItemsByIdThememediaWithHttpInfo (string id, string userId, bool? inheritFromParent)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdThememedia");

            var localVarPath = "/Items/{Id}/ThemeMedia";
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
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (inheritFromParent != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InheritFromParent", inheritFromParent)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdThememedia", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AllThemeMediaResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AllThemeMediaResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AllThemeMediaResult)));
        }

        /// <summary>
        /// Gets theme videos and songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of AllThemeMediaResult</returns>
        public async System.Threading.Tasks.Task<AllThemeMediaResult> GetItemsByIdThememediaAsync (string id, string userId, bool? inheritFromParent)
        {
             ApiResponse<AllThemeMediaResult> localVarResponse = await GetItemsByIdThememediaAsyncWithHttpInfo(id, userId, inheritFromParent);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets theme videos and songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ApiResponse (AllThemeMediaResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<AllThemeMediaResult>> GetItemsByIdThememediaAsyncWithHttpInfo (string id, string userId, bool? inheritFromParent)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdThememedia");

            var localVarPath = "/Items/{Id}/ThemeMedia";
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
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (inheritFromParent != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InheritFromParent", inheritFromParent)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdThememedia", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AllThemeMediaResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AllThemeMediaResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AllThemeMediaResult)));
        }

        /// <summary>
        /// Gets theme songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ThemeMediaResult</returns>
        public ThemeMediaResult GetItemsByIdThemesongs (string id, string userId, bool? inheritFromParent)
        {
             ApiResponse<ThemeMediaResult> localVarResponse = GetItemsByIdThemesongsWithHttpInfo(id, userId, inheritFromParent);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets theme songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ApiResponse of ThemeMediaResult</returns>
        public ApiResponse< ThemeMediaResult > GetItemsByIdThemesongsWithHttpInfo (string id, string userId, bool? inheritFromParent)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdThemesongs");

            var localVarPath = "/Items/{Id}/ThemeSongs";
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
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (inheritFromParent != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InheritFromParent", inheritFromParent)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdThemesongs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ThemeMediaResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (ThemeMediaResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(ThemeMediaResult)));
        }

        /// <summary>
        /// Gets theme songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ThemeMediaResult</returns>
        public async System.Threading.Tasks.Task<ThemeMediaResult> GetItemsByIdThemesongsAsync (string id, string userId, bool? inheritFromParent)
        {
             ApiResponse<ThemeMediaResult> localVarResponse = await GetItemsByIdThemesongsAsyncWithHttpInfo(id, userId, inheritFromParent);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets theme songs for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ApiResponse (ThemeMediaResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<ThemeMediaResult>> GetItemsByIdThemesongsAsyncWithHttpInfo (string id, string userId, bool? inheritFromParent)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdThemesongs");

            var localVarPath = "/Items/{Id}/ThemeSongs";
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
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (inheritFromParent != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InheritFromParent", inheritFromParent)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdThemesongs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ThemeMediaResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (ThemeMediaResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(ThemeMediaResult)));
        }

        /// <summary>
        /// Gets theme videos for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ThemeMediaResult</returns>
        public ThemeMediaResult GetItemsByIdThemevideos (string id, string userId, bool? inheritFromParent)
        {
             ApiResponse<ThemeMediaResult> localVarResponse = GetItemsByIdThemevideosWithHttpInfo(id, userId, inheritFromParent);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets theme videos for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>ApiResponse of ThemeMediaResult</returns>
        public ApiResponse< ThemeMediaResult > GetItemsByIdThemevideosWithHttpInfo (string id, string userId, bool? inheritFromParent)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdThemevideos");

            var localVarPath = "/Items/{Id}/ThemeVideos";
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
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (inheritFromParent != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InheritFromParent", inheritFromParent)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdThemevideos", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ThemeMediaResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (ThemeMediaResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(ThemeMediaResult)));
        }

        /// <summary>
        /// Gets theme videos for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ThemeMediaResult</returns>
        public async System.Threading.Tasks.Task<ThemeMediaResult> GetItemsByIdThemevideosAsync (string id, string userId, bool? inheritFromParent)
        {
             ApiResponse<ThemeMediaResult> localVarResponse = await GetItemsByIdThemevideosAsyncWithHttpInfo(id, userId, inheritFromParent);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets theme videos for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="inheritFromParent">Determines whether or not parent items should be searched for theme media. (optional)</param>
        /// <returns>Task of ApiResponse (ThemeMediaResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<ThemeMediaResult>> GetItemsByIdThemevideosAsyncWithHttpInfo (string id, string userId, bool? inheritFromParent)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetItemsByIdThemevideos");

            var localVarPath = "/Items/{Id}/ThemeVideos";
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
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (inheritFromParent != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "InheritFromParent", inheritFromParent)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdThemevideos", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ThemeMediaResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (ThemeMediaResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(ThemeMediaResult)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>ItemCounts</returns>
        public ItemCounts GetItemsCounts (string userId, bool? isFavorite)
        {
             ApiResponse<ItemCounts> localVarResponse = GetItemsCountsWithHttpInfo(userId, isFavorite);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>ApiResponse of ItemCounts</returns>
        public ApiResponse< ItemCounts > GetItemsCountsWithHttpInfo (string userId, bool? isFavorite)
        {

            var localVarPath = "/Items/Counts";
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
            if (isFavorite != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFavorite", isFavorite)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsCounts", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ItemCounts>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (ItemCounts) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(ItemCounts)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>Task of ItemCounts</returns>
        public async System.Threading.Tasks.Task<ItemCounts> GetItemsCountsAsync (string userId, bool? isFavorite)
        {
             ApiResponse<ItemCounts> localVarResponse = await GetItemsCountsAsyncWithHttpInfo(userId, isFavorite);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">Optional. Get counts from a specific user&#x27;s library. (optional)</param>
        /// <param name="isFavorite">Optional. Get counts of favorite items (optional)</param>
        /// <returns>Task of ApiResponse (ItemCounts)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<ItemCounts>> GetItemsCountsAsyncWithHttpInfo (string userId, bool? isFavorite)
        {

            var localVarPath = "/Items/Counts";
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
            if (isFavorite != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsFavorite", isFavorite)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsCounts", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ItemCounts>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (ItemCounts) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(ItemCounts)));
        }

        /// <summary>
        /// Gets info to debug intros Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;PersistenceIntroDebugInfo&gt;</returns>
        public List<PersistenceIntroDebugInfo> GetItemsIntros ()
        {
             ApiResponse<List<PersistenceIntroDebugInfo>> localVarResponse = GetItemsIntrosWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets info to debug intros Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;PersistenceIntroDebugInfo&gt;</returns>
        public ApiResponse< List<PersistenceIntroDebugInfo> > GetItemsIntrosWithHttpInfo ()
        {

            var localVarPath = "/Items/Intros";
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
                Exception exception = ExceptionFactory("GetItemsIntros", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<PersistenceIntroDebugInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<PersistenceIntroDebugInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<PersistenceIntroDebugInfo>)));
        }

        /// <summary>
        /// Gets info to debug intros Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;PersistenceIntroDebugInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<PersistenceIntroDebugInfo>> GetItemsIntrosAsync ()
        {
             ApiResponse<List<PersistenceIntroDebugInfo>> localVarResponse = await GetItemsIntrosAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets info to debug intros Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;PersistenceIntroDebugInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<PersistenceIntroDebugInfo>>> GetItemsIntrosAsyncWithHttpInfo ()
        {

            var localVarPath = "/Items/Intros";
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
                Exception exception = ExceptionFactory("GetItemsIntros", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<PersistenceIntroDebugInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<PersistenceIntroDebugInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<PersistenceIntroDebugInfo>)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>LibraryLibraryOptionsResult</returns>
        public LibraryLibraryOptionsResult GetLibrariesAvailableoptions ()
        {
             ApiResponse<LibraryLibraryOptionsResult> localVarResponse = GetLibrariesAvailableoptionsWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of LibraryLibraryOptionsResult</returns>
        public ApiResponse< LibraryLibraryOptionsResult > GetLibrariesAvailableoptionsWithHttpInfo ()
        {

            var localVarPath = "/Libraries/AvailableOptions";
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
                Exception exception = ExceptionFactory("GetLibrariesAvailableoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LibraryLibraryOptionsResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LibraryLibraryOptionsResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LibraryLibraryOptionsResult)));
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of LibraryLibraryOptionsResult</returns>
        public async System.Threading.Tasks.Task<LibraryLibraryOptionsResult> GetLibrariesAvailableoptionsAsync ()
        {
             ApiResponse<LibraryLibraryOptionsResult> localVarResponse = await GetLibrariesAvailableoptionsAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (LibraryLibraryOptionsResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<LibraryLibraryOptionsResult>> GetLibrariesAvailableoptionsAsyncWithHttpInfo ()
        {

            var localVarPath = "/Libraries/AvailableOptions";
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
                Exception exception = ExceptionFactory("GetLibrariesAvailableoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<LibraryLibraryOptionsResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (LibraryLibraryOptionsResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(LibraryLibraryOptionsResult)));
        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetLibraryMediafolders (bool? isHidden)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetLibraryMediafoldersWithHttpInfo(isHidden);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetLibraryMediafoldersWithHttpInfo (bool? isHidden)
        {

            var localVarPath = "/Library/MediaFolders";
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

            if (isHidden != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHidden", isHidden)); // query parameter
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
                Exception exception = ExceptionFactory("GetLibraryMediafolders", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetLibraryMediafoldersAsync (bool? isHidden)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetLibraryMediafoldersAsyncWithHttpInfo(isHidden);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional. Filter by folders that are marked hidden, or not. (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetLibraryMediafoldersAsyncWithHttpInfo (bool? isHidden)
        {

            var localVarPath = "/Library/MediaFolders";
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

            if (isHidden != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHidden", isHidden)); // query parameter
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
                Exception exception = ExceptionFactory("GetLibraryMediafolders", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets a list of physical paths from virtual folders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;string&gt;</returns>
        public List<string> GetLibraryPhysicalpaths ()
        {
             ApiResponse<List<string>> localVarResponse = GetLibraryPhysicalpathsWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a list of physical paths from virtual folders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;string&gt;</returns>
        public ApiResponse< List<string> > GetLibraryPhysicalpathsWithHttpInfo ()
        {

            var localVarPath = "/Library/PhysicalPaths";
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
                Exception exception = ExceptionFactory("GetLibraryPhysicalpaths", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<string>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<string>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<string>)));
        }

        /// <summary>
        /// Gets a list of physical paths from virtual folders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;string&gt;</returns>
        public async System.Threading.Tasks.Task<List<string>> GetLibraryPhysicalpathsAsync ()
        {
             ApiResponse<List<string>> localVarResponse = await GetLibraryPhysicalpathsAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a list of physical paths from virtual folders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;string&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<string>>> GetLibraryPhysicalpathsAsyncWithHttpInfo ()
        {

            var localVarPath = "/Library/PhysicalPaths";
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
                Exception exception = ExceptionFactory("GetLibraryPhysicalpaths", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<string>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<string>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<string>)));
        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;LibraryMediaFolder&gt;</returns>
        public List<LibraryMediaFolder> GetLibrarySelectablemediafolders ()
        {
             ApiResponse<List<LibraryMediaFolder>> localVarResponse = GetLibrarySelectablemediafoldersWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;LibraryMediaFolder&gt;</returns>
        public ApiResponse< List<LibraryMediaFolder> > GetLibrarySelectablemediafoldersWithHttpInfo ()
        {

            var localVarPath = "/Library/SelectableMediaFolders";
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
                Exception exception = ExceptionFactory("GetLibrarySelectablemediafolders", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<LibraryMediaFolder>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<LibraryMediaFolder>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<LibraryMediaFolder>)));
        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;LibraryMediaFolder&gt;</returns>
        public async System.Threading.Tasks.Task<List<LibraryMediaFolder>> GetLibrarySelectablemediafoldersAsync ()
        {
             ApiResponse<List<LibraryMediaFolder>> localVarResponse = await GetLibrarySelectablemediafoldersAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets all user media folders. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;LibraryMediaFolder&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<LibraryMediaFolder>>> GetLibrarySelectablemediafoldersAsyncWithHttpInfo ()
        {

            var localVarPath = "/Library/SelectableMediaFolders";
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
                Exception exception = ExceptionFactory("GetLibrarySelectablemediafolders", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<LibraryMediaFolder>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<LibraryMediaFolder>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<LibraryMediaFolder>)));
        }

        /// <summary>
        /// Finds movies and trailers similar to a given movie. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetMoviesByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetMoviesByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Finds movies and trailers similar to a given movie. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetMoviesByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetMoviesByIdSimilar");

            var localVarPath = "/Movies/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetMoviesByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds movies and trailers similar to a given movie. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetMoviesByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetMoviesByIdSimilarAsyncWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Finds movies and trailers similar to a given movie. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetMoviesByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetMoviesByIdSimilar");

            var localVarPath = "/Movies/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetMoviesByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds tv shows similar to a given one. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetShowsByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetShowsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Finds tv shows similar to a given one. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetShowsByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetShowsByIdSimilar");

            var localVarPath = "/Shows/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetShowsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds tv shows similar to a given one. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetShowsByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetShowsByIdSimilarAsyncWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Finds tv shows similar to a given one. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetShowsByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetShowsByIdSimilar");

            var localVarPath = "/Shows/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetShowsByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds movies and trailers similar to a given trailer. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetTrailersByIdSimilar (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetTrailersByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Finds movies and trailers similar to a given trailer. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetTrailersByIdSimilarWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetTrailersByIdSimilar");

            var localVarPath = "/Trailers/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetTrailersByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Finds movies and trailers similar to a given trailer. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetTrailersByIdSimilarAsync (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetTrailersByIdSimilarAsyncWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Finds movies and trailers similar to a given trailer. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="includeItemTypes">Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetTrailersByIdSimilarAsyncWithHttpInfo (string id, string includeItemTypes, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes, string userId, int? limit, string fields)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->GetTrailersByIdSimilar");

            var localVarPath = "/Trailers/{Id}/Similar";
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
            if (includeItemTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeItemTypes", includeItemTypes)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
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
                Exception exception = ExceptionFactory("GetTrailersByIdSimilar", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns></returns>
        public void PostItemsByIdDelete (string id)
        {
             PostItemsByIdDeleteWithHttpInfo(id);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsByIdDeleteWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->PostItemsByIdDelete");

            var localVarPath = "/Items/{Id}/Delete";
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
                Exception exception = ExceptionFactory("PostItemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsByIdDeleteAsync (string id)
        {
             await PostItemsByIdDeleteAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdDeleteAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling LibraryServiceApi->PostItemsByIdDelete");

            var localVarPath = "/Items/{Id}/Delete";
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
                Exception exception = ExceptionFactory("PostItemsByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns></returns>
        public void PostItemsDelete (string ids)
        {
             PostItemsDeleteWithHttpInfo(ids);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsDeleteWithHttpInfo (string ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling LibraryServiceApi->PostItemsDelete");

            var localVarPath = "/Items/Delete";
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

            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsDeleteAsync (string ids)
        {
             await PostItemsDeleteAsyncWithHttpInfo(ids);

        }

        /// <summary>
        /// Deletes an item from the library and file system Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Ids</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsDeleteAsyncWithHttpInfo (string ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling LibraryServiceApi->PostItemsDelete");

            var localVarPath = "/Items/Delete";
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

            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that new movies have been added by an external source Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns></returns>
        public void PostLibraryMediaUpdated (LibraryPostUpdatedMedia body)
        {
             PostLibraryMediaUpdatedWithHttpInfo(body);
        }

        /// <summary>
        /// Reports that new movies have been added by an external source Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostLibraryMediaUpdatedWithHttpInfo (LibraryPostUpdatedMedia body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling LibraryServiceApi->PostLibraryMediaUpdated");

            var localVarPath = "/Library/Media/Updated";
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
                Exception exception = ExceptionFactory("PostLibraryMediaUpdated", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Reports that new movies have been added by an external source Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostLibraryMediaUpdatedAsync (LibraryPostUpdatedMedia body)
        {
             await PostLibraryMediaUpdatedAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Reports that new movies have been added by an external source Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">PostUpdatedMedia</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryMediaUpdatedAsyncWithHttpInfo (LibraryPostUpdatedMedia body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling LibraryServiceApi->PostLibraryMediaUpdated");

            var localVarPath = "/Library/Media/Updated";
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
                Exception exception = ExceptionFactory("PostLibraryMediaUpdated", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        public void PostLibraryMoviesAdded ()
        {
             PostLibraryMoviesAddedWithHttpInfo();
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostLibraryMoviesAddedWithHttpInfo ()
        {

            var localVarPath = "/Library/Movies/Added";
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
                Exception exception = ExceptionFactory("PostLibraryMoviesAdded", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostLibraryMoviesAddedAsync ()
        {
             await PostLibraryMoviesAddedAsyncWithHttpInfo();

        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryMoviesAddedAsyncWithHttpInfo ()
        {

            var localVarPath = "/Library/Movies/Added";
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
                Exception exception = ExceptionFactory("PostLibraryMoviesAdded", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        public void PostLibraryMoviesUpdated ()
        {
             PostLibraryMoviesUpdatedWithHttpInfo();
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostLibraryMoviesUpdatedWithHttpInfo ()
        {

            var localVarPath = "/Library/Movies/Updated";
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
                Exception exception = ExceptionFactory("PostLibraryMoviesUpdated", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostLibraryMoviesUpdatedAsync ()
        {
             await PostLibraryMoviesUpdatedAsyncWithHttpInfo();

        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryMoviesUpdatedAsyncWithHttpInfo ()
        {

            var localVarPath = "/Library/Movies/Updated";
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
                Exception exception = ExceptionFactory("PostLibraryMoviesUpdated", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Starts a library scan Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        public void PostLibraryRefresh ()
        {
             PostLibraryRefreshWithHttpInfo();
        }

        /// <summary>
        /// Starts a library scan Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostLibraryRefreshWithHttpInfo ()
        {

            var localVarPath = "/Library/Refresh";
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
                Exception exception = ExceptionFactory("PostLibraryRefresh", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Starts a library scan Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostLibraryRefreshAsync ()
        {
             await PostLibraryRefreshAsyncWithHttpInfo();

        }

        /// <summary>
        /// Starts a library scan Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostLibraryRefreshAsyncWithHttpInfo ()
        {

            var localVarPath = "/Library/Refresh";
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
                Exception exception = ExceptionFactory("PostLibraryRefresh", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        public void PostLibrarySeriesAdded ()
        {
             PostLibrarySeriesAddedWithHttpInfo();
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostLibrarySeriesAddedWithHttpInfo ()
        {

            var localVarPath = "/Library/Series/Added";
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
                Exception exception = ExceptionFactory("PostLibrarySeriesAdded", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostLibrarySeriesAddedAsync ()
        {
             await PostLibrarySeriesAddedAsyncWithHttpInfo();

        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostLibrarySeriesAddedAsyncWithHttpInfo ()
        {

            var localVarPath = "/Library/Series/Added";
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
                Exception exception = ExceptionFactory("PostLibrarySeriesAdded", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns></returns>
        public void PostLibrarySeriesUpdated ()
        {
             PostLibrarySeriesUpdatedWithHttpInfo();
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostLibrarySeriesUpdatedWithHttpInfo ()
        {

            var localVarPath = "/Library/Series/Updated";
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
                Exception exception = ExceptionFactory("PostLibrarySeriesUpdated", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostLibrarySeriesUpdatedAsync ()
        {
             await PostLibrarySeriesUpdatedAsyncWithHttpInfo();

        }

        /// <summary>
        /// Deprecated. Use /Library/Media/Updated Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostLibrarySeriesUpdatedAsyncWithHttpInfo ()
        {

            var localVarPath = "/Library/Series/Updated";
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
                Exception exception = ExceptionFactory("PostLibrarySeriesUpdated", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
